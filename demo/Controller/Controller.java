
package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Person.Person;
import com.example.demo.service.Personservice;  

@RestController
@RequestMapping("/hello")  
public class Controller {  
    @Autowired  
    private Personservice perService;   
	public List<Person> getAllUsers(){  
        return getAllUsers();  
    }     
    @RequestMapping(value="/adduser", method=RequestMethod.POST)  
    public void addUser(@RequestBody Person per){  
           perService.addUser(per);

    } 
   
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public void getUser(@PathVariable long id){  
         perService.getUser(id); 
    }
        
    @RequestMapping(value="/user/", method=RequestMethod.DELETE)  
    public void deleteUser(@RequestBody Person id){  
          perService.delete(id);        
    }  
    
   @RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
    public void Updateuser(@PathVariable  long id ){
         perService.getUser(id);
   }
    @RequestMapping(value="/personRequestByDept",method = RequestMethod.POST)
   public String personRequestByDept (@RequestParam("DPt") String deptName, @RequestParam("Name") String Personname) {
    	System.out.println("------------------dpt "+ deptName);
    	System.out.println("------------------Name "+ Personname);
     return "my-page";
   
   }
   
   
   
   
    
    }