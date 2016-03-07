package media_sharing;

public class Akun {
    //private Media[] media;
    //media di devine menjadi Video[] video;
    //dan Image[] image;
    
    private Akun[] friends;
    private String password;
    private String namaAkun;
    private int jmlteman = 0;
    
    public Akun(String namaAkun, String password){
        this.namaAkun = namaAkun;
        this.password = password;
        friends = new Akun[5];
    }
    
    public String getNamaAkun(){
        return namaAkun;
    }

    //public createMedia(){}
    //bagi jadi createVideo(){}
    //bagi jadi createImage(){}
    
    //========================================================================//
    //                      FRIENDZONE                                        //
    //========================================================================//
    
    public void followFriend(Akun f){
        if(this.jmlteman < 5){
            friends[jmlteman] = f;
            jmlteman++;
        }
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
            
        }else if(searchFriends(f) != 0){
            friends[searchFriends(f)] = null;
        }else{System.out.println("tidak ada teman yang dihapus");}
    }
    
    //mencari sesuai nama
    public int searchFriends(Akun f){
        for(int i = 0; i<=5;i++){
            if(friends[i].getNamaAkun()== f.getNamaAkun()){
                return i;
            }
        }
        if(friends[5].getNamaAkun() != f.getNamaAkun()){
            System.out.println("Teman tidak ditemukan");
        }
        return -1;
    }
    //========================================================================//
    //========================================================================//
    
    
}
