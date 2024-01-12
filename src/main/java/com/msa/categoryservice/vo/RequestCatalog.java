package com.msa.categoryservice.vo;

import com.msa.categoryservice.domain.Category;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Slf4j
public class RequestCatalog implements Serializable {

    private RequestCatalog() {}

    @NotNull
    @Size( min = 1 )
    private String name;
    @NotNull
    @Size( min = 1 )
    private String description;
    @Enum(enumClass = Category.class, ignoreCase = true)
    private String category;

    @NotNull
    @Min(value = 0)
    private int price;

    @NotNull
    @Min(value = 1)
    private int stock;

}
