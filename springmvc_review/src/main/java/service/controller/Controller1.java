package service.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Controller1 {

    @RequestMapping("/quick")
    public String save(){
        System.out.println("springmvc入门");
        return "hello";
    }

//    跳转页面
//    返回字符串
    @RequestMapping("/quick1")
    public String save1(){
        System.out.println("quick1");
        return "redirect:/success.jsp";
    }
    @RequestMapping("/quick2")
    public ModelAndView save2(ModelAndView modelandview){
        System.out.println(":quick2");
        modelandview.setViewName("hello");
        modelandview.addObject("hahahaha","heiheiheiehieh");
                return modelandview;
    }
    @RequestMapping("/quick3")
    public String save3(Model model){
        System.out.println("quick3");
        model.addAttribute("hahahaha","asfd haoh fao");
        return "hello";
    }

    @RequestMapping("/quick4")
    public String save4(HttpServletRequest request){
        System.out.println("quick4");
        request.setAttribute("hahahaha","aaaaaaaaaaaaaaaa");
        return "hello";

    }

    @RequestMapping("/quick5")
    @ResponseBody
    public String save5(){
        System.out.println("quick5");

        return "hello";
    }
    @ResponseBody
    @RequestMapping("/quick6")
    public String save6(){
        System.out.println("quick6");
        return "{\\\"username\\\":\\\"zhangsan\\\",\\\"age\\\":18}";
    }


}
