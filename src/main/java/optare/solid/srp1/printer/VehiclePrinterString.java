package optare.solid.srp1.printer;

import optare.solid.srp1.VehicleSRP;

public class VehiclePrinterString implements VehiclePrinter {

    public String print(VehicleSRP vehicle) {
        return vehicle.toString();
    }
}
