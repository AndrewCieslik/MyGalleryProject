package com.nopainnogame.myShop.controller;

import com.nopainnogame.myShop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    static List<Item> items = new ArrayList<>();

    static {
        items.add(new Item("Pen", new BigDecimal("20.0"), "https://images.pexels.com/photos/261450/pexels-photo-261450.jpeg?cs=srgb&dl=pexels-pixabay-261450.jpg&fm=jpg"));
        items.add(new Item("Benyar Blue", new BigDecimal("25.23"), "https://tmzegarki.pl/wp-content/uploads/2023/02/3688043e4e0fcb1830b744ac7c1a2f46.jpg"));
        items.add(new Item("Benyar X", new BigDecimal("30.23"), "https://tmzegarki.pl/wp-content/uploads/2020/01/cz-cz-1-miniatura.jpg"));
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", items);
        return "home";
    }
}
