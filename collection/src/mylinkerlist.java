public class mylinkerlist {
    private Noda first;
    private Noda last;
    private int size;
    public void add(Object obj) {
        Noda n=new Noda();
        if (first==null){
            n.setNext(null);
            n.setPervious(null);
            n.setObj(obj);
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
    public Noda noda(int index) {
        Noda temp = null;
        if (first != null) {
        } else {
            temp = first;
            for (int i = 0; i < index; i++) {
               temp=temp.next;
            }
        }
        return temp;
    }
    public void rrangecheck(int index){
        if (index>=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

