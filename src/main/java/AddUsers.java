import java.util.ArrayList;
import java.util.List;

public class AddUsers {
  private static  List<User> usersList = new ArrayList<User>();

  public static void addUser(String nameOfUser, String password){
        usersList.add(new User(nameOfUser, password));
    }

}
