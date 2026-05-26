package services;

import dao.AlertDAO;

public class AlertService {

    AlertDAO dao = new AlertDAO();

    public void triggerEmergency(int userId,
                                 String alertType,
                                 String location) {
                                               
     System.out.println("Sending alert to emergency contacts...");

        dao.createAlert(userId, alertType, location);

        System.out.println("Emergency Service Activated");
    }
}