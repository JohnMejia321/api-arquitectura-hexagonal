package com.hexagonal.application.usescases;

import com.hexagonal.domain.models.Task;
import com.hexagonal.domain.ports.in.RetrieveTaskUseCase;
import com.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    @Autowired
    private final TaskRepositoryPort taskRepositoryPort;



    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
