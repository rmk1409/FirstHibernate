import org.hibernate.Session;

/**
 * Created by r.pogorelov on 13.09.2016.
 */
public class TestHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("rmk140987@gmail.com");
        emp.setFirstName("rmk");
        emp.setLastName("pogorelov");

        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
