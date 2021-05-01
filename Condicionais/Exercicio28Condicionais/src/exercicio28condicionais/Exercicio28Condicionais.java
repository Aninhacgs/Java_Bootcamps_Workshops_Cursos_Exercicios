/*Exercício 28
Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir:
Valor da Compra Valor da Venda
Valor < R$ 10,00 Lucro de 70%
R$ 10,00 £ Valor < R$ 30,00 Lucro de 50%
R$ 30,00 £ Valor < R$ 50,00 Lucro de 40%
Valor ³ R$ 50,00 Lucro de 30%
Criar um algoritmo em JAVA que leia o valor da compra e imprima o valor da
venda.
 */
package exercicio28condicionais;

import java.util.Scanner;

public class Exercicio28Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        float valor, lucro;
        
        System.out.println("Digite o valor da compra......: ");
        valor = (Float.parseFloat(SC.nextLine()));
        
        System.out.println("==========VALOR DA COMPRA X VALOR DO LUCRO==========");
        if(valor < 10){
            lucro = (float) (valor * (70.0 / 100));
            System.out.println("VALOR DA COMPRA...... "+valor+"\nVALOR DO LUCRO..... "+lucro);
        }
        
        else if(valor >= 10 && valor < 30){
            lucro = (float) (valor * (50.0 / 100));
            System.out.println("VALOR DA COMPRA...... "+valor+"\nVALOR DO LUCRO..... "+lucro);
        }
        
        else if(valor >= 30 && valor < 50){
            lucro = (float) (valor * (40.0 / 100));
            System.out.println("VALOR DA COMPRA...... "+valor+"\nVALOR DO LUCRO..... "+lucro);
        }
        
        else if(valor >= 50){
            lucro = (float) (valor * (30.0 / 100));
            System.out.println("VALOR DA COMPRA...... "+valor+"\nVALOR DO LUCRO..... "+lucro);
        }
    }
    
}
