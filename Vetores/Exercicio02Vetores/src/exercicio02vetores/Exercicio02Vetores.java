/*
 Escreva um algoritmo em JAVA que armazene em um vetor todos os números inteiros do intervalo fechado de 1 a 100. Após isso,
 o algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio02vetores;

public class Exercicio02Vetores {
    public static void main(String[] args) {
        int valores[] = new int[101];
        int i;
        
        System.out.println("==========VALORES DO VETOR NO INTERVALO DE 1 A 100==========");
        for(i=1;i<=100;i++){
            valores[i]=i;
            System.out.println(valores[i]);
        }
    }
    
}
