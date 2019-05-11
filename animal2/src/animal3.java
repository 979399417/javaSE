public class animal3 {
    String str;
    public void voice(){
        System.out.println("叫声");

    }
    public class Cat extends animal3{
        public void voice(){
            System.out.println("喵喵喵");
        }
    }
    class Dog extends animal3{
        public void voice(){
            System.out.println("汪汪汪");
        }
    }
    class Tiger extends animal3{
        public void voice(){
            System.out.println("哇哇哇");
        }
    }

}
