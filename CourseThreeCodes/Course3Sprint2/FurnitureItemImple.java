package Course3Sprint2;


public class FurnitureItemImple {
    public static void main(String[] args) {

        FurnitureItem c1;
        c1= new FurnitureItem();

        System.out.println("furniture Type : " + c1.furnitureType);
        System.out.println("Furniture colour : " + c1.furnitureColour);
        System.out.println("Furniture Grade : " + c1.furnitureGrade);
        System.out.println("Discounted price : " + c1.discount(5));
        System.out.println();


    }
}
