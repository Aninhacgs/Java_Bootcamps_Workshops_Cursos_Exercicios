/*
 * Escreva um algoritmo em JAVA que receba a altura de 10 atletas. Esse algoritmo deve imprimir a altura daqueles atletas 
   que tem altura maior que a média.
 */
package exercicio13vetores;
import java.util.Scanner;
public class Exercicio13Vetores {

    public static void main(String[] args) {
        double alturas[] = new double[10];
        int i;
        double media,soma=0.0;
        Scanner SC = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("Digite uma altura referente ao índice "+i+" do vetor: ");
            alturas[i] = (Double.parseDouble(SC.nextLine()));
            while(alturas[i]<=0 || alturas[i]>=3){
                System.out.println("Valor incorreto para altura! Por favor digite novamente: ");
                alturas[i] = (Double.parseDouble(SC.nextLine()));
            }
            
            soma = soma + alturas[i];
        }
        
        media = soma / 10;
        
        System.out.println("\n\n==========VETOR DAS ALTURAS MAIORES QUE A MÉDIA==========");
        for(i=0;i<10;i++){
            if(alturas[i] > media){
                System.out.println("Altura - "+alturas[i]);
            }
            
        }
        
        System.out.println("Média das alturas - "+media);
    }
    
}
