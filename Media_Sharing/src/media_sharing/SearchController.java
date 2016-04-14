
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SearchController implements ActionListener{
    private Console model;
    private HalamanSearch view;
    private String namadiCari;
    
    public SearchController(Console model, HalamanSearch view, String namadiCari){
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setVisible(true);
        this.namadiCari = namadiCari;
    }
    
    public void searchAkun(String namadiCari){
        this.namadiCari = namadiCari;
        Akun k;
        if(model.searchAkun(namadiCari)!= null){
            k = model.searchAkun(namadiCari);
            view.getAkunButton().setText(k.getNamaAkun());
        }else{
            JOptionPane.showMessageDialog(view, "User Tidak ditemukan");
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
            view.getKlikokLabel().setText("");
            Akun k;
            if(model.searchAkun(namadiCari)!= null){
                k = model.searchAkun(namadiCari);
                view.getAkunButton().setText(k.getNamaAkun());
            }else{
                JOptionPane.showMessageDialog(view, "User Tidak ditemukan");
            }            
        }
    }
}
