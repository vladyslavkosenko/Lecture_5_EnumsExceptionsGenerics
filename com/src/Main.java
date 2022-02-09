import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter you login");
        String login = in.nextLine();
        System.out.println("Enter you password");
        String password = in.nextLine();
        System.out.println("Confirm the password");
        String confirmPassword = in.nextLine();
        User user = new User(login, password, confirmPassword);
        user.start();

    }
}
