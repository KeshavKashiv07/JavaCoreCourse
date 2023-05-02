package Course3Sprint5P2;

public class Bike extends VehicleManufacturer implements Vehicle{

    public Bike(String vehicleName, String vehicleModelName, String vehicleType){
        super(vehicleName,vehicleModelName,vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {

        if(vehicleType.equals("Sports bike") ){
            return 300;
        }
        else if (vehicleType.equals("Cruiser")) {
            return 170;
        }
        else{
            return 0;
        }
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike = { Manufacturer name : " + getVehicleName() + ", Model name : " + getVehicleModelName() + ", Vehicle Type : " + getVehicleType() + " }";
    }
}
