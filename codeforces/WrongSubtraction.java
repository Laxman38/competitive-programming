import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int operations = sc.nextInt();

        while(operations > 0) {
            if(num % 10 != 0) {
                num -= 1;
            } else {
                num /= 10;
            }

            operations--;
        }

        System.out.println(num);
    }
}