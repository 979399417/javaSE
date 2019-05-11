import java.util.HashMap;
import java.util.Map;


class sxtmap {
   SxtEntrt[]arr=new SxtEntrt[990];
   int size;
   public static void main(String[] args) {
       Map map=new HashMap();
        map.put("张三",new wife("lisi"));
        wife v=(wife)map.get("张三");
        System.out.println(v.name);
       sxtmap m=new sxtmap();
       m.put("张三",new wife("李四"));
       wife a= (wife) m.get("张三");
   ;
       System.out.println(a.name);
   }
   public Object get(Object key){
       for (int i=0;i<size;i++){
           if(arr[i].key.equals(key)!=false){
               return arr[i].value ;
           }
       }
       return null;
   }
   public void put(Object key,Object value){
       SxtEntrt e=new SxtEntrt(key,value);
       arr[size++]=e;

   }

}

class SxtEntrt{
    Object key;
    Object value;

    public SxtEntrt(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}

class wife{
   String name;
   public wife(String name){
       this.name=name;
   }

}