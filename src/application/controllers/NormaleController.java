package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NormaleController implements Initializable {

    @FXML //  fx:id="btn_normale"
    private Button btn_normale; // Value injected by FXMLLoader

    @FXML //  fx:id="bc_normale"
    private BarChart bc_normale; // Value injected by FXMLLoader

    @FXML //  fx:id="txt_khi_normale"
    private TextField txt_khi_normale; // Value injected by FXMLLoader

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO intégrer les éléments dans le ChoiceBox

    }

    /**
     * Nettoyage du BarChart et des éléments indispensable à la simulation
     */
    private void clearChart() {
        this.bc_normale.getData().clear();
        this.txt_khi_normale.clear();
    }

    @FXML
    private void simulationNormaleAction(ActionEvent event) {
//        this.clearChart();

        this.txt_khi_normale.setText("Test normale in progress");
        // TODO Simuler la loi
    }
}
