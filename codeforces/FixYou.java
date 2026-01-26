import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int changes = 0;

            for(int i = 1; i <= n; i++) {
                String row = sc.next();   
                
                for(int j = 1; j <= m; j++) {
                    char ch = row.charAt(j - 1);

                    if(i == n && j == m) continue;

                    if(j == m && ch == 'R') {
                        changes++;
                    }

                    if(i == n && ch == 'D') {
                        changes++;
                    } 
                }
            }

            System.out.println(changes);
        }
    }
}