public class vndingmachine2 {
    public class vndingmachine {
        int price;
        int balance;
        int tatal;

        void showpromt() {
            System.out.println("welcome");
        }

        void insermoney(int amount) {
            balance = balance + amount;
        }

        public static void main(String[] args) {
            vndingmachine vm = new vndingmachine();

        }
    }
}
