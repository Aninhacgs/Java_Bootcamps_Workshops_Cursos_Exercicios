/*Exercício 21
 Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta com um
peso favorável. Essa situação é determinada através do IMC (Índice de Massa
Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da
Altura (ALTURA) do indivíduo.
A situação do peso é determinada pela tabela abaixo:
Condição           Situação
IMC abaixo de 20  Abaixo do peso
IMC de 20 até 25  Peso Normal
IMC de 25 até 30  Sobre Peso
IMC de 30 até 40  Obeso
IMC de 40 e acima Obeso Mórbido
 */
package exercicio21condicionais;

import java.util.Scanner;
import java.math.RoundingMode;

public class Exercicio21Condicionais {
    public static void main(String[] args) {
        double peso,altura, IMC;
        Scanner SC = new Scanner (System.in);
        
        System.out.println("Digite o valor do peso: ");
        peso = (Double.parseDouble(SC.nextLine()));
        
        System.out.println("Digite o valor da altura: ");
        altura = (Double.parseDouble(SC.nextLine()));
        
        IMC = peso /  Math.pow(altura,2);
        
        System.out.println("===========ANÁLISE DO IMC==========");
        if(IMC < 20){
            System.out.println("Valor do IMC = "+IMC+"\nSituação = Abaixo do Peso!");
        }
        else if(IMC >= 20 && IMC < 25){
            System.out.println("Valor do IMC = "+IMC+"\nSituação = Peso Normal!");
        }
        
        else if(IMC >= 25 && IMC < 30){
            System.out.println("Valor do IMC = "+IMC+"\nSituação = Sobre Peso!");
        }
        
        else if(IMC >= 30 && IMC < 40){
            System.out.println("Valor do IMC = "+IMC+"\nSituação = Obeso!");
        }
        
        else if(IMC >= 40){
            System.out.println("Valor do IMC = "+IMC+"\nSituação = Obeso Mórbido!");
        }
        
        
    }
    
}
