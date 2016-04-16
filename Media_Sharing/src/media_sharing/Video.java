/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.io.File;

/**
 *
 * @author User
 */
public class Video extends Media{
    
    public Video (String nama, File f){
        super(nama,f);
    }
    
    public Video(String nama){
        super(nama);
    }
    
    public Video(){
    }
    
    public String toString(){
        String video = "Nama video  : "+getNama();
        return video;
    }
    
}