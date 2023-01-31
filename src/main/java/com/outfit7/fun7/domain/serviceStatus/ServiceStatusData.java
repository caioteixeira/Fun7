package com.outfit7.fun7.domain.serviceStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ServiceStatusData(@JsonProperty("multiplayer") ServiceState multiplayer,
                                @JsonProperty("user-support") ServiceState userSupport,
                                @JsonProperty("ads") ServiceState ads) {
    public ServiceStatusData(boolean multiplayer, boolean userSupport, boolean ads) {
        this(multiplayer ? ServiceState.ENABLED : ServiceState.DISABLED,
            userSupport ? ServiceState.ENABLED : ServiceState.DISABLED,
            ads ? ServiceState.ENABLED : ServiceState.DISABLED);
    }
}
