package main;

import java.Entity;
import java.Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(group, 300, 275);
        primaryStage.setTitle("Bonsall Tank");
        

        Scene.set(Color.WHITE);
        
        primayStage.setScene(scene);
        primaryStage.show();
        
    }
    public void menu(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(group, 300, 275);
        
    }

    public static void main(String[] args) {
        launch(args);
        
    }
}
