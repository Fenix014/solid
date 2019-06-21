package optare.solid.ocp2;

public class Vehicle {


    public String draw(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return drawCar();
            case MOTORBIKE:
                return drawMotorbike();
        }

        return "";
    }

    private String drawMotorbike() {
        return "Motorbike";
    }

    private String drawCar() {
        return "Car";
    }

}
