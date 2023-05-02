package Course3Sprint2;

public class FurnitureItem {

    String furnitureCode;
    String furnitureType;
    String furnitureColour;
    String furnitureGrade;
    String furnitureUsage;
    int price;

    FurnitureItem(){
        furnitureCode="A232";
        furnitureType="table";
        furnitureColour="black";
        furnitureGrade="A1";
        furnitureUsage="outdoor";
        price=400;
    }

    public float discount(int dispersant){
        return price + (dispersant/100f * price);
    }
}
