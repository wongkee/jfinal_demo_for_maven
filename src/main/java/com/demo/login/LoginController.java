package com.demo.login;

import com.demo.common.model.User;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;

public class LoginController extends Controller {

    @Inject
    LoginService loginService;
    public void index() {
        //setAttr("users", loginService.paginate(getParaToInt(0, 1), 10));
        render("login.html");
       // System.out.println("有用户提交");
    }
    public void save(){
       User user=getModel(User.class);
       set("username",user.get("username"));
       render("index.html");
    }
}
