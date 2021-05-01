/*Exercício 24
Crie um algoritmo em JAVA que leia a idade de uma pessoa e informe a sua
classe eleitoral:
- não eleitor (abaixo de 16 anos);
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
 */
package exercicio24condiconais;

import java.util.Scanner;

public class Exercicio24Condiconais {

    public static void main(String[] args) {
        int idade;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o valor da idade: ");
        idade = (Integer.parseInt(SC.nextLine()));
        
        System.out.println("=========SITUAÇÃO ELITORAL=========");
        if(idade < 16){
            System.out.println("IDADE = "+idade+"\nSITUAÇÃO = NÃO ELEITOR");
        }
        
        else if(idade > 18 && idade < 65){
            System.out.println("IDADE = "+idade+"\nSITUAÇÃO = ELEITOR OBRIGATÓRIO");
        }
        
        else if(idade >= 16 && idade <= 18 || idade >= 65){
            System.out.println("IDADE = "+idade+"\nSITUAÇÃO = ELEITOR FACULTATIVO");
        }
    }
    
}
