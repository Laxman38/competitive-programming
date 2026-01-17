import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hard = 0; 

        for(int i = 0; i < n; i++) {
            int response = sc.nextInt();

            if(response == 1) {
                hard = 1;
                break;
            }
        }

        if(hard == 1) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}