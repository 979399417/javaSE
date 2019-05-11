import java.util.LinkedList;

public class sextmap002 {
    SxtEntrt[]rr =new SxtEntrt[999];
    LinkedList []arr=new LinkedList[999];
    int size;
    public void put(Object key,Object value){
        SxtEntrt e=new SxtEntrt(key, value);
        int a=key.hashCode()%arr.length;
        if (arr[a]==null){
            LinkedList list=new LinkedList();
            list.add(e);
            arr[a]=list;
        }
        else {
                LinkedList list=arr[a];
                for (int i=0;i<list.size(); i++){
                    SxtEntrt e2= (SxtEntrt) list.get(i);
                    if (e.key.equals(key)){
                        e2.value=value;
                    }
                }
            }
            arr[a].add(e);
        }
    public Object get(Object key){
        int a=key.hashCode()%arr.length;
        if (arr[a]!=null){
            LinkedList list=arr[a];
            for (int i=0;i<list.size(); i++){
                SxtEntrt e= (SxtEntrt) list.get(i);
                if (e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        sextmap002 m=new sextmap002();
        m.put("张三",new wife("lisi"));
        m.put("张三",new wife("llss"));
        wife aaa= (wife) m.get("张三");
        System.out.println(aaa.name);
    }
}
