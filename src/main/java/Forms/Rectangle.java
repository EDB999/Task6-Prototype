package Forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    private final double height = 30;//создать конструктор с этими параметрами
    private final double width = 60;
    public Rectangle(){
        figure = "Rectangle";//зачем? 
    }

    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setFill(Color.AQUA);
        gc.fillRect(pointX - (width /2), pointY - (height /2), width, height);
    }
    @Override
    public String toString(){
        return "Rectangle";
    }
}
