package com.example.demo.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.VehicleRepository;
import com.example.demo.model.Vehicle;

@Service
public class UserService{
	@Autowired
	private VehicleRepository vehiclerepository;
    public List<Vehicle> getAllUsers(){  
	       List  user = new ArrayList<>();  
	       vehiclerepository .findAll().forEach(user::add);  
	       return user;  
	    }  
	    
		public  Optional<Vehicle> getUser(long id){  
	          return  vehiclerepository.findById(id); 
	    }  
	    public void addUser(Vehicle ve){  
	    	vehiclerepository.save(ve);
	    }  
	   
	    public void delete(Vehicle id) {
	    	vehiclerepository.delete(id);
			
		}
	
	
	
}
