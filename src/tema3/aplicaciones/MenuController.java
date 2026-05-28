/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Java fx
*Clase Control del Menu
*27 de mayo de 2026
*/
package tema3.aplicaciones;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;

public class MenuController {
    private BorderPane vistaPrincipal;
    private StackPane panelContenido; // Contenedor dinámico central

    public MenuController() {
        vistaPrincipal = new BorderPane();
        panelContenido = new StackPane();
        
        // Mensaje inicial de bienvenida
        Label txtInicio = new Label("Bienvenido al Sistema\nSelecciona una opcion en el menu lateral.");
        txtInicio.setStyle("-fx-font-size: 18px; -fx-text-alignment: center;");
        panelContenido.getChildren().add(txtInicio);
        
        // Creamos el menú lateral (VBox) simulando el diseño de Figma
        VBox menuLateral = new VBox(15);
        menuLateral.setPadding(new Insets(20));
        menuLateral.setStyle("-fx-background-color: #2c3e50;"); // Color oscuro profesional
        
        // Botones que representan los accesos con iconos
        Button btnFourier = new Button("[~] Serie Fourier");
        Button btnTaylor = new Button("[x] Series Taylor");
        
        // Estilos básicos para los botones
        btnFourier.setStyle("-fx-background-color: #34495e; -fx-text-fill: white; -fx-pref-width: 150px;");
        btnTaylor.setStyle("-fx-background-color: #34495e; -fx-text-fill: white; -fx-pref-width: 150px;");
        
        // Eventos para cambiar de vista (Polimorfismo visual)
        btnFourier.setOnAction(e -> abrirVistaFourier());
        btnTaylor.setOnAction(e -> abrirVistaTaylor());
        
        menuLateral.getChildren().addAll(btnFourier, btnTaylor);
        
        // Ensamblamos las partes en el layout principal
        vistaPrincipal.setLeft(menuLateral);
        vistaPrincipal.setCenter(panelContenido);
    }

    private void abrirVistaFourier() {
        FourierController fourierCont = new FourierController();
        panelContenido.getChildren().clear(); // Limpia la ventana anterior
        panelContenido.getChildren().add(fourierCont.getVista()); // Inserta la nueva
    }

    private void abrirVistaTaylor() {
        TaylorController taylorCont = new TaylorController();
        panelContenido.getChildren().clear();
        panelContenido.getChildren().add(taylorCont.getVista());
    }

    public BorderPane getVistaPrincipal() {
        return vistaPrincipal;
    }
}