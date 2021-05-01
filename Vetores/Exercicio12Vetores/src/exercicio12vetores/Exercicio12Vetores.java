/*
 * Escreva um algoritmo em JAVA que receba quinze números do usuário e armazene em um vetor a raiz quadrada de cada número. 
   Caso o valor digitado seja menor que zero o número –1 deve ser atribuído ao elemento do vetor. Após isso, o
   algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio12vetores;
import java.math.MathContext;
import java.util.Scanner;
public class Exercicio12Vetores {

    public static void main(String[] args) {
        int valores[] = new int[15];
        double raiz[] = new double[15];
        int i;
        Scanner SC = new Scanner(System.in);
        for(i=0;i<15;i++){
            System.out.println("Digite um valor para o índice "+i+" do vetor ");
            valores[i] = (Integer.parseInt(SC.nextLine()));
            if(valores[i]<0){
                valores[i] = 0;
            }
            raiz[i] = Math.sqrt(valores[i]);
        }
        System.out.println("\n\n==========A RAIZ QUADRADA DOS VALORES DO VETOR==========");
        for(i=0;i<15;i++){
            System.out.println("A raiz quadrada do número "+valores[i]+" = "+raiz[i]);
        }
    }
    
}
