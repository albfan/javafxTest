package org.albfan.javafxTest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloWorldFXMLController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private Button controllerButton;

    @FXML
    void onAction(ActionEvent event) {
        System.out.println("Hello World! (controllerButton)");
    }

    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello World! (button)");
            }
        });
    }
}