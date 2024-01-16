import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continueTheCycle=true;
        Scanner sc;
        do{
            try {
                continueTheCycle = false;
                sc = new Scanner(System.in);
                int km = 0, litres = 0;
                System.out.printf("\nInserisci il numero di Km percorsi: ");
                km = sc.nextInt();
                System.out.printf("\nInserisci il numero di litri consumati: ");
                litres = sc.nextInt();
                System.out.printf("\nSono stati percorsi " + km / litres + " km al litro");
            } catch (InputMismatchException e) {
                System.out.print("Devi inserire un numero!");
                continueTheCycle = true;
            } catch (ArithmeticException e) {
                System.out.print("Litri deve essere diverso da 0!");
                continueTheCycle = true;
            }
        }while (continueTheCycle==true);
    }
}