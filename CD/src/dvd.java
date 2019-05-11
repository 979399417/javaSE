public class dvd extends item{

    private String dictor;


    public void print() {
        System.out.print("dvd:");
        super.print();
        System.out.print(dictor);
    }
    public dvd(String title, String dictor,  int payingtime, String coment) {
       super(title,coment,payingtime,false);
        this.dictor=dictor;

        settitle("b");

    }

    public static void main(String[] args) {
         dvd dvd=new dvd("a","b",2,"...");
        dvd.print();
    }
}
