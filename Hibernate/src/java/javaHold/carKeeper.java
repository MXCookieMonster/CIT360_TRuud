/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaHold;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Tyden R
 */
public class carKeeper {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        CarObject car1 = new CarObject();
        car1.setId(20);
        car1.setManufacturer("Lamborghini");
        car1.setModel("Aventador");
        
        session.save(car1);
        t.commit();
        System.out.println("Car Successfully Sent");
        factory.close();
        session.close();
        
    }
}
