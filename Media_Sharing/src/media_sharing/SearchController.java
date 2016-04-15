
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
    
    public SearchController(Console model, HalamanSearch view, String namadiCari){
        this.model = model;
        this.view = view;
        this.view.setController(this);
        view.MouseListener(this);
        this.view.setVisible(true);
        this.namadiCari = namadiCari;
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
            view.setVisible(false);
            view.dispose();
        }else if(source.equals(view.getOkButton())){
            if(view.getSearchLabel().getText() .equals("")){
                view.getKlikokLabel().setText("");
                view.getSearchLabel().setText(namadiCari);
                Akun k;
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
                //kalau udah di follow
                HalamanUserStlhFollow HUSF = new HalamanUserStlhFollow();
                HUSF.setController(new UserLainStlh(model, new HalamanUserStlhFollow()));
                view.setVisible(false);
                view.dispose();
                //kalau belum di follow
                HalamanUserLainSblmFollow HULSBF = new HalamanUserLainSblmFollow();
                HULSBF.setController(new UserLainSblm(model, new HalamanUserLainSblmFollow()));
                view.setVisible(false);
                view.dispose();
            }
        }
    }
}
