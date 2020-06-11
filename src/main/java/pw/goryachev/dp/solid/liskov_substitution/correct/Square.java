package pw.goryachev.dp.solid.liskov_substitution.correct;

/**
 * Created by morgan on 12.06.2020
 */

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int computeArea() {
        return side*side;
    }
}