/*
 * Escreva um algoritmo em JAVA que armazene em um vetor todos os números inteiros de 200 a 100 (em ordem decrescente). Após 
   isso, o algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio05vetores;

public class Exercicio05Vetores {
    
    public static void main(String[] args) {
        int valores[] = new int[201];
        int i;
        
        System.out.println("==========VALORES DO VETOR EM ORDEM DECRESCENTE NO INTERVALO 200 A 100");
        for(i=200;i>=100;i--){
            valores[i]= i;
            System.out.println(valores[i]);
        }
    }
    
}
