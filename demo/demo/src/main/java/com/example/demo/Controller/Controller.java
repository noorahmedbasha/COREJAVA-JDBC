package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.model.Vehicle;  

@RestController
@RequestMapping("/hello")  
public  class Controller  {  
	
    @Autowired  
    private  UserService userservice;
	public List<Vehicle> getAllUsers(){  
        return getAllUsers();  
    }     
    @RequestMapping(value="/adduser", method=RequestMethod.POST)  
    public void addUser(@RequestBody Vehicle ve){  
           userservice.addUser(ve);

    } 
   
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public void getUser(@PathVariable long id){  
         userservice.getUser(id); 
    }
        
    @RequestMapping(value="/user/", method=RequestMethod.DELETE)  
    public void deleteUser(@RequestBody Vehicle id){  
           userservice.delete(id);        
    }  
}
