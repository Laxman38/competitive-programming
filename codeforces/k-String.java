import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine(); 
        String s = sc.nextLine();

        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] % k != 0) {
                System.out.println(-1);
                return;
            }
        }

        StringBuilder base = new StringBuilder();        
        for(int i = 0; i < 26; i++) {
            int times = freq[i] / k;
            for(int j = 0; j < times; j++) {
                base.append((char)(i + 'a'));
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < k; i++) {
            result.append(base);
        }

        System.out.println(result);
    }
}