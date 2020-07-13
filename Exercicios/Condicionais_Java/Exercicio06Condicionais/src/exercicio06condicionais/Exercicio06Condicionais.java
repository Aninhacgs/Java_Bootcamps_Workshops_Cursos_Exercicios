/*Exercício 06
Escreva um algoritmo em JAVA que leia um número e imprima a raiz quadrada
do número caso ele seja positivo ou igual a zero e o quadrado do número caso ele seja
negativo.
*/
package exercicio06condicionais;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio06Condicionais {
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int valor, valorAtual;
        
        System.out.println("Digite um valor..........: ");
        valor = (Integer.parseInt(SC.nextLine()));
        
        if(valor == 0 || valor > 0){
            valorAtual = (int) Math.sqrt(valor);
            System.out.println("O valor "+valor+" é igual a zero ou maior que zero\n"
                    + "Desta forma,atualizamos seu valor calculando a sua raiz qudrada = "+valorAtual);
        }
        
        else if(valor < 0){
            valorAtual = (int) Math.pow(valor, 2);
            System.out.println("O valor "+valor+" é menor que zero\n"
                    + "Desta forma,atualizamos seu valor calculando o seu quadrado = "+valorAtual);
        }
    }
    
}

