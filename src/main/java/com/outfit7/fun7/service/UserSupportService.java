package com.outfit7.fun7.service;

import org.springframework.stereotype.Service;

@Service
public class UserSupportService implements IUserSupportService {
    @Override
    public boolean IsUserSupportAvailabled() {
        // TODO: Check current time in Ljubjana
        return false;
    }
}
