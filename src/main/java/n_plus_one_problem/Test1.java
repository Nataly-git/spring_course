package n_plus_one_problem;

import lazy_init_exc.Entity.Department;
import lazy_init_exc.Entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;

import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(lazy_init_exc.Entity.Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            session.beginTransaction();
//            List list = session.createQuery("select d from departments d").getResultList();
//            for(Object object : list) {
//                Department department = (Department) object;
//                System.out.println(department.getDepartmentName() + " " + department.getEmps());
//            }
//            session.getTransaction().commit();

            //////////////////////////////////////

            session.beginTransaction();
            List list = session.createQuery("select d from departments d join fetch d.emps e").getResultList();
            for(Object object : list) {
                Department department = (Department) object;
                System.out.println(department.getDepartmentName() + " " + department.getEmps());
            }
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
        }
    }
