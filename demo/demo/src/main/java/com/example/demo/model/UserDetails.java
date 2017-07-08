package com.example.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="UserDetails")
public class UserDetails 
             {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private   long    userId;
    private String userName;
   
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy="userdetails",fetch = FetchType.EAGER) 
         private List <Vehicle> userdetails_id;
	
	 public UserDetails(){
          
          }
          public UserDetails(long userId,String userName){
        	  this.userId=userId;
        	  this.userName=userName;
        	  
          }
          public String getuserName() {
      		return userName;
      	}

      	public List<Vehicle> getUserDetails() {
      		return userdetails_id;
      	}

      	public void setuserdetails_id(List<Vehicle> userdetails_id) {
      		this.userdetails_id= userdetails_id;
      	}

      	public long getuserId() {
      		return userId;
      	}

    }