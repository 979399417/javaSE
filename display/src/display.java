public class display {

        //  import java.util.Scanner;
        public class dispiay{
            private int value=0;
            private int limit=0;
            public dispiay(int limit){
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
        }
        {

            public static void main(String[] args)
            {
                dispiay a=new dispiay(24);
                for(;;){
                    a.increase();
                    System.out.println(a.getValue());
                }

            }

        }




}
