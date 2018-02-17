public class User {
    private static int userCounter;
    private String userName;
    private String password;
    private boolean online;

    protected User(String userName, String password) {
        userCounter++;
        this.userName = userName;
        this.password = password;
        online = false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
