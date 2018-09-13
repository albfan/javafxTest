package org.albfan.javafxTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class helloFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            HBox layout = FXMLLoader.load(getClass().getResource("/hello.fxml"));

            stage.setTitle("¡Hello JavaFX!");
            stage.setScene(new Scene(layout, 300, 250));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}