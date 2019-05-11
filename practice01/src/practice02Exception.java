import java.util.Scanner;
public class practice02Exception {
    public static void main(String[] args) throws Exception {
//        Scanner scanner=new Scanner(System.in);
//        int sroce=scanner.nextInt();
//        student str=new student();
//        str.setSroce(sroce);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int e = scanner.nextInt();
        int c = scanner.nextInt();
        sss aaa=new sss();
        aaa.isTriangle(a,e,c);


//        int num=50;
//        student stu[]=new student[num];
//        for (int i=0;i<stu.length;i++){
//            int sroce=scanner.nextInt();
//            stu[i].setSroce(sroce);
//        }
    }
}
    class student {
        private int sroce;
        public student(){};

        public student(int sroce) {
            this.sroce = sroce;
        }

        public int getSroce() {
            return sroce;
        }
        public void setSroce(int sroce) {
            try {
            if (sroce > 0 ||sroce < 100)
                throw new  sroceException("请输入1到100的数");
            else this.sroce=sroce;


        } catch (sroceException e) {
                e.printStackTrace();
            }
        }
    }
    class sroceException extends Exception{
        public sroceException() {
        }

        public sroceException(String message) {
            super(message);
        }
    }
    class sss{
   public void isTriangle(int a,int b,int c){
        if(a+b<=c||a+c<=b||b+c<=a){
            try {
                throw new IllegalArgumentException("a,b,c不能构成三角形”");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        else System.out.println(a+":"+b+":"+c);
    }}
    class IllegalArgumentException extends Exception{
        public IllegalArgumentException(String massage) {
            super(massage);
        }
        public IllegalArgumentException() {
        }
    }
