/*
 * Escreva um algoritmo em JAVA que armazene em um vetor todos os números pares do intervalo fechado de 1 a 100. Após isso, o 
   algoritmo deve imprimir todos os valores armazenados.
 */
package exercicio07vetores;

public class Exercicio07Vetores {

    public static void main(String[] args) {
        int valores[] = new int[101];
        int i;
        
        for(i=1;i<=100;i++){
            if(i % 2 == 0){
                valores[i] = i;
            }
        }
        System.out.println("==========VALORES PARES DO VETOR NO INTERVALO DE 1 A 100==========");
        for(i=1;i<=100;i++){
            if(valores[i] != 0){
                System.out.println(valores[i]);
            }
        }
    }
    
}
