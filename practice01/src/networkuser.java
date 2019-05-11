public class networkuser {
    private String id;
    private String password;
    private String email;

    public networkuser(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public networkuser(String id, String password) {
        this.id = id;
        this.password = password;
        email=id+"@gameschool.com";
    }
}
