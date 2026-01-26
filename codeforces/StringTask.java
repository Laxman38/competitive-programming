import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            if("aeiouy".indexOf(ch) == -1) {
                sb.append(".");
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}