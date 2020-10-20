import java.util.Scanner; //importiert den scanner
 

public class taschi { //public (aka öffentlich)  class (aka classe) taschi (aka packetname)


    //farbumgebung

    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_BLACK = "\u001B[30m"; 
    public static final String ANSI_RED = "\u001B[31m"; 
    public static final String ANSI_GREEN = "\u001B[32m"; 
    public static final String ANSI_YELLOW = "\u001B[33m"; 
    public static final String ANSI_BLUE = "\u001B[34m"; 
    public static final String ANSI_PURPLE = "\u001B[35m"; 
    public static final String ANSI_CYAN = "\u001B[36m"; 
    public static final String ANSI_WHITE = "\u001B[37m"; 

    public static void main(String[] args) {
        // TODO Auto-generated method stub


    //Willkommensnachricht
    System.out.println("\nHallo");

    System.out.println(ANSI_RED + "ROT?" + ANSI_RESET);  //des soll eigentlich Rot werden 

        int z1;
        int z2;
        while(true) {
            System.out.print("bitte erste Zahl eingeben: ");
            Scanner zahl1 = new Scanner(System.in);
            z1 = zahl1.nextInt();
            System.out.print("bitte zweite Zahl eingeben: ");
            Scanner zahl2 = new Scanner(System.in);
            z2 = zahl2.nextInt();
            System.out.print("Gewünschte Aktion wählen");
            System.out.println("\nGültige Zeichen / * - +");
            Scanner operand = new Scanner(System.in);
            String o = operand.next();

            switch (o) {
                case "+":
                    int erg;
                    erg = z1 + z2;
                    System.out.println(z1 + " plus " + z2 + " = " + erg);
                    break;
                case "*":
                    erg = z1 * z2;
                    System.out.println(z1 + " mal " + z2 + " = " + erg);
                    break;
                case "-":
                    erg = z1 - z2;
                    System.out.println(z1 + " minus " + z2 + " = " + erg);
                    break;
                case "/":
                    erg = z1 / z2;
                    System.out.println(z1 + " geteilt " + z2 + " = " + erg);
                    break;
                default:
                    System.out.println("Nicht unterstützter Operand");
                    break;
            }

        }
    }

}
