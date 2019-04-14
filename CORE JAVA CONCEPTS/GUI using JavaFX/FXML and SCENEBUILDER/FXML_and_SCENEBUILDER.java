package com.shivam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * created by Shivam on 14-04-2019.
 */
public class FXML_and_SCENEBUILDER extends Application {

    public void start(Stage primaryStage) throws Exception{


        // Setting root , the fxml file.
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene=new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}
