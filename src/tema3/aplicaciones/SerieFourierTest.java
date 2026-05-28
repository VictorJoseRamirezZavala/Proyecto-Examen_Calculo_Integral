/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Serie de Fourier
*Clase test para aproximacion de funciones de series de fourier
*22 de mayo de 2026
*/

package tema3.aplicaciones;

public class SerieFourierTest {
        public static void main(String args []){
            //TODO code application logic here
            
            //TEST
            System.out.println("Test con Onda Cuadrada");
            SerieFourierCuadrada sfc = new SerieFourierCuadrada();
            System.out.println("s(-0.5) = " + sfc.evaluar(-0.5));
            System.out.println("s( 0.5) = " + sfc.evaluar( 0.5));
            System.out.println("s( 1.5) = " + sfc.evaluar( 1.5));
            System.out.println("s( 2.5) = " + sfc.evaluar( 2.5));
            
            
            System.out.println("Test con interfaces");
            SerieFourierCuadradaSr sfcsr = new SerieFourierCuadradaSr();
            SerieFourierInterface sfcsrI = new SerieFourierCuadradaSr();
            
            System.out.println("s(-0.5) = " + sfcsr.evaluar(-0.5));
            System.out.println("s( 0.5) = " + sfcsr.evaluar( 0.5));
            System.out.println("s( 1.5) = " + sfcsr.evaluar( 1.5));
            System.out.println("s( 2.5) = " + sfcsr.evaluar( 2.5));
            
            System.out.println("Test con Onda Triangular");
            SerieFourierTriangular sft = new SerieFourierTriangular();
            System.out.println("s(-0.5) = " + sft.evaluar(-0.5));
            System.out.println("s( 0.5) = " + sft.evaluar( 0.5));
            
    }
}
