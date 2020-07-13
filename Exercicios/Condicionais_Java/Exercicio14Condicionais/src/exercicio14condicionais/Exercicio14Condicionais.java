/*Exercício 14
 Dados três valores A, B e C, construa um algoritmo em JAVA, que imprima os
valores de forma ascendente (do menor para o maior).
 */
package exercicio14condicionais;

import java.util.Scanner;

public class Exercicio14Condicionais {

    public static void main(String[] args) {
        float A,B,C;
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = (Float.parseFloat(SC.nextLine()));
        System.out.println("Digite o valor de B: ");
        B = (Float.parseFloat(SC.nextLine()));
        System.out.println("Digite o valor de C: ");
        C = (Float.parseFloat(SC.nextLine()));
        System.out.println("==========ORDEM ASCENDENTE==========");
        if(A < B && B < C){
            System.out.println("A = "+A+"\n"+"B = "+B+"\n"+"C = "+C);
        }
        
        else if(A < C && C < B){
            System.out.println("A = "+A+"\n"+"C = "+C+"\n"+"B = "+B);
        }
        
        else if(B < A && A < C){
            System.out.println("B = "+B+"\n"+"A = "+A+"\n"+"C = "+C);
        }
        
        else if(B < C && C < A){
            System.out.println("B = "+B+"\n"+"C = "+C+"\n"+"A = "+A);
        }
        
        else if(C < A && A < B){
            System.out.println("C = "+C+"\n"+"A = "+A+"\n"+"B = "+B);
        }
        
        else if(C < B && B < A){
            System.out.println("C = "+C+"\n"+"B = "+B+"\n"+"A = "+A);
        }
        
    }
    
}
