package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ExponentielleController implements Initializable {

    @FXML //  fx:id="btn_exponentielle"
    private Button btn_exponentielle; // Value injected by FXMLLoader

    @FXML //  fx:id="bc_exponentielle"
    private BarChart bc_exponentielle; // Value injected by FXMLLoader

    @FXML //  fx:id="txt_khi_exponentielle"
    private TextField txt_khi_exponentielle; // Value injected by FXMLLoader

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO intégrer les éléments dans le ChoiceBox

    }

    /**
     * Nettoyage du BarChart et des éléments indispensable à la simulation
     */
    private void clearChart() {
        this.bc_exponentielle.getData().clear();
        this.txt_khi_exponentielle.clear();
    }

    @FXML
    private void simulationExponentielleAction(ActionEvent event) {
//        this.clearChart();

        this.txt_khi_exponentielle.setText("Test exponentielle in progress");
        // TODO Simuler la loi
    }
}
