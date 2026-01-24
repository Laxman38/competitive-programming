import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int level = 1;
        int height = 0;
        while(true) {
            int cubes = level * (level + 1) / 2;

            if(n >= cubes) {
                n -= cubes;
                height++;
                level++;
            } else {
                break;
            }
        }

        System.out.println(height);
    }
}