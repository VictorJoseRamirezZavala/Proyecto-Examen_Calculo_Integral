/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Fourier
*Clase para aproximacion de funciones de series de fourier (Onda Triangular)
*27 de mayo de 2026
*/

package tema3.aplicaciones;

public class SerieFourierTriangular extends SerieFourier {
    private double tp = 1;  // Periodo para la triangular
    private double ta0 = 0; // a0 es 0 por ser función impar f(t)=t
    private double[] tan = {0,0,0,0,0,0,0,0,0,0};
    private double[] tbn = new double[10];
    
    public SerieFourierTriangular(){
        super();
        p = tp;
        a0 = ta0;
        an = tan;
        
        // Calculamos los coeficientes bn para f(t) = t
        for (int n = 1; n <= N_DATOS; n++) {
            tbn[n-1] = (2.0 / (n * Math.PI)) * Math.pow(-1, n + 1);
        }
        bn = tbn;
    }
}