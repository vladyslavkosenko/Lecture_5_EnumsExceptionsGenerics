import java.util.Objects;

public class User {

    String password;
    String login;
    String confirmPassword;

    public User(String password, String login, String confirmPassword) {
        this.password = password;
        this.login = login;
        this.confirmPassword = confirmPassword;
    }


    public void start() {
        try {
            if (!login.matches("^[a-zA-Z0-9_]+$") || login.length() >= 20) {
                throw new WrongLoginException("Wrong login");
            } else if (!login.matches("^[a-zA-Z0-9_]+$") || !Objects.equals(login, confirmPassword)) {
                throw new WrongPasswordException("Wrong password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}



