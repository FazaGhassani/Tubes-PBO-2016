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
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author User
 */
public class HalamanUploadVideoController extends MouseAdapter implements ActionListener{
    private Console model;
    private HalamanUploadVideo view;
    File f;
    private String stats = "video";

    public HalamanUploadVideoController(Console model, HalamanUploadVideo view) {
        this.model = model;
        this.view = view;
        view.setController(this);
        view.MouseListener(this);
        view.setVisible(true);
        view.getjLabel2().setText(model.UserAkun.getNamaAkun());
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
            JOptionPane.showMessageDialog(view, "Silahkan Upload Video");
        }else if (source.equals(view.getFButton())){
            HalamanUploadFoto HUF = new HalamanUploadFoto();
            HUF.setController(new HalamanUploadFotoController(model,new HalamanUploadFoto()));
            view.setVisible(false);
            view.dispose();
        }else if (source.equals(view.getBrowseButton())){
            JFileChooser j = new JFileChooser();
            //j.setFileFilter(new FileNameExtensionFilter("AVI"));
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            j.showOpenDialog(view);
            f = j.getSelectedFile();
            
        }else if(source.equals(view.getUploadButton())){
            if(view.getNamaVideoText().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Silahkan masukan caption");
            }else{
                model.VBaru.setNama(view.getNamaVideoText().getText());
                model.VBaru.setDirc(f);
                model.UserAkun.addVideo(model.VBaru);
                JOptionPane.showMessageDialog(view, "Video terupload");
            }   
        } else if (source.equals(view.getTagPersonButton())){
            HalamanSearch HS = new HalamanSearch();
            HS.setControllers(new TagPersonController(model, new HalamanSearch(),stats));
            view.setVisible(false);
            view.dispose();
            
        } 
    }
    
    
    
}
