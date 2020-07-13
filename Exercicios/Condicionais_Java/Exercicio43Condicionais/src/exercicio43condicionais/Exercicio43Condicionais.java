/*Exerccio 43
 Escreva um algoritmo em JAVA que leia um peso na Terra e o número de um
planeta e imprima o valor do seu peso neste planeta. A relação de planetas é dada a
seguir juntamente com o valor das gravidades relativas á Terra:

#      Gravidade         Relativa Planeta
1        0,37                 Mercúrio
2        0,88                   Vênus
3        0,38                   Marte
4        2,64                  Júpiter
5        1,15                  Saturno
6        1,17                   Urano
 */
package exercicio43condicionais;

import java.util.Scanner;

public class Exercicio43Condicionais {

    public static void main(String[] args) {
        int opc;
        float massa,peso;
        float mercurio = (float) 0.37; 
        float venus = (float) 0.88;
        float marte = (float) 0.38;
        float jupter = (float) 2.64; 
        float saturno = (float) 1.15; 
        float urano = (float) 1.17;
        Scanner SC = new Scanner(System.in);
        
        System.out.println("========== MENU PALNETAS ==========");
        System.out.println("1 - Mercúrio\n2 - Vênus\n3 - Marte\n4 - Júpiter\n5 - Saturno\n6 - Urano");
        System.out.println("\nSelecione uma opção: ");
        opc = Integer.parseInt(SC.nextLine());
        System.out.println("\nDigite o valor da massa do objeto: ");
        massa = Float.parseFloat(SC.nextLine());
        
        System.out.println("\n========== ANÁLISE DO PESO EM RELAÇÃO AO PLANETA ==========");
        if(opc == 1){
            peso = massa * mercurio;
            System.out.println("O peso do objeto no planeta Mercúrio = "+peso);
        }
        else if(opc == 2){
            peso = massa * venus;
            System.out.println("O peso do objeto no planeta Vênus = "+peso);
        }
        
        else if(opc == 3){
            peso = massa * marte;
            System.out.println("O peso do objeto no planeta Marte = "+peso);
        }
        else if(opc == 4){
            peso = massa * jupter;
            System.out.println("O peso do objeto no planeta Júpter = "+peso);
        }
        
        else if(opc == 5){
            peso = massa * saturno;
            System.out.println("O peso do objeto no planeta Saturno = "+peso);
        }
        
        else if(opc == 6){
            peso = massa * urano;
            System.out.println("O peso do objeto no planeta Urano = "+peso);
        }
        
        else{
            System.out.println("Opção inválida!");
        }
    }
    
}
