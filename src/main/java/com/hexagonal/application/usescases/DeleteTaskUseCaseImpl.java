package com.hexagonal.application.usescases;

import com.hexagonal.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    @Autowired
    private final TaskRepositoryPort taskRepositoryPort;



    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
