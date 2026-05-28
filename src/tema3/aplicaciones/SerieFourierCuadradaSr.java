/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Fourier
*Clase Sr para aproximacion de funciones de series de fourier
*21 de mayo de 2026
*/

package tema3.aplicaciones;

public class SerieFourierCuadradaSr implements SerieFourierInterface {
    protected double p;     //semiperiodo
    protected double a0;    // coeficientes de la serie de fourier
    protected double[] an = {0,0,0,0,0,0,0,0,0,0};
    protected double[] bn = {2.0/Math.PI, 0, 2.0/(3*Math.PI), 0, 2.0/(5*Math.PI), 0,
        2.0/(7*Math.PI), 0, 2.0/(9*Math.PI), 0};
    
    public SerieFourierCuadradaSr() {
        this.p = 1.0;
        this.a0 = 1.0;
    }

    public double evaluar(double t){
        double st = a0/2;
        for (int n = 1; n <= N_DATOS; n++) {
            st += ( an[n-1]*Math.cos(n*Math.PI*t/p) + bn[n-1]*Math.sin(n*Math.PI*t/p) );
        }
        return st;
    }
}
