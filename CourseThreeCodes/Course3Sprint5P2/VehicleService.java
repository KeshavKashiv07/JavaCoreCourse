package Course3Sprint5P2;

import java.sql.SQLOutput;

public class VehicleService {

    public static void main(String[] args) {

        Bike obj1 = new Bike("H2" , "h2777", "Sports bike");
        System.out.println("Bike type is sport bike its speed is " + obj1.maxSpeed(obj1.getVehicleType()));
        System.out.println(obj1.getManufacturerInformation());

        System.out.println();

        Car obj2 = new Car("Santro" , "san777", "Sedan");
        System.out.println("Car type is sedan car its speed is " + obj2.maxSpeed(obj2.getVehicleType()));
        System.out.println(obj2.getManufacturerInformation());


    }
}
