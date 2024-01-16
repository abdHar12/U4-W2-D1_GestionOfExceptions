import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    void showArray(){}
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int[] arr=new int[10];

        for (int i=0; i<10; i++){
            arr[i]=new Random().nextInt(max - min + 1) + min;
        }

        int scelta=0;

        boolean continueTheCycle=true;
        Scanner sc;
        do{
            sc=new Scanner(System.in);
            continueTheCycle=false;
            try {
                int numToModify;
                do {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Posizione " + (i+1) + " = " + arr[i]);
                    }
                    System.out.println("0: Esci");
                    System.out.print("Scegli un numero da modificare: ");
                    numToModify = sc.nextInt();
                    if(numToModify>10) throw new ArrayIndexOutOfBoundsException("Devi inserire un numero da 1 a 10");
                    if(numToModify == 0) System.exit(0);
                } while (numToModify == 0);
                System.out.print("Inserisci il numero: ");
                int numToInsert = sc.nextInt();
                arr[numToModify-1] = numToInsert;
                System.out.println("New array: ");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Posizione " + (i+1) + " = " + arr[i]);
                }
                System.out.println("0: Esci");
                System.out.print("Scegli un numero da modificare: ");
                numToModify = sc.nextInt();
                if(numToModify>10) throw new ArrayIndexOutOfBoundsException("Devi inserire un numero da 1 a 10");
                if(numToModify == 0) System.exit(0);
            } catch (InputMismatchException e) {
                System.out.println("Bisogna inserire un numero intero");
                continueTheCycle=true;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                continueTheCycle=true;
            }
        }while (!(continueTheCycle==false));
        sc.close();
        }
}