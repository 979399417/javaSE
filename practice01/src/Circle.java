public class Circle {

    private double r;
    public double getArea(){
        return (Math.PI*r*r);

    }
    public double getPerimeter(){
        return (Math.PI*2.0*r);

    }
    public void shou(Circle c){
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
    public Circle(){

    }

    public Circle(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
//        Circle a=new Circle();
//        a.r=2;
//        a.getArea();
//        a.getPerimeter();
    }
}
