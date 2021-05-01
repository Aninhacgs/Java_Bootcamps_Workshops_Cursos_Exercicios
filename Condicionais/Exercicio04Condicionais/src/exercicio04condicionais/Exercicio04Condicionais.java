/*Exercício 04
Escreva um algoritmo em JAVA para determinar se um dado número N
(recebido através do teclado) é POSITIVO, NEGATIVO ou NULO.
*/
package exercicio04condicionais;

import java.util.Scanner;

public class Exercicio04Condicionais {

    public static void main(String[] args) {
        int numero;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite um número...........: ");
        numero = (Integer.parseInt(SC.nextLine()));
        
        if(numero == 0){
            System.out.println("O número "+numero+" é nulo!");
        }
        
        else if(numero < 0){
            System.out.println("O número "+numero+" é negativo!");
        }
        
        else if(numero > 0){
            System.out.println("O número "+numero+" é positivo!");
        }
        
    }
    
}

