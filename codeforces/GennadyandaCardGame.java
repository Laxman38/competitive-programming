import java.util.Scanner;

public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tableCard = sc.next();
        char tableRank = tableCard.charAt(0);
        char tableSuit = tableCard.charAt(1);

        boolean canPlay = false;

        for(int i = 0; i < 5; i++) {
            String handCard = sc.next();
            char handRank = handCard.charAt(0);
            char handSuit = handCard.charAt(1);

            if(handRank == tableRank || handSuit == tableSuit) {
                canPlay = true;
                break;
            }
        }

        System.out.println(canPlay ? "YES" : "NO");
    }
}