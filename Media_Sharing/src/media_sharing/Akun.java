package media_sharing;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Akun {
//    private Video[] video;
//    private Foto[] foto;
//    private Akun[] friends;
    
    private ArrayList<Video> video;
    private ArrayList<Foto> foto;
    private ArrayList<Akun> friends;
    
    private String password;
    private String namaAkun;
    private int jmlteman = 0;
    
    private int jmlhFoto=0;
    private int jmlhVideo=0;
    
    public Akun(String namaAkun, String password){
        this.namaAkun = namaAkun;
        this.password = password;
        friends = new ArrayList<>();
        createFoto();
        createVideo();
    }
    
    public Akun(){
        friends = new ArrayList<>();
    }
    
    public String getNamaAkun(){
        return namaAkun;
    }
    
    public int getjmlTeman(){
        return jmlteman;
    }
    
    public int getjmlhVideo(){
        return jmlhVideo;
    }

    public String getPassword() {
        return password;
    }
    
    
    //========================================================================//
    //                      FRIENDZONE                                        //
    //========================================================================//
    
    public void followFriend(Akun f){
        if(this.jmlteman < 5){
            getFriends().add(f);
            jmlteman++;
        }
    }
    
    public void removeFriend(Akun f){
        if(searchFriends(f)!=null){
            getFriends().remove(f);
            jmlteman--;
        }
    }
    
    public void removeFriends(Akun f){
        if(seachFriends(f) != -1){
            getFriends().remove(seachFriends(f));
            jmlteman--;
        }
    }
    
    public Akun searchFriends(Akun cari){
        Akun Acari = null;
        for (Akun c : getFriends()) {
            if (c == Acari) {
                Acari = c;
                return Acari;
            }
        }
        return null;
    }
    
    public Akun friendSearch(String nama){
        Akun Acari = null;
        for (Akun c : getFriends()) {
            if (c.getNamaAkun().equals(nama)) {
                Acari = c;
                return Acari;
            }
        }
        return null;
    }
    
    public int seachFriends(Akun cari){
        int indeks =0;
        for(Akun c : getFriends()){
            if(c == cari){
                return indeks;
            }
            indeks++;
        }
        return -1;
    }
    
    
    public ArrayList<Akun> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Akun> friends) {
        this.friends = friends;
    }
    
//    public Akun getFriend(int i){
//        return friends[i];
//    }
    
//    //by akun
//    public void removeFriend(Akun f){
//        int i=0;
//            if(searchFriends(f) != -1){
//                for(int j = searchFriends(f); j<friends.length -1;j++){
//                    friends[j] = friends[j+1];
//                    i = j+1;
//                }
//            friends[i] = new Akun();
//            System.out.println("teman berhasil dihapus");
//            jmlteman--;
//        }else{System.out.println("tidak ada teman yang dihapus");}
//    }
//    
//    //by index
//    public void removeFriend1(int i){
//        int k = 0;
//        if(i < jmlteman){
//            for(int j = i;j<friends.length -1;j++){
//                friends[j] = friends[j+1];
//                k = j+1;
//            }
//            friends[k] = new Akun();
//            jmlteman--;
//        }else{
//            friends[i] = new Akun();
//            jmlteman--;
//        }
//    }
    
//    //mencari sesuai nama
//    public int searchFriends(Akun f){
//        for(int i = 0; i<5;i++){
//            if(friends[i] == f){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    //mencari sesuai index
//    public Akun searchFriends1(int i){
//        if(i < jmlteman){
//            return friends[i];
//        }
//        return null;
//    }
    
    //========================================================================//
    //========================================================================//
    
    //========================================================================//
    //                      Foto ZONE                                         //
    //========================================================================//      
    public void createFoto(){
        setFoto(new ArrayList<>());
    }
    
    public int getjmlhFoto(){
        return jmlhFoto;
    }
    
    public Foto searchFoto(Foto f) {
        for (Foto Fc : getFoto()) {
            if (Fc.getNama().equals(f.getNama())) {
                return Fc;
            }
        }
        return null;
    }
    
    public int searchFoto2(String foto){
        int indeks = 0;
        for(Foto  Fc : getFoto()){
            if(Fc.getNama().equals(foto)){
                return indeks;
            }
            indeks++;
        }
        return -1;
    }
    
    public ArrayList<Foto> getFoto() {
        return foto;
    }
    
    public void setFoto(ArrayList<Foto> foto) {
        this.foto = foto;
    }
    
    public void addFoto(Foto f){
        if (jmlhFoto <= 3){
            foto.add(f);
            jmlhFoto++;
            JOptionPane.showMessageDialog(null, "Foto Berhasil dimasukan");
        }else{JOptionPane.showMessageDialog(null,"Foto sudah melebihi kapasitas");}
    }
    
    public void removeMediaFoto(Foto f){
        if(searchFoto(f)!=null){
            foto.remove(searchFoto2(f.getNama()));
            jmlhFoto--;
        }else{JOptionPane.showMessageDialog(null,"Tidak ada foto yang bisa dihapus");}
    }
    
    public int searchFototoIndex(Foto k){
        int indexakun = 0;
        for(Foto kc: foto){
            if(kc.getNama().equals(k.getNama())){
                return indexakun;
            }
            indexakun++;
        }
        return indexakun;
    }


