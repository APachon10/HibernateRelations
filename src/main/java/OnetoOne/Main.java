package OnetoOne;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
	public static void main(String[] args) {
		String dateFormat = "MM-dd-yyyy";
		try {
			DateFormat df = new SimpleDateFormat(dateFormat);
			Date date = (Date) df.parse("04-02-1995");
			Empleado e = new Empleado("Alberto","Pachon","77749839H",date,"mail",new Ficha_empleado());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Transaction t = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			t = session.beginTransaction();
			session.save(e);
			session.save(a2);
			session.save(h1);
			t.commit();
		}catch(Exception e){

		}
	}
}
