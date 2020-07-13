/*Exercício 22
A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo
com o saldo médio no último ano. Fazer um algoritmo em JAVA que leia o
saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir.
Imprimir uma mensagem informando o saldo médio e o valor de crédito.

Saldo Médio    Percentual
De 0 a 500     Nenhum crédito
De 501 a 1000  30% do valor do saldo médio
De 1001 a 3000 40% do valor do saldo médio
Acima de 3001  50% do valor do saldo médio

 */
package exercicio22condicionais;

import java.util.Scanner;

public class Exercicio22Condicionais {

    public static void main(String[] args) {
        double saldoMedio, valorCreditado;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o valor do saldo médio: ");
        saldoMedio = (Double.parseDouble(SC.nextLine()));
        
        System.out.println("=========ANÁLISE CRÉDITO ESPECIAL==========");
        
        if(saldoMedio >= 0 && saldoMedio < 500){
            valorCreditado = 0;
            System.out.println("Saldo Médio R$:"+saldoMedio+"\nValor do crédito R$:"+valorCreditado);
        }
        
        else if(saldoMedio >= 501 && saldoMedio < 1000){
            valorCreditado = saldoMedio * (30.0 / 100);
            System.out.println("Saldo Médio R$:"+saldoMedio+"\nValor do crédito R$:"+valorCreditado);
        }
        
        else if(saldoMedio >= 1001 && saldoMedio < 3000){
            valorCreditado = saldoMedio * (40.0 / 100);
            System.out.println("Saldo Médio R$:"+saldoMedio+"\nValor do crédito R$:"+valorCreditado);
        }
        
        else if(saldoMedio > 3001){
            valorCreditado = saldoMedio * (50.0 / 100);
            System.out.println("Saldo Médio R$:"+saldoMedio+"\nValor do crédito R$:"+valorCreditado);
        }
    }
    
}
