public class Person {
    private String name;
    private int age;
    public void display(){
        System.out.println(name+age);
    }

    public static void main(String[] args) {
        Person a=new Person();
        a.name="杨景";
        a.age=19;
        a.display();
    }
}
