package com.jap.course3;

public class TransmissionImpl {
    public static void main(String[] args) {
    	
        Manual manual1=new Manual("MP4",4,2.540,1.920,1.510,1.000,"Manual");
        manual1.showSpecs();
        
        Manual manual2=new Manual("MP5",5,3.545,1.904,1.280,0.914,0.757,"Manual");
        manual2.showSpecs();
       
       Manual manual3=new Manual("MP6",6,3.010,2.070,1.430,1.000,0.710,0.570,"Manual");
       manual3.showSpecs();

       System.out.println("--------------------------------------------------------------");

        AMT auto=new AMT("AMTP4",4,2.950,1.940,1.340,1.000,0.630,"AMT");
        auto.showSpecs();    }
}
