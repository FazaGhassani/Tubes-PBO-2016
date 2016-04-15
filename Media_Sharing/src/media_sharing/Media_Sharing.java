package media_sharing;

public class Media_Sharing {

public static void main(String[] args) {
    
//    //pertemanan
//    Akun anggota1 = new Akun("Ganis","mewmewpower");
//    Akun anggota2 = new Akun("Anggie","cantik");
//    Akun anggota3 = new Akun("Riki","rikichan");
//    Akun anggota4 = new Akun("Pewdipie","poods");
//    Akun anggota5 = new Akun("Phil","cinnamonbun");
//    Akun anggota6 = new Akun("Dan","memelord");
//    
//    anggota1.followFriend(anggota2);
//    anggota1.followFriend(anggota3);
//    anggota1.followFriend(anggota4);
//    anggota1.followFriend(anggota5);
//    anggota1.followFriend(anggota6);
//    
//    System.out.println("Teman "+anggota1.getNamaAkun()+":");
//    for(int j=0; j<anggota1.getjmlTeman();j++){
//        System.out.println((j+1)+". "+anggota1.getFriend(j).getNamaAkun());
//    }
//
//    System.out.println("Akun yang dicari: "+anggota1.getFriend(1).getNamaAkun());
//    System.out.println("teman yang dicari ada di index ke : "+anggota1.searchFriends(anggota3));
//    
//    System.out.println("");
//    System.out.println("menghapus dari akun");
//    anggota1.removeFriend(anggota3);
//    System.out.println("teman yang dicari (Riki) ada di index ke : "+anggota1.searchFriends(anggota3));
//    
//    for(int j=0; j<anggota1.getjmlTeman();j++){
//        System.out.println((j+1)+". "+anggota1.getFriend(j).getNamaAkun());
//    }
//    
//    System.out.println("");
//    System.out.println("menghapus dari index: ");
//    anggota1.followFriend(anggota3);
//    anggota1.removeFriend1(1);
//    for(int j=0; j<anggota1.getjmlTeman();j++){
//        System.out.println((j+1)+". "+anggota1.getFriend(j).getNamaAkun());
//    }
//    
//    System.out.println("mencari sesuai index : "+anggota1.searchFriends1(0).getNamaAkun());
//    
//    //foto
//    System.out.println("");
//    Foto f1 = new Foto(20000,"Phandom");
//    Foto f2 = new Foto(20000,"Geto");
//    Foto f3 = new Foto(20000,"okeoke");
//    anggota1.createFoto();
//    anggota1.addFoto(f1);
//    anggota1.addFoto(f2);
//    anggota1.addFoto(f3);
//    
//    System.out.println("Foto yang dimiliki: "+anggota1.getNamaAkun());
//    for(int j=0; j<anggota1.getjmlhFoto();j++){
//        System.out.println((j+1)+". "+anggota1.getFoto(j).getNama());
//    }
//    
//    System.out.println("");
//    System.out.println("Menghapus Foto "+anggota1.getNamaAkun());
//    anggota1.removeMediaFoto(2);
//    System.out.println("Video yang dimiliki: "+anggota1.getNamaAkun());
//    for(int j=0; j<anggota1.getjmlhFoto();j++){
//        System.out.println((j+1)+". "+anggota1.getFoto(j).getNama());
//    }
//    
//    //video
//    System.out.println("");
//    Video v1 = new Video("Phil got pancake flipped");
//    Video v2 = new Video("I meet pewds!");
//    anggota1.createVideo();
//    anggota1.addVideo(v1);
//    anggota1.addVideo(v2);
//
//    System.out.println("Video yang dimiliki: "+anggota1.getNamaAkun());
//    for(int j=0; j<anggota1.getjmlhVideo();j++){
//        System.out.println((j+1)+". "+anggota1.getVideo(j).getNama());
//    }
//    
//    System.out.println("");
//    System.out.println("menghapus video "+anggota1.getNamaAkun());
//    anggota1.removeMediaVideo(0);
//    System.out.println("Video yang dimiliki: "+anggota1.getNamaAkun());
//    for(int j=0; j<anggota1.getjmlhVideo();j++){
//        System.out.println((j+1)+". "+anggota1.getVideo(j).getNama());
//    }
//    
//    //tagged
//    System.out.println("");
//    System.out.println("Menambahkan tag kepada "+anggota1.getNamaAkun());
//    System.out.print("Menambah "+anggota2.getNamaAkun()+" dalam tag. ");
//    anggota1.getFoto(0).tagPerson(anggota1,anggota2);
//    System.out.print("Menambah "+anggota3.getNamaAkun()+" dalam tag. ");
//    anggota1.getFoto(0).tagPerson(anggota1,anggota3); //belum berteman dengan riki
//    System.out.print("Menambah "+anggota4.getNamaAkun()+" dalam tag. ");
//    anggota1.getFoto(0).tagPerson(anggota1,anggota4);
//    System.out.print("Menambah "+anggota5.getNamaAkun()+" dalam tag. ");
//    anggota1.getFoto(0).tagPerson(anggota1,anggota5);
//    
//    System.out.println("");
//    System.out.println("orang yang di tag pada foto: "+anggota1.getFoto(0).getNama());
//    for(int j=0; j<anggota1.getFoto(0).getjmlhOrgdiTag();j++){
//        System.out.println((j+1)+". "+anggota1.getFoto(0).getTagged(j).getNamaAkun());
//    }
//    
//    System.out.println("");
//    System.out.println("Mencari orang di dalam tag: ");
//    System.out.println(anggota2.getNamaAkun()+" ada di index ke "+anggota1.getFoto(0).getPersonTag(anggota2));
//    System.out.println("di index ke 0 dalam tag ada "+anggota1.getFoto(0).getPersonTag1(0).getNamaAkun());
//    
//    System.out.println("");
//    System.out.println("Mengapus "+anggota2.getNamaAkun()+" pada foto "+anggota1.getFoto(0).getNama());
//    anggota1.getFoto(0).removePersonTag(anggota2);
//    for(int j=0; j<anggota1.getFoto(0).getjmlhOrgdiTag();j++){
//        System.out.println((j+1)+". "+anggota1.getFoto(0).getTagged(j).getNamaAkun());
//    }
//    System.out.println("");
//    System.out.print("Menambah "+anggota2.getNamaAkun()+" dalam tag. ");
//    anggota1.getFoto(0).tagPerson(anggota1,anggota2);
//    System.out.println("Mengapus "+anggota4.getNamaAkun()+" pada foto "+anggota1.getFoto(0).getNama());
//    anggota1.getFoto(0).removePersonTag1(0);
//    for(int j=0; j<anggota1.getFoto(0).getjmlhOrgdiTag();j++){
//        System.out.println((j+1)+". "+anggota1.getFoto(0).getTagged(j).getNamaAkun());
//    }
    
  } 
}
