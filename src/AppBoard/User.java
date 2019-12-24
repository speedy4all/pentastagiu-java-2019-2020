package AppBoard;

public class User {
    private String mail;
    private String name;


    public User(String mail, String name) {
        this.mail = mail;
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User: " +
                "email='" + mail + '\'' +
                ", name='" + name + '\'' +
                '.';
    }

}
