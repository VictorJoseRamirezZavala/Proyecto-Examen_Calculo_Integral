/*
* 2026 TecNM-ITESS-TICS
* Periodo Enero Junio 2026
* Asignatura: Cálculo Integral
* Grupo: TI-201
* Docente: Francisco Javier Montecillo Puente
* Descripción: 1.1 Medicion aproximada de figuras amorfas
*              Distancia de la curva de una función
*              Paso 1: entender 
*                      calcular la longitud de la curva de una funcion f(X)
*                      la funcion es FIJA, dado un rango [a, b]
*                      
*              Paso 2: diseño CLASE/algoritmo/GUI
*
*
*               --------------------------------------
*              |        FunctionDistance
*               --------------------------------------
*              | - xStart: double   ==> eso es "a" del rango [a, b]
*              | - xEnd: double 
*              | - nPuntos: int
*               --------------------------------------
*              | + FunctionDistance( xStart: double, xEnd: double, nPuntos: int)
*              | + compute(): double
*               --------------------------------------
*
*              Paso 3: implementacion / coding
* Programador: VJRZ
* Fecha: 05 de febrero 2026
 */
package tema1teofund;

// imports
// nombre de la clase
public class FunctionDistance {

// atributos
    private double xStart;
    private double xEnd;
    private int nPoints;

// métodos
    public FunctionDistance(double xStart, double xEnd, int nPoints) {
        this.xStart = xStart;
        this.xEnd = xEnd;
        this.nPoints = nPoints;
    }

    public double compute() {
        //Calcular delta
        double deltaX = (xEnd - xStart) / nPoints;

        //Calcular n puntos de la funcion
        double x[] = new double[nPoints];
        double y[] = new double[nPoints];

        for (int i = 0; i < nPoints; i++) {
            x[i] = i * deltaX;
            y[i] = Math.sin(x[i]);
        }


        
        //Sumar N - 1 longitudes
        
        
        //Regresar la suma
        return 0.0;
    }
}
