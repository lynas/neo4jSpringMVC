package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LynAs on 7/19/2016
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }

}
