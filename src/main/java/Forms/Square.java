package Forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{
    private final double height = 15;
    private final double width = 15;
    public Square(){
        figure = "Square";
    }

    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setFill(Color.BLACK);
        gc.fillRect(pointX - (width/2), pointY - (height /2), width, height);
    }
    @Override
    public String toString(){
        return "Square";
    }
}