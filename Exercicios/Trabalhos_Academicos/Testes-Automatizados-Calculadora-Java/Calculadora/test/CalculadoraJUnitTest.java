

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Ana
 */
public class CalculadoraJUnitTest {
    
    @Before
    public void numero1() {
        boolean retorno;
        Calculadora v1 = new Calculadora();
        
        if(0.0 == v1.numero1){
            retorno = true;
        }
    }
    
    @Before
    public void numero2() {
        boolean retorno;
        Calculadora v2 = new Calculadora();
        
        if(0.0 == v2.numero2){
            retorno = true;
        }
    }
    
    @Before
    public void valor() {
        boolean retorno;
        Calculadora v3 = new Calculadora();
        
        if(0.0 == v3.valor){
            retorno = true;
        }
    }
    
    @Before
    public void resultado1() {
        boolean retorno;
        Calculadora r1 = new Calculadora();
        
        if(0.0 == r1.resultadoAbs){
            retorno = true;
        }
    }
    
    @Before
    public void resultado2() {
        boolean retorno;
        Calculadora r2 = new Calculadora();
        
        if(0.0 == r2.resultadoCosseno){
            retorno = true;
        }
    }
    
    @Before
    public void resultado3() {
        boolean retorno;
        Calculadora r3 = new Calculadora();
        
        if(0.0 == r3.resultadoCossenoTrigonometrico){
            retorno = true;
        }
    }
    
    @Before
    public void resultado4() {
        boolean retorno;
        Calculadora r4 = new Calculadora();
        
        if(0.0 == r4.resultadoDivisao){
            retorno = true;
        }
    }
    
    @Before
    public void resultado5() {
        boolean retorno;
        Calculadora r5 = new Calculadora();
        
        if(0.0 == r5.resultadoLogaritmo){
            retorno = true;
        }
    }
    
    @Before
    public void resultado6() {
        boolean retorno;
        Calculadora r6 = new Calculadora();
        
        if(0.0 == r6.resultadoMaior){
            retorno = true;
        }
    }
    
    @Before
    public void resultado7() {
        boolean retorno;
        Calculadora r7 = new Calculadora();
        
        if(0.0 == r7.resultadoMenor){
            retorno = true;
        }
    }
    
    @Before
    public void resultado8() {
        boolean retorno;
        Calculadora r8 = new Calculadora();
        
        if(0.0 == r8.resultadoMultiplicar){
            retorno = true;
        }
    }
    
    @Before
    public void resultado9() {
        boolean retorno;
        Calculadora r9 = new Calculadora();
        
        if(0.0 == r9.resultadoPotencia){
            retorno = true;
        }
    }
    
    @Before
    public void resultado10() {
        boolean retorno;
        Calculadora r10 = new Calculadora();
        
        if(0.0 == r10.resultadoQ){
            retorno = true;
        }
    }
    
    @Before
    public void resultado11() {
        boolean retorno;
        Calculadora r11 = new Calculadora();
        
        if(0.0 == r11.resultadoSeno){
            retorno = true;
        }
    }
    
    @Before
    public void resultado12() {
        boolean retorno;
        Calculadora r12 = new Calculadora();
        
        if(0.0 == r12.resultadoSoma){
            retorno = true;
        }
    }
    
    @Before
    public void resultado13() {
        boolean retorno;
        Calculadora r13 = new Calculadora();
        
        if(0.0 == r13.resultadoSubtrair){
            retorno = true;
        }
    }

    @Test
    public void Somar (){
        boolean retorno;
        Calculadora c1 = new Calculadora();
        c1.numero1 = 12;
        c1.numero2 = 8;
        
        if(20 == c1.getSomar()){
            retorno = true;
        }
    }
    
