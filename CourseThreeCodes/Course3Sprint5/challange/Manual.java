package Course3Sprint5.challange;

public class Manual extends Transmission{
    private double GareRatio1;
    private double GareRatio2;
    private double GareRatio3;
    private double GareRatio4;
    private double GareRatio5;
    private double GareRatio6;


    public Manual(int mp4 , double GareRatio1 , double GareRatio2 , double GareRatio3 , double GareRatio4) {
        super.getMP4();
        this.GareRatio1=GareRatio1;
        this.GareRatio2=GareRatio2;
        this.GareRatio3=GareRatio3;
        this.GareRatio4=GareRatio4;
    }

    public Manual(int mp5 , double GareRatio1 , double GareRatio2 , double GareRatio3 , double GareRatio4 , double GareRatio5) {
        super.getMP5();
        this.GareRatio1=GareRatio1;
        this.GareRatio2=GareRatio2;
        this.GareRatio3=GareRatio3;
        this.GareRatio4=GareRatio4;
    }

    public Manual(int mp6 , double GareRatio1 , double GareRatio2 , double GareRatio3 , double GareRatio4 , double GareRatio5 , double GareRatio6) {
        super.getMP6();
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

    public double getGareRatio6() {
        return GareRatio6;
    }

    public void setGareRatio6(double gareRatio6) {
        GareRatio6 = gareRatio6;
    }

    public void showSpecs4(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Transmission type : Manual" );
        System.out.println("Transmission model number : MP4" );
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
        System.out.println("Transmission type : Manual" );
        System.out.println("Transmission model number : MP5" );
        System.out.println("Key Specifications");
        System.out.println("1. Forward gear : " + getMP5());
        System.out.println("2. 1st Gear ratio : " + getGareRatio1());
        System.out.println("3. 2nd Gear ratio : " + getGareRatio2());
        System.out.println("4. 3rd Gear ratio : " + getGareRatio3());
        System.out.println("5. 4th Gear ratio : " + getGareRatio4());
        System.out.println("6. 5th Gear ratio : " + getGareRatio5());
        System.out.println("----------------------------------------------------------");
    }

    public void showSpecs6(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Transmission type : Manual" );
        System.out.println("Transmission model number : MP6" );
        System.out.println("Key Specifications ");
        System.out.println("1. Forward gear : " + getMP4());
        System.out.println("2. 1st Gear ratio : " + getGareRatio1());
        System.out.println("3. 2nd Gear ratio : " + getGareRatio2());
        System.out.println("4. 3rd Gear ratio : " + getGareRatio3());
        System.out.println("5. 4th Gear ratio : " + getGareRatio4());
        System.out.println("6. 5th Gear ratio : " + getGareRatio5());
        System.out.println("7. 6th Gear ratio : " + getGareRatio6());
        System.out.println("----------------------------------------------------------");
    }
}
