package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PoissonController implements Initializable {

    @FXML //  fx:id="btn_poisson"
    private Button btn_poisson; // Value injected by FXMLLoader

    @FXML //  fx:id="bc_poisson"
    private BarChart bc_poisson; // Value injected by FXMLLoader

    @FXML //  fx:id="txt_khi_poisson"
    private TextField txt_khi_poisson; // Value injected by FXMLLoader

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO intégrer les éléments dans le ChoiceBox

    }

    /**
     * Nettoyage du BarChart et des éléments indispensable à la simulation
     */
    private void clearChart() {
        this.bc_poisson.getData().clear();
        this.txt_khi_poisson.clear();
    }

    @FXML
    private void simulationPoissonAction(ActionEvent event) {
//        this.clearChart();

        this.txt_khi_poisson.setText("Test loi poisson in progress");
        // TODO Simuler la loi
    }
}
