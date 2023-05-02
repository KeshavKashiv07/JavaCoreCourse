package Course3Sprint5.challange;

public class Transmission {

    private int MP4;
    private int MP5;
    private int MP6;
    private int AMTP4;
    private int AMTD5;

    public Transmission(){
        this.MP4=getMP4();
        this.MP5=getMP5();
        this.MP6=getMP6();
        this.AMTP4=getAMTP4();
        this.AMTD5=getAMTD5();

    }

    public Transmission(int mp4 , int mp5 , int mp6){
        this.MP4=mp4;
        this.MP5=mp5;
        this.MP6=mp6;
    }

    public Transmission(int AMTP4 , int AMTD5) {
        this.AMTP4=AMTP4;
        this.AMTD5=AMTD5;
    }


    public int getMP4() {
        return MP4;
    }

    public void setMP4(int MP4) {
        this.MP4 = MP4;
    }

    public int getMP5() {
        return MP5;
    }

    public void setMP5(int MP5) {
        this.MP5 = MP5;
    }

    public int getMP6() {
        return MP6;
    }

    public void setMP6(int MP6) {
        this.MP6 = MP6;
    }



    public int getAMTP4() {
        return AMTP4;
    }

    public void setAMTP4(int AMTP4) {
        this.AMTP4 = AMTP4;
    }

    public int getAMTD5() {
        return AMTD5;
    }

    public void setAMTD5(int AMTD5) {
        this.AMTD5 = AMTD5;
    }


}
