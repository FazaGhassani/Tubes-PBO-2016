package media_sharing;

public class Media_Sharing {

public static void main(String[] args) {
    Akun anggota1 = new Akun("Ganis","mewmewpower");
    Akun anggota2 = new Akun("Anggie","cantik");
    Akun anggota3 = new Akun("Riki","rikichan");
    Akun anggota4 = new Akun("Daniel","damnvans");
    Akun anggota5 = new Akun("Phil","cinnamonbun");
    Akun anggota6 = new Akun("Dan","memelord");
    
    anggota1.followFriend(anggota2);
    anggota1.followFriend(anggota3);
    anggota1.followFriend(anggota4);
    anggota1.followFriend(anggota5);
    anggota1.followFriend(anggota6);
    
    System.out.println("Teman "+anggota1.getNamaAkun()+":");
    for(int i=0; i<5;i++){
        System.out.println((i+1)+". "+anggota1.getFriend(i).getNamaAkun());
    }

    System.out.println("Akun yang dicari: "+anggota1.getFriend(1).getNamaAkun());
    System.out.println("teman yang dicari ada di index ke : "+anggota1.searchFriends(anggota3));
    
    System.out.println("");
    anggota1.removeFriend(anggota3);
    System.out.println("teman yang dicari (Riki) ada di index ke : "+anggota1.searchFriends(anggota3));
    
    for(int j=0; j<5;j++){
        System.out.println((j+1)+". "+anggota1.getFriend(j).getNamaAkun());
    }
    
    //foto
    anggota1.createFoto();
    }
    
}
