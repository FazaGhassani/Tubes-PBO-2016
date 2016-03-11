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
        int i = 1;
        if(searchFriends(f) != -1 && searchFriends(f) != 0){
            friends[searchFriends(f)] = null;
            
            //majuin antrian ke depan//
            for(int j=0;j<5;j++){
                while(friends[i] == null && i<4){
                    i++;
                }
                if(i<4){
                    friends[i] = friends[i+1];
                    friends[i+1] = null;
                }
            }
            //---------------------//
            
        }else if(searchFriends(f) != 0){
            friends[searchFriends(f)] = null;
        }else{System.out.println("tidak ada teman yang dihapus");}
    }
    
    //mencari sesuai nama
    public int searchFriends(Akun f){
        int j=0;
        for(int i = 0; i<5;i++){
            if(friends[i].getNamaAkun()== f.getNamaAkun()){
                j = i;
            }
        }
        if(friends[5].getNamaAkun() != f.getNamaAkun()){
            j = -1;
            System.out.println("Teman tidak ditemukan");
        }
        return j;
    }
    //========================================================================//
    //========================================================================//

    public int searchVideo(Akun f){
        int j=0;
        for (int i=0; i<=5;i++){
            if(video[i].getNama() == f.getVideo(i).getNama()){
                j = i;
            }
        }
        if (video[5].getNama() != f.getVideo(j).getNama()){
            j = -1;
            System.out.println("Bukan video yang dicari");
        }
        return j;
    }
    
    public int searchFoto(Akun f) {
        int j = 0;
        for (int i = 0; i <= 5; i++) {
            if (foto[i].getNama() == f.getFoto(i).getNama()) {
                j = i;
            }
        }
        if (foto[5].getNama() != f.getFoto(j).getNama()) {
            j = -1;
            System.out.println("Bukan video yang dicari");
        }
        return j;
    }
    
    
    public Foto getFoto(int i) {
        return foto[i];
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }

    public Video getVideo(int i) {
        return video[i];
    }
    
    public void addFoto(Foto f){
        if (jmlhFoto <= 3){
            foto[jmlhFoto] = f;
            jmlhFoto++;
        }
    }
    
    public void addVideo(Video v){
        if (jmlhVideo <=2){
            video[jmlhVideo] = v;
            jmlhVideo++;
        }
    }
    
    public void removeVideo (Akun f){
        int i=1;
        if (f.searchVideo(f) == -1){
            System.out.println("Video tidak ditemukan");
        } else if (f.searchVideo(f) != -1) {
            video[f.searchVideo(f)] = null;
            
            for(int j=0;j<5;j++){
                while(video[i] == null && i<4){
                    i++;
                }
                if(i<4){
                    video[i] = video[i+1];
                    video[i+1] = null;
                }
            }
        } else if (f.searchVideo(f) != 0){
            video[f.searchVideo(f)] = null;
        }
    }
    
     public void removeFoto(Akun f) {
        int i = 1;
        if (f.searchFoto(f) == -1) {
            System.out.println("Video tidak ditemukan");
        } else if (f.searchFoto(f) != -1) {
            foto[f.searchFoto(f)] = null;

            for (int j = 0; j < 5; j++) {
                while (foto[i] == null && i < 4) {
                    i++;
                }
                if (i < 4) {
                    foto[i] = foto[i + 1];
                    foto[i + 1] = null;
                }
            }
        } else if (f.searchFoto(f) != 0) {
            foto[f.searchFoto(f)] = null;
        }
    }
     
    public void createFoto(){
        foto = new Foto[3];
    }
    
    public void createVideo(){
        video = new Video[2];
    }
    
    public Foto getMediaFoto(int i){
        return foto[i];
    }
    
    public Video getMediaVideo(int i){
        return video[i];
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
    
    public void removeMediaVideo(int i) {

        video[i] = null;
        if (i == 0) {
            video[i] = video[i + 1];
        }
    }
}
