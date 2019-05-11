public class xxx {
    private int x;
    private int y;
    private int b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "xxx{" +
                "x=" + x +
                ", y=" + y +
                ", b=" + b +
                '}';
    }

    public xxx() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public xxx(int x, int y, int b) {
        this.x = x;
        this.y = y;
        this.b = b;
    }

    public xxx(int x) {
        this.x = x;
    }
}
