package media_sharing;

import java.util.Calendar;

public class Media {
    private Akun[] tagged;
    private String nama;
    private int jmlhOrgdiTag;
    
    /*//calender matter
    Calendar kalender;
    java.util.Date now = kalender.getTime();
    private java.sql.Timestamp tanggal;
    //*/

    public Media(String nama) {
        this.nama = nama;
        //this.kalender = Calendar.getInstance();
        this.tagged = new Akun[5];
    }
    
    public Media(){
        this.tagged = new Akun[5];
    }
    
    /*public void setTanggal(){
        tanggal = new java.sql.Timestamp(now.getTime());
    }
    
    public java.util.Date getTanggal(){
        return tanggal;
    }*/

    public String getNama() {
        return nama;
    }
        
    public Akun getTagged(int i) {
        return tagged[i];
    }
    
    public int getjmlhOrgdiTag(){
        return jmlhOrgdiTag;
    }
    
    public void tagPerson(Akun punya,Akun cari){
        if (punya.searchFriends(cari) == -1){
                System.out.println("Akun belum berteman dengan yang akan di Tag");
        } else {
            tagged[jmlhOrgdiTag] = cari;
            jmlhOrgdiTag++;
            System.out.println("tag berhasil");
        }
    }
    
    public int getPersonTag(Akun cari){//termasuk search tag
        for(int i=0; i<tagged.length; i++){
            if(tagged[i] == cari){
                return i;
            }
        }
        return -1;
    }
    
    public Akun getPersonTag1(int i){
        if(i <= jmlhOrgdiTag){
            return tagged[i];
        }
        return null;
    }
    
    public void removePersonTag(Akun cari) {
        int i = 0;
        if (getPersonTag(cari) == -1) {
            System.out.println("Video tidak ditemukan");
        } else if (getPersonTag(cari)!= -1) {

            for (int j = 0; j < tagged.length -1; j++) {
                tagged[j] = tagged[j+1];
                i = j+1;
            }
            tagged[i] = new Akun();
        }
        jmlhOrgdiTag--;
    }
    
    public void removePersonTag1(int i){
        int k = 0;
        if(i < jmlhOrgdiTag){
            for(int j = i;j<tagged.length -1;j++){
                tagged[j] = tagged[j+1];
                k = j+1;
            }
            tagged[k] = new Akun();
            jmlhOrgdiTag--;
        }else{
            tagged[i] = new Akun();
            jmlhOrgdiTag--;
        }
    }
    
}
