package com.parakhi.secondgradel.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.parakhi.secondgradel.entity.Person;
import com.parakhi.secondgradel.interf.PersonInterface;
import com.parakhi.secondgradle.utility.DbConnect;

@Service
@Qualifier("PersonService")
public class PersonService {
	@Autowired
	DbConnect dbCon;
	
	 public PersonService() {
		 dbCon=new DbConnect();
	}

	
	 
	 public List<Person> getAll() throws ClassNotFoundException, SQLException{
		List<Person> personList=new ArrayList<Person>();
		 String sql = "SELECT *FROM tbl_person";
		 dbCon.open();
		 com.mysql.jdbc.PreparedStatement stmt=dbCon.initStatement(sql);
         ResultSet rs = dbCon.executeQuery(stmt);
         while (rs.next()) {
            Person person=new Person();
            person.setId(rs.getInt("person_id"));
            person.setName(rs.getString("person_name"));;
            person.setEmail(rs.getString("person_email"));
            person.setPhone(rs.getString("person_phone"));
            personList.add(person);
             
                           }
         dbCon.close();
		return personList;
		
	}
	
	

}
