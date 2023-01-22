package com.outfit7.fun7.domain.serviceStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ServiceStatusData(@JsonProperty("multiplayer") ServiceState multiplayer,
                                @JsonProperty("user-support") ServiceState userSupport,
                                @JsonProperty("ads") ServiceState ads) {
}
