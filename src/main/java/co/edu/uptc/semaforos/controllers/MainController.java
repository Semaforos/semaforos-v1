package co.edu.uptc.semaforos.controllers;

import co.edu.uptc.semaforos.model.MainModel;
import javafx.animation.*;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private MainModel mainModel;

    @FXML
    private VBox firstPage;

    @FXML
    private StackPane simulationPage;

    @FXML
    private ImageView image;

    private boolean isRed = false;

    @FXML
    protected void onInit(){
        firstPage.setVisible(false);
        simulationPage.setVisible(true);
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), image);
        transition.setFromX(200);
        transition.setFromY(50);
        transition.setToX(0);
        transition.setToY(0);
        transition.setByX(-200);
        transition.setByY(-50);
        transition.setCycleCount(1);
        transition.play();
        simulationPage.setStyle("-fx-background-color: blue");
    }

    public void setColor(){
        if (isRed){
            simulationPage.setStyle("-fx-background-color: blue");
            isRed = false;
            return;
        }
        simulationPage.setStyle("-fx-background-color: red");
        isRed = true;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mainModel = new MainModel();
        mainModel.setMainController(this);
        mainModel.init();
    }
}