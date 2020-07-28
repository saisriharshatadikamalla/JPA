package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import harsha.Test.User;

@RestController
public class MyRESTController {

	@Autowired
	ContactRepository repository;

	@GetMapping("/contacts")
	public Iterable<Contact> getContacts() {
		return repository.findAll();
	}

	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public ResponseEntity<String> addContact(@RequestBody Contact contact) {

		try {
	   repository.save();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<String>("user added successfully", HttpStatus.OK);

	}
	
	
	@RequestMapping(value = "/removeUser/{email}", method = RequestMethod.DELET)
	public ResponseEntity<String> deleteContact(@PathVariable(value = "email") String email) {
		Contact con =  repository.findByEmail(email);

		try {
			   repository.delete(con);
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}

		return new ResponseEntity<String>("user deleted", HttpStatus.OK);

	}
	
	
	@RequestMapping(value = "/keywordSearch/{keyword}", method = RequestMethod.GET)
	public ResponseEntity<String> getContact(@PathVariable(value = "keyword") {

		try {
	   repository.save();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<String>("user added successfully", HttpStatus.OK);

	}
	
	
}
