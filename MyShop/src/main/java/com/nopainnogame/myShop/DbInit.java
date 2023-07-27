package com.nopainnogame.myShop;

import com.nopainnogame.myShop.model.Item;
import com.nopainnogame.myShop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.saveAll(List.of(
                new Item("Pen", new BigDecimal("20.0"), "https://images.pexels.com/photos/261450/pexels-photo-261450.jpeg?cs=srgb&dl=pexels-pixabay-261450.jpg&fm=jpg"),
                new Item("Benyar Blue", new BigDecimal("25.23"), "https://tmzegarki.pl/wp-content/uploads/2023/02/3688043e4e0fcb1830b744ac7c1a2f46.jpg"),
                new Item("Benyar X", new BigDecimal("30.23"), "https://tmzegarki.pl/wp-content/uploads/2020/01/cz-cz-1-miniatura.jpg")
        ));
    }
}
