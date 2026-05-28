/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Taylor
*Clase serie Taylor Logaritmica
*27 de mayo de 2026
*/
package tema3.aplicaciones;

public class SerieLogaritmica extends SerieTaylor {

    // Constructor que pasa el parámetro a la clase padre
    public SerieLogaritmica(int nTerminos) {
        super(nTerminos);
    }

    // Implementación de la fórmula con signos alternados: (-1)^(n-1) * (x^n) / n
    @Override
    protected double calcularTermino(double x, int i) {
        // Mapeamos el índice del ciclo (0, 1, 2...) al término matemático (1, 2, 3...)
        int termino = i + 1; 
        
        // Si el término es par el signo es negativo, si es impar es positivo
        double signo = (termino % 2 == 0) ? -1.0 : 1.0;
        
        return signo * Math.pow(x, termino) / termino;
    }
}