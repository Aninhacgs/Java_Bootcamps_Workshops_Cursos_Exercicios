/*Exercício 05
Construir um algoritmo em JAVA que leia dois números e efetue a adição.
Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele
mais 8; caso o valor somado seja menor ou igual a 20, este deverá ser apresentado
subtraindo-se 5.
*/
package exercicio05condicionais;
import java.util.Scanner;
public class Exercicio05Condicionais {
    public static void main(String[] args) {
        int n1,n2,soma,somaAtual;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor..........: ");
        n1 = (Integer.parseInt(SC.nextLine()));
        System.out.println("Digite o segundo valor...........: ");
        n2 = (Integer.parseInt(SC.nextLine()));
        
        soma = n1 + n2;
        
        if(soma > 20){
            somaAtual = soma + 8;
            
            System.out.println("A soma "+n1+" + "+n2+" = "+soma+" é maior que 20.\n"
                    + "Desta forma, atualizamos seu valor para "+somaAtual);
        }
        
        else if(soma < 20){
            somaAtual = soma - 5;
            System.out.println("A soma "+n1+" + "+n2+" = "+soma+" é menor que 20.\n"
                    + "Desta forma, atualizamos seu valor para "+somaAtual);
        }
        
    }
    
}

