/*Exercicio 41
 Criar um algoritmo em JAVA que leia o um número inteiro entre 1 e 7 e
escreva o dia da semana correspondente. Caso o usuário digite um número fora desse
intervalo, deverá aparecer uma mensagem informando que não existe dia da semana
com esse número.
 */
package exercicio41condicionais;

import java.util.Scanner;

public class Exercicio41Condicionais {

    public static void main(String[] args) {
        int dia;
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite um valor para dia da semana: ");
        dia = Integer.parseInt(SC.nextLine());
        System.out.println("==========DIA DA SEMANA==========");
        if(dia == 1){
            System.out.println("DOMINGO");
        }
        else if(dia == 2){
            System.out.println("SEGUNDA");
        }
        else if(dia == 3){
            System.out.println("TERÇA");
        }
        else if(dia == 4){
            System.out.println("QUARTA");
        }
        else if(dia == 5){
            System.out.println("QUINTA");
        }
        else if(dia == 6){
            System.out.println("SEXTA");
        }
        else if(dia == 7){
            System.out.println("SÁBADO");
        }
        else{
            System.out.println("NÃO EXISTE DIA DA SEMANA EQUIVALENTE A ESTE VALOR!");
        }
    }
    
}
