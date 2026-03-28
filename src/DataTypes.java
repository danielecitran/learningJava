import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String
        System.out.println("Gib einen String ein:");
        String text = input.nextLine(); // String ist eine Zeichenkette und wird als "String" definiert

        // Integer (int)
        System.out.println("Gib eine ganze Zahl ein:");
        int number = Integer.parseInt(input.nextLine()); // Integer ist der Datentyp für ganze Zahlen und wird als "int" definiert

        // Double (floating number)
        System.out.println("Gib eine Kommazahl ein:");
        double floatingNumber = Double.parseDouble(input.nextLine()); // Double ist der Datentyp für Kommazahlen

        // Boolean (true oder false)
        System.out.println("Gib true oder etwas anderes ein");
        boolean trueOrFalse = Boolean.parseBoolean(input.nextLine()); // Boolean ist der Datentyp für True or False
        // Wenn man hier etwas anderes als "True" (egal ob gross oder klein) wird es zu "false"


        System.out.println("Eingegebener Text (String): " + text);
        System.out.println("Eingegebene ganze Zahl (Integer): " + number);
        System.out.println("Eingegebene Kommazahl (Double): " + floatingNumber);
        System.out.println("true oder false?: " + trueOrFalse);
    }
}
