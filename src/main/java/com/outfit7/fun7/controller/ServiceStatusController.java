package com.outfit7.fun7.controller;

import com.outfit7.fun7.domain.serviceStatus.ServiceStatusData;
import com.outfit7.fun7.service.IAdsService;
import com.outfit7.fun7.service.IMultiplayerService;
import com.outfit7.fun7.service.IUserSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceStatusController {

    @Autowired
    IAdsService adsService;

    @Autowired
    IMultiplayerService multiplayerService;

    @Autowired
    IUserSupportService userSupportService;

    @GetMapping
    public ResponseEntity<ServiceStatusData> GetServiceStatus(
            @RequestParam("timezone") String timezone,
            @RequestParam("userId") String userId,
            @RequestParam("cc") String countryCode) {

        var areAdsEnabled = adsService.AreAdsEnabled();
        var isMultiplayerEnabled = multiplayerService.IsMultiplayerEnabledForUser(userId, countryCode);
        var isUserSupportAvailable = userSupportService.IsUserSupportAvailable();

        ServiceStatusData response = new ServiceStatusData(isMultiplayerEnabled, isUserSupportAvailable, areAdsEnabled);
        return ResponseEntity.ok(response);
    }
}
