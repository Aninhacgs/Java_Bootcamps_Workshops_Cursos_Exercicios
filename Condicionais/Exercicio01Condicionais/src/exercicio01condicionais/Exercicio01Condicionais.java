/*
Escreva um algoritmo em JAVA que leia um número e o imprima caso ele seja
maior que 20.
*/
package exercicio01condicionais;
import java.util.Scanner;

public class Exercicio01Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número.........: ");
        numero = (Integer.parseInt(SC.nextLine()));
        
        if(numero>20){
            System.out.println("O número "+numero+" é maior que 20");
        }
        else{
            System.out.println("O número "+numero+" é menor que 20");
        }
        
    }
    
}
