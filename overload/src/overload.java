public class overload {

    class mymath{
        public int add(int a,int b){
         //   int result=a+b;
            return a+b;
        }
        public int add(int a,int b,int c){
       //     int result=a+b+c;
            return a+b+c;
        }
    }

    public void main(String[] args) {
        mymath m=new mymath();
        int result=m.add(2,3);
        System.out.println(result);


    }
}
