/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Java fx
*Clase AppMain
*27 de mayo de 2026
*/
package tema3.aplicaciones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Instanciamos el controlador encargado de armar la interfaz principal
        MenuController menuController = new MenuController();
        
        // Creamos la escena principal (Ancho: 800, Alto: 600)
        Scene scene = new Scene(menuController.getVistaPrincipal(), 800, 600);
        
        primaryStage.setTitle("Sistema de Metodos Numericos - TICs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}