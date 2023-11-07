package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.models.Task;

public interface CreateTaskUseCase {

    public Task createTask(Task task);
}
