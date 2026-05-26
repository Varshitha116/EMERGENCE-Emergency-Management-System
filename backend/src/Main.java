import dao.ContactDAO;
import dao.UserDAO;
import services.AlertService;

public class Main {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();

        userDAO.registerUser(
                "Varshitha",
                "varshitha@gmail.com",
                "1234"
        );

        ContactDAO contactDAO = new ContactDAO();

        contactDAO.addContact(
                1,
                "Mother",
                "9876543210",
                "Parent"
        );

        AlertService alertService = new AlertService();

        alertService.triggerEmergency(
                1,
                "Medical Emergency",
                "Hyderabad"
        );

    }
}