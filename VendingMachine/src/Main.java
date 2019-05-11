public class Main {
    public static void main(String[] args) {


        class VendingMachine {
            int price;
            int talal;
            int balance;
            void showprompt(){
                System.out.println("hello");
            }
            void insermomey(int amount){
                balance=balance+amount;
            }
            void  shoubalance(){
                System.out.println(balance);
            }
            public   void main(String[] args){
                VendingMachine em=new VendingMachine();
                em.showprompt();
                em.insermomey(100);
                em.shoubalance();
            }
        }

    }

}
