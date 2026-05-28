/*
 * TecnM ITESS-TICS
 * Enero-Junio 2026
 * Calculo Integral
 * Docente: Francisco Javier Montecillo Puentada
 * Tema 3. Aplicaciones, Serie de Fourier
 * Clase abstracta para aproximacion de funciones de series de fourier
 * 21 de mayo de 2026
 */

package tema3.aplicaciones;

public abstract class SerieFourier {
    protected final int N_DATOS = 10; // Número de armónicos a calcular
    protected double p;               // Semiperiodo
    protected double a0;              // Coeficiente a0
    protected double[] an;            // Coeficientes coseno
    protected double[] bn;            // Coeficientes seno
    
    // Constructor vacío
    public SerieFourier() {
    }

    // Constructor parametrizado por si se ocupa
    public SerieFourier(double p, double a0, double[] an, double[] bn) {
        this.p = p;
        this.a0 = a0;
        this.an = an;
        this.bn = bn;
    }
    
    // Método común para evaluar la serie en un tiempo 't'
    public double evaluar(double t) {
        double st = a0 / 2.0;
        for (int n = 1; n <= N_DATOS; n++) {
            st += (an[n-1] * Math.cos(n * Math.PI * t / p) + bn[n-1] * Math.sin(n * Math.PI * t / p));
        }
        return st;
    }
}