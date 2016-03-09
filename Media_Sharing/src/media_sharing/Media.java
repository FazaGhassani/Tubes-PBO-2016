package media_sharing;

import java.util.Calendar;

public class Media {
    private Akun[] tagged;
    private String nama;
    private int jmlhOrgdiTag;
    
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

    public Akun getTagged(int i) {
        return tagged[i];
    }
    
    public void tagPerson(Akun punya,Akun cari){
            if (punya.searchFriends(cari) == -1){
                System.out.println("Belum memiliki teman");
            } else {
                for (int i=0; i<tagged.length; i++){
                    tagged[jmlhOrgdiTag] = cari;
                    jmlhOrgdiTag++;
                }
            }
    }

    public String getNama() {
        return nama;
    }
    
    public int getPersonTag(Akun cari){//termasuk search tag
        int j=0;
        for(int i=0; i<tagged.length; i++){
            if(tagged[i] == cari){
                j = i;
            }
        }
        return j;
    }
    public void removePersonTag(Akun cari) {
        int i = 1;
        if (getPersonTag(cari) == -1) {
            System.out.println("Video tidak ditemukan");
        } else if (getPersonTag(cari)!= -1) {
            tagged[getPersonTag(cari)] = null;

            for (int j = 0; j < 5; j++) {
                while (tagged[getPersonTag(cari)] == null && i < 4) {
                    i++;
                }
                if (i < 4) {
                    tagged[getPersonTag(cari)] = tagged[getPersonTag(cari) + 1];
                    tagged[getPersonTag(cari) + 1] = null;
                }
            }
        } else if(getPersonTag(cari) != 0) {
            tagged[getPersonTag(cari)] = null;
        }
    }
    
}
