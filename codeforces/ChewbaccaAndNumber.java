import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next(); 
        
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int digit = ch - '0';
            int invert = 9 - digit;
            
            if (i == 0 && invert == 0) {
                res.append(digit);
            } else {
                res.append(Math.min(digit, invert));
            }
        }
        
        System.out.println(res);
    }
}
