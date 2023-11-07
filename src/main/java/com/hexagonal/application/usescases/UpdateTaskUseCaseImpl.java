package com.hexagonal.application.usescases;


import com.hexagonal.domain.models.Task;
import com.hexagonal.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@AllArgsConstructor
public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    @Autowired
    private final TaskRepositoryPort taskRepositoryPort;



    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepositoryPort.update(updatedTask);
    }



}
