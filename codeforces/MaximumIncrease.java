import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        int cnt = 1, maxLen = 1;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(i == 0) continue;

            if(arr[i] > arr[i - 1]) {
                cnt++;
                maxLen = Math.max(maxLen, cnt);
            } else {
                cnt = 1;
            }
        }

        System.out.println(maxLen);
    }
}