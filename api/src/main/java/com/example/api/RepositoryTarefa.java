package com.example.api;

import com.example.api.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTarefa extends JpaRepository<Tarefa, Integer> {
}
