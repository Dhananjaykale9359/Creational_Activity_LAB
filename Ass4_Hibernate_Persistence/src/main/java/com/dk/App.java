package com.dk;

import java.time.LocalDate;
import java.time.LocalTime;

import com.dk.dao.DairyDao;
import com.dk.model.Dairy;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting Application...");

        DairyDao dairyDao = new DairyDao();
        
        // Creating a Dairy object with sample data
        Dairy dairy = new Dairy("Genious Farmm", 13, LocalTime.now(), LocalDate.now());
        
        // Save the Dairy object to the database
        dairyDao.saveDairy(dairy);
        
        System.out.println("Inserted Dairy ID: " + dairy.getMilkId());
    }
}
