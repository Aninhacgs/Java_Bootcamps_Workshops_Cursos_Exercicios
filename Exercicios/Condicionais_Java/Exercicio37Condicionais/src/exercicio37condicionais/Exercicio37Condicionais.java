/*Exercicio37
 Criar um algoritmo em JAVA que a partir da idade e peso do paciente calcule a
dosagem de determinado medicamento e imprima a receita informando quantas gotas
do medicamento o paciente deve tomar por dose. Considere que o medicamento em
questão possui 500 mg por ml, e que cada ml corresponde a 20 gotas.
- Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou
acima de 60 quilos devem tomar 1000 mg; com peso abaixo de 60 quilos
devem tomar 875 mg.
- Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo
peso corpóreo conforme a tabela a seguir:
    Peso                 Dosagem
5 kg a 9 kg               125 mg
9.1 kg a 16 kg            250 mg
16.1 kg a 24 kg           375 mg
24.1 kg a 30 kg           500 mg
Acima de 30 kg            750 mg
 */
package exercicio37condicionais;

import java.util.Scanner;

public class Exercicio37Condicionais {
    
    public static void main(String[] args) {
       float peso,calc,quantidadeGotas;
       int idade;
       Scanner SC = new Scanner(System.in);
       
       System.out.println("Digite a idade: ");
       idade = Integer.parseInt(SC.nextLine());
       System.out.println("Digite o peso: ");
       peso = Float.parseFloat(SC.nextLine());
       
       System.out.println("========== RECEITA DE DOSAGEM PARA MEDICAMENTO ==========");
       if(idade >= 12 && peso >= 60){
           calc = (float) (1000 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
       
       else if(idade >= 12 && peso < 60){
           calc = (float) (875 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
       
       else if(idade < 12 && peso >= 5 && peso <= 9){
           calc = (float) (125 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
       
       else if(idade < 12 && peso > 9 && peso <= 16 ){
           calc = (float) (250 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
       
       else if(idade < 12 && peso > 16 && peso <= 24){
           calc = (float) (374 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
       
       else if(idade < 12 && peso > 24 && peso <= 30){
           calc = (float) (500 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
       
       else if(idade < 12 && peso > 30){
           calc = (float) (750 / 500.0);
           quantidadeGotas = (int) (calc * 20);
           System.out.println("IDADE = "+idade+"\nPESO = "+peso+"\nQUANTIDADE DE ML = "+calc+"\nQUANTIDADE DE GOTAS = "
                   +quantidadeGotas);
       }
    }
    
}
