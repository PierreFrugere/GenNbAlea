package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class WeibullController implements Initializable {

    @FXML //  fx:id="btn_weibull"
    private Button btn_weibull; // Value injected by FXMLLoader

    @FXML //  fx:id="bc_weibull"
    private BarChart bc_weibull; // Value injected by FXMLLoader

    @FXML //  fx:id="txt_khi_weibull"
    private TextField txt_khi_weibull; // Value injected by FXMLLoader

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO intégrer les éléments dans le ChoiceBox

    }

    /**
     * Nettoyage du BarChart et des éléments indispensable à la simulation
     */
    private void clearChart() {
        this.bc_weibull.getData().clear();
        this.txt_khi_weibull.clear();
    }

    @FXML
    private void simulationWeibullAction(ActionEvent event) {
//        this.clearChart();

        this.txt_khi_weibull.setText("Test weibull in progress");
        // TODO Simuler la loi
    }
}
