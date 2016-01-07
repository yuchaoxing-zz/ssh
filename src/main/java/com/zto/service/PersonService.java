package com.zto.service;

import java.util.List;

import com.zto.bean.Person;
import com.zto.dao.PersonDAO;

/**
 * ҵ������
 * @author ���
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
