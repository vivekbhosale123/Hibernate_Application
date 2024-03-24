package org.techhub.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.techhub.Employee;

//import java.lang.module.Configuration;

public class ClientApplicationInsert {

	public static void main(String[] args) {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction t=s.beginTransaction();
		Query q=s.createQuery("select e.name,e.email from Employee e where e.id:=empid");
		List<Object[]>list=q.list();
		q.setParameter("empid",2);
		for(Object[]o:list )
		{
			System.out.println(o[0]+"\t"+o[1]);
		}
// partial query		Query q=s.createQuery("select e.name,e.email from Employee e");
//		List<Object[]>list=q.list();
//		for(Object []o:list)
//		{
//			System.out.println(o[0]+"\t"+o[1]);
//		}
		
//wild selection		Query q=s.createQuery("from Employee e");
//		List<Employee>list=q.list();
//		for(Employee e:list)
//		{
//			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail());
//		}
		
//on load method //		try
//		{
//		   Object obj=s.load(Employee.class,new Integer(1));
//		   if(obj!=null)
//		   {
//			   Employee e=(Employee)obj;
//			   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail());
//		   }
//		   else
//		   {
//			   System.out.println("not found");
//		   }
//				   
//		}
//		catch(Exception ex)
//		{
//			System.out.println(ex);
//		}
//		Employee e=new Employee();
//		e.setId(1);
//		e.setName("vickjj");
//		e.setEmail("v@gmail.com");
//		Employee e1=new Employee();
//		e1.setId(11);
//		e1.setName("namm");
//		e1.setEmail("v@gmail.com");
//		List<Employee>ee=new ArrayList<Employee>();
//		ee.add(e1);
//		ee.add(e);
//		s.save(e1);
//		s.save(e);
//		s.update(e);;
		t.commit();
		s.close();
	}

	private static Serializable Integer(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
