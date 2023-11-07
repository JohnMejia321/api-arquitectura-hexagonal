package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask(Long id, Task updatedTask);
}
