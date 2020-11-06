package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.mapper.SearchMapper;
import springboot.dto.Doctor;

/**
 * @author zzzz
 * @create 2019-08-29 下午12:06
 */
@Controller
public class Hello {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @Autowired
    SearchMapper service;

    @RequestMapping("/find/{id}")
    @ResponseBody
    public Doctor find(@PathVariable("id") int i) {
        Doctor result = new Doctor();
        result.setId("1");
        result.setName("aa");
        result.setObject("cc");
        return result;

    }
}
