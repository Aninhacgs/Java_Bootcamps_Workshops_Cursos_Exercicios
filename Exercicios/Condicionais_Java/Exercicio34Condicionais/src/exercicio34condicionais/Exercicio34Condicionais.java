/*Exercício34
 Criar um algoritmo em PORTUGOL que receba o valor de x, e calcule e imprima o
valor de f(x).

f(x) = 8 / 2 - x

 */
package exercicio34condicionais;

import java.util.Scanner;

public class Exercicio34Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int x;
        float f;
        
        System.out.println("Digite o valor de  x: ");
        x = Integer.parseInt(SC.nextLine());
        
        System.out.println("==========CALCULANDO O VALOR DA F(X)==========");
        if(x == 2){
            System.out.println("Não foi possível calcular o valor da f(x), pois não existe divisão por zero!");
        }
        
        else{
            f = (float) 8 / (2 - x);
            System.out.println("f(x) = "+f);
        }
    }
    
}
