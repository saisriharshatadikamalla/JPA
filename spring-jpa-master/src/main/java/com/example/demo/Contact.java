package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;

	public Contact() {

	}

	public Contact(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Column(unique = true)
	String email;

	/**
	 * @return the name
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param name the name to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToMany(targetEntity = Place.class)
	private List places;

	public List getPlaces() {
		return places;
	}

	public void setPlaces(List places) {
		this.places = places;
	}

}

class Place {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(targetEntity = Place.class)
	private List Contact;

	public List getContact() {
		return contacts;
	}

	public void setContact(List contact) {
		this.contact = contact;
	}

}