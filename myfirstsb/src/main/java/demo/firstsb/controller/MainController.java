package demo.firstsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController{
    @GetMapping(value = "/")
    //@ResponseBody
    public String index() {
        return "index.html";
        //return "<h1>Hi!</h1>";
    }
    
}

