package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.service.SearchService;
import springboot.zz.Doctor;

/**
 * @author zzzz
 * @create 2019-08-29 下午12:06
 */
@Controller
public class Hello {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @Autowired
    SearchService service;

    @RequestMapping("/find/{id}")
    @ResponseBody
 public Doctor find(@PathVariable("id") int i){

        return  service.search(i);

 }
}