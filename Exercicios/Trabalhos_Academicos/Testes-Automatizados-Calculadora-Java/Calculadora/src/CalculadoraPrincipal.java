
public class CalculadoraPrincipal {
    
    public static void main (String[] args){
        Calculadora c1 = new Calculadora();
        Calculadora c2 = new Calculadora();
        Calculadora c3 = new Calculadora();
        Calculadora c4 = new Calculadora();
        Calculadora c5 = new Calculadora();
        Calculadora c6 = new Calculadora();
        Calculadora c7 = new Calculadora();
        Calculadora c8 = new Calculadora();
        Calculadora c9 = new Calculadora();
        Calculadora c10 = new Calculadora();
        Calculadora c11 = new Calculadora();
        Calculadora c12 = new Calculadora();
        Calculadora c13 = new Calculadora();
        
        c1.numero1 = 2;
        c1.numero2 = 12;
        c1.somar();
        c1.getSomar();
        
        c2.numero1 = 1;
        c2.numero2 = 15;
        c2.subtrair();
        c2.getSubtrair();
        
        c3.numero1 = 3;
        c3.numero2 = 5;
        c3.multiplicar();
        c3.getMultiplicar();
        
        c4.numero1 = 36;
        c4.numero2 = 6;
        c4.dividir();
        c4.getDividir();
        
        c5.valor = 114;
        c5.raizQuadrad();
        c5.getQuadrada();
        
        c6.valor = -34;
        c6.valorAbsoluto();
        c6.getAbsoluto();
        
        c7.valor = 30;
        c7.cosseno();
        c7.getCosseno();
        
        c8.valor = 45;
        c8.seno();
        c8.getSeno();
        
        c9.valor = 60;
        c9.cossenoTrigonometrico();
        System.out.println(c9.getCossenoTrigonometrico());
        
        
        c10.numero1 = 190;
        c10.numero2 = 40;
        c10.maiorValor();
        c10.getMaiorValor();
        
        c11.numero1 = 290;
        c11.numero2 = 12;
        c11.minimoValor();
        c11.getMenorValor();
        
        c12.numero1 = 4;
        c12.numero2 = 4;
        c12.potencia();
        c12.getPotencia();
        
        c13.valor = 2;
        c13.logaritmo();
        c13.getLogaritmo();
    }
    
}
