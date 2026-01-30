import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if (m % n != 0) {
            System.out.println(-1);
            return;
        }

        int x = m / n;
        int moves = 0;

        while (x % 2 == 0) {
            x /= 2;
            moves++;
        }

        while (x % 3 == 0) {
            x /= 3;
            moves++;
        }

        System.out.println(x == 1 ? moves : -1);
    }
}