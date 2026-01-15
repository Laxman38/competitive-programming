import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int place = 1;

            ArrayList<Integer> roundNumbers = new ArrayList<>();

            int temp = n;
            while(temp != 0) {
                int digit = temp % 10;
                if(digit != 0) {
                    roundNumbers.add(digit * place);
                }

                temp = temp / 10;
                place = place * 10;
            }

            System.out.println(roundNumbers.size());

            for(int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}