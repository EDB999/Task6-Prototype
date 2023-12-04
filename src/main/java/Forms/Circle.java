package Forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    private final double height = 20;
    private final double width = 20;
    public Circle(){
        figure = "Circle";
    }

    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setFill(Color.LIMEGREEN);
        gc.fillOval(pointX - (height /2), pointY - (width /2), height, width);
    }
    @Override
    public String toString(){
        return "Circle";
    }
}