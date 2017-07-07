package com.example.demo.Person;
import javax.persistence.*;
@Entity
@Table(name = "personA")
public class Person {  
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String DPt;
    
    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private PersonOrganisations personOrganisation;
    
    public Person(){}
    
   public Person(String name){
    this.name=name;
    
    }
    
    public Person(String name, PersonOrganisations personOrganisation){
        this.name = name;
        this.personOrganisation = personOrganisation;
    }

    
    @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", DPt=" + DPt + ", personOrganisation=" + personOrganisation
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDPt() {
		return DPt;
	}

	public void setDPt(String dPt) {
		DPt = dPt;
	}

	public PersonOrganisations getPersonOrganisation() {
		return personOrganisation;
	}

	public void setPersonOrganisation(PersonOrganisations personOrganisation) {
		this.personOrganisation = personOrganisation;
	}
    
    
}
   
