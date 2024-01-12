package com.msa.categoryservice.service.port;

import com.msa.categoryservice.domain.Catalog;
import com.msa.categoryservice.dto.CatalogDto;
import com.msa.categoryservice.exception.NoItemException;

import java.util.List;

public interface SearchCatalogPort {

    public CatalogDto searchCatalog ( Long catalogId ) throws NoItemException;
    public List<CatalogDto> searchCatalogs (String parentCatalogId ) throws NoItemException;
}