//    public int searchFoto(String nama) {
//        for (int i = 0; i <= jmlhFoto; i++) {
//            if (foto[i].getNama().equals(nama)) {
//                return i;
//            }
//        }
//        return -1;
//    }
    
//    public void setFoto(Foto[] foto) {
//        this.foto = foto;
//    }
//    
//    public Foto getFoto(int i) {
//        return foto[i];
//    }
//    
//    public void addFoto(Foto f){
//        if (jmlhFoto <= 3){
//            getFoto()[jmlhFoto] = f;
//            jmlhFoto++;
//        }
//    }
//    
//    //by index
//    public void removeMediaFoto(int i){
//        int k=0;
//        if(i != 2){
//            for(int j=i;j<getFoto().length-1 ;j++){
//                getFoto()[j] = getFoto()[j+1];
//                k = j+1;
//            }
//            getFoto()[k] = new Foto();
//            jmlhFoto--;
//        }else{
//            getFoto()[i] = new Foto();
//            jmlhFoto--;
//        }
//    }
    
    //========================================================================//
    //========================================================================//
    
    //========================================================================//
    //                      Video ZONE                                        //
    //========================================================================// 
    public void createVideo(){
        video = new ArrayList<>();
    }
    
    public Video searchVideo(Video v){
        for (Video Fc : getVideo()) {
            if (Fc.getNama().equals(v.getNama())) {
                return Fc;
            }
        }
        return null;
    }
    
    public int searchVideo2(String video){
        int indeks = 0;
        for(Video  Fc : getVideo()){
            if(Fc.getNama().equals(foto)){
                return indeks;
            }
            indeks++;
        }
        return -1;
    }
    
    public void addVideo(Video v){
        if (jmlhVideo < 3){
            video.add(v);
            jmlhVideo++;
        }else{JOptionPane.showMessageDialog(null,"Video sudah melebihi kapasitas");}
    }
    
    public void removeMediaVideo(Video v) {
       if(searchVideo(v)!=null){
            video.remove(searchVideo2(v.getNama()));
            jmlhVideo--;
       }else{JOptionPane.showMessageDialog(null,"Tidak ada Video yang dihapus");}
    }
    
    public ArrayList<Video> getVideo() {
        return video;
    }
    
    public int searchVideotoIndex(Video k){
        int indexakun = 0;
        for(Video kc: video){
            if(kc.getNama().equals(k.getNama())){
                return indexakun;
            }
            indexakun++;
        }
        return indexakun;
    }

//    public int searchVideo(String nama){
//        for (int i=0; i<=jmlhVideo;i++){
//            if(video[i].getNama().equals(nama)){
//                return i;
//            }
//        }
//        return -1;
//    }

//    public Video getVideo(int i) {
//        return video[i];
//    }
    
//    public void addVideo(Video v){
//        if (jmlhVideo < 3){
//            video[jmlhVideo] = v;
//            jmlhVideo++;
//        }
//    }
    
    //by index
//    public void removeMediaVideo(int i) {
//        if (i == 0) {
//            video[i] = video[i + 1];
//            video[i+1] = new Video();
//            jmlhVideo--;
//        }else{
//            video[i] = new Video();
//            jmlhVideo--;
//        }
//    }
    //========================================================================//
    //========================================================================//
    
    public String toString(){
        String akun = "Username : "+getNamaAkun()
                +"\n ";
        return akun;
    }

}
