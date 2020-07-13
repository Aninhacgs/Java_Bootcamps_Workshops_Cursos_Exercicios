/*
 * Escreva um algoritmo em JAVA que receba dez números do usuário e armazene em um vetor o cubo de cada número. Após isso, o 
   algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio11vetores;
import java.math.MathContext;
import java.util.Scanner;
public class Exercicio11Vetores {

    public static void main(String[] args) {
        int valores[] = new int[20];
        int cubo[] = new int[20];
        int i;
        Scanner SC = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("Digite um valor referente ao índice "+i+" do vetor: ");
            valores[i] = (Integer.parseInt(SC.nextLine()));
            cubo[i] = (int) Math.pow(valores[i], 3);
            
        }
        
        System.out.println("==========O CUBO DOS VALORES DO VETOR==========");
        for(i=0;i<10;i++){
            System.out.println("O cubo do valor "+valores[i]+" = "+cubo[i]);
        }
    }
    
}
