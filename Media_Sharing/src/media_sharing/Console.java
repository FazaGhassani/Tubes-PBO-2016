package media_sharing;

import java.io.*;
import java.util.Scanner;

public class Console {
    Akun userakun;
    Akun[] daftarAkun = new Akun[5];
    private int jmlhAkun=0;
    char i, t;
    
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
        for(int k = 0; k<jmlhAkun;k++){
            if(daftarAkun[k].getNamaAkun().equals(namaakun)){
                return k;
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
    
    
    //add akun by sign up
    public void MenuAddAkun(){
        String namauser;
        String passworduser;
        
        try{
            System.out.println("Masukan username baru: ");
            InputStreamReader usr = new InputStreamReader(System.in);
            BufferedReader usrn = new BufferedReader(usr);
            namauser = usrn.readLine();
            
            System.out.println("Masukan Password baru: ");
            InputStreamReader psw = new InputStreamReader(System.in);
            BufferedReader pswr = new BufferedReader(psw);
            passworduser = pswr.readLine();
            
            Akun baru = new Akun(namauser, passworduser);
            baru.createFoto(); baru.createVideo();
            addAkun(baru);
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    } 
//
    
 // login
    public void MenuLogin(){
        String namauser;
        String passworduser;
        int indeks = 0;
        
        try{
            System.out.println("Masukan username yang ada: ");
            InputStreamReader usr = new InputStreamReader(System.in);
            BufferedReader usrn = new BufferedReader(usr);
            namauser = usrn.readLine();
            
            System.out.println("Masukan Password: ");
            InputStreamReader psw = new InputStreamReader(System.in);
            BufferedReader pswr = new BufferedReader(psw);
            passworduser = pswr.readLine();
            
            indeks = searchAkun2(namauser);
            System.out.println(indeks);
            if(indeks != -1){
                userakun = daftarAkun[indeks];
                System.out.println("anda sudah login");
                i = 'y';
            }else{System.out.println("Nama akun belum terdaftar");}
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
//
    
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
//
    
//menu nge follow friends
    public void FollowFriend(Akun userakun, Akun fAkun){
        userakun.followFriend(fAkun);
    }
//

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
//

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
//
    
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
            
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
//
    
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
//

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
//
    
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
//
    
//tag person foto
    public void tagPersonFoto(Akun userakun, String namafoto){
        Akun cari;
        cari = SearchAkunOrg();
        
        if(userakun.searchFoto(namafoto) != -1 && cari != null){
            userakun.getFoto(userakun.searchFoto(namafoto)).tagPerson(userakun,cari);
        }
        
    }
//
    
//tag person video
    public void tagPersonVideo(Akun userakun, String namavideo){
        Akun cari;
        cari = SearchAkunOrg();
        
        if(userakun.searchVideo(namavideo) != -1 && cari != null){
            userakun.getVideo(userakun.searchVideo(namavideo)).tagPerson(userakun,cari);
        }
    }
//
    
//remove tag person foto
    public void RemovePersonTagFoto(Akun userakun, String namafoto){
        Akun cari;
        cari = SearchAkunOrg();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama foto: ");
        String foto = input.next();
        
        if(userakun.searchFoto(namafoto) != -1 && cari != null){
            userakun.getFoto(userakun.searchFoto(namafoto)).removePersonTag(cari);
        }
    }
//
    
//remove tag person video
    public void RemovePersonTagVideo(Akun userakun, String namavideo){
        Akun cari;
        cari = SearchAkunOrg();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama video: ");
        String video = input.next();
        
        if(userakun.searchVideo(namavideo) != -1 && cari != null){
            userakun.getVideo(userakun.searchVideo(namavideo)).removePersonTag(cari);
        }
    }
//
    
//view video foto dan teman
    public void viewFoto(){
        System.out.println("Foto yang dimiliki: "+userakun.getNamaAkun());
        for(int j=0; j<userakun.getjmlhFoto();j++){
            System.out.println((j+1)+". "+userakun.getFoto(j).getNama());
        }
    }
    
    public void viewVideo(){
        System.out.println("Video yang dimiliki: "+userakun.getNamaAkun());
        for(int j=0; j<userakun.getjmlhVideo();j++){
            System.out.println((j+1)+". "+userakun.getVideo(j).getNama());
        }
    }
//
    
//menu utama

    public void MenuUtama(){ 
        i = 'n';
        while(i == 'n') {
            String menulogin = toString1();
        
            System.out.println(menulogin);
        
            Scanner input = new Scanner(System.in);
            int pilihan;
            pilihan = input.nextInt();
            if (pilihan == 1) {
                MenuLogin();
            } else if (pilihan == 2) {
                MenuAddAkun();
            } 
        }
        
        t = 'n';
        while (t == 'n'){
            String menu = toString2();
            String namafoto, namavideo;
            System.out.println(menu);
            
            Scanner input = new Scanner(System.in);
            int pil;
            pil = input.nextInt();
            if (pil == 1){
                if(userakun.getjmlhFoto()<=3){
                    System.out.println("Masukan nama foto: ");
                    namafoto = input.next();
                    Foto fotobaru = new Foto(namafoto);
                    userakun.addFoto(fotobaru);
                    System.out.println("foto sudah dimasukan");
                }
         
            } else if (pil == 2){
                if(userakun.getjmlhFoto()<=3){
                    System.out.println("Masukan nama Video: ");
                    namavideo = input.next();
                    Video videobaru = new Video(namavideo);
                    userakun.addVideo(videobaru);
                    System.out.println("video sudah dimasukan");
                }
                
            } else if (pil == 3){
                System.out.println("2");
                
            } else if (pil == 4){
                System.out.println(userakun.toString());
                viewFoto();
                viewVideo();
                
            } else if (pil == 5){
                daftarAkun[searchAkun2(userakun.getNamaAkun())] = userakun;
                t = 'y';
    
            }
            
        }
    }
    
    public String toString1(){
        String x = " 1. Login "+
                   " \n 2. Signup "+
                   " \n Masukan Pilihan: ";
        return x;
    }
    
    public String toString2(){
        String y = " 1. Add Foto "+
                   " \n 2. Add Video "+
                   " \n 3. Cari teman "+
                   " \n 4. lihat profil "+
                   " \n 5. Log out dan exit program"+
                   " \n Masukkan pilihan: ";
        return y;
    }
}

