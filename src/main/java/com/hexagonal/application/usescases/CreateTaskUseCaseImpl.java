package com.hexagonal.application.usescases;

import com.hexagonal.domain.models.Task;
import com.hexagonal.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    @Autowired
    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }

}
