/*Exercício 13
 Construa um algoritmo em JAVA que dado quatro valores, A, B, C e D, o
algoritmo imprima o maior e o menor valor.
 */
package exercicio13condicionais;

import java.util.Scanner;

public class Exercicio13Condicionais {
    
    public static void main(String[] args) {
        float A,B,C,D;
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite o valor para A: ");
        A = (Float.parseFloat(SC.nextLine()));
        System.out.println("Digite o valor para B: ");
        B = (Float.parseFloat(SC.nextLine()));
        System.out.println("Digite o valor para C: ");
        C = (Float.parseFloat(SC.nextLine()));
        System.out.println("Digite o valor para D: ");
        D = (Float.parseFloat(SC.nextLine()));
        
        System.out.println("==========VALORES DE A, B, C e D==========");
        System.out.println("A = "+A+"\n"+"B = "+B+"\n"+"C = "+C+"\n"+"D = "+D);
        
        System.out.println("==========MENOR VALOR==========");
        if(A < B && A < C && A < D){
            System.out.println("O menor valor "+A);
        }
        
        else if(B < A && B<C && B<D){
            System.out.println("O menor valor "+B);
        }
        
        else if(C< A && C<B && C<D){
            System.out.println("O menor valor "+C);
        }
        
        else if(D< A && D<B && D<C){
            System.out.println("O menor valor "+D);
        }
        
        System.out.println("==========MAIOR VALOR==========");
        if(A > B && A > C && A > D){
            System.out.println("O maior valor "+A);
        }
        
        else if(B> A && B>C && B>D){
            System.out.println("O maior valor "+B);
        }
        
        else if(C> A && C>B && C>D){
            System.out.println("O maior valor "+C);
        }
        
        else if(D> A && D>B && D>C){
            System.out.println("O maior valor "+D);
        }
    }
    
}
