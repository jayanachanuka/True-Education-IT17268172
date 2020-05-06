package Model;

public class Login_Model {

    private String username;
    private String password;

    public Login_Model(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
