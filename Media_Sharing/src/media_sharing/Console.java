package media_sharing;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Console {
    Akun UserAkun = new Akun();
    Akun UserLain;
    
    private ArrayList<Akun> daftarAkun = new ArrayList<>();
    private int jmlhAkun=0;
    char i, t;
    
    public ArrayList<Akun> getDaftarAkun() {
        return daftarAkun;
    }
	
    public void addAkun(Akun Akunbaru){
        if(jmlhAkun < 5){
            daftarAkun.add(Akunbaru);
            jmlhAkun++;
        }else{JOptionPane.showMessageDialog(null, "Akun Sudah Penuh");}   
    }
    
    public Akun searchAkun(String nama){
        Akun Acari = null;
        for (Akun c : daftarAkun) {
            if (c.getNamaAkun().equals(nama)) {
                Acari = c;
                return Acari;
            }
        }
        return null;
    }
    
    public int searchAkuns(String nama){
        int indeks = 0;
        for(Akun c : daftarAkun){
            if(c.getNamaAkun().equals(nama)){
                return indeks;
            }
            indeks++;
        }
        return -1;
    }
    
    public void deleteAkun(Akun DAkun){
        daftarAkun.remove(DAkun);
        jmlhAkun = jmlhAkun -1;
    }
    
    public void followFriend(Akun userAkun, Akun fAkun){
        userAkun.followFriend(fAkun);
    }
    
//    public Akun seachFriend(String cnama){
//        Akun cari = new Akun(cnama,cnama);
//        if(UserAkun.searchFriends(cari) != null){
//            return UserAkun.searchFriends(cari);
//        }else{JOptionPane.showMessageDialog(null, "Teman tidak ditemukan");}
//        return null;
//    }
    
    public void removeFriend(String nama){
        Akun cari = new Akun(nama,nama);
        UserAkun.removeFriend(cari);
    }
    
    public void addPhoto(Foto f){
        UserAkun.addFoto(f);
    }
    
    public void addVideo(Video v){
        UserAkun.addVideo(v);
    }
    
    public void removeFoto(Foto f){
        UserAkun.removeMediaFoto(f);
    }
    
    public void removeVideo(Video v){
        UserAkun.removeMediaVideo(v);
    }
    
    public void tagPersonFoto(Akun namaAkun, String namafoto){
        Foto f = new Foto(namafoto);
        
        if(UserAkun.searchFoto(f)!=null && searchAkun(namaAkun.getNamaAkun()) != null){
            UserAkun.getFoto().get(UserAkun.searchFototoIndex(f)).tagPerson(UserAkun,namaAkun);
        }
    }
    
    public void tagPersonVideo(Akun namaAkun, String namavideo){
        Video v = new Video(namavideo);
        
        if(UserAkun.searchVideo(v)!=null && searchAkun(namaAkun.getNamaAkun()) != null){
            UserAkun.getVideo().get(UserAkun.searchVideotoIndex(v)).tagPerson(UserAkun,namaAkun);
        }
    }
    
    public void RemovePersonTagFoto(Akun namaAkun, String namafoto){
        Foto f = new Foto(namafoto);
        
        if(UserAkun.searchFoto(f)!=null && searchAkun(namaAkun.getNamaAkun()) != null){
            UserAkun.getFoto().get(UserAkun.searchFototoIndex(f)).removePersonTag(namaAkun);
        }
    }
    
    public void RemovePersonTagVideo(Akun namaAkun, String namavideo){
        Video v = new Video(namavideo);
        
        if(UserAkun.searchVideo(v)!=null && searchAkun(namaAkun.getNamaAkun()) != null){
            UserAkun.getVideo().get(UserAkun.searchVideotoIndex(v)).removePersonTag(namaAkun);
        }
    }
    
    public void ViewFoto(){
        for(Foto f: UserAkun.getFoto()){
            f.toString();
        }
    }
    
    public void ViewVideo(){
        for(Video v:UserAkun.getVideo()){
            v.toString();
        }
    }
    
    public void ViewFriend(){
        for(Akun c:UserAkun.getFriends()){
            c.toString();
        }
    }
    
    public void ViewTaggedFoto(Foto f){
        for(Akun c : f.getTagged()){
            c.toString();
        }
    }
    
    public void ViewTaggedVideo(Video v){
        for(Akun c : v.getTagged()){
            c.toString();
        }
    }
    
    
    
    
    
    
    
    
    
    
    //view foto dan video
    //view tagged video dan foto
    
    
}
