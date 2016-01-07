package com.zto.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zto.bean.Person;
import com.zto.service.PersonService;
/**
 * Action²ã²Ù×÷person
 * @author ÐÏÓî³¬
 *
 */
public class PersonAction extends ActionSupport{

	private PersonService personService; 
	
	public String findAll(){
		System.out.println("----------------------------------------");
		List<Person> list=personService.findAll();
		for (Person person : list) {
			System.out.println(person.getPersonname()+"+++++++++++++++++++++++++++++++");
		}
		ServletActionContext.getRequest().getSession().setAttribute("LIST", list);
		return "index";
	}
	
	public PersonService getPersonService() {
		return personService;
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
}
