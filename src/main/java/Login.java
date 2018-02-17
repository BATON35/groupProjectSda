import java.util.Scanner;

public class Login {


    public static boolean isVaildLogin(User user) {

        System.out.println("Logowanie: uzytkownik " + user.getUserName());
        System.out.println("podaj hasło");
        Scanner sc = new Scanner(System.in);
        String validPassword = sc.nextLine();
        if (validPassword.equals(user.getPassword())) {
            System.out.println("poprawne hasło");
            return true;
        }
        System.out.println("bledne hasło");
        return false;

    }
}

