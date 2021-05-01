/*Exercício 16
 Construa um algoritmo em JAVA, que receba três valores, A, B e C, e
armazene-os em três variáveis com os seguintes nomes: MAIOR, INTER e MENOR
(os nomes correspondem aos valores ordenados).
 */
package exercicio16condicionais;

import java.util.Scanner;

public class Exercicio16Condicionais {

    public static void main(String[] args) {
        float A,B,C;
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = (Float.parseFloat(SC.nextLine()));
        
        System.out.println("Digite o valor de B: ");
        B = (Float.parseFloat(SC.nextLine()));
        
        System.out.println("Digite o valor de C: ");
        C = (Float.parseFloat(SC.nextLine()));
        
        if(A > B && A > C && B > C ){
            System.out.println("MAIOR "+A+"\n"+"INTER "+B+"\n"+"MENOR "+C);
                    
        }
        
        else if(A > B && A > C && C > B ){
            System.out.println("MAIOR "+A+"\n"+"INTER "+C+"\n"+"MENOR "+B);
                    
        }
        
        else if(B > A && B > C && A > C ){
            System.out.println("MAIOR "+B+"\n"+"INTER "+A+"\n"+"MENOR "+C);
                    
        }
        
        else if(B > A && B > C && C > A ){
            System.out.println("MAIOR "+B+"\n"+"INTER "+C+"\n"+"MENOR "+A);
                    
        }
        
        else if(C > A && C > B && A > B ){
            System.out.println("MAIOR "+C+"\n"+"INTER "+A+"\n"+"MENOR "+B);
                    
        }
        
        else if(C > A && C > B && B > A ){
            System.out.println("MAIOR "+C+"\n"+"INTER "+B+"\n"+"MENOR "+A);
                    
        }
    }
    
}
