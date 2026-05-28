/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Taylor
*Clase serie Taylor Exponencial
*27 de mayo de 2026
*/
package tema3.aplicaciones;

public class SerieExponencial extends SerieTaylor {

    // Constructor que pasa el parámetro a la clase padre
    public SerieExponencial(int nTerminos) {
        super(nTerminos);
    }

    // Implementación de la fórmula: (x^i) / i!
    @Override
    protected double calcularTermino(double x, int i) {
        System.out.println("Calculando desde la clase hija SerieExponencial...");
        return Math.pow(x, i) / factorial(i);
    }

    // Método auxiliar para calcular el factorial de i
    private double factorial(int n) {
        double fact = 1.0;
        for (int j = 1; j <= n; j++) {
            fact *= j;
        }
        return fact;
    }
}