/* Exercicío 12
 A prefeitura de Contagem abriu uma linha de crédito para os funcionários estatutários.
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um
algoritmo que permita entrar com o salário bruto e o valor da prestação, e informar se
o empréstimo pode ou não ser concedido.
 */
package exercicio12condicionais;
import java.util.Scanner;

public class Exercicio12Condicionais {

    public static void main(String[] args) {
       float salarioBruto, valorPrestacao, valorMaximo;
       Scanner SC = new Scanner(System.in);
       System.out.println("Digite o valor do salário bruto: ");
       salarioBruto = (Float.parseFloat(SC.nextLine()));
       System.out.println("Digite o valor da prestação: ");
       valorPrestacao = (Float.parseFloat(SC.nextLine()));
       
       valorMaximo = (float) (salarioBruto * (30.0 / 100));
       
       if(valorMaximo >= valorPrestacao){
           System.out.println("====================VALORES====================");
           System.out.println("Salário Bruto.........: R$:"+salarioBruto+"\n"+"Valor da Prestação..........: R$:"+
                   valorPrestacao+"\n"+"Valor máximo para empréstimo..........: R$:"+valorMaximo+"\n\n");
           System.out.println("==========STATUS DO EMPRÉSTIMO==========");
           System.out.println("O empréstimo pode ser concedido!\n");
       }
       
       else if(valorMaximo < valorPrestacao){
           System.out.println("====================VALORES====================");
           System.out.println("Salário Bruto.........: R$:"+salarioBruto+"\n"+"Valor da Prestação..........: R$:"+
                   valorPrestacao+"\n"+"Valor máximo para empréstimo..........: R$:"+valorMaximo+"\n\n");
           System.out.println("==========STATUS DO EMPRÉSTIMO==========");
           System.out.println("O empréstimo não pode ser concedido!\n");
    }
    }
    
}
