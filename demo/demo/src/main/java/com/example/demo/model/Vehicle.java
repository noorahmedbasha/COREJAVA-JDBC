package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name="VEHICLE")
public class Vehicle 
{
    @Id
    @GeneratedValue
    
    private long vehicleId;
    private String vehicleName;
    
   
   @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
   @JoinColumn(name="userdetails_id")
    private UserDetails userdetails;
    public Vehicle(){}
  
    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    
    @Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + "]";
	}
    
    
    
    public UserDetails getUserDetails() {
		return userdetails;
	}

	public void setUserDetails(UserDetails userdetails) {
		this.userdetails= userdetails;
	}

  }