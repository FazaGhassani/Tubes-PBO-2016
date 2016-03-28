package media_sharing;
import java.io.*;
import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
        Console cons = new Console();
        
        //asumsi akun lain sudah ada
        Akun k1 = new Akun("AnggieC","hai");
        k1.createFoto(); k1.createVideo();
        Akun k2 = new Akun("Dan","Memelord");
        k2.createFoto(); k2.createVideo();
        Akun k3 = new Akun("Mamat","halo");
        k3.createFoto(); k3.createVideo();
        Akun k4 = new Akun("Riki","cupu");
        k4.createFoto(); k4.createVideo();

        cons.addAkun(k1);
        cons.addAkun(k2);
        cons.addAkun(k3);
        cons.addAkun(k4);
        // asumsi akun lain sudah ada
        
        
        cons.MenuUtama();
    }  
}
