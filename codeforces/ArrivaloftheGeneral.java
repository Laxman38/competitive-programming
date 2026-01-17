import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxHeight = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < n; i++) {
            int heights = sc.nextInt();

            if(heights > maxHeight) {
                maxHeight = heights;
                maxIndex = i;
            } 

            if(heights <= minHeight) {
                minHeight = heights;
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        if(maxIndex > minIndex) swaps--;

        System.out.println(swaps);
    }
}