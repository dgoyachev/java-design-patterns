package pw.goryachev.dp.solid.liskov_substitution;

import org.junit.jupiter.api.Test;
import pw.goryachev.dp.solid.liskov_substitution.correct.Rectangle;
import pw.goryachev.dp.solid.liskov_substitution.correct.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LiskovSubstitutionTest {

    @Test
    public void confirmation() {

        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals(rectangle.computeArea(), 200);

        rectangle.setHeight(20);
        rectangle.setWidth(30);

        assertEquals(rectangle.getHeight(), 20);
        assertEquals(rectangle.getWidth(), 30);

        Square square = new Square(10);
        assertEquals(square.computeArea(), 100);

        square.setSide(20);
        square.setSide(30);

        assertNotEquals(square.getSide(), 20);
        assertEquals(square.getSide(), 30);
    }
}