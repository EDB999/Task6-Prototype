package Forms;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {
    private final double height = 50;
    private final double width = 25;
    public Triangle(){
        figure = "Треугольник";
    }

    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setFill(Color.BLUEVIOLET);
        gc.fillPolygon(new double[] {pointX, pointX - (width /2), pointX + (width /2)}, new double[] {pointY - (height /2), pointY + (height /2), pointY + (height /2)}, 3);
    }
    @Override
    public String toString(){
        return "Triangle";
    }
}
