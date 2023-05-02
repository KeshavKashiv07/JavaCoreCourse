package Course3Sprint5P2;

public class Car extends VehicleManufacturer implements Vehicle{

    public Car(String vehicleName, String vehicleModelName, String vehicleType){
        super(vehicleName,vehicleModelName,vehicleType);
    }
    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equals("Sports car") ){
            return 250;
        }
        else if (vehicleType.equals("Sedan")) {
            return 170;
        }
        else{
            return 0;
        }
    }

    @Override
    public String getManufacturerInformation() {
        return "Car = { Manufacturer name : " + getVehicleName() + ", Model name : " + getVehicleModelName() + ", Vehicle Type : " + getVehicleType() + " }";
    }
}
