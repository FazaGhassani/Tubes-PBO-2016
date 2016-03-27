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
public class Video extends Media{
    
    public Video (String nama){
        super(nama);
    }
    
    public Video(){
        super();
    }
    
    public String toString(){
        String video = "Nama video  : "+getNama()+
                       "Teman        : "+getTagged(0).getNamaAkun()+", "+getTagged(1).getNamaAkun()
                                       +", "+getTagged(2).getNamaAkun()+", "+getTagged(3).getNamaAkun()
                                       +", "+getTagged(4).getNamaAkun()+", "+getTagged(5).getNamaAkun();
        return video;
    }
    
}