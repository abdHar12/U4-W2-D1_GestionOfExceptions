package classes;

import exceptions.BancaException;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            if(x>saldo) {
                nMovimenti++;
                throw new BancaException("il conto è in rosso. Ti rimangono solo: " + saldo + "€");
            }
            saldo = saldo - x;
        }
        else
        if((x+0.5)>saldo) {
            nMovimenti++;
            throw new BancaException("il conto è in rosso. Ti rimangono solo: " + saldo + "€");
        }
            saldo = saldo - x - 0.50;
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}

