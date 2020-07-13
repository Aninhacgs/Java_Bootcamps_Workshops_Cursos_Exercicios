/*
 * Escreva um algoritmo em JAVA que armazene em um vetor todos os números múltiplos de 5, no intervalo fechado de 1 a 500. 
   Após isso, o algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio06vetores;

public class Exercicio06Vetores {

    public static void main(String[] args) {
        int valores[] = new int[501];
        int i;        
        for(i=1;i<=500;i++){
            if(i % 5 == 0){
                valores[i] = i;
            }
        }
        System.out.println("==========VALORES DO VETOR MÚLTIPLOS DE 5 NO INTERALO DE 1 A 500==========");
        for(i=0;i<501;i++){
            if(valores[i]!= 0){
                System.out.println(valores[i]);
            }
        }
    }
    
}
