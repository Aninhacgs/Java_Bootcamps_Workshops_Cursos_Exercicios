/*Exercício 36
Construir um algoritmo em JAVA para calcular as raízes de uma equação do 2º
grau, sendo que os valores dos coeficientes A, B, e C devem ser fornecidos pelo
usuário através do teclado.
 */
package exercicio36condicionais;

import java.util.Scanner;
import java.math.RoundingMode;

public class Exercicio36Condicionais {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a,b,c;
        float delta,x1,x2;
        
        System.out.println("Digite o valor de a: ");
        a = Integer.parseInt(SC.nextLine());
        
        System.out.println("Digite o valor de b: ");
        b = Integer.parseInt(SC.nextLine());
        
        System.out.println("Digite o valor de c: ");
        c = Integer.parseInt(SC.nextLine());
        
        delta = (float) (Math.pow(b,2) - (4*a*c));
        
        System.out.println("==========CALCULANDO BHASKARA==========");
        
        if(delta < 0){
            System.out.println("Não será possível calcular os valores de x1 e x2, pois delta possui um valor menor que zero."
                    + "\n Delta = "+delta);
        }
        
        else if(delta == 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (a * 2));
            x2 = (float) ((-b - Math.sqrt(delta)) / (a * 2));
            System.out.println("Duas raízes reais iguais!\nDelta = "+delta+"\nX1 = "+x1+"\nX2 = "+x2);
        }
        
        else if(delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (a * 2));
            x2 = (float) ((-b - Math.sqrt(delta)) / (a * 2));
            System.out.println("Duas raízes reais diferentes!\nDelta = "+delta+"\nX1 = "+x1+"\nX2 = "+x2);
        }
        
    }
    
}
