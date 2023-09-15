package br.setebit.taskbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.setebit.taskbackend.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}
