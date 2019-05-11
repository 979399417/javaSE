import java.util.Scanner;

public class Main{



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Fraction a = new Fraction(in.nextInt(), in.nextInt());

        Fraction b = new Fraction(in.nextInt(), in.nextInt());

        a.print();

        b.print();

        a.plus(b).print();

        a.multiply(b).plus(new Fraction(5, 6)).print();

        a.print();

        b.print();

        in.close();

    }
}

class Fraction
{
    private int fenzi,fenmu;
    public Fraction(int a,int b){
        this.fenzi=a;
        this.fenmu=b;
    }
    void print()

    {
        int r, x = fenzi, y = fenmu;
        while (y != 0)
        {
            r = x % y;
            x = y;
            y = r;
        }
        fenzi /= x;
        fenmu /= x;
        if (fenzi==fenmu)
            System.out.println(fenzi/fenmu);
        else
            System.out.println(fenzi+"/"+fenmu);
        return;
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

}