/*Exercício30
 Dado três valores, A, B e C, construa um algoritmo em JAVA para verificar se
estes valores podem ser valores dos lados de um triângulo, e se for, se é um triangulo
escaleno, um triangulo eqüilátero ou um triangulo isósceles.

Observações:
Triângulo equilátero: possui os três lados com medidas iguais. 
Triângulo isósceles: possui dois lados com medidas iguais. 
Triângulo escaleno: possui os três lados com medidas diferentes. 
 */
package exercicio30condicionais;

import java.util.Scanner;

public class Exercicio30Condicionais {

    public static void main(String[] args) {
        float A,B,C;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = Float.parseFloat(SC.nextLine());
        
        System.out.println("Digite o valor de B: ");
        B = Float.parseFloat(SC.nextLine());
        
        System.out.println("Digite o valor de C: ");
        C = Float.parseFloat(SC.nextLine());
        
        System.out.println("==========ANÁLISE DOS VALORES A,B,C==========");
        if(A > Math.abs(B - C) && B < Math.abs(A + C) && C < Math.abs(A+B)){
            System.out.println("Os valores "+A+" "+B+" e "+C+" formam um triângulo!");
            
            if(A == B || B == C){
                System.out.println("Triângulo isósceles: possui dois lados com medidas iguais. \n" +
                         "A = "+A+"\nB = "+B+"\nC = "+C);
            }
            
        else if(A == B && B == C){
                System.out.println("Triângulo equilátero: possui os três lados com medidas iguais.\n"+
                        "A = "+A+"\nB = "+B+"\nC = "+C);
            }
            
        else if(A != B && B!=C && A!=C){
                System.out.println("Triângulo escaleno: possui os três lados com medidas diferentes.\n"+
                       "A = "+A+"\nB = "+B+"\nC = "+C);
            }

        }
        
        else{
            System.out.println("Os valores "+A+" "+B+" e "+C+" não formam um triângulo!");
        }
        
    }
    
}
