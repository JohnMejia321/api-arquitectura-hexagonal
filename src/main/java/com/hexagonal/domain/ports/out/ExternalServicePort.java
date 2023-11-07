package com.hexagonal.domain.ports.out;

import com.hexagonal.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {

    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);

}
