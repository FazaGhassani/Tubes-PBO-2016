/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

/**
 *
 * @author User
 */
public class Foto extends Media{
    private double size;
    
    public Foto(double size, String nama) {
        super(nama);
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
