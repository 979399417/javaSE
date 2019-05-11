public class sxtlinkedlist {
    private Noda first;
    private Noda last;
    private int size;


    public void add(Object obj){
        Noda n=new Noda();
        if(first==null){
            n.setPervious(null);
            n.setObj(obj);
            n.setNext(null);
            first=n;
            last=n;
        }
        else {
            n.setPervious(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last=n;
            size++;
        }
    }
    public int size(){
        return size;
    }
    public Object get(int index){
        Noda temp=noda(index);
        if (temp!=null){
            return temp.obj;
        }
        return null;
    }
    public void remove(int index){
        Noda temp=noda(index);
        if (temp!=null){
            Noda up=temp.pervious;
            Noda down=temp.next;
            up.next=down;
            down.pervious=up;
        }
        size--;
    }
    public void add(int index,Object obj){
        Noda temp=noda(index);
        Noda newnoda=new Noda();
        newnoda.obj=obj;
        if (temp!=null){
            Noda up=temp.pervious;
            up.next=newnoda;
            newnoda.pervious=up;
            newnoda.next=temp;
            temp.pervious=newnoda;
            size++;
        }
    }
    private void rangecheck(int index){
        if (index>=size){
            try {
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public Noda noda(int index){
        rangecheck(index);
        Noda temp=null;
        if(first!=null){
        }
        else {
            temp=first;
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        sxtlinkedlist list=new sxtlinkedlist();
        list.add("aaa");
        list.add("vvv");
        list.add("vvv");
        list.add("vvv");
        list.add("vvv");
        list.add("vvv");
        list.remove(2);
        System.out.println(list.size);
    }

}
