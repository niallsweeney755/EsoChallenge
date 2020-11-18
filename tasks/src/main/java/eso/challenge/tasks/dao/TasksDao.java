package eso.challenge.tasks.dao;

import eso.challenge.tasks.entity.Tasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksDao extends CrudRepository<Tasks, Integer> {
}
