import java.util.Scanner;
//Main Methode
public class Main{
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // Variablen Deklaration
        int a = 0;
        int b = 0;
        float sum = 0;
        String operator;

        System.out.println("Bitte gebe die Erste Zahl ein");
        a = myObj.nextInt();  // Read user input

        System.out.println("Bitte gebe den Operator ein(+,-,*,/)");
        operator = myObj.nextLine();  // Read user input

        System.out.println("Bitte gebe die zweite Zahl ein");
        b = myObj.nextInt();  // Read user input

        switch(operator){
            case "+":
                System.out.println("Addition");
                sum = a + b;
                break;
            case "-":
                System.out.println("Subtraktion");
                sum = a - b;
                break;
            case "*":
                System.out.println("Multiplikation");
                sum = a * b;
                break;
            case "/":
                System.out.println("Division");
                sum = a / b;
                break;
            default:
                System.out.println("Bitte verwende den richtigen Operator(+,-,*,/)");
        }
        System.out.println("Das Ergebnis ist: " + sum);
        //Verwendung
    }
}