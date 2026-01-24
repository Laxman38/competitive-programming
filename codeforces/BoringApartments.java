import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int apartment = sc.nextInt();
            String a = Integer.toString(apartment);

            int d = a.charAt(0) - '0';
            int n = a.length();

            int ans = (d - 1) * 10 + n * (n + 1) / 2;

            System.out.println(ans);
        }
    }
}