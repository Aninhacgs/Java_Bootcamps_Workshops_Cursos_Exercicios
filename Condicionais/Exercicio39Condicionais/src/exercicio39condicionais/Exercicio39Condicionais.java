/*Exercicio39
 Criar um algoritmo em JAVA que informe a quantidade total de calorias de
uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida
(veja a tabela a seguir).

Prato       Calorias         Sobremesa       Calorias         Bebida             Calorias
Vegetariano 180 cal          Abacaxi         75 cal           Chá                20 cal
Peixe       230 cal          Sorvete diet    110 cal          Suco de laranja    70 cal
Frango      250 cal          Mouse diet      170 cal          Suco de melão      100 cal
Carne       350 cal          Mouse chocolate 200 cal          Refrigerante diet  65 cal

Sugestão: 
enumere cada opção de prato, sobremesa e bebida. Ou seja: 
Prato: 
1 - vegetariano, 
2 – Peixe, 
3 – Frango, 
4 – Carne; 
Sobremesa: 
1 – Abacaxi, 
2 – Sorvete diet, 
3 – Mouse diet, 
4 – Mouse chocolate; 
Bebida: 
1 – Chá, 
2 - Suco de laranja, 
3 – Suco de melão, 
4 – Refrigerante diet.
 */
package exercicio39condicionais;

import java.util.Scanner;

public class Exercicio39Condicionais {
    
