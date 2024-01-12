package com.msa.categoryservice.dto;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Slf4j
public class CatalogDto implements Serializable {

    private CatalogDto() {}

    public CatalogDto(Long id, String name, String description, String parent) {
        Id = id;
        this.name = name;
        this.description = description;
        this.parent = parent;
    }

    private Long Id;
    private String name;
    private String description;
    private String parent;

}
