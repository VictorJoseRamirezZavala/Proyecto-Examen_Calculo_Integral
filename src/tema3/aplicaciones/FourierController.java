/*
*TecnM ITESS-TICS
*Enero-Junio 2026
*Calculo Integral
*Docente: Francisco Javier Montecillo Puentada
*Tema 3. Aplicaciones, Java fx
*Clase Control de serie Fourier
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

import tema3.aplicaciones.SerieFourier; 

public class FourierController {
    private VBox vista;
    private TextField campoArmonicos;
    private LineChart<Number, Number> graficaFourier;
    private XYChart.Series<Number, Number> serieOnda;

    public FourierController() {
        vista = new VBox(15);
        vista.setPadding(new Insets(20));
        
        Label titulo = new Label("Modulo Integrado: Serie de Fourier (Onda)");
        titulo.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        
        HBox panelEntradas = new HBox(10);
        campoArmonicos = new TextField("4");
        Button btnCalcular = new Button("Calcular y Graficar");
        
        panelEntradas.getChildren().addAll(new Label("Armonicos (N):"), campoArmonicos, btnCalcular);
        
        NumberAxis xAxis = new NumberAxis(-4, 4, 1);
        NumberAxis yAxis = new NumberAxis(-2, 2, 0.5);
        graficaFourier = new LineChart<>(xAxis, yAxis);
        graficaFourier.setCreateSymbols(false);
        
        serieOnda = new XYChart.Series<>();
        serieOnda.setName("Señal Sintetizada");
        graficaFourier.getData().add(serieOnda);
        
        btnCalcular.setOnAction(e -> {
            serieOnda.getData().clear();
            animarGrafica();
        });
        
        vista.getChildren().addAll(titulo, panelEntradas, graficaFourier);
    }

    private void animarGrafica() {
        System.out.println("Calculando desde la clase hija SerieFourier...");
        int armonicos = Integer.parseInt(campoArmonicos.getText());
        Timeline timeline = new Timeline();
        int puntosTotales = 100;
        double paso = 0.08;

        for (int i = 0; i <= puntosTotales; i++) {
            final double t = -4.0 + (i * paso);
            
            double suma = 0.0;
            for (int n = 1; n <= armonicos; n++) {
                int k = 2 * n - 1; 
                suma += Math.sin(k * t) / k;
            }
            final double amplitud = (4.0 / Math.PI) * suma;
            
            KeyFrame frame = new KeyFrame(
                Duration.millis(i * 15),
                e -> serieOnda.getData().add(new XYChart.Data<>(t, amplitud))
            );
            timeline.getKeyFrames().add(frame);
        }
        timeline.play();
    }

    public VBox getVista() {
        return vista;
    }
}