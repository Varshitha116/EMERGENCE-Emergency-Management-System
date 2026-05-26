package dao;

import config.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlertDAO {

    public void createAlert(int userId,
                            String alertType,
                            String locationName) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO alerts(user_id,alert_type,location_name) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, userId);
            ps.setString(2, alertType);
            ps.setString(3, locationName);

            ps.executeUpdate();

            System.out.println("Emergency Alert Triggered");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}