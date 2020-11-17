package OnetoOne;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
	public static void main(String[] args) {
		Empleado e = new Empleado("Alberto","Pachon","77749839H","mail",new Ficha_empleado());
		Transaction t = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			t = session.beginTransaction();
			session.save(e);
			t.commit();
		}catch(Exception e3){
			e3.printStackTrace();
		}
	}
}
