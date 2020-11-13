package it.sannita.angularspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import it.sannita.angularspringboot.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	
	
}
