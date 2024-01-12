package com.msa.categoryservice.service.port;

import com.msa.categoryservice.domain.Catalog;

public interface RegisterCatalogPort {

    public Long registerCatalog ( Catalog catalog ) throws Exception;
}
