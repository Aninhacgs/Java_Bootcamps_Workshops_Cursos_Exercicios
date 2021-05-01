/*Exercício 03
Construa um algoritmo em JAVA que determine (imprima) se um dado número
N inteiro (recebido através do teclado) é PAR ou ÍMPAR.
*/
package exercicio03condicionais;

import java.util.Scanner;

public class Exercicio03Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um valor........:");
        numero = (Integer.parseInt(SC.nextLine()));
        
        if(numero % 2 == 0){
            System.out.println("O número "+numero+" é par!");
        }
        
        else if(numero % 2 != 0){
            System.out.println("O número "+numero+" é ímpar!");
    }
    }
    
}

