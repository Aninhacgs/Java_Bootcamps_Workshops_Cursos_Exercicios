/*Exercicio 38
 Construa um algoritmo em JAVA para determinar a situação
(APROVADO/EXAME/REPROVADO) de um aluno, dado a sua freqüência (FREQ)
(porcentagem de 0 a 100%) e sua nota (NOTA) (nota de 0.0 a 10.0), sendo que:
Condição Situação
Freqüência até 75% Reprovado
Freqüência entre 75% e 100% e Nota até 3.0 Reprovado
Freqüência entre 75% e 100% e Nota de 3.0 até 7.0 Exame
Freqüência entre 75% e 100% e Nota entre 7.0 e 10.0 Aprovado
 */
package exercicio38condicionais;

import java.util.Scanner;

public class Exercicio38Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        float frequencia, nota;
        System.out.println("Digite o valor da frequencia: ");
        frequencia = Float.parseFloat(SC.nextLine());
        System.out.println("Digite o valor da nota: ");
        nota = Float.parseFloat(SC.nextLine());
        System.out.println("==========BOLETIM ESCOLAR==========");
        if(frequencia<=75.0){
            System.out.println("REPROVADAO POR FREQUÊNCIA!");
        }
        else if(frequencia>75.0 && nota<=3.0){
            System.out.println("REPROVADO POR MÉDIA!");
        }
        else if(frequencia>75.0 && nota>3.0 && nota<=7.0){
            System.out.println("EXAME!");
        }
        else if(frequencia>75.0 && nota>7 && nota<=10){
            System.out.println("APROVADO!");
        }
    }
    
}
