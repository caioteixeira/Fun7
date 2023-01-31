package com.outfit7.fun7.service;

import org.springframework.stereotype.Service;

@Service
public class AdsService implements IAdsService {
    @Override
    public boolean AreAdsEnabled() {
        //TODO: Fetch endpoint
        return true;
    }
}
