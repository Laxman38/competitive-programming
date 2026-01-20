import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstBananaCost = sc.nextInt();
        int amountAvailable = sc.nextInt();
        int bananasRequired = sc.nextInt();

        int totalCost = 0;
        for(int i = 1; i <= bananasRequired; i++) {
            totalCost += firstBananaCost * i;
        }

        int borrow = totalCost - amountAvailable;
        System.out.println(Math.max(borrow, 0));
    }
}