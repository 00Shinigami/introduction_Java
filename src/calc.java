//Main Methode
public class main{
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
        // Variablen Deklaration
        int a = 0;
        int b = 0;
        int c = 0;
        float sum = 0;
        char operator = 0;

        switch(operator){
            case '+':
                System.out.println("Addition");
                sum = a + b + c;
                break;
            case '-':
                System.out.println("Subtraktion");
                sum = a - b - c;
                break;
            case '*':
                System.out.println("Multiplikation");
                sum = a * b * c;
                break;
            case '/':
                System.out.println("Division");
                sum = a / b / c;
                break;
            default:
                System.out.println("Bitte verwende den richtigen Operator(+,-,*,/)");
        }
        System.out.println("Das Ergebnis ist: " + sum);
        //Verwendung
    }
}