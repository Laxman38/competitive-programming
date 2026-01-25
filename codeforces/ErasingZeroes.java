import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++) {
            String s = sc.nextLine();

            boolean seenOne = false;
            int zeroCount = 0;
            int erase = 0;

            for(char ch : s.toCharArray()) {
                if(ch == '1') {
                    seenOne = true;
                    erase += zeroCount;
                    zeroCount = 0;
                } else if(seenOne) {
                    zeroCount++;
                }
            }

            System.out.println(erase);
        }
    }
}