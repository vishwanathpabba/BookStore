package com.bookstore.com.bookstrore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Vishwanath PC on 7/23/2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
