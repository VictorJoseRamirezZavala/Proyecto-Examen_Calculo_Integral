/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Java fx
*Clase Control de serie Taylor
*27 de mayo de 2026
*/
package tema3.aplicaciones;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

import tema3.aplicaciones.SerieExponencial; 

public class TaylorController {
    private VBox vista;
    private TextField campoTerminos;
    private LineChart<Number, Number> graficaTaylor;
    private XYChart.Series<Number, Number> serieDatos;

    public TaylorController() {
        vista = new VBox(15);
        vista.setPadding(new Insets(20));
        
        Label titulo = new Label("Modulo Integrado: Series de Taylor (e^x)");
        titulo.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        
        HBox panelEntradas = new HBox(10);
        campoTerminos = new TextField("6");
        Button btnCalcular = new Button("Calcular y Graficar");
        
        panelEntradas.getChildren().addAll(new Label("Terminos:"), campoTerminos, btnCalcular);
        
        NumberAxis xAxis = new NumberAxis(-2, 2, 0.5);
        NumberAxis yAxis = new NumberAxis(0, 8, 1);
        graficaTaylor = new LineChart<>(xAxis, yAxis);
        graficaTaylor.setCreateSymbols(false);
        
        serieDatos = new XYChart.Series<>();
        serieDatos.setName("Aproximacion e^x");
        graficaTaylor.getData().add(serieDatos);
        
        btnCalcular.setOnAction(e -> {
            serieDatos.getData().clear();
            animarGrafica();
        });
        
        vista.getChildren().addAll(titulo, panelEntradas, graficaTaylor);
    }

    private void animarGrafica() {
        int terminos = Integer.parseInt(campoTerminos.getText());
        Timeline timeline = new Timeline();
        int puntosTotales = 40;
        double paso = 0.1;

        SerieExponencial calculadoraTaylor = new SerieExponencial(terminos);

        for (int i = 0; i <= puntosTotales; i++) {
            final double currentX = -2.0 + (i * paso);
            
            // Le pedimos a la clase que evalúe el valor
            final double currentY = calculadoraTaylor.evaluar(currentX);
            
            KeyFrame frame = new KeyFrame(
                Duration.millis(i * 20),
                e -> serieDatos.getData().add(new XYChart.Data<>(currentX, currentY))
            );
            timeline.getKeyFrames().add(frame);
        }
        timeline.play();
    }

    public VBox getVista() {
        return vista;
    }
}