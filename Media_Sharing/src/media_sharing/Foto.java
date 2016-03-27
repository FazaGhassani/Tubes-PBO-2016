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
}
