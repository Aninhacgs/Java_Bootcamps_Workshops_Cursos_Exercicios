/*Exercício31
 Dados três valores A, B e C, construa um algoritmo em PORTUGOL para verificar se
estes valores podem ser valores dos lados de um triângulo, e se for, classificá-los
(imprimi-los) segundo os ângulos. (Triângulo Retângulo = 90º, Triângulo Obtusângulo
> 90º , Triângulo Acutângulo < 90º)

Triângulo acutângulo: possui todos os ângulos com medidas menores que 90º. 
Triângulo retângulo: possui um ângulo com medida igual a 90º. 
Triângulo obtusângulo: possui um ângulo obtuso, maior que 90º.

 */
package exercicio31condicionais;

import java.util.Scanner;

public class Exercicio31Condicionais {

    public static void main(String[] args) {
        float A,B,C;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o valor de Ângulo 1: ");
        A = Float.parseFloat(SC.nextLine());
        
        System.out.println("Digite o valor de Ângulo 2: ");
        B = Float.parseFloat(SC.nextLine());
        
        System.out.println("Digite o valor de Ângulo 3: ");
        C = Float.parseFloat(SC.nextLine());
        
        System.out.println("========== ANÁLISE DOS ÂNGULOS 1,2,3 ==========");
        if(A == 90 || B == 90 || C == 90){
            System.out.println("Triângulo retângulo: possui um ângulo com medida igual a 90º.\n"+
                    "ÂNGULO 1 = "+A+"\nÂNGULO 2 = "+B+"\nÂNGULO 3 = "+C);
        }
        
        else if(A <90 && B < 90 && C < 90){
            System.out.println("Triângulo acutângulo: possui todos os ângulos com medidas menores que 90º.\n"+
                    "ÂNGULO 1 = "+A+"\nÂNGULO 2 = "+B+"\nÂNGULO 3 = "+C);
        }
        
        else if(A > 90 || B > 90 || C > 90){
            System.out.println("Triângulo obtusângulo: possui um ângulo obtuso, maior que 90º.\n"+
                    "ÂNGULO 1 = "+A+"\nÂNGULO 2 = "+B+"\nÂNGULO 3 = "+C);
        }
    }
    
}
