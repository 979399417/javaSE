import java.util.ArrayList;

public class MyAarrayList {
    /**
     * The value is used for object storage.
     */
   private Object[] value;

    /**
     * The count is the number of objects used.
     */
  private   int size;
    public MyAarrayList(){
        this(16);

    }
    public MyAarrayList(int size){
        value=new Object[size];

    }

    public void add(Object obj){
        value[size]=obj;
        size++;
        if (size>=value.length){
            //扩容
            int newCapacity=value.length*2;
            Object[]newlist=new  Object[newCapacity];
            for(int i=0;i<value.length;i++){
                newlist[i]=value[i];
            }
            value=newlist;
        }
    }
    public Object get(int index) {


        return value[index];

    }
    public static void main(String[] args){
        MyAarrayList list=new MyAarrayList(2);
        list.add("aaa");
        list.add(new Name("帅"));
     //   list.add("bbb");
        Name a=(Name) list.get(1);
        System.out.println(a.name);

    }

}

