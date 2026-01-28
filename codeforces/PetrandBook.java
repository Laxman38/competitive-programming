import java.util.Scanner;

public class PetrandBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[7];

        for(int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        while(n != 0) {
            if(n <= arr[j]) {
                System.out.println(j + 1);
                break;
            } else {
                n -= arr[j];
            }

            j = (j + 1) % 7;
        }
    }
}