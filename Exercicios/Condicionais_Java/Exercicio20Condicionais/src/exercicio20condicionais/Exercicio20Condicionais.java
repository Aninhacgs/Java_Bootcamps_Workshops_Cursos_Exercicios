/*Exercicio 20
 Criar um algoritmo em JAVA que leia dois números e imprimir o quadrado do
menor número e raiz quadrada do maior número, se for possível.
 */
package exercicio20condicionais;
import java.util.Scanner;
import java.math.RoundingMode;

public class Exercicio20Condicionais {

    public static void main(String[] args) {
        double n1,n2,quadrado;
        double raiz;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        n1 = (Double.parseDouble(SC.nextLine()));
        System.out.println("Digite o segundo valor: ");
        n2 = (Double.parseDouble(SC.nextLine()));
        
        if(n1 < n2){
            quadrado = Math.pow(n1, 2);
            System.out.println("O quadrado do número "+n1+" = "+quadrado);
            if(n2 > 0){
                raiz = Math.sqrt(n2);
                System.out.println("A raíz quadrada do número "+n2+" = "+raiz);
            }
            else{
                System.out.println("Não foi possível calcular a raiz quadrada do número "+n2+" ,pois este valor é menor que zero!");
            }
            
        }
        
        else if(n2 < n1){
            quadrado = Math.pow(n2, 2);
            System.out.println("O quadrado do número "+n2+" = "+quadrado);
            if(n1 > 0){
                raiz = Math.sqrt(n1);
                System.out.println("A raíz quadrada do número "+n1+" = "+raiz);
            }
            else{
                System.out.println("Não foi possível calcular a raiz quadrada do número "+n1+" ,pois este valor é menor que zero!");
            }
        }
    }
    
}
