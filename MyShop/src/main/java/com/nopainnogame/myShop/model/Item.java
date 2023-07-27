package com.nopainnogame.myShop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private BigDecimal price;
    private String imgUrl;
}
