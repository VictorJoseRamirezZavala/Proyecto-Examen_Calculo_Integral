/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Fourier
*Clase abstracta para aproximacion de funciones de series de fourier
*22 de mayo de 2026
*/

package tema3.aplicaciones;

public class SerieFourierCuadrada extends SerieFourier {
    private double cp = 1;
    private double ca0 = 1;
    private double[] can = {0,0,0,0,0,0,0,0,0,0};
    private double[] cbn = {2.0/Math.PI, 0, 2.0/(3*Math.PI), 0, 2.0/(5*Math.PI), 0,
        2.0/(7*Math.PI), 0, 2.0/(9*Math.PI), 0};
    
    public SerieFourierCuadrada(){
        super();
        p = cp;
        a0 = ca0;
        an = can;
        bn = cbn;
    }
    
}
