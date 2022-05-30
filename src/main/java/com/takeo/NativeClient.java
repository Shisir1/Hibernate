package com.takeo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.takeo.pojo.Employee;
import com.takeo.util.SessionUtil;


public class NativeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session ses = SessionUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		
//		NativeQuery query = ses.createSQLQuery("select e.* from employee where e.eno=:no");
//		
//		query.setParameter("no", 100);
//
//		//when we are selecting all the columns we can call as entityqueries
//		//should be register with addEntity()
//		query.addEntity(Employee.class);
//		
//		List<Employee>addRecords = query.getResultList();
//		
//		for(Employee emp : addRecords)
//		{
//			System.out.println(emp.getEno() + "\t" + emp.getFirstName() + "\t" + emp.getLastName() + emp.getEmail());
//		}
		
//		NativeQuery query = ses.createSQLQuery("select e.* from employee where e.eno=:no");
//		
//		//when we are selecting specific columns we can call as a scalar queries
//		query.addScalar("e.firstname");
//		query.addScalar("e.lastname");
//		
//		List<Object[]> addRecords = query.getResultList();
//		
//		for(Object obj[]: addRecords)
//		{
//			System.out.println(obj[0] + "\t" + obj[1]);
//		}
		
		NativeQuery query = ses.createSQLQuery("insert into employee values(200,'rani','yannam','yannam@gmail.com')");
		
		int count = query.executeUpdate();
		tx.commit();
		System.out.println("Records are inserted: " + count );
	}

}
