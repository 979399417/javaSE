import java.util.ArrayList;

public class datebase {

    //   private ArrayList<CD> listcd=new ArrayList<CD>();
    //  private ArrayList<dvd> listdvd=new ArrayList<dvd>();
    private ArrayList<item> listitem = new ArrayList<item>();
    /*public void list(){
        for(CD cd:listcd){
            cd.print();
        }
        for (dvd dvd:listdvd){
            dvd.print();
        }
    }*/

    //
    //public void add(dvd dvd){
    //   listdvd.add(dvd);
    // }
    public void add(item item) {
        listitem.add(item);
    }

    public void list() {
        for (item item : listitem) {
            item.print();
        }
    }

        public static void main (String[]args){
            datebase x = new datebase();

            x.add(new CD("abc", "abc", 4, 60, "..."));
            x.add(new CD("def", "def", 4, 60, "..."));
           // x.list();
            x.add(new dvd("xxx", "aaa,", 60, "..."));
            x.list();

        }
    }

