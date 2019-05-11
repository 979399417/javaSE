public class Noda {
     Noda pervious;
     Object obj;
     Noda next;
    public Noda(){

    }

    public Noda(Noda pervious, Object obj, Noda next) {
        this.pervious = pervious;
        this.obj = obj;
        this.next = next;
    }

    public Noda getPervious() {
        return pervious;
    }

    public void setPervious(Noda pervious) {
        this.pervious = pervious;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Noda getNext() {
        return next;
    }

    public void setNext(Noda next) {
        this.next = next;
    }
}
