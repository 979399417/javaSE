import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class value{
    private int i;
    public void set(int i){
        this.i=i;
    }
    public int get(){
        return i;
    }
public String toString(){
        return ""+i;
}
}
public class notebook {
    private ArrayList<String> notes=new ArrayList<String>();
    public void add(String s){
        notes.add(s);
    }
    public int getsize(){
        return notes.size();
    }
    public String getnote(int index){
        return notes.get(index);

    }
    public void add(String s,int location){
        notes.add(location,s);
    }
    public void removenote(int index){
        notes.remove(index);
    }
        public String[] list() {
        String[] x=new String[notes.size()];
       /* for(int i=0;i<notes.size();i++){
            x[i]=notes.get(i);
          */  notes.toArray(x);
          return x;
    }

    public String getNotes(int index) {
        return notes.get(index);
    }

    public static void main(String[] args) {
        value v=new value();
        System.out.println(v);
        ArrayList<String> a=new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("first");
        System.out.println(a);
        HashSet<String> s=new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        System.out.println(s);
       /* for(String k:s){
            System.out.println(k);
        }*/
       /* value[] a=new value[10];
        for(int i=0;i<a.length;i++){
            a[i]=new value();
            a[i].set(i);
        }
        for(value v:a){
            System.out.println(v.get());
            v.set(0);
        }
        for(value v:a){
            System.out.println(v.get());
        }*/

     /*   int[] ia=new int[10];
        String[] a=new String[10];
        for(int i=0;i<a.length;i++){
            a[i]=""+i;
        }
        System.out.println(a.length);
        System.out.println(ia[0]+2);*/

       /* String[] a=new String[2];
         a[0]="first";
         a[1]="second";
        notebook nb=new notebook();
        nb.add("first");
        nb.add("second");
        System.out.println(nb.getsize());
        System.out.println(nb.getnote(0));
        System.out.println(nb.getnote(0));
        nb.add("third",1);
        System.out.println(nb.getnote(1));
        nb.removenote(1);
        String[] x=nb.list();
        for(String s:x){
            System.out.println(s);*/


        }


    }



