package services;

import dao.AlertDAO;

public class AlertService {

    AlertDAO dao = new AlertDAO();

    public void triggerEmergency(int userId,
                                 String alertType,
                                 String location) {

        dao.createAlert(userId, alertType, location);

        System.out.println("Emergency Service Activated");
    }
}