/*Exercício 18
 Construa um algoritmo em JAVA que indique se um número digitado está
compreendido entre 20 e 90 ou não (20 e 90 não estão na faixa de valores).
 */
package exercicio18condicionais;

import java.util.Scanner;

public class Exercicio18Condicionais {

    public static void main(String[] args) {
        int n;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        n = (Integer.parseInt(SC.nextLine()));
        
        if(n > 20 && n < 90){
            System.out.println("O número "+n+" está na faixa de valores entre 20 e 90!");
        }
        else{
            System.out.println("O número "+n+" não pertence a faixa de valores entre 20 e 90!");
        }
    }
    
}
