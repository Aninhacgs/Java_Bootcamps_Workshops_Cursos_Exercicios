/*Exercício 19
Construir um algoritmo em JAVA que leia um número e imprima se ele é igual
a 5, a 200, a 400, se está no intervalo entre 500 e 1000, inclusive, ou se ela está fora
dos escopos anteriores.
 */
package exercicio19condicionais;

import java.util.Scanner;

public class Exercicio19Condicionais {
    public static void main(String[] args) {
        int n;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        n = (Integer.parseInt(SC.nextLine()));
        
        System.out.println("===========ANÁLISE DO NÚMERO "+n+"==========");
        if(n == 5){
            System.out.println("O número "+n+" é igual a 5!");
        }
        
        if(n == 200){
            System.out.println("O número "+n+" é igual a 200!");
        }
        
        if(n == 400){
            System.out.println("O número "+n+" é igual a 400!");
        }
        
        if(n > 500 && n < 1000){
            System.out.println("O número "+n+" pertence ao intervalo 500 a 1000!");
        }
        
        if(n < 500){
            System.out.println("O número "+n+" não pertence ao intervalo 500 a 1000!");
        }
        
        if(n > 1000){
            System.out.println("O número "+n+" não pertence ao intervalo 500 a 1000!");
        }
    }
    
}
