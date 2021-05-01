/*Exercício 02
Construa um algoritmo em JAVA que leia dois valores numéricos inteiros e
efetue a adição; caso o resultado seja maior que 10, apresentá-lo.
*/
package exercicio02condicionais;

import java.util.Scanner;

public class Exercicio02Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int numero1, numero2, soma;
        
        System.out.println("Digite o primeiro número..........: ");
        numero1 = (Integer.parseInt(SC.nextLine()));
        System.out.println("Digite o segundo número..........: ");
        numero2 = (Integer.parseInt(SC.nextLine()));
        soma = numero1 + numero2;
        
        if(soma > 10){
            System.out.println("A soma  "+numero1+" + "+numero2+" = "+soma+" é maior que 10");
        }
        else{
            System.out.println("A soma "+numero1+" + "+numero2+" = "+soma+" é menor que 10");
        }
        
    }
    
}
