import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stops = sc.nextInt();

        int passengers = 0, minCapacity = 0;
        for(int i = 0; i < stops; i++) {
            int exits = sc.nextInt();
            int enters = sc.nextInt();

            passengers -= exits;
            passengers += enters;

            minCapacity = Math.max(minCapacity, passengers);
        }   

        System.out.println(minCapacity);
    }
}