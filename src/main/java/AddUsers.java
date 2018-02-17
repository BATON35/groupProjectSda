import java.util.ArrayList;
import java.util.List;

public class AddUsers {
  private static  List<User> usersList = new ArrayList<User>();

  public static void addUser(User user){
        usersList.add(user);
      System.out.println("uzytkownik dodany do listy");
      System.out.println(usersList.get(0).getUserName());
    }

}
