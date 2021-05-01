/*Exercício 23
 Escreva um algoritmo em JAVA que dada a idade de uma pessoa, determine
sua classificação segundo a seguinte tabela:
- maior de idade;
- menor de idade;
- pessoa idosa (idade superior ou igual a 65 anos).
 */
package exercicio23condicionais;

import java.util.Scanner;

public class Exercicio23Condicionais {

    public static void main(String[] args) {
        int idade;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o valor da idade: ");
        idade = (Integer.parseInt(SC.nextLine()));
        
        System.out.println("=========ANÁLISE DA IDADE=========");
        if(idade < 18){
            System.out.println("IDADE = "+idade+"\nSITUAÇÃO = MENOR DE IDADE");
        }
        
        else if(idade >= 18 && idade < 65){
            System.out.println("IDADE = "+idade+"\nSITUAÇÃO = MAIOR DE IDADE");
        }
        
        else if(idade >= 65){
            System.out.println("IDADE = "+idade+"\nSITUAÇÃO = PESSOA IDOSA");
        }
    }
    
}
