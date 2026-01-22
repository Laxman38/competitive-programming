import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int ops = 0;

            while(a <= n && b <= n) {
                if(a < b) {
                    a += b;
                } else {
                    b += a;
                }
                
                ops++;  
            }

            System.out.println(ops);
        }   
    }
}