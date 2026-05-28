/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Fourier
*Clase interface para aproximacion de funciones de series de fourier
*22 de mayo de 2026
*/

package tema3.aplicaciones;

public interface SerieFourierInterface {
    final int N_DATOS = 10;
    
    double evaluar(double x);
}
