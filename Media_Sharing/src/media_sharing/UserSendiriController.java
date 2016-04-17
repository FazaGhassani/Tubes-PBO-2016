
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class UserSendiriController extends MouseAdapter implements ActionListener{
    private Console model;
    private HalamanUserSendiri view;
    
    public UserSendiriController(Console model, HalamanUserSendiri view){
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.MouseListener(this);
        this.view.setVisible(true);
        this.view.getjLabel3().setText(model.UserAkun.getNamaAkun());
        this.view.getjComboBox1().setSelectedIndex(0);
        if(model.UserAkun.getFoto() == null && model.UserAkun.getVideo() == null){
            this.view.getViewFotoUserField().setText("Tidak memiliki foto/video");
        }else if(model.UserAkun.getFoto() == null && model.UserAkun.getVideo() != null){
            this.view.getViewFotoUserField().setText(model.ViewVideo());
        }else if (model.UserAkun.getFoto() != null && model.UserAkun.getVideo() == null){
            this.view.getViewFotoUserField().setText(model.ViewFoto());
        }
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
        }else if(source.equals(view.getOkButton1())){
            if (view.getCariFotoField().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Masukan Indeks");
            }else{
                int indeks = Integer.parseInt(view.getCariFotoField().getText());
                if(view.getjComboBox1().getSelectedIndex() == 0){
                    ViewFoto VF = new ViewFoto();
                    VF.setController(new ViewFotoController(model, new ViewFoto(), model.UserAkun.getFoto().get(indeks-1)));
                    view.setVisible(false);
                    view.dispose();
                }else if(view.getjComboBox1().getSelectedIndex() == 1){
                    ViewVideo VV = new ViewVideo();
                    VV.setController(new ViewVideoController(model, new ViewVideo(), model.UserAkun.getVideo().get(indeks-1)));
                    view.setVisible(false);
                    view.dispose();               
                }
            }
        }
    }
}
