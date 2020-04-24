import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String[] tab = new String[5];
        String[] revTab = new String[tab.length];
        System.out.println("Podaj pięć imion");
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        String firstName = scan.nextLine();
        String firstName1 = scan1.nextLine();
        String firstName2 = scan2.nextLine();
        String firstName3 = scan3.nextLine();
        String firstName4 = scan4.nextLine();
        tab[0] = firstName;
        tab[1] = firstName1;
        tab[2] = firstName2;
        tab[3] = firstName3;
        tab[4] = firstName4;
        for (int i = tab.length; i > 0; ) {
            for (int j = 0; j < tab.length; j++) {
                i--;
                revTab[j] = tab[i];
                System.out.println("cześć " + tab[i]);
            }
        }
    }
}
