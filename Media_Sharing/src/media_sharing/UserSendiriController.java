
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UserSendiriController implements ActionListener{
    private Console model;
    private HalamanUserSendiri view;
    
    public UserSendiriController(Console model, HalamanUserSendiri view){
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getLogoutButton())){
            MenuAwal MA = new MenuAwal();
            MA.setController(new MenuAwalController(model));
            view.setVisible(false);
            view.dispose();
        }else if(source.equals(view.getOkButton())){
            String cari = view.getSearchLabel().getText();
            if(view.getSearchLabel().getText() != ""){
                HalamanSearch HS = new HalamanSearch();
                HS.setController(new SearchController(model, new HalamanSearch(), cari));
                view.setVisible(false);
                view.dispose();
            }else{view.getSearchLabel().setText("masukan username");}
        }
    }
}
