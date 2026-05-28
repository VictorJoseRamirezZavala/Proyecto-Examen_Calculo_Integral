/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Taylor
*Clase serie Taylor Test
*27 de mayo de 2026
*/
package tema3.aplicaciones;

public class SerieTaylorTest {
    public static void main(String[] args) {
        
        // Definimos una cantidad de 10 términos para la aproximación
        int terminos = 10;
        double xPrueba = 0.5;

        // 1. Probar Serie Exponencial e^x
        SerieTaylor exponencial = new SerieExponencial(terminos);
        double resExp = exponencial.evaluar(xPrueba);
        double realExp = Math.exp(xPrueba);

        System.out.println("\n[Funcion Exponencial e^x para x = " + xPrueba + "]");
        System.out.println("Aproximacion por Serie: " + resExp);
        System.out.println("Valor Real (Math.exp):   " + realExp);
        System.out.println("Diferencia (Error):      " + Math.abs(realExp - resExp));

        // 2. Probar Serie Logarítmica ln(1+x)
        SerieTaylor logaritmica = new SerieLogaritmica(terminos);
        double resLn = logaritmica.evaluar(xPrueba);
        // Comparamos con Math.log(1 + x) debido al ajuste de centrado
        double realLn = Math.log(1.0 + xPrueba); 

        System.out.println("\n[Funcion Logaritmica ln(1+x) para x = " + xPrueba + "]");
        System.out.println("Aproximacion por Serie: " + resLn);
        System.out.println("Valor Real (Math.log):   " + realLn);
        System.out.println("Diferencia (Error):      " + Math.abs(realLn - resLn));
    }
}