package com.parakhi.secondgradle.interf;

import java.sql.SQLException;
import java.util.List;

import com.parakhi.secondgradle.entity.Person;
public interface PersonInterface {

	public List<Person> getAll() throws ClassNotFoundException, SQLException;
}
