package com.nopainnogame.myShop.controller;

import com.nopainnogame.myShop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class HomeController {
    private List<Item> items = List.of(
            new Item("Pen", new BigDecimal("20.0"), "https://images.pexels.com/photos/261450/pexels-photo-261450.jpeg?cs=srgb&dl=pexels-pixabay-261450.jpg&fm=jpg"),
            new Item("Benyar Blue", new BigDecimal("25.23"), "https://tmzegarki.pl/wp-content/uploads/2023/02/3688043e4e0fcb1830b744ac7c1a2f46.jpg"),
            new Item("Benyar X", new BigDecimal("30.23"), "https://tmzegarki.pl/wp-content/uploads/2020/01/cz-cz-1-miniatura.jpg")
    );

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", items);
        return "home";
    }
}
