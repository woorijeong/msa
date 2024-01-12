package com.msa.categoryservice.vo;

import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Slf4j
public class ResponseCatalog implements Serializable {

    private ResponseCatalog() {
    }

    private Long Id;
    private String name;
    private String description;
    private String parent;
}
