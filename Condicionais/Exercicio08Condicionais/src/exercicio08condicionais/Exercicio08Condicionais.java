/*Exercício 08
Escreva um algoritmo em JAVA que leia um número e informe se ele é ou não
divisível por 5.
*/

package exercicio08condicionais;

import java.util.Scanner;

public class Exercicio08Condicionais {

    public static void main(String[] args) {
        int valor;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite um valor..........: ");
        valor = (Integer.parseInt(SC.nextLine()));
        
        if(valor %5 == 0){
            System.out.println("O número "+valor+" é divisível por 5!");
        }
        
        else if(valor %5 !=0){
            System.out.println("O número "+valor+" não é divisível por 5!");
        }
    }
    
}


