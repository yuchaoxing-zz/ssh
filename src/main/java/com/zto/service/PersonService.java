package com.zto.service;

import java.util.List;

import com.zto.bean.Person;
import com.zto.dao.PersonDAO;

/**
 * ÒµÎñ²ã²Ù×÷
 * @author ÐÏÓî³¬
 *
 */
public class PersonService {

	private PersonDAO personDao;
	
	public List<Person> findAll(){
		return personDao.findAll();
	}

	public PersonDAO getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDAO personDao) {
		this.personDao = personDao;
	}
}
