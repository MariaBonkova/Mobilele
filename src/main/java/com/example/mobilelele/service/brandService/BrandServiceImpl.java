package com.example.mobilelele.service.brandService;

import com.example.mobilelele.repository.BrandRepository;
import com.example.mobilelele.service.brandService.BrandService;
import com.example.mobilelele.service.init.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DataBaseInitService {
    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean existInDb() {
        return this.brandRepository.count()!=0;
    }
}
