package uz.islombek;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

//            Person person = session.get(Person.class, 2);
//            System.out.println(person.getName() + " " + person.getAge());
//            Person person1 =  new Person("Islombek",29);
//            Person person2 =  new Person("Dildor",33);
//            Person person3 =  new Person("Bonu",25);
//
//            session.persist(person1);
//            session.persist(person2);
//            session.persist(person3);

            //delete
//            Person person = session.get(Person.class, 4);
//            session.remove(person);

            //update
            Person person = session.get(Person.class, 5);
            person.setName("Dildora");

            session.getTransaction().commit();
        } finally {
            factory.close();

        }
    }
}
