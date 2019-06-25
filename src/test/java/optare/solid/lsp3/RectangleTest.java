package optare.solid.lsp3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void should_calculate_rectangle_area_20_when_width_is_5_and_height_is_4() {
        IRectangle rectangle = new Rectangle(5, 4);
        assertEquals(20, rectangle.calculateArea());
    }

    @Test
    public void should_calculate_square_area_25_when_width_is_5() {
        IRectangle square = new Square(5);
        assertEquals(25, square.calculateArea());
    }
}