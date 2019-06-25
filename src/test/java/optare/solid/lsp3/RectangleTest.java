package optare.solid.lsp3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void should_calculate_rectangle_area_20_when_width_is_5_and_height_is_4() {
        Rectangle r = new Rectangle();
        r.setWidth(5);
        r.setHeight(4);
        assertEquals(20, r.calculateArea());
    }

    @Test
    public void should_calculate_square_area_25_when_width_is_5() {
        Rectangle r = new Square();
        r.setWidth(5);
        r.setHeight(4); // FIXME
        assertEquals(25, r.calculateArea());
    }
}