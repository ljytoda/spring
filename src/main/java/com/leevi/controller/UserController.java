package com.leevi.controller;

import com.leevi.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'request':'success'}";
    }

    @RequestMapping("/comparam")
    @ResponseBody
    public String comparam(String name) {
        System.out.println("普通参数===》:" + name);
        return "{'comparam':'" + name + "'}";
    }

    @RequestMapping("/band-param")
    @ResponseBody
    public String bndparam(@RequestParam("name") String userName) {
        System.out.println("绑定参数===》:" + userName);
        return "{'band-param':'" + userName + "'}";
    }

    //pojo传参
    @RequestMapping("/pojo-param")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo传参===》:" + user);
        return "{'pojo-param':'" + user + "'}";
    }

    //pojo嵌套传参
    @RequestMapping("/pojoNestingParam")
    @ResponseBody
    public String pojoNestingParam(User user) {
        System.out.println("pojo嵌套传参===》:" + user);
        return "{'pojo-nesting-param':'" + user + "'}";
    }

    //数组传参
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] names) {
        System.out.println("数组传参===》:" + Arrays.toString(names));
        return "{'array-param':'" + Arrays.toString(names) + "'}";
    }

    //list传参
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> names) {
        System.out.println("list  传参===》:" + names);
        return "{'list-param':'" + names + "'}";
    }

    //json list  传参
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("list common(json)参数传递 list ==>" + likes);
        return "{'listParamForJson':'"+ likes +"'}";
    }

    //pojo json 传参
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo common(json)参数传递 pojo ==>" + user);
        return "{'pojoParamForJson':'"+ user +"'}";
    }
    //list pojo  json 传参
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> user) {
        System.out.println("list pojo common(json)参数传递 list pojo ==>" + user);
        return "{'listPojoParamForJson':'"+ user +"'}";
    }
    //https://www.bilibili.com/video/BV1ZF411G7eP?t=1.0&p=10
}