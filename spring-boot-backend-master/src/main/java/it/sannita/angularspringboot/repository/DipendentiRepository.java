package it.sannita.angularspringboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.sannita.angularspringboot.model.Dipendente;
import java.util.List;


public interface DipendentiRepository extends CrudRepository<Dipendente, Integer>{
	@Modifying
	@Transactional
	

	@Query( value = "select * from hrmanagement.dipendente where nome = ?", nativeQuery = true)
	List<Dipendente> findByName(String nome);
	
	@Query( value = "select * from hrmanagement.dipendente", nativeQuery = true)
	List<Dipendente> findAllDipendenti();
	
	
	
}
