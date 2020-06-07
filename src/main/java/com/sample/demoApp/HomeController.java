package com.sample.demoApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("home")
    //public String home(HttpServletRequest req, HttpServletResponse res){
    //public String home(@RequestParam("name") String Myname, HttpSession session){
        //public ModelAndView home(@RequestParam("name") String Myname){
        public ModelAndView home(Alien alien){
       // HttpSession session = req.getSession();
        //String name = req.getParameter("name");
        ModelAndView mv = new ModelAndView();
        //mv.addObject("name",Myname);
        mv.addObject("obj",alien);
        mv.setViewName("Home");
        //session.setAttribute("name",Myname);
       //System.out.println("Hi.." + Myname);
       //return "Home.jsp";
        //return "Home";
        return mv;
    }
}
