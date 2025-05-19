package com.dk.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dk.model.Dairy;
import com.dk.util.Hibutil;

public class DairyDao {
    public void saveDairy(Dairy dairy) {
        Transaction transaction = null;
        
        try (Session session = Hibutil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(dairy); 
            transaction.commit();
            System.out.println("Data Saved Successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
