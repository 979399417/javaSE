public class point {
    private int a,b,c;
    public point(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    static int qq;
    public static void  pointss(){

    }
    public double star(point y){
        int result=(a-y.a)*(a-y.a)+(b-y.b)*(b-y.b)+(c-y.c)*(c-y.c);
        return Math.sqrt(result);
    }
    public static void main(String[] args) {
        point x=new point(2,3,4);
        point y=new point(4,5,6);
       double result= x.star(y);
            System.out.println(result);



    }
}
