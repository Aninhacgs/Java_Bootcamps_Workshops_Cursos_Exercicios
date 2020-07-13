/*Exercicio 44
 Criar um algoritmo em JAVA que leia um número inteiro entre 1 e 12 e
escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo,
deverá aparecer uma mensagem informando que não existe mês com este número.
 */
package exercicio44condicionais;

import java.util.Scanner;

public class Exercicio44Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int mes;
        System.out.println("==========MÊS==========");
        System.out.println("Digite um valor para mês: ");
        mes = Integer.parseInt(SC.nextLine());
        
        if(mes == 1){
            System.out.println("JANEIRO");
        }
        else if(mes == 2){
            System.out.println("FEVEREIRO");
        }
        else if(mes == 3){
            System.out.println("MARÇO");
        }
        else if(mes == 4){
            System.out.println("ABRIL");
        }
        else if(mes == 5){
            System.out.println("MAIO");
        }
        else if(mes == 6){
            System.out.println("JUNHO");
        }
        else if(mes == 7){
            System.out.println("JULHO");
        }
        else if(mes == 8){
            System.out.println("AGOSTO");
        }
        else if(mes == 9){
            System.out.println("SETEMBRO");
        }
        else if(mes == 10){
            System.out.println("OUTUBRO");
        }
        else if(mes == 11){
            System.out.println("NOVEMBRO");
        }
        else if(mes == 12){
            System.out.println("DEZEMBRO");
        }
        else{
            System.out.println("NÃO EXISTE MÊS EQUIVALENTE A ESTE VALOR!'");
        }
    }
    
}
