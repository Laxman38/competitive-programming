import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        int count = 0;

        while(num != 0) {
            long lastDigit = num % 10;

            if(lastDigit == 4 || lastDigit == 7) {
                count++;

                if(count > 7) break;
            }

            num = num / 10;
        }

        if(count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}