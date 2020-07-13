/*Exercício 33
 Criar um algoritmo em JAVA que receba o valor de x, e calcule e imprima o
valor de f(x).
f(x) -> 1, se x <= 1;
f(x) -> 2, se x < 1 <= 2;
f(x) -> x ** 2, se 2 < x <= 3;
f(x) -> x ** 3, se x > 3;

 */
package exercicio33condicionais;

import java.util.Scanner;
import java.math.RoundingMode;

public class Exercicio33Condicionais {

    public static void main(String[] args) {
        float n, x;
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite o valor para x: ");
        n = Float.parseFloat(SC.nextLine());
        
        if(n <= 1){
            x = 1;
            System.out.println("O valor da f(x) = "+x);
        }
        
        else if(n > 1 && n <= 2){
            x = 2;
            System.out.println("O valor da f(x) = "+x);
        }
        
        else if(n > 2 && n <= 3){
            x = (float) Math.pow(n, 2);
            System.out.println("O valor da f(x) = "+x);
        }
        
        else if(n > 3){
            x = (float) Math.pow(n, 3);
            System.out.println("O valor da f(x) = "+x);
        }
        
    }
    
}