    public static void main(String[] args) {
        int prato,sobremesa,bebida;
        int abacaxi,sorveteDiet,mouseDiet,mouseChocolate,cha,sucoLaranja,sucoMelao,refrigeranteDiet;
        int vegetariano,peixe,frango,carne;
        String prato1 = "Vegetariano";
        String prato2 ="Peixe";
        String prato3 = "Frango";
        String prato4 = "Carne";
        String sobremesa1 = "Abacaxi";
        String sobremesa2 = "Sorvete Diet";
        String sobremesa3 = "Mouse Diet";
        String sobremesa4 = "Mouse Chocolate";
        String bebida1 = "Chá";
        String bebida2 = "Suco de Laranja";
        String bebida3 = "Suco de Melão";
        String bebida4 = "Refrigerante Diet";
        float totalCalorias = 0;
        Scanner SC = new Scanner(System.in);
        //Inicializando as variáveis equivalentes as sobremesas
        abacaxi = 75;
        sorveteDiet = 110;
        mouseDiet = 170;
        mouseChocolate = 200;
        //Inicializando as variáveis equivalentes as bebidas
        cha = 20;
        sucoLaranja = 70;
        sucoMelao = 100;
        refrigeranteDiet = 65;
        //Inicializando as variáveis equivalentes aos pratos
        vegetariano = 180;
        peixe = 230;
        frango = 250;
        carne = 350;
        
        System.out.println("========== MENU PARA CARDÁPPIO =========");
        System.out.println("PRATOS:\n1-"+prato1+"\n2-"+prato2+"\n3-"+prato3+"\n4-"+prato4+"\nSOBREMESAS:\n1-"+sobremesa1+"\n2-"
        +sobremesa2+"\n3-"+sobremesa3+"\n4-"+sobremesa4+"\nBEBIDAS:\n1-"+bebida1+"\n2-"+bebida2+"\n3-"+bebida3+"\n4-"+bebida4);
        
        System.out.println("\n\nDigite um valor entre de 1 até 4 para selecionar o prato: ");
        prato = Integer.parseInt(SC.nextLine());
        System.out.println("Digite um valor de 1 até 4 para selecionar a sobremessa: ");
        sobremesa = Integer.parseInt(SC.nextLine());
        System.out.println("Digite um valor de 1 até 4 para selecionar a bebida: ");
        bebida = Integer.parseInt(SC.nextLine());
        
        if(prato == 1){
            if(sobremesa == 1 && bebida == 1){
                totalCalorias = vegetariano + cha + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa1+"  Calorias"+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 2){
                totalCalorias = vegetariano + sucoLaranja + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa1+"  Calorias"+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 3){
                totalCalorias = vegetariano + sucoMelao + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa1+"  Calorias"+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1  && bebida == 4){
                totalCalorias = vegetariano + refrigeranteDiet + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa1+"  Calorias"+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 2 && bebida == 1){
                totalCalorias = vegetariano + cha + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa2+"  Calorias"+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 2){
                totalCalorias = vegetariano + sucoLaranja + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa2+"  Calorias"+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 3){
                totalCalorias = vegetariano + sucoMelao + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa2+"  Calorias"+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 4){
                totalCalorias = vegetariano + refrigeranteDiet + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa2+"  Calorias"+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 3 && bebida == 1){
                totalCalorias = vegetariano + cha + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa3+"  Calorias"+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 2){
                totalCalorias = vegetariano + sucoLaranja + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa3+"  Calorias"+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 3){
                totalCalorias = vegetariano + sucoMelao + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa3+"  Calorias"+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 4){
                totalCalorias = vegetariano + refrigeranteDiet + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa3+"  Calorias"+
                        mouseDiet+"\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 4 && bebida == 1){
                totalCalorias = vegetariano + cha + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa4+"  Calorias"+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 2){
                totalCalorias = vegetariano + sucoLaranja + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa4+"  Calorias"+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 3){
                totalCalorias = vegetariano + sucoMelao + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa4+"  Calorias"+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 4){
                totalCalorias = vegetariano + refrigeranteDiet + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato1+"  Calorias = "+vegetariano+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa4+"  Calorias"
                        +mouseChocolate+"\nTotal Calorias = "+totalCalorias);
            }
            
        }
        else if(prato == 2){
            if(sobremesa == 1 && bebida == 1){
                totalCalorias = peixe + cha + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 2){
                totalCalorias = peixe + sucoLaranja + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 3){
                totalCalorias = peixe + sucoMelao + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1  && bebida == 4){
                totalCalorias = peixe + refrigeranteDiet + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 2 && bebida == 1){
                totalCalorias = peixe + cha + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 2){
                totalCalorias = peixe + sucoLaranja + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 3){
                totalCalorias = peixe + sucoMelao + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 4){
                totalCalorias = peixe + refrigeranteDiet + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 3 && bebida == 1){
                totalCalorias = peixe + cha + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 2){
                totalCalorias = peixe + sucoLaranja + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 3){
                totalCalorias = peixe + sucoMelao + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 4){
                totalCalorias = peixe + refrigeranteDiet + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa3+"  Calorias = "+
                        mouseDiet+"\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 4 && bebida == 1){
                totalCalorias = peixe + cha + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 2){
                totalCalorias = peixe + sucoLaranja + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 3){
                totalCalorias = peixe + sucoMelao + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 4){
                totalCalorias = peixe + refrigeranteDiet + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato2+"  Calorias = "+peixe+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa4+"  Calorias = "
                        +mouseChocolate+"\nTotal Calorias = "+totalCalorias);
            }
        }
        
        else if(prato == 3){
            if(sobremesa == 1 && bebida == 1){
                totalCalorias = frango + cha + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 2){
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                totalCalorias = frango + sucoLaranja + abacaxi;
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 3){
                totalCalorias = frango + sucoMelao + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1  && bebida == 4){
                totalCalorias = frango + refrigeranteDiet + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 2 && bebida == 1){
                totalCalorias = frango + cha + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 2){
                totalCalorias = frango + sucoLaranja + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 3){
                totalCalorias = frango + sucoMelao + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 4){
                totalCalorias = frango + refrigeranteDiet + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 3 && bebida == 1){
                totalCalorias = frango + cha + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 2){
                totalCalorias = frango + sucoLaranja + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 3){
                totalCalorias = frango + sucoMelao + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 4){
                totalCalorias = frango + refrigeranteDiet + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa3+"  Calorias = "+
                        mouseDiet+"\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 4 && bebida == 1){
                totalCalorias = frango + cha + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 2){
                totalCalorias = frango + sucoLaranja + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 3){
                totalCalorias = frango + sucoMelao + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 4){
                totalCalorias = frango + refrigeranteDiet + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato3+"  Calorias = "+frango+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa4+"  Calorias = "
                        +mouseChocolate+"\nTotal Calorias = "+totalCalorias);
            }
        }
        else if(prato == 4){
            if(sobremesa == 1 && bebida == 1){
                totalCalorias = carne + cha + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 2){
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                totalCalorias = carne + sucoLaranja + abacaxi;
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1 && bebida == 3){
                totalCalorias = carne + sucoMelao + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 1  && bebida == 4){
                totalCalorias = carne + refrigeranteDiet + abacaxi;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa1+"  Calorias = "+abacaxi+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 2 && bebida == 1){
                totalCalorias = carne + cha + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 2){
                totalCalorias = carne + sucoLaranja + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 3){
                totalCalorias = carne + sucoMelao + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 2 && bebida == 4){
                totalCalorias = carne + refrigeranteDiet + sorveteDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa2+"  Calorias = "+sorveteDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 3 && bebida == 1){
                totalCalorias = carne + cha + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 2){
                totalCalorias = carne + sucoLaranja + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 3){
                totalCalorias = carne + sucoMelao + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa3+"  Calorias = "+mouseDiet+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 3 && bebida == 4){
                totalCalorias = carne + refrigeranteDiet + mouseDiet;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa3+"  Calorias = "+
                        mouseDiet+"\nTotal Calorias = "+totalCalorias);
            }
            
            else if(sobremesa == 4 && bebida == 1){
                totalCalorias = carne + cha + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida1+"  Calorias = "+cha+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 2){
                totalCalorias = carne + sucoLaranja + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida2+"  Calorias = "+sucoLaranja+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 3){
                totalCalorias = carne + sucoMelao + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida3+"  Calorias = "+sucoMelao+"\nSobremesa = "+sobremesa4+"  Calorias = "+mouseChocolate+
                        "\nTotal Calorias = "+totalCalorias);
            }
            else if(sobremesa == 4 && bebida == 4){
                totalCalorias = carne + refrigeranteDiet + mouseChocolate;
                System.out.println("\n\n========== TOTAL CALORIAS ==========");
                System.out.println("Prato = "+prato4+"  Calorias = "+carne+
                        "\nBebida = "+bebida4+"  Calorias = "+refrigeranteDiet+"\nSobremesa = "+sobremesa4+"  Calorias = "
                        +mouseChocolate+"\nTotal Calorias = "+totalCalorias);
            }
        }
    }
    
}
