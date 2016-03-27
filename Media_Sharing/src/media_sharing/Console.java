package media_sharing;


import java.io.*;
import java.util.Scanner;

public class Console {
    Akun[] daftarAkun = new Akun[5];
    private int jmlhAkun=0;
    
    public void addAkun(Akun Akunbaru){
        if(jmlhAkun < 5){
            daftarAkun[jmlhAkun] = Akunbaru;
            jmlhAkun++;
        }else{System.out.println("Akun sudah penuh");}   
    }
    
    public Akun getAkun(int ID){
        return daftarAkun[ID];
    }
    
    public Akun searchAkun(int i){
        if(i < jmlhAkun){
            return daftarAkun[i];
        }
        return null;
    }
    
    public int searchAkun2(String namaakun){
        for(int i = 0; i<5;i++){
            if(daftarAkun[i].getNamaAkun() == namaakun){
                return i;
            }
        }
        return -1;
    }
    
    public void deleteAkun(int ID){
        int k = 0;
        if(ID < jmlhAkun){
            for(int j = ID;j<daftarAkun.length -1;j++){
                daftarAkun[j] = daftarAkun[j+1];
                k = j+1;
            }
            daftarAkun[k] = new Akun();
            jmlhAkun--;
        }else{
            daftarAkun[ID] = new Akun();
            jmlhAkun--;
        }
    }
    
    
    //adda akun
    public void MenuAddAkun(){
        String namauser;
        String passworduser;
        
        try{
            System.out.println("Masukan username: ");
            InputStreamReader usr = new InputStreamReader(System.in);
            BufferedReader usrn = new BufferedReader(usr);
            namauser = usrn.readLine();
            
            System.out.println("Masukan Password: ");
            InputStreamReader psw = new InputStreamReader(System.in);
            BufferedReader pswr = new BufferedReader(psw);
            passworduser = pswr.readLine();
            
            Akun baru = new Akun(namauser, passworduser);
            addAkun(baru);
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }  
    
//menu delete
    public void MenuDeleteAkun(){
        String nama;
        String pass;
        try{
            System.out.println("Masukan username yang akan dihapus: ");
            InputStreamReader usrn = new InputStreamReader(System.in);
            BufferedReader usrna = new BufferedReader(usrn);
            nama = usrna.readLine();

            if (searchAkun2(nama) != -1) {
                System.out.println("Masukan Password: ");
                InputStreamReader pswr = new InputStreamReader(System.in);
                BufferedReader pswrd = new BufferedReader(pswr);
                pass = pswrd.readLine();

                if (daftarAkun[searchAkun2(nama)].getPassword() == pass) {
                    deleteAkun(searchAkun2(nama));
                }else{
                    System.out.println("Password tidak sesuai dengan username");
                }
            }else{System.out.println("tidak ada username akun tsb");}
            
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
    
//menu nge follow friends
    public void FollowFriend(Akun userakun, Akun fAkun){
        userakun.followFriend(fAkun);
    }

//public search 
    public Akun SearchAkunOrg(){
        String nama;
        
        try{
            System.out.println("Masukan username yang akan dicari: ");
            InputStreamReader usrn = new InputStreamReader(System.in);
            BufferedReader usrna = new BufferedReader(usrn);
            nama = usrna.readLine();
            
            if(searchAkun2(nama) != -1){
                return daftarAkun[searchAkun2(nama)];
            }
            
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
        
        return null;
    }

//menu remove friend
    public void RemoveFriend(Akun userakun){
        Akun fdelete = SearchAkunOrg();
        if(fdelete != null){
            System.out.println("anda yakin akan menghapus "+fdelete.getNamaAkun()+"?");
            System.out.println("1. yes / 2. no");
            Scanner input = new Scanner(System.in);
            int pil = input.nextInt();
            switch (pil){
                case 'y': userakun.removeFriend(SearchAkunOrg());
                case 'n': System.out.println("Tidak jadi mneghapus");
            }
        }
    }
    
//menu add foto
    public void addPhoto(Akun userakun){
        String namafoto;
        try{
            System.out.println("Masukan nama foto: ");
            InputStreamReader namaf = new InputStreamReader(System.in);
            BufferedReader namafo = new BufferedReader(namaf);
            namafoto = namafo.readLine();
            
            Foto newfoto = new Foto(namafoto);
            userakun.addFoto(newfoto);
            
            System.out.println("tag photo");
            
            
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
    
//menu add video
    public void addVideo(Akun userakun){
        String namaVideo;
        try{
            System.out.println("Masukan nama video: ");
            InputStreamReader namav = new InputStreamReader(System.in);
            BufferedReader namavi = new BufferedReader(namav);
            namaVideo = namavi.readLine();
            
            Video newvideo = new Video(namaVideo);
            userakun.addVideo(newvideo);
            
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }

//remove media foto
    public void removeFoto(Akun userakun){
        String namafoto;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama foto: ");
        namafoto = input.next();
        
        if(userakun.searchFoto(namafoto) != -1){
            userakun.removeMediaFoto(userakun.searchFoto(namafoto));
        }else{System.out.println("Foto tidak ditemukan");}
    }
    
//remove media video
    public void removeVideo(Akun userakun){
        String namavideo;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama video: ");
        namavideo = input.next();
        
        if(userakun.searchFoto(namavideo) != -1){
            userakun.removeMediaFoto(userakun.searchFoto(namavideo));
        }else{System.out.println("Video tidak ditemukan");}
    }
    
//tag person
    public void tagPersonFoto(Akun userakun, Akun cari, String namafoto){
        Akun nama;
        nama = SearchAkunOrg();
        if (nama == cari){
            nama.getFoto(jmlhAkun)
        }
    }
}

