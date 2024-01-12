package com.msa.categoryservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Slf4j
@Getter
public class Catalog {

    protected Catalog() {}

    public Catalog(String name, String description, Category category, int price, int stock) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    @Id
    @GeneratedValue
    private long Id;
    private String name;
    @Lob
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private Category category;
    private int price;
    private int stock;

    public void reduceStock( int consumedCatalogCount ) {
        this.stock -= consumedCatalogCount;
    }

}
