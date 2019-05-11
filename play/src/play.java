



        public class play{
            private int value=0;
            private int limit=0;
            public play(int limit){
                this.limit=limit;
            }
            public void increase(){
                value++;
                if(value==limit){
                    value=0;
                }
            }
            public int getValue(){
                return value;
            }



            public static void main(String[] args)
            {
                play a=new play(24);
                for(;;) {
                    a.increase();
                    System.out.println(a.getValue());


                }
            }
}










