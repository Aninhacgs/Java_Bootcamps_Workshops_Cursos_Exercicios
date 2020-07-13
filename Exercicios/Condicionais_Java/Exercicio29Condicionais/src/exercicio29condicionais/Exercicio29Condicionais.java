/*Exercício 29
Dado três valores, A, B e C, construa um algoritmo em JAVA para verificar se
estes valores podem ser valores dos lados de um triângulo.
 */
package exercicio29condicionais;

import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio29Condicionais {

    public static void main(String[] args) {
        int A,B,C;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = Integer.parseInt(SC.nextLine());
        System.out.println("Digite o valor de B: ");
        B = Integer.parseInt(SC.nextLine());
        System.out.println("Digite o valor de C: ");
        C = Integer.parseInt(SC.nextLine());
        
        if(Math.abs(B - C) < A && A > Math.abs(B + C)){
            System.out.println("Os valores "+A+" "+B+" e "+C+" podem ser valores de um triângulo!");
        }
        
        else if(Math.abs(A - C) < B && B > Math.abs(A + C)){
            System.out.println("Os valores "+A+" "+B+" e "+C+" podem ser valores de um triângulo!");
        }
        
        else if(Math.abs(A - B) < C && C > Math.abs(A + B)){
            System.out.println("Os valores "+A+" "+B+" e "+C+" podem ser valores de um triângulo!");
        }
        
        else{
            System.out.println("Os valores "+A+" "+B+" e "+C+" não podem ser valores de um triângulo!");
        }
    }
    
}
