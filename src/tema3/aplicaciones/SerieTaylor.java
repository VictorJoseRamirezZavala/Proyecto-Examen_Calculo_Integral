/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Taylor
*Clase serie Taylor
*27 de mayo de 2026
*/
package tema3.aplicaciones;

public abstract class SerieTaylor {
    // Atributo protegido para que las clases hijas puedan acceder
    protected int nTerminos;

    // Constructor
    public SerieTaylor(int nTerminos) {
        this.nTerminos = nTerminos;
    }

    // Método común: contiene la lógica del ciclo sumador (Polimorfismo)
    public double evaluar(double x) {
        double suma = 0.0;
        for (int i = 0; i < nTerminos; i++) {
            suma += calcularTermino(x, i);
        }
        return suma;
    }

    // Método abstracto: cada clase hija lo implementará con su propia fórmula
    protected abstract double calcularTermino(double x, int i);
}