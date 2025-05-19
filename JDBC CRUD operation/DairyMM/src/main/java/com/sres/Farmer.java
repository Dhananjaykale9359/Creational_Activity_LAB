package com.sres;

import java.util.Scanner;
import java.sql.*;

public class Farmer {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to Database
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "")) {
                int chs;
                do {
                    System.out.println("\n====== Farmer Management ======");
                    System.out.println("1. Insert");
                    System.out.println("2. Display");
                    System.out.println("3. Update");
                    System.out.println("4. Delete");
                    System.out.print("Enter your choice: ");
                    int ch = sc.nextInt();

                    switch (ch) {
                        case 1:
                            // Insert Operation
                            try (PreparedStatement ps = con.prepareStatement("INSERT INTO Farmers (IdNo, Name, Locality, Account_No, Phone_No) VALUES (?, ?, ?, ?, ?)")) {
                                System.out.print("Enter Farmer ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter Name: ");
                                String name = sc.nextLine();

                                System.out.print("Enter Locality: ");
                                String locality = sc.nextLine();

                                System.out.print("Enter Account Number: ");
                                int accountNo = sc.nextInt();

                                System.out.print("Enter Phone Number: ");
                                long phoneNo = sc.nextLong();

                                ps.setInt(1, id);
                                ps.setString(2, name);
                                ps.setString(3, locality);
                                ps.setInt(4, accountNo);
                                ps.setLong(5, phoneNo);

                                int i = ps.executeUpdate();
                                System.out.println("✅ Farmer inserted successfully!");
                            }
                            break;

                        case 2:
                            // Display Operation
                            try (Statement st = con.createStatement();
                                 ResultSet rs = st.executeQuery("SELECT * FROM Farmers")) {
                                System.out.println("\nID\tName\tLocality\tAccount No\tPhone No");
                                System.out.println("-----------------------------------------------------------");
                                while (rs.next()) {
                                    System.out.println(rs.getInt(1) + "\t" +
                                                       rs.getString(2) + "\t" +
                                                       rs.getString(3) + "\t" +
                                                       rs.getInt(4) + "\t" +
                                                       rs.getLong(5));
                                }
                            }
                            break;

                        case 3:
                            // Update Operation
                            try (PreparedStatement ps = con.prepareStatement("UPDATE Farmers SET Name=?, Locality=?, Account_No=?, Phone_No=? WHERE IdNo=?")) {
                                System.out.print("Enter ID to update: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter New Name: ");
                                String name = sc.nextLine();

                                System.out.print("Enter New Locality: ");
                                String locality = sc.nextLine();

                                System.out.print("Enter New Account Number: ");
                                int accountNo = sc.nextInt();

                                System.out.print("Enter New Phone Number: ");
                                long phoneNo = sc.nextLong();

                                ps.setString(1, name);
                                ps.setString(2, locality);
                                ps.setInt(3, accountNo);
                                ps.setLong(4, phoneNo);
                                ps.setInt(5, id);

                                int i = ps.executeUpdate();
                                System.out.println(i > 0 ? "✅ Record updated successfully!" : "⚠ No record found with that ID.");
                            }
                            break;

                        case 4:
                            // Delete Operation
                            try (PreparedStatement ps = con.prepareStatement("DELETE FROM Farmers WHERE IdNo=?")) {
                                System.out.print("Enter ID to delete: ");
                                int id = sc.nextInt();

                                ps.setInt(1, id);
                                int i = ps.executeUpdate();
                                System.out.println(i > 0 ? "✅ Record deleted successfully!" : "⚠ No record found with that ID.");
                            }
                            break;

                        default:
                            System.out.println("❌ Invalid choice!");
                    }

                    System.out.print("\nPress 0 to continue, any other key to exit: ");
                    chs = sc.nextInt();
                } while (chs == 0);
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
