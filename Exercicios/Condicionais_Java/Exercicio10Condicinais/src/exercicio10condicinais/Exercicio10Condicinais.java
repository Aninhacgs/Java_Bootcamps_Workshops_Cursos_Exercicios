/*Exercício 10
Construa um algoritmo em JAVA que imprima qual o menor e qual o maior
valor de dois números A e B, lidos através do teclado.
*/
package exercicio10condicinais;

import java.util.Scanner;

public class Exercicio10Condicinais {

    public static void main(String[] args) {
       int A,B;
       Scanner SC = new Scanner(System.in);
       
       System.out.println("Digite o valor de A..........: ");
       A = (Integer.parseInt(SC.nextLine()));
       System.out.println("Digite o valor de B..........: ");
       B = (Integer.parseInt(SC.nextLine()));
       
       if(A > B){
           System.out.println("O valor "+A+" é maior que "+B);
       }
       
       else if(B > A){
           System.out.println("O valor "+B+" é maior que "+A);
       }
    }
    
}

