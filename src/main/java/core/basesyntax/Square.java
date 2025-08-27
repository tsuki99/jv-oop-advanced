package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square: "
                + "color: " + getColor()
                + ", side: " + side
                + ", area: " + getArea());
    }

    @Override
    double getArea() {
        double area = side * side;
        return Math.round(area * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
