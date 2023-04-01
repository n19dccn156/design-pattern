package Creational.Prototype.Prototype;

import java.util.concurrent.TimeUnit;

public class Cell implements Cloneable {
 
    private String color;
    private String coordinate;
 
    public Cell(String color) {
        this.color = color;
        try {
            // More time to create an cell
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
 
    @Override
    public String toString() {
        return "Cell [color=" + color + ", coordinate=" + coordinate + "]\n";
    }

    @Override
    public Cell clone() {
        try {
            return (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getColor() {
        return this.color;
    }

    public String getCoordinator() {
        return this.coordinate;
    }
}
