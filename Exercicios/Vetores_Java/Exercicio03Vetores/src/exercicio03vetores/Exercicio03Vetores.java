/*
 Escreva um algoritmo em JAVA que armazene em um vetor todos os números inteiros de 100 a 1 (em ordem decrescente). Após isso, o algoritmo deve imprimir
todos os valores armazenados.
 */
package exercicio03vetores;

public class Exercicio03Vetores {
    
    public static void main(String[] args) {
        int valores[] = new int[101];
        int i;
        System.out.println("==========VALORES DO VETOR EM ORDEM DECRESCENTE==========");
        for(i=100;i>=1;i--){
            valores[i] = i;
            System.out.println(valores[i]);
        }
    }
    
}
