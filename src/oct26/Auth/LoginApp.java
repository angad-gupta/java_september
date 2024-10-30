package oct26.Auth;

public class LoginApp {
    public static void main(String[] args) {
        LoginManager user = new LoginManager("angad", "12345");

        System.out.println(user);

        user.login("angad", "12345");

        user.setPassword("123");

        System.out.println(user);

        user.login("angad", "123");

    }
}
