
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class SearchController extends MouseAdapter implements ActionListener{
    private Console model;
    private HalamanSearch view;
    private String namadiCari;
    private String status;
    Akun k;
    
    public SearchController(Console model, HalamanSearch view, String namadiCari){
        this.model = model;
        this.view = view;
        this.view.setController(this);
        view.MouseListener(this);
        this.view.setVisible(true);
        this.namadiCari = namadiCari;
    }
    
     public SearchController(Console model, HalamanSearch view){
        this.model = model;
        this.view = view;
        this.view.setController(this);
        view.MouseListener(this);
        this.view.setVisible(true);
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
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if (source.equals(view.getLogoutButton())){
            MenuAwal MA = new MenuAwal();
            MA.setController(new MenuAwalController(model));
            model.getDaftarAkun().add(model.UserAkun);
            view.setVisible(false);
            view.dispose();
        }else if(source.equals(view.getOkButton())){
            if(view.getSearchLabel().getText() .equals("")){
                view.getKlikokLabel().setText("");
                view.getSearchLabel().setText(namadiCari);
                if(model.searchAkun(namadiCari) != null){
                    k = model.searchAkun(namadiCari);
                    view.getAkunButton().setText(k.getNamaAkun());
                }else if(model.searchAkun(namadiCari) == null){
                    JOptionPane.showMessageDialog(view, "User Tidak ditemukan");
                }                
            }else{
                String cari = view.getSearchLabel().getText();
            
                if(!"".equals(cari)){
                    HalamanSearch HS = new HalamanSearch();
                    HS.setController(new SearchController(model, new HalamanSearch(), cari));
                    view.setVisible(false);
                    view.dispose();
                }else{view.getSearchLabel().setText("Masukan Username");}
            }            
        }else if(source.equals(view.getAkunButton())){
            if(view.getAkunButton().getText().equals("")){
                JOptionPane.showMessageDialog(view, "klik ok, atau ketikan username terlebih dahulu");
            }else{
                if(model.UserAkun.searchFriends(k) == null){
                    status = "follow";
                }else if(model.UserAkun.searchFriends(k) != null){
                    status = "unfollow";
                }
                model.UserLain = k;
                
                HalamanUserLainSblmFollow HULSBF = new HalamanUserLainSblmFollow();
                HULSBF.setController(new UserLainSblm(model, new HalamanUserLainSblmFollow(), status));
                view.setVisible(false);
                view.dispose();
            }
        }
    }
}
