/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.geometry.Pos;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author Arose
 */
public class SideMenu {
    public VBox layout;
    private ColorPicker colorPicker;
    
    public static Color currentColor;
    
    static 
    {
       currentColor = Color.SNOW;
    }
    
    public SideMenu()
    {
        layout = new VBox();
        
        colorPicker = new ColorPicker(Color.WHITE);
        layout.getChildren().add(colorPicker);
        layout.setAlignment(Pos.CENTER);
        
        colorPicker.setOnAction(e -> {
            currentColor = colorPicker.getValue();
        });
        
    }
    
}
