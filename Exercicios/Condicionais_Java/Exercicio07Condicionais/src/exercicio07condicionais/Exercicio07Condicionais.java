/*Exercício 07
Escreva um algoritmo em JAVA que receba um número e imprima uma das
mensagens: “é múltiplo de 3” ou “não é múltiplo de 3”.
*/

package exercicio07condicionais;

import java.util.Scanner;

public class Exercicio07Condicionais {

    public static void main(String[] args) {
        int valor;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite um valor...........: ");
        valor = (Integer.parseInt(SC.nextLine()));
        
        if(valor % 3 == 0){
            System.out.println("O número "+valor+" é múltiplo de 3!");
        }
        
        else if(valor % 3 !=0){
            System.out.println("O número "+valor+" não é multiplo de 3!");
        }
     
    }
    
}


