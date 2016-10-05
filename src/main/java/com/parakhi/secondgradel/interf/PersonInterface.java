package com.parakhi.secondgradel.interf;

import java.sql.SQLException;
import java.util.List;

import com.parakhi.secondgradel.entity.Person;
public interface PersonInterface {

	public List<Person> getAll() throws ClassNotFoundException, SQLException;
}
