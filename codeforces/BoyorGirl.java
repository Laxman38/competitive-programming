import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int freq[] = new int[26];
        for(char ch : name.toCharArray()) {
            freq[ch - 'a']++;
        }

        int cnt = 0;
        for(int i = 0; i < 26; i++) {
            if(freq[i] >= 1) {
                cnt++;
            }
        }

        String gender = cnt % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
        System.out.println(gender);
    }
}