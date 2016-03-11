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
    
    public void removeFriend(Akun f){
        int i=0;
            if(searchFriends(f) != -1){
                for(int j = searchFriends(f); j<friends.length -1;j++){
                    friends[j] = friends[j+1];
                    i = j+1;
                }
            friends[i] = new Akun();
            System.out.println("teman berhasil dihapus");
        }else{System.out.println("tidak ada teman yang dihapus");}
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
    //========================================================================//
    //========================================================================//
    
    //========================================================================//
    //                      Foto ZONE                                         //
    //========================================================================//      
    public void createFoto(){
        foto = new Foto[3];
    }
    
    public int searchFoto(Akun f) {
        for (int i = 0; i <= 3; i++) {
            if (foto[i]== f.getFoto(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public Foto getFoto(int i) {
        return foto[i];
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }
    
    public void addFoto(Foto f){
        if (jmlhFoto <= 3){
            foto[jmlhFoto] = f;
            jmlhFoto++;
        }
    }
    
    public void removeMediaFoto(int i){
        
        foto[i] = null;
        if(i == 0){
            for(int j=0;j<2;j++){
                foto[j] = foto[j+1];
                foto[j+1] = foto[j+2];
            }
        }else if(i == 1){
            for(int j=0;j<1;j++){
                foto[j+1]=foto[j+2];
            }
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
 
    public int searchVideo(Akun f){
        for (int i=0; i<=2;i++){
            if(video[i] == f.getVideo(i)){
                return i;
            }
        }
        return -1;
    }

    public Video getVideo(int i) {
        return video[i];
    }
    
    public void addVideo(Video v){
        if (jmlhVideo <=2){
            video[jmlhVideo] = v;
            jmlhVideo++;
        }
    }
    
    public void removeMediaVideo(int i) {

        video[i] = null;
        if (i == 0) {
            video[i] = video[i + 1];
        }
    }
    //========================================================================//
    //========================================================================//
}
