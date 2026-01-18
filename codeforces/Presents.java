import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int frnd[] = new int[n];
        for(int i = 0; i < n; i++) {
            frnd[i] = sc.nextInt();
        }

        int received[] = new int[n];
        for(int i = 0; i < n; i++) {
            received[frnd[i] - 1] = i + 1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(received[i] + " ");
        }
    }
}