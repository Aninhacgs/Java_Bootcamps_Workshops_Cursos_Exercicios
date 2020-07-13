/*Exercício 25
 A confederação brasileira de natação irá promover eliminatórias para o próximo
mundial. Fazer um algoritmo em PORTUGOL que receba a idade de um nadador e
determine (imprima) a sua categoria segundo a tabela a seguir:
Categoria      Idade
Infantil A 5 – 7 anos
Infantil B 8 – 10 anos
Juvenil A 11 – 13 anos
Juvenil B 14 – 17 anos
Sênior Maiores de 18 anos
 */
package exercicio25condicionais;

import java.util.Scanner;

public class Exercicio25Condicionais {
    public static void main(String[] args) {
        int idade;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite a idade do nador: ");
        idade = (Integer.parseInt(SC.nextLine()));
        
        
        System.out.println("==========ANÁLISE CATEGORIA DE NATAÇÃO=========");
        if(idade < 5){
            System.out.println("IDADE = "+idade+"\nCATEGORAIA = NÃO PODE SER INCLUÍDO EM NENHUMA CATEGORIA!");
        }
        else if(idade >= 5 && idade <= 7){
            System.out.println("IDADE = "+idade+"\nCATEGORIA = INFANTIL A");
        }
        
        else if(idade >= 8 && idade <= 10){
            System.out.println("IDADE = "+idade+"\nCATEGORIA = INFANTIL B");
        }
        
        else if(idade >= 11 && idade <= 13){
            System.out.println("IDADE = "+idade+"\nCATEGORIA = JUVENIL A");
        }
        
        else if(idade >= 14 && idade <= 17){
            System.out.println("IDADE = "+idade+"\nCATEGORIA = JUVENIL B");
        }
        
        else if(idade >= 18){
            System.out.println("IDADE = "+idade+"\nCATEGORIA = SÊNIOR");
        }
    }
    
}
