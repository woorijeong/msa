package com.msa.categoryservice.domain;

import com.msa.categoryservice.dto.CatalogDto;
import com.msa.categoryservice.exception.NoItemException;
import com.msa.categoryservice.service.port.DeleteCatalogPort;
import com.msa.categoryservice.service.port.SearchCatalogPort;
import com.msa.categoryservice.service.port.RegisterCatalogPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class CatalogDomainAdapter implements RegisterCatalogPort, DeleteCatalogPort, SearchCatalogPort {

    private final CatalogRepository catalogRepository;

    @Override
    public long deleteCatalog(Long catalogId) throws Exception {
        return 0;
    }

    @Override
    public Long registerCatalog(Catalog catalog) throws Exception {
        return null;
    }

    @Override
    public CatalogDto searchCatalog(Long catalogId) throws NoItemException {
        return null;
    }

    @Override
    public List<CatalogDto> searchCatalogs(String parentCatalogId) throws NoItemException {
        return null;
    }
}
