package optare.solid.ocp2;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void should_draw_car_when_vehicle_is_a_car() {
        Vehicle car= new Car();
        String drawCar = car.draw();
        assertEquals("Car", drawCar);
    }

    @Test
    public void should_draw_motorbike_when_vehicle_is_a_motorbike() {
        Vehicle motorbike= new Motorbike();
        String drawMotorbike = motorbike.draw();
        assertEquals("Motorbike", drawMotorbike);
    }
}