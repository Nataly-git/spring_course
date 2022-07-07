package lazy_init_exc;

import lazy_init_exc.Entity.Department;
import lazy_init_exc.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Department dep = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Artem", "Ivanov", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1500);
//            Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//
//            session.beginTransaction();
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("Done");

            ////////////////////////////////////////////
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            session.getTransaction().commit();
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            System.out.println("Done");

            ////////////////////////////////////////////
            session.beginTransaction();
            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());
            System.out.println("Done");
            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
