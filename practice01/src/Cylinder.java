public class Cylinder extends Circle {
    private double hight;

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double r, double hight) {
        super(r);
        this.hight = hight;
    }
    double getVolume() {
        return (hight*getArea());
    }
    void showVolume(){
        System.out.println(getVolume());
    } //将圆柱体的体积输出到屏幕

}
