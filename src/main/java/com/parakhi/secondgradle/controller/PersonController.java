package com.parakhi.secondgradle.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parakhi.secondgradle.entity.Person;
import com.parakhi.secondgradle.services.PersonService;

@RestController
@RequestMapping("/dbpersons")
public class PersonController {
  @Autowired
  PersonService ps;

@RequestMapping(value="/all")
public List<Person> getAll() throws ClassNotFoundException, SQLException{
	return ps.getAll();
	
	
 }
 
	
	
}
