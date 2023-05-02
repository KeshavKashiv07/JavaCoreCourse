package Course3Sprint5.challange;

public class TransmissionImpl {
    public static void main(String[] args) {

        Transmission a = new Transmission(4,5,6);
        System.out.println(a.getMP4());

        Manual m4 = new Manual(4 , 2.540 ,1.920, 1.510,1.000);
        m4.showSpecs4();

        Manual m5 = new Manual(5 , 3.545 ,1.904 , 1.280 , 0.914 , 0.757 );
        m5.showSpecs5();

        Manual m6 = new Manual(6,3.010,2.070,1.430,1.000,0.710,0.570);
        m6.showSpecs6();


        Automated a4 = new Automated(4,2.540,1.920,1.510,1.000);
        a4.showSpecs4();

        Automated a5 = new Automated(5,2.950,1.940,1.340,1.000,0.630);
        a5.showSpecs5();


    }
}
