package dao;

import config.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactDAO {

    public void addContact(int userId,
                           String contactName,
                           String phone,
                           String relationName) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO contacts(user_id,contact_name,phone,relation_name) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, userId);
            ps.setString(2, contactName);
            ps.setString(3, phone);
            ps.setString(4, relationName);

            ps.executeUpdate();

            System.out.println("Contact Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}