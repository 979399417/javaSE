import com.company.Main;

import java.util.HashMap;
import java.util.Map;

public class sxtmap {
    SxtEntrt[]arr=new SxtEntrt[990];
    int size;
    public static void main(String[] args) {
        Map map=new HashMap();
     //   map.put("张三",new wife("lisi"));
       // wife v=(wife)map.get("张三");
       // System.out.println(v.name);
        sxtmap m=new sxtmap();
        m.put("张三",new wife("李四"));
        wife w=(wife)m.get("张三");
        System.out.println(w.name);
    }
    class SxtEntrt{
        Object key;
        Object value;
    }
    public Object get(Object key){
        for (int i=0;i<size;i++){
            if(arr[i].key.equals(key)){
                return arr[i].value ;
            }
        }
        return null;
    }
    public void put(Object key,Object value){
        SxtEntrt e=new SxtEntrt();
        arr[size++]=e;

    }
    static class wife{
        String name;
        public wife(String name){
            this.name=name;
        }

    }
}
