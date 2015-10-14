// spočtěte velikosti předem zadaného počtu dvourozměrných vektorů
package velikostvektorudvourozmer;

import java.util.Scanner;


public class VelikostVektoruDvourozmer {

   
    public static void main(String[] args) {
         Scanner vstup = new Scanner(System.in);
         System.out.print("počet vektorů:");
        int pocet = vstup.nextInt();
        for (int i=1; i<=pocet; i++) {
            System.out.print("Vektor "+i+":");
            System.out.print("první složka: ");
            int a = vstup.nextInt();
            System.out.print("Druhá složka: ");
            int b = vstup.nextInt();
            System.out.print("Veikost vektoru: "+Math.sqrt(a*a+b*b));
            
        }
     
    }
    
}
