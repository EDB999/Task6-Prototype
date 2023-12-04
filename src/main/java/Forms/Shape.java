package Forms;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape implements Cloneable{
    protected String figure;
    public abstract void draw(GraphicsContext gr, Double pointX, Double pointY);

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone; }

    @Override
    public String toString(){
        return super.toString();
    }
}
