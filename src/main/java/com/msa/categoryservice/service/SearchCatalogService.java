package com.msa.categoryservice.service;

import com.msa.categoryservice.service.port.SearchCatalogPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SearchCatalogService {

    private final SearchCatalogPort searchCatalogPort;

}
