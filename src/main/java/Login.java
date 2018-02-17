import java.util.Scanner;

public class Login {

    public static boolean isVaildLogin(String userName, String password) {

        System.out.println("Logowanie: uzytkownik " + userName);
        System.out.println("podaj hasło");
        Scanner sc = new Scanner(System.in);
        String validPassword = sc.nextLine();
        if (validPassword.equals(password)) {
            System.out.println("poprawne hasło");
            return true;
        }
        System.out.println("bledne hasło");
        return false;

    }
}

