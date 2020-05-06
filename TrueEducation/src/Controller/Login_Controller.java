package Controller;

import Model.Login_Model;
import View.Dashboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.persistence.internal.oxm.mappings.Login;

public class Login_Controller {

    public boolean Login_Controller(Login_Model login) {

        boolean isSuccess = false;

        try {
            Connection conn;
            PreparedStatement ps;

            String userName = login.getUsername();
            String password = login.getPassword();

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/True_Edu", "test", "123");
            ps = conn.prepareStatement("SELECT * FROM SIGN_UP WHERE USERNAME = ? AND PASSWORD = ?");

            ps.setString(1, userName);
            ps.setString(2, String.valueOf(password));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isSuccess = true;
                String userType = rs.getString("USERTYPE");
                switch (userType) {
                    case "Admin":                       
                        Dashboard home = new Dashboard();
                        home.lblUsername.setText(userName);
                        home.setVisible(true);
                        break;
                    //Handle other userType here
                    case "Marketing Officer":
                        break;
                    default:
                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isSuccess;
    }
}
