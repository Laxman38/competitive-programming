import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int toasts = (k * l) / nl;
        int slices = c * d;
        int grams = p / np;

        int totalToasts = Math.min(Math.min(toasts, slices), grams);
        int individualToasts = totalToasts / n;
        
        System.out.println(individualToasts);
    }
}