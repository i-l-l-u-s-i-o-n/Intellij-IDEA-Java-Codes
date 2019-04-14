package com.shivam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




/**
 * created by Shivam on 14-04-2019.
 */
public class JavaFX_Basics extends Application {


    // This is the method of the ABSTRACT class Application.
    // Here we can add our stage(window),scene and widgets.
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button=new Button("Click"); // Creating a new Button

        // Creating a layout i.e the ROOT node.
        // There are various Layouts such as GridPane, StackPane, BorderPane etc....
        StackPane root=new StackPane();

        root.getChildren().add(button);  // getChildren() returns the observable List of nodes.and in that list we add the root.

        // Now we create a scene.
        Scene scene=new Scene(root,400,400);   // Assigning root to be the scene for the stage.

        primaryStage.setScene(scene);  // Setting scene.

        primaryStage.setTitle("Basic Application");  // Setting Title.




        primaryStage.show();// It shows the application.



    }


    public static void main(String[] args) {

        launch();//it calls the constructor and start our application.
    }
}
