package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML //  fx:id="home"
    private BorderPane home; // Value injected by FXMLLoader

    @FXML //  fx:id="btn_uni"
    private Button btn_uni; // Value injected by FXMLLoader

    @FXML //  fx:id="btn_expo"
    private Button btn_expo; // Value injected by FXMLLoader

    @FXML //  fx:id="btn_norm"
    private Button btn_norm; // Value injected by FXMLLoader

    @FXML //  fx:id="btn_poisson"
    private Button btn_poisson; // Value injected by FXMLLoader

    @FXML //  fx:id="btn_weibull"
    private Button btn_weibull; // Value injected by FXMLLoader

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO intégrer les élémnents dans le ChoiceBox

    }

    /**
     * Nettoyage du BorderPane de la page d'accueil
     */
    private void clearHome() {
        this.home.setCenter(null);
        this.home.setRight(null);
    }

    @FXML
    private void handleUniformeAction(ActionEvent event) {
        this.clearHome();

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/uniforme.fxml"));
            BorderPane bp_uniforme = (BorderPane) loader.load();

            this.home.setCenter(bp_uniforme);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleExponentielleAction(ActionEvent event) {
        this.clearHome();

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/exponentielle.fxml"));
            BorderPane bp_expo = (BorderPane) loader.load();

            this.home.setCenter(bp_expo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleNormaleAction(ActionEvent event) {
        this.clearHome();

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/normale.fxml"));
            BorderPane bp_norm = (BorderPane) loader.load();

            this.home.setCenter(bp_norm);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlePoissonAction(ActionEvent event) {
        this.clearHome();

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/poisson.fxml"));
            BorderPane bp_poisson = (BorderPane) loader.load();

            this.home.setCenter(bp_poisson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleWeibullAction(ActionEvent event) {
        this.clearHome();

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/weibull.fxml"));
            BorderPane bp_weibull = (BorderPane) loader.load();

            this.home.setCenter(bp_weibull);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
