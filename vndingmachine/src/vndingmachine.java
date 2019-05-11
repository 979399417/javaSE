
public class vndingmachine {
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
        if(balance>=price){;
            System.out.println("here you are");
            balance=balance-price;
            tatal=tatal+price;
        }
    }

}

