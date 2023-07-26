package com.nopainnogame.myShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home(){
        return """
                <html>
                <body>
                <h2 style="color: red;">MyShop</h2>
                </body>
                </html>
                """;
    }
}
