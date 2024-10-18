public class UserProfile {
    private int user_ID;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;

    public UserProfile(int user_ID, String username, String password, String name, int age, String email_id, String doc) {
        this.user_ID = user_ID;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    public int getuser_ID() {
        return user_ID;
    }

    public String getPassword() {
        return password;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email_id;
    }

    public void editProfile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
    }

    public void showDocuments() {
        if (doc != null) {
            System.out.println("Document: " + doc);
        } else {
            System.out.println("Document tidak ditemukan ");
            
        }
    }
}

