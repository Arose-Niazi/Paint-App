/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Arose
 */
public class PaintGround {
    public Canvas layout;
    private GraphicsContext gc;

    public PaintGround() {
    
        layout = new Canvas(1000, 1000);
        gc = layout.getGraphicsContext2D();
        gc.setLineWidth(5.0);
        
        layout.setOnMousePressed(e -> {
            gc.setStroke(SideMenu.currentColor);
            gc.beginPath();
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
        });
        
        layout.setOnMouseDragged(e -> {
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
        });
        
        layout.setOnMouseReleased(e -> {
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
            gc.closePath();
        });
        
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, layout.getWidth(), layout.getHeight());
    }
    
    
}
