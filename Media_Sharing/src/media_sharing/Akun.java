package media_sharing;

public class Akun {
    private Video[] video;
    private Foto[] foto;
    
    private Akun[] friends;
    private String password;
    private String namaAkun;
    private int jmlteman = 0;
    
    private int jmlhFoto=0;
    private int jmlhVideo=0;
    
    public Akun(String namaAkun, String password){
        this.namaAkun = namaAkun;
        this.password = password;
        friends = new Akun[5];
    }
    
    public Akun(){
        friends = new Akun[5];
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
    
    //========================================================================//
    //                      FRIENDZONE                                        //
    //========================================================================//
    
    public void followFriend(Akun f){
        if(this.jmlteman < 5){
            friends[jmlteman] = f;
            jmlteman++;
        }
    }
    
    public Akun getFriend(int i){
        return friends[i];
    }
    
    //by akun
    public void removeFriend(Akun f){
        int i=0;
            if(searchFriends(f) != -1){
                for(int j = searchFriends(f); j<friends.length -1;j++){
                    friends[j] = friends[j+1];
                    i = j+1;
                }
            friends[i] = new Akun();
            System.out.println("teman berhasil dihapus");
            jmlteman--;
        }else{System.out.println("tidak ada teman yang dihapus");}
    }
    
    //by index
    public void removeFriend1(int i){
        int k = 0;
        if(i < jmlteman){
            for(int j = i;j<friends.length -1;j++){
                friends[j] = friends[j+1];
                k = j+1;
            }
            friends[k] = new Akun();
            jmlteman--;
        }else{
            friends[i] = new Akun();
            jmlteman--;
        }
    }
    
    //mencari sesuai nama
    public int searchFriends(Akun f){
        for(int i = 0; i<5;i++){
            if(friends[i] == f){
                return i;
            }
        }
        return -1;
    }
    
    //mencari sesuai index
    public Akun searchFriends1(int i){
        if(i < jmlteman){
            return friends[i];
        }
        return null;
    }
    //========================================================================//
    //========================================================================//
    
    //========================================================================//
    //                      Foto ZONE                                         //
    //========================================================================//      
    public void createFoto(){
        foto = new Foto[3];
    }
    
    public int getjmlhFoto(){
        return jmlhFoto;
    }
    
/*    
    public int searchFoto(Akun f) {
        for (int i = 0; i <= 3; i++) {
            if (foto[i]== f.getFoto(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }
*/   
    public Foto getFoto(int i) {
        return foto[i];
    }
    
    public void addFoto(Foto f){
        if (jmlhFoto <= 3){
            foto[jmlhFoto] = f;
            jmlhFoto++;
        }
    }
    
    //by index
    public void removeMediaFoto(int i){
        int k=0;
        if(i != 2){
            for(int j=i;j<foto.length-1 ;j++){
                foto[j] = foto[j+1];
                k = j+1;
            }
            foto[k] = new Foto();
            jmlhFoto--;
        }else{
            foto[i] = new Foto();
            jmlhFoto--;
        }
    }
    
    //========================================================================//
    //========================================================================//
    
    //========================================================================//
    //                      Video ZONE                                        //
    //========================================================================// 
    public void createVideo(){
        video = new Video[2];
    }
 
/*
    public int searchVideo(Akun f){
        for (int i=0; i<=2;i++){
            if(video[i] == f.getVideo(i)){
                return i;
            }
        }
        return -1;
    }
*/

    public Video getVideo(int i) {
        return video[i];
    }
    
    public void addVideo(Video v){
        if (jmlhVideo < 3){
            video[jmlhVideo] = v;
            jmlhVideo++;
        }
    }
    
    //by index
    public void removeMediaVideo(int i) {
        if (i == 0) {
            video[i] = video[i + 1];
            video[i+1] = new Video();
            jmlhVideo--;
        }else{
            video[i] = new Video();
            jmlhVideo--;
        }
    }
    //========================================================================//
    //========================================================================//
}
