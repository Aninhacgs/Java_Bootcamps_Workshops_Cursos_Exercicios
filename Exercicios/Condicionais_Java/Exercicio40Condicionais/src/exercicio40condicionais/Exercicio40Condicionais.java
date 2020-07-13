/*Exercicio 40
Criar um algoritmo em JAVA que leia o destino do passageiro, se a viagem
inclui retorno (ida e volta) e informar o preço da passagem conforme a tabela a seguir:
Condição                 Ida          Ida e Volta
Região Norte           R$ 500,00       R$ 900,00
Região Nordeste        R$ 350,00       R$ 650,00
Região Centro-Oeste    R$ 350,00       R$ 600,00
Região Sul             R$ 300,00       R$ 550,00
 */
package exercicio40condicionais;

import java.util.Scanner;

public class Exercicio40Condicionais {

    public static void main(String[] args) {
        float ida1 = 500, ida2 = 350, ida3 = 350, ida4 = 300;
        float idaVolta1 = 900, idaVolta2 = 650, idaVolta3 = 600, idaVolta4 = 550;
        int regiao,passagem;
        String regiao1 = "Região Norte";
        String regiao2 = "Região Nordeste";
        String regiao3 = "Região Centro-Oeste";
        String regiao4 = "Região Sul";
        Scanner SC = new Scanner(System.in);
        
        System.out.println("========= MENU de REGIÕES ==========");
        System.out.println("1 - Reigião Norte\n2 - Região Nordeste\n3 - Região Centro-Oeste\n"
                + "4 - Região Sul");
        
        System.out.println("\nDigite um valor para selecionar uma região: ");
        regiao = Integer.parseInt(SC.nextLine());
        
        System.out.println("Digite 1 para passagem somente de ida ou 2 para passagem de ida e volta: ");
        passagem = Integer.parseInt(SC.nextLine());
        
        System.out.println("========== DESTINO PASSAGEIRO =========");
        if(regiao == 1){
            if(passagem == 1){
                System.out.println("Região de destino = "+regiao1+"\nValor da passagem R$:"+ida1);
            }
            else if(passagem == 2){
                System.out.println("Região de destino = "+regiao1+"\nValor da passagem R$:"+idaVolta1);
            }
        }
        
        else if( regiao == 2){
            if(passagem == 1){
                System.out.println("Região de destino = "+regiao2+"\nValor da passagem R$:"+ida2);
            }
            else if(passagem == 2){
                System.out.println("Região de destino = "+regiao2+"\nValor da passagem R$:"+idaVolta2);
            }
        }
        
        else if( regiao == 3){
            if(passagem == 1){
                System.out.println("Região de destino = "+regiao3+"\nValor da passagem R$:"+ida3);
            }
            else if(passagem == 2){
                System.out.println("Região de destino = "+regiao3+"\nValor da passagem R$:"+idaVolta3);
            }
        }
        
        else if( regiao == 4){
            if(passagem == 1){
                System.out.println("Região de destino = "+regiao4+"\nValor da passagem R$:"+ida4);
            }
            else if(passagem == 2){
                System.out.println("Região de destino = "+regiao4+"\nValor da passagem R$:"+idaVolta4);
            }
        }
        
        else{
            System.out.println("Opção inválida!");
        }
    }
    
}
