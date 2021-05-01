/*Exercício 32
 Dados três valores A, B e C, construa um algoritmo em JAVA para verificar se
estes valores podem ser valores dos lados de um triângulo, e se for um triângulo
retângulo, determinar (imprimir) os seus ângulos internos.
 */
package exercicio32condicionais;

import java.util.Scanner;
import java.math.RoundingMode;

public class Exercicio32Condicionais {

    public static void main(String[] args) {
        float A,B,C,ang1,ang2,ang3;
        Scanner SC = new Scanner (System.in);
        
        System.out.println("Digite o valor de A: ");
        A = Float.parseFloat(SC.nextLine());
        
        System.out.println("Digite o valor de B: ");
        B = Float.parseFloat(SC.nextLine());
        
        System.out.println("Digite o valor de C: ");
        C = Float.parseFloat(SC.nextLine());
        
        System.out.println("========== CALCULANDO OS ÂNGULOS INTERNOS DE TRIÂNGULO RETÂNGULO ==========");
        if(A > Math.abs(B - C) && B < Math.abs(A + C) && C < Math.abs(A+B)){
            System.out.println("Os valores "+A+" "+B+" e "+C+" formam um triângulo!");
            
            if((A*A == B*B + C*C) || (B*B == A*A + C*C) || (C*C == A*A + B*B)){
                System.out.println("É um triângulo retângulo");
                
                if((A > B)&& (A > C)){
                ang1 = 90;
                ang2 = (float) (180.0 / Math.PI * Math.atan(B / C));
                ang3 = 90 - ang2; 
                System.out.println("ÂNGULO 1 = "+ang1+"\nÂNGULO 2 = "+ang2+"\nÂNGULO 3 = "+ang3);
                }
            
              else if((B > A)&& (B > C)){
                ang1 = 90;
                ang2 = (float) (180.0 / Math.PI * Math.atan(A / C));
                ang3 = 90 - ang2; 
                System.out.println("ÂNGULO 1 = "+ang1+"\nÂNGULO 2 = "+ang2+"\nÂNGULO 3 = "+ang3);

               }
            
              else if((C > A)&& (C > B)){
                ang1 = 90;
                ang2 = (float) (180.0 / Math.PI * Math.atan(A / B));
                ang3 = 90 - ang2; 
                System.out.println("ÂNGULO 1 = "+ang1+"\nÂNGULO 2 = "+ang2+"\nÂNGULO 3 = "+ang3);

              }
                
            }

        }
        else{
           System.out.println("Os valores "+A+" "+B+" e "+C+" não formam um triângulo!"); 
        }
    }
    
}
