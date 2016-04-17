package media_sharing;

import java.io.File;

public class Foto extends Media{
    private double size;
    
    public Foto(String nama, File f) {
        super(nama, f);
    }
    
    public Foto(){
    
    }
    
    public Foto(String nama){
        super(nama);
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
    
    public String toString(){
        String foto = "Nama foto    : "+getNama()
                + "\n ";
        return foto;
    }
}
