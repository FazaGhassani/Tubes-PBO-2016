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
public class HalamanUploadFotoController extends MouseAdapter implements ActionListener{
    private Console model;
    private HalamanUploadFoto view;
    private File f;
    private String stats = "foto";

    public HalamanUploadFotoController(Console model, HalamanUploadFoto view) {
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
            HalamanUploadVideo HUV = new HalamanUploadVideo();
            HUV.setController(new HalamanUploadVideoController(model,new HalamanUploadVideo()));
            view.setVisible(false);
            view.dispose();
        }else if (source.equals(view.getFButton())){
            JOptionPane.showMessageDialog(view, "Silahkan Upload Foto");
        }else if (source.equals(view.getBrowseButton())){
            JFileChooser j = new JFileChooser();
            j.setFileFilter(new FileNameExtensionFilter("jpg", "png"));
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            j.showOpenDialog(view);
            f = j.getSelectedFile();
            
            //tinggal display
        }else if(source.equals(view.getUploadButton())){
            if(view.getNamaFotoText().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Silahkan masukan caption");
            }else{
                model.Baru.setNama(view.getNamaFotoText().getText());
                model.Baru.setDirc(f);
                model.UserAkun.addFoto(model.Baru);
                JOptionPane.showMessageDialog(view, "Foto terupload");
            }  
        }else if (source.equals(view.getTagPersonButton())){
//            if(model.Baru.getDirc()== null){
//                JOptionPane.showMessageDialog(view, "Masukan foto dulu");
//            }else{
                HalamanSearch HS = new HalamanSearch();
                HS.setControllers(new TagPersonController(model, new HalamanSearch(),stats));
                view.setVisible(false);
                view.dispose(); 
//            }
        }
    }
    
    
}
