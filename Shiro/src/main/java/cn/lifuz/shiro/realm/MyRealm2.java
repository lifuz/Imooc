package cn.lifuz.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：${date} ${time}
 */
public class MyRealm2 implements Realm {


    @Override
    public String getName() {
        return "MyRealm1";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String name = (String) token.getPrincipal();//得到用户名
        String passwd = new String((char[]) token.getCredentials());//得到密码

        if (!"wang".equals(name)) {
            throw new UnknownAccountException();//如果用户名错误
        }

        if (!"123".equals(passwd)) {
            throw new IncorrectCredentialsException();//如果密码错误
        }

        //如果身份验证成功，返回一个AuthenticationInfo实现
        return new SimpleAuthenticationInfo(name, passwd, getName());
    }
}
