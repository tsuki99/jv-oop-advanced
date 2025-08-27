package core.basesyntax;

public abstract class Figure implements Drawable {
    public static final double NUMBER_FOR_ROUND = 10.0;

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
