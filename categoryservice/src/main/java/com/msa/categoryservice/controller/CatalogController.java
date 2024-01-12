package com.msa.categoryservice.controller;

import com.msa.categoryservice.exception.NoItemException;
import com.msa.categoryservice.service.DeleteCatalogService;
import com.msa.categoryservice.service.RegisterCatalogService;
import com.msa.categoryservice.service.SearchCatalogService;
import com.msa.categoryservice.vo.RequestCatalog;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CatalogController {

    private final RegisterCatalogService registerCatalogService;
    private final DeleteCatalogService deleteCatalogService;
    private final SearchCatalogService searchCatalogService;

    @PostMapping("/catalogs/items")
    public ResponseEntity<Object>  registerCatalog( final RequestCatalog requestCatalog ) {
        try{

        } catch(Exception e) {

        }

    }

    @PutMapping("/catalogs/items/{catalogId}")
    public ResponseEntity<Object> deleteCatalog( long catalogId ) {
        try{

        } catch(Exception e) {

        }

    }

    @GetMapping("/catalogs/items/{catalogId}")
    public ResponseEntity<Object> getCatalog( long catalogId ) {
        try{

        } catch(NoItemException e) {

        }
    }

    @GetMapping("/catalogs/items/categories/{category}")
    public ResponseEntity<Object> getCatalogs( String category ) {
        try{

        } catch(NoItemException e) {

        }
    }

}
