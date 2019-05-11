public class display {




    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

       Clock clock = new Clock(x, y, z);
       for(;;){
           clock.tick();
           System.out.println(clock.toString());
       }

       // clock.tick();
        //System.out.println(clock.toString());

     //  System.out.println(clock);

       // in.close();

    }


}
