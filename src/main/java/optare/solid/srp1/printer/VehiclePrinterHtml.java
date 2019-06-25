package optare.solid.srp1.printer;

import optare.solid.srp1.VehicleSRP;

public class VehiclePrinterHtml implements VehiclePrinter {

    public String print(VehicleSRP vehicle) {
        return "<HTML><BODY>MaxSpeed: "+vehicle.getMaxSpeed()+", Wheels: "+vehicle.getWheelCount()+"</BODY></HTML>";
    }
}
