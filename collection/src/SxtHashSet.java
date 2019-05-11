import java.util.HashMap;
import java.util.HashSet;

public class SxtHashSet {
    HashMap map;

    private static final Object PRESENT=new Object();
    public SxtHashSet() {
        map= new HashMap();
    }
    public int size(){
        return map.size();
    }
    public void add(Object O){
        map.put(O,PRESENT);
    }
    public static void main(String[] args) {
        SxtHashSet set=new SxtHashSet();
        set.add("aaa");
        set.add(new String("aaa"));
        System.out.println(set.size());
    }
}
