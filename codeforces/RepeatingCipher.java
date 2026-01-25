import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for(int i = 0; idx < n; i++) {
            sb.append(s.charAt(idx));
            idx += i + 1;
        }

        System.out.println(sb);
    }
}