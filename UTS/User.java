public class User extends UserProfile {

    public User(int user_ID, String username, String password, String name, int age, String email_Id, String doc) {
        super(user_ID, username, password, name, age, email_Id, doc);
    }

    public String logIn(int user_ID, String password) {
        if (getuser_ID() == user_ID && getPassword().equals(password)) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }

    public void recoverPassword() {
       System.out.println("Password recovery process initiated.");
    }

    public String logOut() {
        return "Logged out";
    }
}
