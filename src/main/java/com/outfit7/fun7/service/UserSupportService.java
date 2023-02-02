package com.outfit7.fun7.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.ZoneId;

@Service
public class UserSupportService implements IUserSupportService {

    private ZoneId userSupportZoneId;

    private LocalTime minWorkingHours;

    private LocalTime maxWorkingHours;

    public UserSupportService() {
        this.userSupportZoneId = ZoneId.of("Europe/Ljubljana");
        this.minWorkingHours = LocalTime.of(9, 0);
        this.maxWorkingHours = LocalTime.of(15, 0);
    }

    public UserSupportService(ZoneId userSupportZoneId, LocalTime minWorkingHours, LocalTime maxWorkingHours) {
        this.userSupportZoneId = userSupportZoneId;
        this.minWorkingHours = minWorkingHours;
        this.maxWorkingHours = maxWorkingHours;
    }

    @Override
    public boolean IsUserSupportAvailable() {
        var localTime = LocalTime.now(userSupportZoneId);
        return !minWorkingHours.isAfter(localTime) && !maxWorkingHours.isBefore(localTime);
    }
}
