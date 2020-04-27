package com.yefan.thymeleaf.controller;

import com.yefan.thymeleaf.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafController {

    @RequestMapping("/leaf")

    public String ShowPage(Model model) {
        model.addAttribute("msg","One");
        model.addAttribute("date",new Date());
        model.addAttribute("sex","男");

        model.addAttribute("id","100");
        model.addAttribute("name","yyt");

        return "index";
    }

    @RequestMapping("index1")
    public String ToIndex(Integer id,String name) {
        System.out.println(id+"-----"+name);
        return "index1";
    }

    @RequestMapping("/list")
    public String ShowList(Model model){
        List<User> list=new ArrayList<>();
        list.add(new User(1,"yf","21"));
        list.add(new User(2,"yyt","22"));
        list.add(new User(3,"zzl","23"));
        list.add(new User(4,"wyl","24"));
        list.add(new User(5,"jhj","25"));
        model.addAttribute("list",list);

        return "list";
    }
}
