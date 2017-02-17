/**
 * 
 */
package eu.nimble.services.catalog.identity.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * @author ceefour
 *
 */
@Inherited
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@InterceptorBinding
public @interface SecuredIdentifier {
    /**
     * A single String value denoting the permission to check 
     * along with the parameter value. The permission 
     * is "permission":"parameterValue";
     */
    String permission() default "manage";
}
