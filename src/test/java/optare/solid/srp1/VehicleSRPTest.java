package optare.solid.srp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleSRPTest {
    @Test
    public void should_return_4_wheels_when_is_a_vehicle() {
        VehicleSRP vehicle = new VehicleSRP();
        assertEquals(4, vehicle.getWheelCount());
    }

    @Test
    public void should_return_200_top_speed_when_is_a_vehicle() {
        VehicleSRP vehicle = new VehicleSRP();
        assertEquals(200, vehicle.getMaxSpeed());
    }
}
