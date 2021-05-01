/*Exercício 42
 Criar um algoritmo em JAVA que leia o número correspondente ao mês atual e
os dígitos (somente os quatro números) de uma placa de veículo, e através do número
finalizador da placa (algarismo da casa das unidades) determine se o IPVA do veículo
vence no mês corrente.

Final 1 – mês (1) – Janeiro 
Final 2 – mês (2) – Fevereiro 
Final 3 – mês (3) – Março 
Final 4 – mês (4) – Abril 
Final 5 – mês (5) – Maio 
Final 6 – mês (6) – Junho
Final 7 – mês (7) – Julho
Final 8 – mês (8) – Agosto
Final 9 – mês (9) – Setembro
Final 0 – mês (10) – Outubro
 */
package exercicio42condicionais;

import java.util.Scanner;

public class Exercicio42Condicionais {

    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        int milhar, centena, dezena, unidade,mesAtual,atraso;
        String mes1 = "Janeiro";
        String mes2 = "Fevereiro";
        String mes3 = "Março";
        String mes4 = "Abril";
        String mes5 = "Maio";
        String mes6 = "Junho";
        String mes7 = "Julho";
        String mes8 = "Agosto";
        String mes9 = "Setembro";
        String mes10 = "outubro";
        
        
        System.out.println("Digite o primeiro número da placa do automóvel: ");
        milhar = Integer.parseInt(SC.nextLine());
        while(milhar <0 || milhar > 9){
            System.out.println("Valor incorreto! Digite novamente: ");
            milhar = Integer.parseInt(SC.nextLine());
        }
        
        System.out.println("Digite o segundo número da placa do automóvel: ");
        centena = Integer.parseInt(SC.nextLine());
        while(centena <0 || centena > 9){
            System.out.println("Valor incorreto! Digite novamente: ");
            centena = Integer.parseInt(SC.nextLine());
        }
        
        System.out.println("Digite o terceiro número da placa do automóvel: ");
        dezena = Integer.parseInt(SC.nextLine());
        while(dezena <0 || dezena > 9){
            System.out.println("Valor incorreto! Digite novamente: ");
            dezena = Integer.parseInt(SC.nextLine());
        }
        
        System.out.println("Digite o primeiro número da placa do automóvel: ");
        unidade = Integer.parseInt(SC.nextLine());
        while(unidade <0 || unidade > 9){
            System.out.println("Valor incorreto! Digite novamente: ");
            unidade = Integer.parseInt(SC.nextLine());
        }
        
        System.out.println("Digite um valor de 1 até 12 para selecionar o mês atual: ");
        mesAtual = Integer.parseInt(SC.nextLine());
        while(mesAtual <0 || mesAtual > 12){
            System.out.println("Mês inválido! Digite novamente: ");
            mesAtual = Integer.parseInt(SC.nextLine());
        }
        
        if(unidade == 1){
            if(mesAtual == 1){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+" vence este mês "+
                        mes1);
            }
            else{
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+" venceu no mês "+
                        mes1+" e possui "+atraso+" meses atrasados");
            }
              
        }
        
        else if(unidade == 2){
            if(mesAtual == 2){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes2);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes2+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
            }
        
        else if(unidade == 3){
            if(mesAtual == 3){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes3);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes3+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
         else if(unidade == 4){
            if(mesAtual == 4){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes4);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes4+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
         else if(unidade == 5){
            if(mesAtual == 5){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes5);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes5+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
        else if(unidade == 6){
            if(mesAtual == 6){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes6);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes6+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
        else if(unidade == 7){
            if(mesAtual == 7){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes7);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes7+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
         else if(unidade == 8){
            if(mesAtual == 8){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes8);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes8+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
        else if(unidade == 9){
            if(mesAtual == 9){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes9);
            }
            else if(mesAtual > unidade){
                atraso = mesAtual - unidade;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes9+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
       else if(unidade == 0){
            if(mesAtual == 10){
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vence este mês "+mes10);
            }
            else if(mesAtual > 10){
                atraso = mesAtual - 10;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " venceu no mês "+mes10+" e possui "+atraso+" meses atrasados");
            }
            
            else if(mesAtual < unidade){
                atraso = unidade - mesAtual;
                System.out.println("========== MÊS DE PAGAMENTO IPVA ==========");
                    System.out.println("O IPVA do automável equivalente a placa "+milhar+centena+dezena+unidade+
                        " vencerá daqui a "+atraso+" meses");
                }
        }
        
    }
}
