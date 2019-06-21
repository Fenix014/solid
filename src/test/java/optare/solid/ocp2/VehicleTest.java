package optare.solid.ocp2;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void should_draw_car_when_vehicle_is_a_car() {
        Vehicle car= new Vehicle();
        String drawCar = car.draw(VehicleType.CAR);
        assertEquals("Car", drawCar);
    }

    @Test
    public void should_draw_motorbike_when_vehicle_is_a_motorbike() {
        Vehicle car= new Vehicle();
        String drawMotorbike = car.draw(VehicleType.MOTORBIKE);
        assertEquals("Motorbike", drawMotorbike);
    }
}