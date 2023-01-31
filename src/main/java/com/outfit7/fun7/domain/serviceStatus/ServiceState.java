package com.outfit7.fun7.domain.serviceStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ServiceState {
    @JsonProperty("enabled")
    ENABLED,

    @JsonProperty("disabled")
    DISABLED
}
