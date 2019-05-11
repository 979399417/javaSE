

    public class vndingmachine2 {
        int price=80;
        int balance;
        int tatal;

        void showpromt() {
            System.out.println("welcome");
        }

        void insermoney(int amount) {
            balance = balance + amount;
        }
        void shoubalance(){
        System.out.println(balance);
        }
        void getfood(){
            if(balance>=price){
                System.out.println("here you are");
                balance=balance-price;
                tatal=tatal+price;
            }
        }

        public static void main(String[] args) {
            vndingmachine asd=new vndingmachine();
            asd.showpromt();
            asd.insermoney(100);
            asd.shoubalance();
        }

    }


