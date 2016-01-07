package com.zto.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zto.bean.Person;

public class PersonTest {

	
			
			
	/*//执行crud操作
			
			//添加
			StuInfo stu=new StuInfo();
			stu.setStuName("hibernate");
			stu.setStuSex("男");
			stu.setStuAge(10);
			stu.setStuAddress("ssh框架");
			session.save(stu);*/
			
			/*//删除
			StuInfo stu=new StuInfo();
			stu.setStuId(8);
			session.delete(stu);*/
			
			/*//修改
			StuInfo stu=new StuInfo();
			stu.setStuId(1);
			stu.setStuName("成龙");
			stu.setStuSex("男");
			stu.setStuAge(63);
			stu.setStuAddress("北京");
			session.update(stu);*/
			
			
			/*//查询1,知道get和load的区别
			StuInfo stu=(StuInfo)session.get(StuInfo.class, 1);
			System.out.println(stu.getStuName());
			//查询2
			StuInfo stu1=(StuInfo)session.load(StuInfo.class, 1);
			System.out.println(stu1.getStuName());*/
			
			/*//保存或修改，有id时为修改，没id时为添加
			StuInfo stu=new StuInfo();
			stu.setStuId(1);
			stu.setStuName("成龙");
			stu.setStuSex("男");
			stu.setStuAge(63);
			stu.setStuAddress("北京");
			session.saveOrUpdate(stu);*/
	private static Configuration config;
	private static SessionFactory sf;
	private static Session session;
	private static Transaction tran;
			
	@BeforeClass
	public static void beforClass(){
		//读取数据源
		config=new Configuration().configure();
		//设置会话工厂
		sf=config.buildSessionFactory();
	}
	
	@Test
	public void findTest(){
		//开启一次会话
		session=sf.openSession();
		//开启一次事务
		tran=session.beginTransaction();
		
		Person person=(Person)session.get(Person.class, 1);
		System.out.println(person.getPersonname());
		
	}
	@Test
	public void addTest(){
		//开启一次会话
		session=sf.openSession();
		//开启一次事务
		tran=session.beginTransaction();
		
		Person person=new Person();
		person.setPersonname("李四");
		person.setIdcard("61052819940119301x");
		session.save(person);
	}
	@Test
	public void updateTest(){
		//开启一次会话
		session=sf.openSession();
		//开启一次事务
		tran=session.beginTransaction();
		
		Person person=new Person();
		person.setPersonid(2);
		person.setPersonname("李四");
		person.setIdcard("61052819940119301y");
		session.update(person);
	}
	
	@Test
	public void deleteTest(){
		//开启一次会话
		session=sf.openSession();
		//开启一次事务
		tran=session.beginTransaction();
		
		Person person=new Person();
		person.setPersonid(3);
		session.delete(person);
	}
	
	
	
	
	@AfterClass
	public static void afterClass(){
		//提交事务
		tran.commit();
		//关闭session
		session.close();
	}
	
}
