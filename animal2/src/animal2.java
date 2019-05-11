
    public class animal2 {

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
        public animal2(){
            super();
            System.out.println("创建一个动物");
        }
        class mammal2 {
            animal2 animal2=new animal2();

            public void taisheng(){
                System.out.println("胎生");
            }

        }
        public static void main(String[] args) {
           bird2 v = new bird2();
             v.run();

        }
        class paxing2{
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

    }
    class bird2 {

    public bird2(){
        System.out.println("创建一个鸟对象");
        }
        animal2 animal2=new animal2();
        public void run(){
            animal2.run();
            System.out.println("我是小鸟，飞不高");
        }

        public void aggsheng(){
            System.out.println("卵生");
        }
    }

