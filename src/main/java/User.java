public class User {
    private String userName;
    private String password;

    public User(String userName, String pasword) {
        this.userName = userName;
        this.password = pasword;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