    @After
    public void resultadoSoma() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoSoma){
            retorno = true;
        }
    }
    
    @Test
    public void Subtrair(){
        boolean retorno;
        Calculadora c2 = new Calculadora();
        c2.numero1 = 4;
        c2.numero2 = 34;
        
        if(-30 == c2.getSubtrair()){
            retorno = true;
        }
    }
    
    @After
    public void resultadoSubtrair() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoSubtrair){
            retorno = true;
        }
    }
    
    @Test
    public void Multiplicar(){
        boolean retorno;
        Calculadora c3 = new Calculadora();
        c3.numero1 = 11;
        c3.numero2 = 22;
        
        if(242 == c3.getMultiplicar()){
            retorno = true;
        }
    }
    
    @After
    public void resultadoMultiplicar() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoMultiplicar){
            retorno = true;
        }
    }
    
    @Test
    public void Dividir(){
        boolean retorno;
        Calculadora c4 = new Calculadora();
        c4.numero1 = 144;
        c4.numero2 = 4;
        
        if(36 == c4.getDividir()){
            retorno = true;
        }
        
        Calculadora c5 = new Calculadora();
        c5.numero1 = 0;
        c5.numero2 = 0;
        
        if(0 != c5.getDividir()){
            retorno = false;
        }
    }
    
    @After
    public void resultadoDividir() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoDivisao){
            retorno = true;
        }
    }
    
    
    @Test
    public void raizQuadrada(){
        boolean retorno;
        Calculadora c6 = new Calculadora();
        c6.valor = 144;
        
        if(12 == c6.getQuadrada()){
            retorno = true;
        }
    } 
    
    @After
    public void resultadoRaizQuadrada() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoQ){
            retorno = true;
        }
    }
    
    @Test
    public void valorAbsoluto(){
        boolean retorno;
        Calculadora c7 = new Calculadora();
        c7.valor = -36;
        
        if(36 == c7.getAbsoluto()){
            retorno = true;
        }
        
    }
    
    @After
    public void resultadoValorAbsoluto() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoAbs){
            retorno = true;
        }
    }
    @Test
    public void Cosseno(){
        boolean retorno;
        Calculadora c8 = new Calculadora();
        c8.valor = 45;
        
        if(0.525321989 == c8.getCosseno()){
            retorno = true;
        }
    }
    
    @After
    public void resultadoCosseno() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoCosseno){
            retorno = true;
        }
    }
    
    @Test
    public void Seno(){
        boolean retorno;
        Calculadora c9 = new Calculadora();
        c9.valor = 30;
        
        if(-0.988031624 == c9.getSeno()){
            retorno = true;
        }
        
    }
    
    @After
    public void resultadoSeno() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoSeno){
            retorno = true;
        }
    }
    
    @Test
    public void MaiorValor(){
        boolean retorno;
        Calculadora c10 = new Calculadora();
        c10.numero1 = 150;
        c10.numero2 = -150;
        
        if(150 == c10.getMaiorValor()){
            retorno = true;
        }
    }
    
    @After
    public void resultadoMaiorValor() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoMaior){
            retorno = true;
        }
    }
    
    @Test
    public void MenorValor(){
        boolean retorno;
        Calculadora c11 = new Calculadora();
        c11.numero1 = -2;
        c11.numero2 = 2;
        
        if(-2 == c11.getMenorValor()){
            retorno = true;
        }
    }
    
    @After
    public void resultadoMenor() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoMenor){
            retorno = true;
        }
    }
    
    @Test
    public void Potencia(){
        boolean retorno;
        Calculadora c12 = new Calculadora();
        c12.numero1 = 2;
        c12.numero2 = 3;
        
        if(8 == c12.getPotencia()){
            retorno = true;
        }
        
    }
    
    @After
    public void resultadoPotencia() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoPotencia){
            retorno = true;
        }
    }
    @Test
    public void Logaritmo(){
        boolean retorno;
        Calculadora c13 = new Calculadora();
        c13.valor = 2;
        
        if(0.30102999566 == c13.getLogaritmo()){
            retorno = true;
        }
    }
    
    
    @After
    public void resultadoLogaritmo() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoLogaritmo){
            retorno = true;
        }
    }
    
    @Test
    public void CossenoTrigonometrico(){
        boolean retorno;
        Calculadora c14 = new Calculadora();
        c14.valor = 60;
        
        if(-0.9524129804151563 == c14.getCossenoTrigonometrico()){
            retorno = true;
        }
        
    }
    
    @After
    public void resultadoCossenoTrigonometrico() {
        boolean retorno;
        Calculadora r = new Calculadora();
        
        if(0.0 == r.resultadoCossenoTrigonometrico){
            retorno = true;
        }
    }

}
