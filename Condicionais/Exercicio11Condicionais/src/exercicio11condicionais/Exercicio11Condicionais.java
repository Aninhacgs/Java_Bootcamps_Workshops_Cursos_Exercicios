/*Exercício 11
Escreva um algoritmo em JAVA que leia um número e informe se ele é
divisível por 3 e por 7.
*/
package exercicio11condicionais;

import java.util.Scanner;

public class Exercicio11Condicionais {
    public static void main(String[] args) {
        int valor;
        Scanner SC =  new Scanner(System.in);
        
        System.out.println("Digite um valor..........: ");
        valor = (Integer.parseInt(SC.nextLine()));
        
        if(valor % 3 == 0 && valor % 7 == 0){
            System.out.println("O valor "+valor+" é divisível por 3 e 7!");
        }
        
        else{
            System.out.println("O valor "+valor+" não é divisível por 3 e 7!");
        }
    }
    
}

