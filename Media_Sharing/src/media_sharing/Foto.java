package media_sharing;

public class Foto extends Media{
    private double size;
    
    public Foto(double size, String nama) {
        super(nama);
        this.size = size;
    }
    
    public Foto(String nama){
        super(nama);
    }
    
    public Foto(){
        super();
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
    
    public String toString(){
        String foto = "Nama foto    : "+getNama()+
                      "Ukuran foto  : "+getSize()+
                      "Teman        : "+getTagged(0).getNamaAkun()+", "+getTagged(1).getNamaAkun()
                                       +", "+getTagged(2).getNamaAkun()+", "+getTagged(3).getNamaAkun()
                                       +", "+getTagged(4).getNamaAkun()+", "+getTagged(5).getNamaAkun();
        return foto;
    }
}
