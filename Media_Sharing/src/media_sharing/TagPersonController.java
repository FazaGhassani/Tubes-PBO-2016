/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TagPersonController extends MouseAdapter implements ActionListener{
    private Console model;
    private HalamanSearch view;
    private String stats;

    public TagPersonController(Console model, HalamanSearch view, String stats) {
        this.model = model;
        this.view = view;
        this.stats=stats;
        view.setControllers(this);
        view.setVisible(true);
        view.MouseListener(this);
    }

     @Override
    public void mouseClicked(MouseEvent e){
        Object source = e.getSource();
        if (source.equals(view.getViphoLabel())){
           HalamanUtama HU = new HalamanUtama();
           HU.setController(new UtamController(model, new HalamanUtama()));
           view.setVisible(false);
           view.dispose();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getLogoutButton())){
            MenuAwal MA = new MenuAwal();
            MA.setController(new MenuAwalController(model));
            model.getDaftarAkun().add(model.UserAkun);
            view.setVisible(false);
            view.dispose();
        }
        else if(source.equals(view.getVButton())){
            HalamanUploadVideo HUV = new HalamanUploadVideo();
            HUV.setController(new HalamanUploadVideoController(model,new HalamanUploadVideo()));
            view.setVisible(false);
            view.dispose();
        }else if (source.equals(view.getFButton())){
            HalamanUploadFoto HUF = new HalamanUploadFoto();
            HUF.setController(new HalamanUploadFotoController(model,new HalamanUploadFoto()));
            view.setVisible(false);
            view.dispose();
        }else if(source.equals(view.getOkButton())){
            view.getKlikokLabel().setText("Ketikan Username dan klik ok");
            if(view.getSearchLabel().getText().equals("")){
                view.getSearchLabel().setText("Ketikan Username");
            }else{
                String cari = view.getSearchLabel().getText();
                if(model.UserAkun.friendSearch(cari) != null){
                    view.getAkunButton().setText(model.UserAkun.friendSearch(cari).getNamaAkun());
                }
            }
        }else if(source.equals(view.getAkunButton())){
            if(view.getAkunButton().getText().equals("")){
                JOptionPane.showMessageDialog(view, "silahkan search dahulu");
            }else{
                if("foto".equals(stats)){
                    String cari = view.getSearchLabel().getText();
                    Akun k = model.UserAkun.friendSearch(cari);
                    view.getKlikokLabel().setText("");
                    if (model.UserAkun.friendSearch(cari) != null){
                        model.Baru.tagPerson(k);
                        JOptionPane.showMessageDialog(view, "Berhasil di tag");
                        HalamanUploadFoto HUF = new HalamanUploadFoto();
                        HUF.setController(new HalamanUploadFotoController(model,new HalamanUploadFoto()));
                        view.setVisible(false);
                        view.dispose();
                        
                    } else{
                        JOptionPane.showMessageDialog(view, "Anda Belum berteman dengan "+ cari);
                    }                
                }else if("video".equals(stats)){
                    String cari = view.getSearchLabel().getText();
                    Akun k = model.UserAkun.friendSearch(cari);
                    view.getKlikokLabel().setText("");
                    if (model.UserAkun.friendSearch(cari) != null){
                        model.Baru.tagPerson(k);
                        JOptionPane.showMessageDialog(view, "Berhasil di tag");
                        HalamanUploadVideo HUV = new HalamanUploadVideo();
                        HUV.setController(new HalamanUploadVideoController(model,new HalamanUploadVideo()));
                        view.setVisible(false);
                        view.dispose();
                    } else{
                        JOptionPane.showMessageDialog(view, "Anda Belum berteman dengan "+ cari);
                    } 
                }
            }
        }
    }
}
