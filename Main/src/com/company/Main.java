

import java.util.Scanner;
 class Fraction{
     private int fenzi,fenmu;
     public Fraction(int a,int b){
         this.fenzi=a;
         this.fenmu=b;
     }
     public void print() {
         int min = fenzi;
         int max = fenzi;
         if(fenzi==fenmu){
             System.out.println(1);
         }
         if (fenzi > fenmu) {
             min = fenmu;
             max = fenzi;
         }


             for (int i = 0; i < max; i++) {
                 if (0 == min % i && 0 == max % i) {
                     System.out.println(fenzi / i + ":" + fenmu / i);
                 }
             }

     }
     public Fraction plus(Fraction b){
         Fraction x=new Fraction(0,1);
         x.fenmu=b.fenmu*this.fenmu;
         x.fenzi=b.fenzi*fenmu+fenzi*b.fenmu;
         return x;
     }
     public Fraction multiply(Fraction r){
         Fraction x=new Fraction(1,1);
         x.fenmu=r.fenmu*fenmu;
         x.fenzi=x.fenzi*fenzi;
         return x;
     }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Fraction a = new Fraction(in.nextInt(), in.nextInt());

        Fraction b = new Fraction(in.nextInt(),in.nextInt());

        a.print();

        b.print();

        a.plus(b).print();

        a.multiply(b).plus(new Fraction(5,6)).print();

        a.print();

        b.print();

        in.close();

    }




}


