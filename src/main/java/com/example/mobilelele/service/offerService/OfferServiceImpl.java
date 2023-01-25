package com.example.mobilelele.service.offerService;

import com.example.mobilelele.repository.OfferRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import com.example.mobilelele.service.offerService.OfferService;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService, DataBaseInitService {
    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean existInDb() {
        return this.offerRepository.count()!=0;
    }
}
