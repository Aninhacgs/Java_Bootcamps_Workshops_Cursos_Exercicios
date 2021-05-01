/*Exercício 26
 Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas
começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um
vendedor de um plano de saúde apresentou a tabela a seguir. Criar um algoritmo em
JAVA que entre com a idade de uma pessoa e imprima o valor que ela deverá
pagar, segundo a seguinte tabela:
Idade Valor
Até 10 anos R$ 30,00
Acima de 10 até 29 anos R$ 60,00
Acima de 29 até 45 anos R$ 120,00
Acima de 45 até 59 anos R$ 150,00
Acima de 59 até 65 anos R$ 250,00
maior que 65 anos R$ 400,00
 */
package exercicio26condicionais;

import java.util.Scanner;

public class Exercicio26Condicionais {

    public static void main(String[] args) {
        int idade;
        double valor;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite a idade: ");
        idade = (Integer.parseInt(SC.nextLine()));
        
        System.out.println("==========ANÁLISE DO VALOR DA MENSALIDADE PARA PLANO DE SAÚDE=========");
        
        if(idade <= 10){
            valor = 30;
            System.out.println("IDADE = "+idade+"\nVALOR = "+valor);
            
        }
        
        else if(idade > 10 && idade <= 29){
            valor = 60;
            System.out.println("IDADE = "+idade+"\nVALOR = "+valor);
        }
        
        else if(idade > 29 && idade <= 45){
            valor = 120;
            System.out.println("IDADE = "+idade+"\nVALOR = "+valor);
        }
        
        else if(idade > 45 && idade <= 59){
            valor = 150;
            System.out.println("IDADE = "+idade+"\nVALOR = "+valor);
        }
        
        else if(idade > 59 && idade <= 65){
            valor = 250;
            System.out.println("IDADE = "+idade+"\nVALOR = "+valor);
        }
        
        else if(idade > 65){
            valor = 400;
            System.out.println("IDADE = "+idade+"\nVALOR = "+valor);
        }
        
    }
    
}
