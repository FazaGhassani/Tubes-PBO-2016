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
    System.out.println("1. "+anggota1.getFriend(0).getNamaAkun());
    System.out.println("2. "+anggota1.getFriend(1).getNamaAkun());
    System.out.println("3. "+anggota1.getFriend(2).getNamaAkun());
    System.out.println("4. "+anggota1.getFriend(3).getNamaAkun());
    System.out.println("5. "+anggota1.getFriend(4).getNamaAkun());
    
    }
    
}
