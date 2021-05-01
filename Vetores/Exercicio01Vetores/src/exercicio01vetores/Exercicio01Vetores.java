/*
 Escreva um algoritmo em JAVA que armazene em um vetor todos os números inteiros de 0 a 50. Após isso, o algoritmo deve 
 imprimir todos os valores armazenados.
 */
package exercicio01vetores;

public class Exercicio01Vetores {
    public static void main(String[] args) {
        
        int valores[] = new int [51];
        int i;
        System.out.println("==========VALORES DO VEOTOR==========");
        for(i=0;i<=50;i++){
            valores[i] = i;
            System.out.println(valores[i]);
        }
    }
    
}
