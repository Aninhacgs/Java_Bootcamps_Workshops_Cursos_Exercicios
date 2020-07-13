/*Exercicio35
 Criar um algoritmo em PORTUGOL que receba o valor de x, e calcule e imprima o
valor de f(x).
f(x) = (5.x+3) / raiz(x**2 - 16) 
 */
package exercicio35condicionais;

import java.util.Scanner;
import java.math.RoundingMode;

public class Exercicio35Condicionais {

    public static void main(String[] args) {
        int x;
        float f, aux,raiz;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("==========CALCULANDO O VALOR DA F(X)==========");
        System.out.println("Digite o valor de x: ");
        x = Integer.parseInt(SC.nextLine());
        
        if(x < 5){
             System.out.println("Não foi possível caluclar o valor da f(x)!");
        }
        
        else{
            aux = (float) Math.pow(x, 2) - 16;
            raiz = (float) Math.sqrt(aux);
            f = (float)(5 * x + 3) / raiz;
            
            System.out.println("F(X) = "+f);
        }
    }
    
}
