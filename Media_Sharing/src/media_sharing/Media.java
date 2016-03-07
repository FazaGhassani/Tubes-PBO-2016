package media_sharing;

import java.util.Calendar;

public class Media {
    private Akun[] tagged;
    private String nama;
    
    //calender matter
    Calendar kalender;
    java.util.Date now = kalender.getTime();
    private java.sql.Timestamp tanggal;
    //

    public Media(String nama) {
        this.nama = nama;
        this.kalender = Calendar.getInstance();
        this.tagged = new Akun[5];
    }
    
    public void setTanggal(){
        tanggal = new java.sql.Timestamp(now.getTime());
    }
    
    public java.util.Date getTanggal(){
        return tanggal;
    }
    
}
