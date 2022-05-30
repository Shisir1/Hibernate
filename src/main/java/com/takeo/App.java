package com.takeo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.pojo.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Step 1 : Configure Object 
    	Configuration cfg = new Configuration();
    	
    	cfg.configure("com/takeo/config/hibernate.cfg.xml");
    	
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    	//Step 2 : Build Session Factory
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	//Step 3 : Obtain the Session 
    	Session ses = factory.openSession();
    	Transaction tx = ses.beginTransaction();
    	
//    	Session ses1 = factory.openSession();
    	
    	//Only require for update, deletion
//    	Transaction tx1 = ses.beginTransaction();
    	
    	//Step 4 : Bulk Operations 
    	
    	//to fetch all the records
//    	Query query = ses.createQuery("from Employee");
//    	List <Employee> empRecords = query.getResultList();
//    	
//    	for(Employee emp : empRecords)
//    	{
//    		System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t" + emp.getEmail());
//    	}
    	
    	//From Employee where eno > 101
//    	Query query = ses.createQuery("from Employee where eno > 101");
//    	
//    	List <Employee> empRecords = query.getResultList();
//    	
////    	for(Employee emp : empRecords)
////    	{
////    		System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t" + emp.getEmail());
////    	}
//    	
//    	//java 8 : Lambda Expression
//    	empRecords.forEach(emp -> {
//    		System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t" + emp.getEmail());
//    	});
////    	
//    	//Stream() 
////    	empRecords.stream().forEach(emp -> 
////    	System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t" + emp.getEmail());
////    	);
    	
    	//to Fetch specific Columns
//    	Query query = ses.createQuery("select firstName, lastName, from Employee");
//    	
//    	List <Object[]> addRecords = query.getResultList();
//    	
//    	for(Object obj[] : addRecords)
//    	{
//    		System.out.println(obj[0] + "\t" + obj[1]);
//    	}
    	
//    	//to Fetch specific Columns
//    	Query query1 = ses.createQuery("select firstName, lastName, from Employee");
//    	
//    	List <Object[]> addRecords1 = query1.getResultList();
//    	
//    	for(Object obj[] : addRecords1)
//    	{
//    		System.out.println(obj[0] + "\t" + obj[1]);
//    	}
    	
    	//to Fetch specific Columns
//    	Query query1 = ses.createQuery("select firstName from Employee");
//    	
//    	List <Object[]> addRecords1 = query1.getResultList();
//    	
//    	for(Object name : addRecords1)
//    	{
//    		System.out.println(name);
//    	}
    	
//    	Query query = ses.getNamedQuery("find.all");
//    	
//    	//set the value for NamedQuery
//    	query.setParameter("no",100);
//    	
//    	List<Employee>addRecords = query.getResultList();
//    	
//    	addRecords.stream().forEach(emp -> 
//    	{
//    		System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t" + emp.getEmail());
//    	}
//    	);
    	
    	//getting data in descending order
//    	String hql_query = "from Employee a ORDER BY a.eno desc";
//    	
//    	Query query = ses.createQuery(hql_query);
//    	
//    	List<Employee>addRecords = query.getResultList();
//    	
//    	addRecords.stream().forEach((emp) -> 
//    	{
//    		System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + "\t" + emp.getEmail());
//    	}
//    	);
    	
    	//updating the data in the database
    	//e is elias name for Employee
//    	Query query = ses.createQuery("update Employee e set e.lastName =:name ");
//    	
//    	query.setParameter("name", "Humagain");
//    	
//    	int count = query.executeUpdate();
//    	tx.commit();
//    	System.out.println("Number of rows updated : " + count);
//  
    	//update only specific column
    	Query query = ses.createQuery("update Employee e set e.lastName =:name where eno =: no ");
    	query.setParameter("no", 100);
    	
    	query.setParameter("name", "H");
    	
    	int count = query.executeUpdate();
    	tx.commit();
    	System.out.println("Number of rows updated : " + count);
  
    }
}
