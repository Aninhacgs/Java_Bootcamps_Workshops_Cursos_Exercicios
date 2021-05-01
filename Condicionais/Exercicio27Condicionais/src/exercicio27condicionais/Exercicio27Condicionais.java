/*Exercício 27
 Escreva um algoritmo em PORTUGOL que leia as duas notas bimestrais de um aluno
e determine a média das notas semestral. Através da média calculada o algoritmo deve
imprimir a seguinte mensagem: “Aprovado”, “Reprovado” ou em “Exame” (a média é
7 para Aprovação, menor que 3 para Reprovação e as demais em Exame).
 */
package exercicio27condicionais;

import java.util.Scanner;

public class Exercicio27Condicionais {
    
    public static void main(String[] args) {
      String nome;
      float av1,av2,media;
      Scanner SC = new Scanner(System.in);
      
      System.out.println("Digite o nome do aluno: ");
      nome = (SC.nextLine());
      
      System.out.println("Digite a nota para AV1: ");
      av1 = (Float.parseFloat(SC.nextLine()));
      
      System.out.println("Digite a nota para AV2: ");
      av2 = (Float.parseFloat(SC.nextLine()));
      
      media = (av1 + av2) / 2;
      
      System.out.println("==========BOLETIM ESCOLAR=========");
      
      if(media <= 3){
          System.out.println("NOME...... "+nome+"\nAVALIAÇÃO 1°...... "+av1+"\nAVALIAÇÃO 2°..... "+av2+"\nMEDIA...... "+media+"\nSITUAÇÃO...... REPROVADO");
      }
      
      else if(media >3 && media < 7){
          System.out.println("NOME...... "+nome+"\nAVALIAÇÃO 1°...... "+av1+"\nAVALIAÇÃO 2°..... "+av2+"\nMEDIA...... "+media+"\nSITUAÇÃO...... EM EXAME");
          
      }
      
      else if(media >= 7){
          System.out.println("NOME...... "+nome+"\nAVALIAÇÃO 1°...... "+av1+"\nAVALIAÇÃO 2°..... "+av2+"\nMEDIA...... "+media+"\nSITUAÇÃO...... APROVADO");
      }
    }
    
}
