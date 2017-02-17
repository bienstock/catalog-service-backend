package eu.nimble.services.catalog.identity.security;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import eu.nimble.services.catalog.identity.api.IdentityLookup;
import eu.nimble.services.catalog.identity.exception.IdentityException;
import eu.nimble.services.catalog.identity.model.impl.Identity;
import eu.nimble.services.catalog.identity.security.config.ShiroConfig;

@ShiroConfig
public class SecurityRealm extends AuthorizingRealm {

    private IdentityLookup lookup;

    public SecurityRealm() {

    }

    public SecurityRealm(IdentityLookup lookup) {
        this.lookup = lookup;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // TODO Auto-generated method stub
        Object o = principals.getPrimaryPrincipal();
        if (o instanceof Identity) {
            SimpleAuthorizationInfo acc = new SimpleAuthorizationInfo();
            Identity i = (Identity) o;
            switch (i.getIdentityType()) {
                case CARE_PROVIDER:
                    acc.addRole(i.getIdentityType().name());
                    if (i.getOrganization() != null) {
                        acc.addRole(i.getOrganization().toLowerCase());
                    }
                    acc.addStringPermission("manage:*");
                    break;
                default:
                    acc.addRole(i.getIdentityType().name());
                    acc.addStringPermission("manage:" + i.getLoginName());
                    acc.addStringPermission("manage:" + i.getOwnerId());
                    break;
            }

            return acc;
        }
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // check the login
        if (token instanceof UsernamePasswordToken) {
            UsernamePasswordToken userToken = (UsernamePasswordToken) token;
            try {
                Identity i = lookup.authenticate(userToken.getUsername(), new String(userToken.getPassword()));
                if (i != null) {
                    //
                    SimpleAccount acc = new SimpleAccount(i, userToken.getPassword(), getName());
                    switch (i.getIdentityType()) {
                        case CARE_PROVIDER:
                            acc.addRole(i.getIdentityType().name());
                            if (i.getOrganization() != null) {
                                acc.addRole(i.getOrganization().toLowerCase());
                            }
                            acc.addStringPermission("manage:*");
                            break;
                        default:
                            acc.addRole(i.getIdentityType().name());
                            acc.addStringPermission("manage:" + i.getLoginName());
                            acc.addStringPermission("manage:" + i.getOwnerId());
                            break;
                    }

                    return acc;
                }
            } catch (IdentityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            throw new AuthenticationException("Login not successful!");
        }
        return null;
    }


}
