import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int largest = Math.max(x1, Math.max(x2, x3));
        int smallest = Math.min(x1, Math.min(x2, x3));

        int totalDistance = largest - smallest;
        System.out.println(totalDistance);
    }
}