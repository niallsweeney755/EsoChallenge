package eso.challenge.tasks.dao;

import eso.challenge.tasks.entity.IndividualRota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualRotaDao extends CrudRepository<IndividualRota, Integer> {
}
