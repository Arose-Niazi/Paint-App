/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Arose
 */
public class Painter extends Application {
   
    @Override
    public void start(Stage primaryStage) {
        SideMenu sm = new SideMenu();
        PaintGround pg = new PaintGround();
        BorderPane layout = new BorderPane();
        layout.setLeft(sm.layout);
        layout.setCenter(pg.layout);
        
        Rectangle2D screen = Screen.getPrimary().getBounds();
        
        primaryStage.setScene(new Scene(layout,1000.0,1000.0));
        primaryStage.setTitle("Paint Program");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
