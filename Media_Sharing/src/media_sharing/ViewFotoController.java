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
public class ViewFotoController extends MouseAdapter implements ActionListener{
    private Console model;
    private ViewFoto view;
    private Foto foto; //foto yang dipanggil di userakun disamakan disini

    public ViewFotoController(Console model, ViewFoto view, Foto foto) {
        this.model = model;
        this.view = view;
        this.foto = foto;
        this.view.setController(this);
        this.view.setVisible(true);
        this.view.MouseListener(this);
        this.view.getjLabel2().setText(foto.getNama());
        this.view.getViewFotoUserField().setText(foto.toString());
    }

    @Override
    public void mouseClicked(MouseEvent e){
        Object source = e.getSource();
        if (source.equals(view.getViphoLabel())){
           HalamanUserSendiri HUS = new HalamanUserSendiri();
           HUS.setController(new UserSendiriController(model, new HalamanUserSendiri()));
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
        }else if(source.equals(view.getOkButton())){
            String cari = view.getSearchLabel().getText();
            
            if(!"".equals(cari)){
                HalamanSearch HS = new HalamanSearch();
                HS.setController(new SearchController(model, new HalamanSearch(), cari));
                view.setVisible(false);
                view.dispose();
            }else{view.getSearchLabel().setText("Masukan Username");}
        }else if(source.equals(view.getVButton())){
            HalamanUploadVideo HUV = new HalamanUploadVideo();
            HUV.setController(new HalamanUploadVideoController(model,new HalamanUploadVideo()));
            view.setVisible(false);
            view.dispose();
        }else if (source.equals(view.getFButton())){
            HalamanUploadFoto HUF = new HalamanUploadFoto();
            HUF.setController(new HalamanUploadFotoController(model,new HalamanUploadFoto()));
            view.setVisible(false);
            view.dispose();
        } else if (source.equals(view.getDeleteFotoButton())){
            model.UserAkun.removeMediaFoto(foto);
            JOptionPane.showMessageDialog(view, "Foto telah dihapus");
            
            HalamanUserSendiri HUS = new HalamanUserSendiri();
            HUS.setController(new UserSendiriController(model, new HalamanUserSendiri()));
            view.setVisible(false);
            view.dispose();
        } else if (source.equals(view.getTagPersonButton())){
            model.UserAkun.getFoto().get(model.UserAkun.searchFototoIndex(foto)).removeAllTagged();
            JOptionPane.showMessageDialog(view, "Semua tag telah dihapus");
        }
    }
}
