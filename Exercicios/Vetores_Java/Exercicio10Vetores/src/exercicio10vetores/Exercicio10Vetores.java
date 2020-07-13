/*
 * Escreva um algoritmo em JAVA que receba dez números do usuário e armazene em um vetor a metade de cada número. Após isso, o
   algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio10vetores;
import java.util.Scanner;
public class Exercicio10Vetores {

    public static void main(String[] args) {
        int valores[] = new int[10];
        int i;
        double metades[] = new double[10];
        Scanner SC = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("Digite um valor para o índice "+i+" do vetor: ");
            valores[i] = (Integer.parseInt(SC.nextLine()));
            metades[i] = valores[i] / 2;
        }
        System.out.println("==========METADE DOS VALORES DO VETOR==========");
        for(i=0;i<10;i++){
            System.out.println("A metade do valor "+valores[i]+" = "+metades[i]);
        }
    }
    
}
