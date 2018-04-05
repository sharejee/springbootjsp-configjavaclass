package com.jspconfigclass.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by : Ron Rith
 * Create Date: 04/05/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/home"})
    private String getHome(){
        return "home";
    }
}
