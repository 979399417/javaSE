import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class text01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("aaa");
        list.add(new Date());
        list.add(new dog());
        list.add(1234);
        System.out.println(list);
        List list2=new ArrayList();
        list2.add("bbb");
        list2.add("ccc");
        list.add(list2);
        String str=(String)list.get(0);
        System.out.println(str);

    }

}
class dog{
}