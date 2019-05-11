public class animal {

    String eye;
    public void  run(){
        System.out.println("跑跑");
    }
    public void eat(){
        System.out.println("吃吃");
    }
    public void slepep(){
        System.out.println("zzzzzzz");
    }
    class mammal extends animal{

        public void taisheng(){
            System.out.println("胎生");
        }
    }
    class paxing{
        public void  run(){
            System.out.println("跑跑");
        }
        public void eat(){
            System.out.println("吃吃");
        }
        public void aggsheng(){
            System.out.println("卵生");
        }
    }
    class bird extends animal{
        public void run(){
            super();
        }

        public void aggsheng(){
            System.out.println("卵生");
        }
    }
    public static void main(String[] args) {
        bird b=new bird();
        b.run();
    }
    public animal(){
        super();
        System.out.println("创建一个动物对象"
        );
    }

}
