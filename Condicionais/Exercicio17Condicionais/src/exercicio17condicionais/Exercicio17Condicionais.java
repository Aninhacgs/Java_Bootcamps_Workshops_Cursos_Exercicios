/*Exercício 17
Escreva um algoritmo em JAVA que leia um número e informe se ele é
divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
 */
package exercicio17condicionais;

import java.util.Scanner;

public class Exercicio17Condicionais {
    public static void main(String[] args) {
        int n;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        n = (Integer.parseInt(SC.nextLine()));
        
        System.out.println("==========DIVISIBILIDADE DO NÚMERO "+n+"==========");
        if(n % 2 == 0){
            System.out.println("O número "+n+" é divisível por 2!\n");
        }
        
        if(n % 10 == 0){
            System.out.println("O número "+n+" é divisível por 10!\n");
        }
        
        if(n % 5 == 0){
            System.out.println("O número "+n+" é divisível por 5!\n");
        }
        
        if(n % 2 != 0 && n % 5 !=0 && n % 10 != 0){
            System.out.println("O número "+n+" não é divisível por 2, 5 e 10!");
        }
    }
    
}
