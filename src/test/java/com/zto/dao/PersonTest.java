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

	
			
			
	/*//ִ��crud����
			
			//���
			StuInfo stu=new StuInfo();
			stu.setStuName("hibernate");
			stu.setStuSex("��");
			stu.setStuAge(10);
			stu.setStuAddress("ssh���");
			session.save(stu);*/
			
			/*//ɾ��
			StuInfo stu=new StuInfo();
			stu.setStuId(8);
			session.delete(stu);*/
			
			/*//�޸�
			StuInfo stu=new StuInfo();
			stu.setStuId(1);
			stu.setStuName("����");
			stu.setStuSex("��");
			stu.setStuAge(63);
			stu.setStuAddress("����");
			session.update(stu);*/
			
			
			/*//��ѯ1,֪��get��load������
			StuInfo stu=(StuInfo)session.get(StuInfo.class, 1);
			System.out.println(stu.getStuName());
			//��ѯ2
			StuInfo stu1=(StuInfo)session.load(StuInfo.class, 1);
			System.out.println(stu1.getStuName());*/
			
			/*//������޸ģ���idʱΪ�޸ģ�ûidʱΪ���
			StuInfo stu=new StuInfo();
			stu.setStuId(1);
			stu.setStuName("����");
			stu.setStuSex("��");
			stu.setStuAge(63);
			stu.setStuAddress("����");
			session.saveOrUpdate(stu);*/
	private static Configuration config;
	private static SessionFactory sf;
	private static Session session;
	private static Transaction tran;
			
	@BeforeClass
	public static void beforClass(){
		//��ȡ����Դ
		config=new Configuration().configure();
		//���ûỰ����
		sf=config.buildSessionFactory();
	}
	
	@Test
	public void findTest(){
		//����һ�λỰ
		session=sf.openSession();
		//����һ������
		tran=session.beginTransaction();
		
		Person person=(Person)session.get(Person.class, 1);
		System.out.println(person.getPersonname());
		
	}
	@Test
	public void addTest(){
		//����һ�λỰ
		session=sf.openSession();
		//����һ������
		tran=session.beginTransaction();
		
		Person person=new Person();
		person.setPersonname("����");
		person.setIdcard("61052819940119301x");
		session.save(person);
	}
	@Test
	public void updateTest(){
		//����һ�λỰ
		session=sf.openSession();
		//����һ������
		tran=session.beginTransaction();
		
		Person person=new Person();
		person.setPersonid(2);
		person.setPersonname("����");
		person.setIdcard("61052819940119301y");
		session.update(person);
	}
	
	@Test
	public void deleteTest(){
		//����һ�λỰ
		session=sf.openSession();
		//����һ������
		tran=session.beginTransaction();
		
		Person person=new Person();
		person.setPersonid(3);
		session.delete(person);
	}
	
	
	
	
	@AfterClass
	public static void afterClass(){
		//�ύ����
		tran.commit();
		//�ر�session
		session.close();
	}
	
}
