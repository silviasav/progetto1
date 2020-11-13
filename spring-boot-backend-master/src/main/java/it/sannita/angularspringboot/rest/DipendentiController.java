package it.sannita.angularspringboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import it.sannita.angularspringboot.repository.DipendentiRepository;
import it.sannita.angularspringboot.model.User;
import it.sannita.angularspringboot.model.Dipendente;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("dipendente")

public class DipendentiController {

	private final DipendentiRepository repository;

	public DipendentiController(@Autowired DipendentiRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	
	public List<Dipendente> getDipendente() {
		return (List<Dipendente>)repository.findAllDipendenti();
	}	

	@GetMapping("/findByName")
	public List<Dipendente> getDipendente(@RequestParam String nome) {
		return repository.findByName(nome);
	}
	
	@PostMapping("/insertDipendente")
    void addDipendente(@RequestBody Dipendente dipendente) {
        repository.save(dipendente);
    }

}
