import static java.lang.Double.max;
import static java.lang.Double.min;
import static java.lang.Math.abs;
import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Calculadora {
    
    double numero1, numero2, valor, resultadoSoma, resultadoSubtrair, resultadoMultiplicar, resultadoDivisao;
    double resultadoQ, resultadoAbs, resultadoCosseno, resultadoSeno, resultadoMaior, resultadoMenor, resultadoPotencia;
    double resultadoLogaritmo, resultadoCossenoTrigonometrico;
    
    void somar(){
        resultadoSoma = numero1 + numero2;
    }
    
    double getSomar(){
        return resultadoSoma;
    }
    
    
    void subtrair(){
        resultadoSubtrair = numero1 - numero2;
    }
    
    double getSubtrair(){
        return resultadoSubtrair;
    }
    
    void multiplicar(){
        resultadoMultiplicar = numero1 * numero2;
    }
    
    double getMultiplicar(){
        return resultadoMultiplicar;
    }
      
    void dividir(){
        while(numero1 == 0){
            Scanner SC = new Scanner (System.in);
            System.out.println("Não existe divisão por zero!");
            System.out.println("Digite um novo valor: ");
            numero1 = (Double.parseDouble(SC.nextLine()));
        }
        while(numero2 == 0){
            Scanner SC = new Scanner (System.in);
            System.out.println("Não existe divisão por zero!");
            System.out.println("Digite um novo valor: ");
            numero1 = (Double.parseDouble(SC.nextLine()));
        }
        resultadoDivisao = numero1 / numero2;
    }
    
    double getDividir(){
        return resultadoDivisao;
    }
    
    void raizQuadrad(){
       resultadoQ = sqrt(valor);
    }
    
    double getQuadrada(){
        return resultadoQ;
    }
    
    void valorAbsoluto(){
        resultadoAbs = abs(valor);
    }
    
    double getAbsoluto(){
        return resultadoAbs;
    }
    
    void cosseno(){
        resultadoCosseno = acos(valor);
    }
    
    double getCosseno(){
        return resultadoCosseno;
    }
    
    void seno(){
        resultadoSeno = sin(valor);
    }
    
    double getSeno(){
        return resultadoSeno;
    }
    
    void cossenoTrigonometrico(){
        resultadoCossenoTrigonometrico = cos(valor);
    }
    
    double getCossenoTrigonometrico(){
        return resultadoCossenoTrigonometrico;
    }
   
    
    void maiorValor(){
        resultadoMaior = max (numero1, numero2);
    }
    
    
    double getMaiorValor(){
        return resultadoMaior;
    }
    
    void minimoValor(){
        resultadoMenor = min (numero1, numero2);
    }
    
    double getMenorValor(){
        return resultadoMenor;
    }
    
    void potencia(){
        resultadoPotencia = pow (numero1, numero2);
    }
    
    double getPotencia(){
        return resultadoPotencia;
    }
    
     void logaritmo(){
        resultadoLogaritmo = log(valor);
    }
     
    double getLogaritmo(){
        return resultadoLogaritmo;
    }
    
    
}
