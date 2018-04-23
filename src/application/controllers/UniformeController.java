package application.controllers;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UniformeController implements Initializable {

    @FXML //  fx:id="btn_uniforme"
    private Button btn_uniforme; // Value injected by FXMLLoader

    @FXML //  fx:id="bc_uniforme"
    private BarChart bc_uniforme; // Value injected by FXMLLoader

    @FXML //  fx:id="txt_khi_uniforme"
    private TextField txt_khi_uniforme; // Value injected by FXMLLoader

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO intégrer les éléments dans le ChoiceBox

    }

    /**
     * Nettoyage du BarChart et des éléments indispensable à la simulation
     */
    private void clearChart() {
        this.bc_uniforme.getData().clear();
        this.txt_khi_uniforme.clear();
    }

    @FXML
    private void simulationUniformeAction(ActionEvent event) {
//        this.clearChart();

        txt_khi_uniforme.setText("Test uniforme in progress");
        // TODO Simuler la loi
    }
}
