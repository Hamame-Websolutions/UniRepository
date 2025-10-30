import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("geben SIe eine Zahl ein");
        Scanner s = new Scanner(System.in);
        int zahl1 = s.nextInt();
        System.out.println("Zahl 2");
        int zahl2 = s.nextInt();
        s.close();

        System.out.println("Ergebnisse: ");
        System.out.println("Summe: " + (zahl1 + zahl2));
        System.out.println("Summe: " + (zahl1 - zahl2));
        System.out.println("Summe: " + (zahl1 * zahl2));
        System.out.println("Summe: " + (zahl1 / zahl2));

    }
}