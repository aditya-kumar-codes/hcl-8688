package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
//      Student s1=new Student();
//      s1.setName("Aditya");
//      s1.setRollno(1);
//      s1.setMarks(45);
        Laptop l1=new Laptop();
        l1.setLname("ROG");
        l1.setBrand("ASUS");
        l1.setLid(154);

        Alien  a1=new Alien();
        a1.setAname("Adi");
        a1.setAid(001);
        a1.setTech("java");
        a1.setLaptop(l1);
////        Student s2=new Student();
//        s2.setName("Sharma");
//        s2.setRollno(2);
//        s2.setMarks(46);
        //System.out.println(s1);
        Student s2=null;
        //Configuration cfg=new Configuration();
       // cfg.addAnnotatedClass()
        // cfg.configure();
        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .configure()
                .buildSessionFactory();

        //Adding data to table
        Session session=sf.openSession();
        Transaction transaction= session.beginTransaction();
       // s2=session.get(Student.class,1);
        session.persist(a1);
       transaction.commit();
//
//        //data adition to table
//
//        //deleting student
//        s1 = session.get(Student.class, 1);
//        //Transaction transaction = session.beginTransaction();
//        session.remove(s1);
//        transaction.commit();



        System.out.println(a1);


    }
}
