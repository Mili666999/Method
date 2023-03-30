import java.util.Scanner;

public class Main {
    static void bot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("User message: ");
        int x = sc.nextInt();
        if (x == 1){System.out.println("Order confirmed");}
            else if (x == 2) {System.out.println("info@sololearn.com");}
            else {System.out.println("Probaj opet...");
                bot();
        }}
        public static void main(String[] args) {
            bot();
    }
}