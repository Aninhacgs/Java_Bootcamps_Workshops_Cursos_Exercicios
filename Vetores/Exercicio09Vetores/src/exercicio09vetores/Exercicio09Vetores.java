/*
 * Escreva um algoritmo em JAVA que armazene em um vetor o quadrado dos números ímpares no intervalo fechado de 1 a 20. Após
   isso, o algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio09vetores;
import java.math.MathContext;
import java.util.Scanner;
public class Exercicio09Vetores {
    
    public static void main(String[] args) {
        int valores[] = new int[20];
        int quadrado[] = new int[20];
        int i;
        Scanner SC = new Scanner(System.in);
        for(i=0;i<20;i++){
            System.out.println("Digite um valor referente ao índice "+i+" do vetor: ");
            valores[i] = (Integer.parseInt(SC.nextLine()));
            if(valores[i] % 2 != 0){
                quadrado[i] = (int) Math.pow(valores[i], 2);
                System.out.println("O quadrado do valor "+valores[i]+" = "+quadrado[i]);
            }
            
        }
        
    }
    
}
