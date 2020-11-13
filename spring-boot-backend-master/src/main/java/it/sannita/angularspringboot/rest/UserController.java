package it.sannita.angularspringboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.sannita.angularspringboot.model.User;
import it.sannita.angularspringboot.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
   
    private final UserRepository userRepository;
    
    public UserController(@Autowired UserRepository userRepository){
    	this.userRepository = userRepository;
    }
 
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
