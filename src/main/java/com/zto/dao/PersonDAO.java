package com.zto.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zto.bean.Person;
/**
 * DAO�����
 * @author ���
 *
 */
public class PersonDAO extends HibernateDaoSupport{

	public List<Person> findAll(){
		return this.getHibernateTemplate().find("from Person");
	}
}
