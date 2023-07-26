package com.nopainnogame.myShop.controller;

import com.nopainnogame.myShop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("item",new Item("Pen", new BigDecimal("20.0"), "https://images.pexels.com/photos/261450/pexels-photo-261450.jpeg?cs=srgb&dl=pexels-pixabay-261450.jpg&fm=jpg"));
        //return );
        return "home";
    }
}
