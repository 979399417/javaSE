import java.util.Scanner;

public class VendingMachine;
public class Main {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            VendingMachine em = new VendingMachine();
            em.shouPrompt();
            em.shouBalance();
            em.inserMoney(100);
            em.getFood();

        }
    }

