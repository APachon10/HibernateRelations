package OneToMany;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		ArrayList<Empleado> employees = new ArrayList<Empleado>();

		Empleado a1 = new Empleado();
		Empleado a2 = new Empleado();

		Departamento h1 = new Departamento();
		employees.add(a1);
		employees.add(a2);
		h1.setE(employees);

		Transaction t = null;

		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			t = session.beginTransaction();
			session.save(a1);
			session.save(a2);
			session.save(h1);
			t.commit();
		}catch(Exception e){

		}
	}

}
