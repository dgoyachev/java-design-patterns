package pw.goryachev.dp.solid.liskov_substitution;

import org.junit.jupiter.api.Test;
import pw.goryachev.dp.solid.liskov_substitution.incorrect.Rectangle;
import pw.goryachev.dp.solid.liskov_substitution.incorrect.Square;

import static org.junit.jupiter.api.Assertions.*;

class LiskovSubstitutionViolationTest {

    @Test
    public void violation() {

        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals(rectangle.computeArea(), 200);

        rectangle.setHeight(20);
        rectangle.setWidth(30);

        assertEquals(rectangle.getHeight(), 20);
        assertEquals(rectangle.getWidth(), 30);

        Square square = new Square(10);
        assertEquals(square.computeArea(), 100);

        square.setHeight(20);
        square.setWidth(30);

        assertNotEquals(square.getHeight(), 20);
        assertEquals(square.getWidth(), 30);
    }
}