import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        //Todo: this will be the menue. so neeeds to be implemetned
        //Todo: need to make buttons and action events.
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setTitle("Bonsall Tank");

        Button play = new Button("Play");

        play.setOnAction((ActionEvent e) -> {

        });

        Button settingsButton = new Button("Settings");

        settingsButton.setOnAction((ActionEvent e) ->{
            settings(primaryStage);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public void settings(Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene(root,300, 275);
        Button fullscreen = new Button("Full Screen: Off");

        fullscreen.setOnAction((ActionEvent e)->{
            if(fullscreen.getText().equals("Full Screen: Off")) {
                primaryStage.setFullScreen(false);
                fullscreen.setText("Full Screen: On");
            }else{
                primaryStage.setFullScreen(true);
                fullscreen.setText("Full Screen: Off");
            }
        });


    }

    public static void main(String[] args) {
        launch(args);
        
    }
}
