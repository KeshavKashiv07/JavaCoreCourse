package Course1Sprint5;

import java.util.Scanner;

public class HarshCodePizza {

	public void displayCustomerDetail(String name, String email, long phoneNo, String address){

        System.out.println("------------------------");
        System.out.println("Customer Details");
        System.out.println("------------------------");
        System.out.println("Name of the Customer is: "+name);
        System.out.println("Email of the Customer is: "+email);
        System.out.println("Contact No of the Customer is: "+phoneNo);
        System.out.println("Address of the Customer is: "+address);

    }

    public void displayMenu(){

        double regularPizza=9.99;
        double mediumPizza=11.99;
        double largePizza=13.99;
        double garlicBreadPrice=5.99;
        double beveragesPrice=1.99;
        int noOfPizzasOrdered=0;
        int noOfGarlicBreadOrdered=0;
        int noOfBeverageOrdered=0;
        int choice=0;

        System.out.println("\nSelect the items to order");
        System.out.println("Sl\t\t\tItem\t\tCategory");
        System.out.println("1)\t\t\tPizza");
        System.out.println("\t\t\t\t\tPrice of One Regular Pizza: "+regularPizza);
        System.out.println("\t\t\t\t\tPrice of One Medium Pizza: "+mediumPizza);
        System.out.println("\t\t\t\t\tPrice of One Large Pizza: "+largePizza);
        System.out.println("2)\t\t\tGarlic Bread");
        System.out.println("\t\t\t\t\tPrice of One Garlic Bread: "+garlicBreadPrice);
        System.out.println("3)\t\t\tBeverages");
        System.out.println("\t\t\t\t\tPrice of One Beverage: "+garlicBreadPrice);
    }

    public float getPriceOfPizzaBasedOnSize(int size){

        float priceOfPizza=0;

        if(size==1){
            priceOfPizza=9.99f;
        }
        else if (size==2){
            priceOfPizza=11.99f;
        }
        else if (size==3){
            priceOfPizza=13.99f;
        }
            else {
                System.out.println("Invalid size, Enter 1, 2 or 3.");
                priceOfPizza=0;
        }
        return priceOfPizza;
    }

    public float getPriceOfGarlicBread(){
        float priceOfGarlicBread=5.99f;
        return priceOfGarlicBread;
    }
    public float getPriceOfBeverage(){
        float priceOfBeverage=1.99f;
        return priceOfBeverage;
    }

    public float calculatePriceOfPizza(int noOfPizza, float priceOfPizza){
        return noOfPizza*priceOfPizza;
    }

    public float calculatePriceOfGarlicBread(int noOfGarlicBread, float priceOfGarlicBeard){
        return noOfGarlicBread*priceOfGarlicBeard;
    }

    public float calculatePriceOfBeverage(int noOfBeverage,float priceOfBeverage){
        return noOfBeverage*priceOfBeverage;
    }

    public float calculateTotalBill(float totalPizzaPrice, float totalGarlicBread, float totalBeverage){
        float totalBillAmount=0;
        totalBillAmount=totalPizzaPrice+totalGarlicBread+totalBeverage;
        return totalBillAmount;
    }

    public float calculateDiscountAndReturnBillAmount(float totalBillAmount){
        float discountedBill=0;
        discountedBill=(10/100f)*totalBillAmount;
        if(totalBillAmount>=50){
            discountedBill=totalBillAmount-discountedBill;
            return  discountedBill;
        }else
        return totalBillAmount;
    }

    public void displayOrderDetails(int noOfPizza, int noOfGarlicBread, int noOfBeverage, int size, float totalPrice, float discountedBill){
        System.out.println("-------------------------");
        System.out.println("Order Details");
        System.out.println("-------------------------");
        System.out.println("The number of Pizza ordered: " +noOfPizza);
        System.out.println("The number of Garlic Bread ordered: "+noOfGarlicBread);
        System.out.println("The number of Beverages ordered: "+noOfBeverage);
        System.out.println("--------------------------------------------------");
        System.out.println("Total bill : " + totalPrice);
        System.out.println("Total doscount : " + discountedBill);

    }

    public static void main(String [] ar){

        HarshCodePizza ps=new HarshCodePizza();

        String name;
        String email;
        long phoneNo=0;
        String address;
        int noOfPizzasOrdered=0;
        int noOfGarlicBreadOrdered=0;
        int noOfBeverageOrdered=0;
        int pizzaSize=0;
        int ch=0;
        float totalPizzaPrice=0;
        float totalGarlicBreadPrice=0;
        float totalBeveragePrice=0;
        float totalBillAmount;
        float totalBillAfterDiscounted;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Name: ");
        name=sc.nextLine();

        System.out.println("Enter the Customer Email: ");
        email=sc.nextLine();

        System.out.println("Enter the Customer Number: ");
        phoneNo=sc.nextLong();

        System.out.println("Enter the Customer Address: ");
        address=sc.next();

        ps.displayCustomerDetail(name,email,phoneNo,address);  //function for displaying customer details...
        ps.displayMenu();

        do{
            System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
            ch=sc.nextInt();

            switch (ch){
            case 1:
                System.out.println("Please enter 1 for Regular, 2 for Medium and 3 for Large: ");
                pizzaSize=sc.nextInt();
                
                float pizzaPrice=ps.getPriceOfPizzaBasedOnSize(pizzaSize);
                
                System.out.println("Enter the number of Pizza you want to order: ");
                noOfPizzasOrdered=sc.nextInt();
                
               totalPizzaPrice= ps.calculatePriceOfPizza(noOfPizzasOrdered,pizzaPrice);
               System.out.println("Total price of Pizza is: "+totalPizzaPrice);
                break;

            case 2:
                float priceGarlic=ps.getPriceOfGarlicBread();
                System.out.println("Please enter the number of Garlic Bread you want to order: ");
                noOfGarlicBreadOrdered=sc.nextInt();
                totalGarlicBreadPrice=ps.calculatePriceOfGarlicBread(noOfGarlicBreadOrdered,priceGarlic);
                System.out.println("Total price of Garlic Bread is: "+totalGarlicBreadPrice);
                break;

            case 3:
                float priceBeverage=ps.getPriceOfBeverage();
                System.out.println("Please enter the number of Beverages you want to order: ");
                noOfBeverageOrdered=sc.nextInt();
                totalBeveragePrice=ps.calculatePriceOfBeverage(noOfBeverageOrdered,priceBeverage);
                System.out.println("Total price of Beverages is: "+totalBeveragePrice);
                break;
                default:
                    System.out.println("Invalid Choice you entered.");
        }
            System.out.println("Do you want to place another order enter 1 to continue or 0 to exit: ");
            ch=sc.nextInt();
        }while (ch!=0);

       
       
       totalBillAmount= ps.calculateTotalBill(totalPizzaPrice,totalGarlicBreadPrice,totalBeveragePrice);
        totalBillAfterDiscounted=ps.calculateDiscountAndReturnBillAmount(totalBillAmount);

        ps.displayOrderDetails(noOfPizzasOrdered,noOfGarlicBreadOrdered,noOfBeverageOrdered,pizzaSize,totalBillAfterDiscounted,totalBillAmount);

    }

}
