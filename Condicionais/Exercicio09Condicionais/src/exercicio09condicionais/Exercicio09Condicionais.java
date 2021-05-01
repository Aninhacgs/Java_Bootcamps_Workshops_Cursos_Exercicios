/*Exercício 09
Escreva um algoritmo em JAVA para determinar se um número A é divisível
por um outro número B. Esses valores devem ser fornecidos pelo usuário.
*/

package exercicio09condicionais;

import java.util.Scanner;

public class Exercicio09Condicionais {

    public static void main(String[] args) {
       int A,B;
       Scanner SC = new Scanner(System.in);
       
       System.out.println("Digite o valor de A.........: ");
       A = (Integer.parseInt(SC.nextLine()));
       while(A <= 0){
           System.out.println("O valor de A deve ser maior que zero!\nPor favor, digite novamente..........: ");
           A = (Integer.parseInt(SC.nextLine()));
       }
       System.out.println("Digite o valor de B.........: ");
       B = (Integer.parseInt(SC.nextLine()));
       
       while(B <= 0){
           System.out.println("O valor de B deve ser maior que zero!\nPor favor, digite novamente..........: ");
           B = (Integer.parseInt(SC.nextLine()));
       }
      
       while(B>A){
           System.out.println("O valor B deve ser menor que o valor de A!\nPor favor, digite novamente.........: ");
           B = (Integer.parseInt(SC.nextLine()));
       }
       
       if(A %B == 0){
           System.out.println("O valor "+A+" é divisível por "+B+"!");
       }
       
       else if(A %B !=0){
           System.out.println("O valor "+A+" não é divisível por "+B+"!");
       }
    }
    
}

