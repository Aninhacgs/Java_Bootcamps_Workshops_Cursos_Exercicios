/*
 *Escreva um algoritmo em JAVA que armazene em um vetor todos os números inteiros de 100 a 200. Após isso, o algoritmo 
  deve imprimir todos os valores armazenados.
 */
package exercicio04vetores;

public class Exercicio04Vetores {

    public static void main(String[] args) {
        int valores[] = new int[201];
        int i;
        System.out.println("=========VALORES DO VETOR NO INTERVALO DE 100 A 200==========");
        for(i=100;i<=200;i++){
            valores[i] = i;
            System.out.println(valores[i]);
        }
    }
    
}
