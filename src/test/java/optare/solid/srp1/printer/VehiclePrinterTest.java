package optare.solid.srp1.printer;

import optare.solid.srp1.VehicleSRP;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehiclePrinterTest {
    @Test
    public void should_print_string_vehicle_when_call_printer() {
        VehicleSRP vehicle = new VehicleSRP();
        VehiclePrinter vehiclePrinter = new VehiclePrinterString();

        final String result = vehiclePrinter.print(vehicle);

        assertEquals("wheelCount=4, maxSpeed=200", result);
    }

    @Test
    public void should_print_html_vehicle_when_call_printer() {
        VehicleSRP vehicle = new VehicleSRP();
        VehiclePrinter vehiclePrinter = new VehiclePrinterHtml();

        final String result = vehiclePrinter.print(vehicle);

        assertEquals("<HTML><BODY>MaxSpeed: 200, Wheels: 4</BODY></HTML>", result);
    }
}
