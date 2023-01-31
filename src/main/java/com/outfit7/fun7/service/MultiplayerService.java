package com.outfit7.fun7.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplayerService implements IMultiplayerService{

    String UnitedStatesCountryCode = "US";

    @Override
    public boolean IsMultiplayerEnabledForUser(String userId, String cc) {
        // TODO: Check number of user accesses
        return UnitedStatesCountryCode.equals(cc);
    }
}
