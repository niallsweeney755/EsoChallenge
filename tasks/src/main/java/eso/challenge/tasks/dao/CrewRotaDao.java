package eso.challenge.tasks.dao;

import eso.challenge.tasks.entity.CrewRota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewRotaDao extends CrudRepository<CrewRota, Integer> {
}
