package com.outfit7.fun7.controller;

import com.outfit7.fun7.domain.serviceStatus.ServiceState;
import com.outfit7.fun7.domain.serviceStatus.ServiceStatusData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceStatusController {
    @GetMapping
    public ResponseEntity<ServiceStatusData> GetServiceStatus(
            @RequestParam("timezone") String timezone,
            @RequestParam("userId") String userId,
            @RequestParam("cc") String countryCode) {
        ServiceStatusData response = new ServiceStatusData(ServiceState.ENABLED, ServiceState.DISABLED, ServiceState.ENABLED);
        return ResponseEntity.ok(response);
    }
}
