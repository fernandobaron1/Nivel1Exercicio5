
package nivel1exercicio5;

import java.util.Scanner;


public class Nivel1Exercicio5 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
       System.out.println ("Informe a quantidade");
       int qtd = leia.nextInt();
       double vlrLaranja = 0;
       
       if (qtd < 12) {
           vlrLaranja = 1.10;
       } else {
           vlrLaranja = 0.75;
       }
       
       double resultado = qtd * vlrLaranja;
       System.out.println ("O valor total é: "+resultado);

    }
    
}
