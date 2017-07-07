package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.example.demo.Person.Person;
import com.example.demo.Repository.PersonReposirtory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Personservice {
    @Autowired  
    private   PersonReposirtory personrepo;  
    public List<Person> getAllUsers(){  
        List<Person>user = new ArrayList<>();  
          personrepo.findAll().forEach(user::add);  
        return user;  
    }  
    public  Optional<Person> getUser(Long id){  
          return  personrepo.findById(id); 
    }  
    public void addUser(Person per){  
        personrepo.save(per);  
    }  
   
    public void delete(Person id) {
	personrepo.delete(id);
		
	}

    
}  