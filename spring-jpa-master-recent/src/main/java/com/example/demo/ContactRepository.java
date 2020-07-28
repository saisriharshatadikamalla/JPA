package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

	public Contact findByEmail(String email);
	
	@Query(value="select * from Contacts u where u.name like %:keyword% or u.email like %:keyword%", nativeQuery=true)
	List<Contacts> findUsersByKeyword(@Param("keyword") String keyword);
}
