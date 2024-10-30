package oct26.Auth;

public class LoginManager {
    private String username;
    private String password;

    public LoginManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("User is Authenticated");
        }
        else {
            System.out.println("Invalid Credential");
        }
    }

    @Override
    public String toString() {
        return "LoginManager{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
