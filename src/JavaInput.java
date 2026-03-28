import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {

        // Scanner wird als "input" definiert:
        Scanner input = new Scanner(System.in);

        System.out.println("Wie heisst du?");
        String name = input.nextLine();

        System.out.println("Wie alt bist du?");
        int age = Integer.parseInt(input.next()); // man kann auch Integer.valueOf(...) verwenden
        /*
        Der Unterschied von .next und .nextLine:
        Wenn der User z.B mehrere Wörter eingibt und man nur .next verwendet,
        wird nur das erste Wort als input genommen und in der Variable gespeichert
        */

        System.out.println("Du heisst " + name + " und bist " + age + " Jahre alt.");

    }
}