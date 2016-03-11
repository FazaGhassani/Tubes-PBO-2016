package media_sharing;

public class Media_Sharing {

public static void main(String[] args) {
    Akun anggota1 = new Akun("Ganis","mewmewpower");
    Akun anggota2 = new Akun("Anggie","cantik");
    Akun anggota3 = new Akun("Riki","rikichan");
    Akun anggota4 = new Akun("Pewdipie","poods");
    Akun anggota5 = new Akun("Phil","cinnamonbun");
    Akun anggota6 = new Akun("Dan","memelord");
    
    anggota1.followFriend(anggota2);
    anggota1.followFriend(anggota3);
    anggota1.followFriend(anggota4);
    anggota1.followFriend(anggota5);
    anggota1.followFriend(anggota6);
    
    System.out.println("Teman "+anggota1.getNamaAkun()+":");
    for(int j=0; j<anggota1.getjmlTeman();j++){
        if(anggota1.getFriend(j).getNamaAkun() != null){
            System.out.println((j+1)+". "+anggota1.getFriend(j).getNamaAkun());
        }
    }

    System.out.println("Akun yang dicari: "+anggota1.getFriend(1).getNamaAkun());
    System.out.println("teman yang dicari ada di index ke : "+anggota1.searchFriends(anggota3));
    
    System.out.println("");
    anggota1.removeFriend(anggota3);
    System.out.println("teman yang dicari (Riki) ada di index ke : "+anggota1.searchFriends(anggota3));
    
    for(int j=0; j<anggota1.getjmlTeman();j++){
        if(anggota1.getFriend(j).getNamaAkun() != null){
            System.out.println((j+1)+". "+anggota1.getFriend(j).getNamaAkun());
        }
    }
    
    //foto
    System.out.println("");
    Foto f1 = new Foto(20000,"Phandom");
    Foto f2 = new Foto(20000,"Geto");
    Foto f3 = new Foto(20000,"okeoke");
    anggota1.createFoto();
    anggota1.addFoto(f1);
    anggota1.addFoto(f2);
    anggota1.addFoto(f3);
    
    System.out.println("Foto yang dimiliki: "+anggota1.getNamaAkun());
    for(int j=0; j<anggota1.getjmlhFoto();j++){
        if(anggota1.getFoto(j).getNama()!= null){
            System.out.println((j+1)+". "+anggota1.getFoto(j).getNama());
        }
    }
    
    System.out.println("");
    System.out.println("Menghapus Foto "+anggota1.getNamaAkun());
    anggota1.removeMediaFoto(2);
    System.out.println("Video yang dimiliki: "+anggota1.getNamaAkun());
    for(int j=0; j<anggota1.getjmlhFoto();j++){
        if(anggota1.getFoto(j).getNama()!= null){
            System.out.println((j+1)+". "+anggota1.getFoto(j).getNama());
        }
    }
    
    //video
    System.out.println("");
    Video v1 = new Video("Phil got pancake flipped");
    Video v2 = new Video("I meet pewds!");
    anggota1.createVideo();
    anggota1.addVideo(v1);
    anggota1.addVideo(v2);

    System.out.println("Video yang dimiliki: "+anggota1.getNamaAkun());
    for(int j=0; j<anggota1.getjmlhVideo();j++){
        if(anggota1.getVideo(j).getNama()!= null){
            System.out.println((j+1)+". "+anggota1.getVideo(j).getNama());
        }
    }
    
    System.out.println("");
    System.out.println("menghapus video "+anggota1.getNamaAkun());
    anggota1.removeMediaVideo(0);
    System.out.println("Video yang dimiliki: "+anggota1.getNamaAkun());
    for(int j=0; j<anggota1.getjmlhVideo();j++){
        if(anggota1.getVideo(j).getNama()!= null){
            System.out.println((j+1)+". "+anggota1.getVideo(j).getNama());
        }
    }
    
  } 
}
