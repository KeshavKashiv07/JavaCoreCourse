package Course3Sprint5.challange;

public class Automated extends Transmission{

    private double GareRatio1;
    private double GareRatio2;
    private double GareRatio3;
    private double GareRatio4;
    private double GareRatio5;

    public Automated(int AMPT4 ,double GareRatio1 , double GareRatio2 , double GareRatio3 , double GareRatio4){
        super.getAMTP4();
        this.GareRatio1=GareRatio1;
        this.GareRatio2=GareRatio2;
        this.GareRatio3=GareRatio3;
        this.GareRatio4=GareRatio4;
    }
    public Automated(int AMTD5 , double GareRatio1 , double GareRatio2 , double GareRatio3 , double GareRatio4 , double GareRatio5) {
        super.getAMTD5();
        this.GareRatio1=GareRatio1;
        this.GareRatio2=GareRatio2;
        this.GareRatio3=GareRatio3;
        this.GareRatio4=GareRatio4;
    }


    public double getGareRatio1() {
        return GareRatio1;
    }

    public void setGareRatio1(double gareRatio1) {
        GareRatio1 = gareRatio1;
    }

    public double getGareRatio2() {
        return GareRatio2;
    }

    public void setGareRatio2(double gareRatio2) {
        GareRatio2 = gareRatio2;
    }

    public double getGareRatio3() {
        return GareRatio3;
    }

    public void setGareRatio3(double gareRatio3) {
        GareRatio3 = gareRatio3;
    }

    public double getGareRatio4() {
        return GareRatio4;
    }

    public void setGareRatio4(double gareRatio4) {
        GareRatio4 = gareRatio4;
    }

    public double getGareRatio5() {
        return GareRatio5;
    }

    public void setGareRatio5(double gareRatio5) {
        GareRatio5 = gareRatio5;
    }

    public void showSpecs4(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Transmission type : Automated manual" );
        System.out.println("Transmission model number : AMTP4" );
        System.out.println("Key Specifications");
        System.out.println("1. Forward gear : " + getMP4());
        System.out.println("2. 1st Gear ratio : " + getGareRatio1());
        System.out.println("3. 2nd Gear ratio : " + getGareRatio2());
        System.out.println("4. 3rd Gear ratio : " + getGareRatio3());
        System.out.println("5. 4th Gear ratio : " + getGareRatio4());
        System.out.println("----------------------------------------------------------");
    }

    public void showSpecs5(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Transmission type : Automated manual" );
        System.out.println("Transmission model number : AMTD5" );
        System.out.println("Key Specifications");
        System.out.println("1. Forward gear : " + getMP5());
        System.out.println("2. 1st Gear ratio : " + getGareRatio1());
        System.out.println("3. 2nd Gear ratio : " + getGareRatio2());
        System.out.println("4. 3rd Gear ratio : " + getGareRatio3());
        System.out.println("5. 4th Gear ratio : " + getGareRatio4());
        System.out.println("6. 5th Gear ratio : " + getGareRatio5());
        System.out.println("----------------------------------------------------------");
    }
}
