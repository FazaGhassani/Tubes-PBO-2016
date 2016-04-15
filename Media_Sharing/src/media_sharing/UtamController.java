
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class UtamController extends MouseAdapter implements ActionListener{
    
    private Console model;
    private HalamanUtama view;
    
    public UtamController(Console model, HalamanUtama view){
        this.model = model;
        this.view=view;
        this.view.setController(this);
        view.MouseListener(this);
        this.view.setVisible(true);
        view.getjLabel1().setText(model.UserAkun.getNamaAkun());
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        Object source = e.getSource();
        if (source.equals(view.getProfilLabel())){
           HalamanUserSendiri HUS = new HalamanUserSendiri();
           HUS.setController(new UserSendiriController(model, new HalamanUserSendiri()));
           view.setVisible(false);
           view.dispose();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
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
        } 
    }
    
}

//frame.addWindowListener(new java.awt.event.WindowAdapter() {
//    @Override
//    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
//        if (JOptionPane.showConfirmDialog(frame, 
//            "Are you sure to close this window?", "Really Closing?", 
//            JOptionPane.YES_NO_OPTION,
//            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
//            System.exit(0);
//        }
//    }
//});
