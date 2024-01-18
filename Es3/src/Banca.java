import classes.ContoCorrente;
import classes.ContoOnLine;
import exceptions.BancaException;

public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(25000);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(1700);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}