package com.example.demo.Person;

import javax.persistence.*;

@Entity
@Table(name = "personB")
public class PersonOrganisations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Long numberOfpersons;

	public PersonOrganisations() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getNumberOfpersons() {
		return numberOfpersons;
	}

	public void setNumberOfpersons(Long numberOfpersons) {
		this.numberOfpersons = numberOfpersons;
	}

	@Override
	public String toString() {
		return "PersonOrganisations [id=" + id + ", numberOfpersons=" + numberOfpersons + "]";
	}

	public PersonOrganisations(long id, Long numberOfpersons) {
		super();
		this.id = id;
		this.numberOfpersons = numberOfpersons;
	}
}
