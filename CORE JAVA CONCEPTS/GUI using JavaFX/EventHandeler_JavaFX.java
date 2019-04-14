package com.shivam;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 * created by Shivam on 14-04-2019.
 */
public class EventHandeler_JavaFX extends Application {

    public void start(Stage primaryStage){

        Button b1=new Button("Say hello !");
        Button b2=new Button("Exit");

        Text text=new Text("Hello will be printed here !");


        // Defining a event handler for b1.
        EventHandler eventHandler=new EventHandler() {
            @Override
            public void handle(Event event) {
                text.setText("Hello There!! You pressed the Say Hello Button:)");
            }
        };
        // Assigning a eventHandler to b1.
        b1.setOnAction(eventHandler);

        //  OR

        //b1.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);



        // Assigning EventHandler to b2.
        // EventHandler is a marker Interface so we can use LAMBDA exp.
        b2.setOnAction(e -> System.exit(0));


        // Layout
        HBox root=new HBox();

        root.getChildren().addAll(text,b1,b2);

        // Scene
        Scene scene=new Scene(root,500,500);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }

}
