public class User {
    private int id;
    private String usermame;
    private String password;
    public int age;

    public User(int id, String usermame, String password, int age) {
        this.id = id;
        this.usermame = usermame;
        this.password = password;
        this.age = age;
    }

    private User(int id){
        this.id=id;
    }
    public User(){}

    public User(int id, String usermame, String password) {
        this.id = id;
        this.usermame = usermame;
        this.password = password;
    }

    public void show(){
        System.out.println(id+":"+usermame+":"+password);
    }
    public void study(){
        System.out.println("学习");
    }
    public void study(String coursename){
        System.out.println(coursename+"正在学习" );
    }
}
