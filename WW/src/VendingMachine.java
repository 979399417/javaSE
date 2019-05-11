public class VendingMachine {

    int price;
    int talal;
    int balance;

    void showprompt() {
        System.out.println("hello");
    }

    void insermomey(int amount) {
        balance = balance + amount;
    }

    void shoubalance() {
        System.out.println(balance);
    }
}
