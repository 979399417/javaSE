public class animal {
    String str;
    public void voice(){
        System.out.println("叫声");

    }
    public class Cat extends animal{
        public void voice(){
            System.out.println("喵喵喵");
        }
    }
    class Dog extends animal{
        public void voice(){
            System.out.println("汪汪汪");
        }
    }
    class Tiger extends animal{
        public void voice(){
            System.out.println("哇哇哇");
        }
    }

}
