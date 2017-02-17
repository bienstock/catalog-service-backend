package eu.nimble.services.catalog.identity.security;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Secured @Interceptor
public class SecurityInterceptor {

//	@Inject
//	Subject subject;
//	@Inject
//	SecurityManager securityManager;
	Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);

	/**
	 * Interceptor method to check appropriate
	 * permissions 
	 * @param context
	 * @return
	 * @throws Exception
	 */
    @AroundInvoke
    public Object interceptShiroSecurity(InvocationContext context) throws Exception {
    	Subject subject = SecurityUtils.getSubject();
//		if (! SecurityUtils.getSubject().equals(subject)) {
//			System.err.println("Subjects are not identical -->" + SecurityUtils.getSubject().isAuthenticated());
//			
//		}
        Class<?> c = context.getTarget().getClass();
        Method m = context.getMethod();

        if (!subject.isAuthenticated() && hasAnnotation(c, m, RequiresAuthentication.class)) {
            throw new UnauthenticatedException("Authentication required");
        }

        if (subject.getPrincipal() != null && hasAnnotation(c, m, RequiresGuest.class)) {
            throw new UnauthenticatedException("Guest required");
        }

        if (subject.getPrincipal() == null && hasAnnotation(c, m, RequiresUser.class)) {
            throw new UnauthenticatedException("User required");
        }

        RequiresRoles roles = getAnnotation(c, m, RequiresRoles.class);

        if (roles != null) {
            subject.checkRoles(Arrays.asList(roles.value()));
        }

        RequiresPermissions permissions = getAnnotation(c, m, RequiresPermissions.class);

        if (permissions != null) {
             subject.checkPermissions(permissions.value());
        }
        String identifier = getIdentifierPermission(context, m, subject);
        logger.info("checking permission for identifier {}", identifier);
        if ( identifier != null ) {
        	// 
        	subject.checkPermission(identifier);
        }
        return context.proceed();
    }
    private String getIdentifierPermission(InvocationContext ctx, Method method, Subject subject) {
		// check the targetId (or OwnerId respectively) which is to be secured!
		String targetId = null;
		for (int i = 0; i < method.getParameterCount(); i++ ) {
			Parameter param = method.getParameters()[i];
			// check whether there is a SecureIdentifier
	        SecuredIdentifier idAnno = param.getDeclaredAnnotation(SecuredIdentifier.class);
	        if ( idAnno != null ) {
	        	String name = idAnno.permission();
	        	Object paramValue = ctx.getParameters()[i];
	        	if ( paramValue != null ) {
	        		targetId = paramValue.toString();
	        		String action = name;
	        		String permission = String.format("%s:%s", action, targetId);
	        		
	        		logger.info("Checking access permission '{}' for user '{}'", permission, subject.getPrincipal());
	        		return permission;
	        	}
	        	else {// no id provided
	        		throw new AuthorizationException("No proper id provided!");
	        	}
	        }
		}
		return null;
    }

    private static boolean hasAnnotation(Class<?> c, Method m, Class<? extends Annotation> a) {
        return m.isAnnotationPresent(a)
            || c.isAnnotationPresent(a)
            || c.getSuperclass().isAnnotationPresent(a);
    }

    private static <A extends Annotation> A getAnnotation(Class<?> c, Method m, Class<A> a) {
        return m.isAnnotationPresent(a) ? m.getAnnotation(a)
            : c.isAnnotationPresent(a) ? c.getAnnotation(a)
            : c.getSuperclass().getAnnotation(a);
    }

}