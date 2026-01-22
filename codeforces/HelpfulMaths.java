import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = sc.nextLine().split("\\+");
        Arrays.sort(arr);

        System.out.print(String.join("+", arr));   
    }
}