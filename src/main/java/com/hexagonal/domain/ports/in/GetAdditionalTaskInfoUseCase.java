package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);

}
