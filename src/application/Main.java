package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage stagePrincipal;
    private BorderPane layoutPrincipal;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stagePrincipal = primaryStage;
        this.stagePrincipal.setTitle("M&AS - Génération de nombre aléatoire");

        initLayoutPrincipal();

        // afficheApercuIntegration();
    }

    /**
     * Initialise le layout principal
     */
    private void initLayoutPrincipal() {
        try {
            // Charge le layout principal à partir du fichier fxml
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("home.fxml"));
            layoutPrincipal = (BorderPane) loader.load();

            // Affiche la Scene contenue dans le layout principal
            Scene scene = new Scene(layoutPrincipal);
            stagePrincipal.setScene(scene);
            stagePrincipal.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Affiche l'apercu pour les intégrations de fonctions dans le layout principal
     */
    private void afficheApercuIntegration() {
        try {
            // Charge l'aperçu intégration de fonction
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("views/vueIntegration.fxml"));
            AnchorPane vueIntegration = (AnchorPane) loader.load();

            // Ajoute cet aperçu au centre du layout principal
            layoutPrincipal.setCenter(vueIntegration);

            HomeController controller = loader.getController();
//            controller.setDataChoiceBox(); // setChoiceData
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return le stage principal
     */
    public Stage getStagePrincipal() {
        return stagePrincipal;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
