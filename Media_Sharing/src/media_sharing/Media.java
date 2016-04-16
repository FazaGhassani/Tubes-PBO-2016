package media_sharing;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Media {
    private ArrayList<Akun> tagged;
    private String nama;
    private int jmlhOrgdiTag;
    private File dirc;

    public File getDirc() {
        return dirc;
    }

    public void setDirc(File dirc) {
        this.dirc = dirc;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Media(String nama, File f) {
        this.nama = nama;
        this.tagged = new ArrayList<>();
        this.dirc=f;
    }

    public Media(String nama) {
        this.nama = nama;
        this.tagged = new ArrayList<>();
    }
    
    public Media(){
        this.tagged = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }
    
    public ArrayList<Akun> getTagged() {
        return tagged;
    }
    
    public int getjmlhOrgdiTag(){
        return jmlhOrgdiTag;
    }
    
    public void tagPerson(Akun cari){
            getTagged().add(cari);
            jmlhOrgdiTag++;
    }
    
    public void removePersonTag(Akun cari) {
        if(getPersonTag(cari)!=null){
            tagged.remove(cari);
        }
    }
        
    public Akun getPersonTag(Akun cari){
        for(Akun c : tagged){
            if (c.getNamaAkun().equals(cari.getNamaAkun())) {
                 return c;
            }
        }
        return null;
    }

    
//    public void tagPerson(Akun punya,Akun cari){
//        if (punya.searchFriends(cari) == -1){
//                System.out.println("Akun belum berteman dengan yang akan di Tag");
//        } else {
//            tagged[jmlhOrgdiTag] = cari;
//            jmlhOrgdiTag++;
//            System.out.println("tag berhasil");
//        }
//    }
    
//    public Akun getPersonTag1(int i){
//        if(i <= jmlhOrgdiTag){
//            return getTagged()[i];
//        }
//        return null;
//    }
    
//    public void removePersonTag(Akun cari) {
//        int i = 0;
//        if (getPersonTag(cari) == -1) {
//            System.out.println("Orang tidak ditemukan");
//        } else if (getPersonTag(cari)!= -1) {
//
//            for (int j = 0; j < getTagged().length -1; j++) {
//                tagged[j] = getTagged()[j+1];
//                i = j+1;
//            }
//            tagged[i] = new Akun();
//        }
//        jmlhOrgdiTag--;
//    }
    
//    public void removePersonTag1(int i){
//        int k = 0;
//        if(i < jmlhOrgdiTag){
//            for(int j = i;j<getTagged().length -1;j++){
//                tagged[j] = getTagged()[j+1];
//                k = j+1;
//            }
//            tagged[k] = new Akun();
//            jmlhOrgdiTag--;
//        }else{
//            tagged[i] = new Akun();
//            jmlhOrgdiTag--;
//        }
//    }
    
}
