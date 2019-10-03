package com.jhly.document.controller;

import com.jhly.document.model.User;
import com.jhly.document.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.controller
 * @Version:1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param uName
     * @param uPassword
     * @param request
     * @param response
     * @return
     */
    @PostMapping("login")
    public String login(@RequestParam(name = "uName") String uName,
                        @RequestParam(name = "uPassword") String uPassword,
                        HttpServletRequest request,
                        HttpServletResponse response) {
        if (userService.login(uName, uPassword)) {
//            登陆成功，放入session和cookie
            User user = userService.getUser(uName, uPassword);
            request.getSession().setAttribute("user", user);
            response.addCookie(new Cookie("userId", user.getUId().toString()));
            return "redirect:/";
        } else {
            return "redirect:/user/login.jsp";
        }
    }

    /**
     * 用户注销
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("logout")
    public String logout(HttpServletRequest request,
                         HttpServletResponse response){
        request.getSession().removeAttribute("user");
        Cookie cookie =new Cookie("userId",null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/";
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("register")
    public String register(User user){
        if(userService.register(user)){
            return "redirect:/user/login.jsp";
        }else {
            return "redirect:/user/register.jsp";
        }
    }
}
