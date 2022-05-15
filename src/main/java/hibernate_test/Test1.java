package hibernate_test;


import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Aleksandr", "Ivanov", "IT", 600);
            session.beginTransaction(); // всегда нужно открыть транзакцию
            session.save(emp);
            session.getTransaction().commit(); // всегда нужно закрыть транзацию

            System.out.println("Done");
            System.out.println(emp);
        }
        finally {
            factory.close();
        }
    }
}
