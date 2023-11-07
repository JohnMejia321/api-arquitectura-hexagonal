package com.hexagonal.application.usescases;

import com.hexagonal.domain.models.AdditionalTaskInfo;
import com.hexagonal.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.domain.ports.out.ExternalServicePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;



    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
