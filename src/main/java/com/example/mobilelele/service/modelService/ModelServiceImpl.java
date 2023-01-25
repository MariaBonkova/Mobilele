package com.example.mobilelele.service.modelService;

import com.example.mobilelele.repository.ModelRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import com.example.mobilelele.service.modelService.ModelService;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService, DataBaseInitService {
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean existInDb() {
        return this.modelRepository.count()!=0;
    }
}
