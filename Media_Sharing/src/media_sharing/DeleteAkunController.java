/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DeleteAkunController implements ActionListener {
    
    private Console model;
    private DeleteAkun view;

    public DeleteAkunController(Console model, DeleteAkun view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String nama = view.getUsernameText().getText();
        String pass = view.getPasswordText().getText();
        Object source = e.getSource();
        
        if (source.equals(view.getBackButton())){
            MenuAwal MA = new MenuAwal();
            MA.setController(new MenuAwalController(model));
            view.setVisible(false);
            view.dispose();
        }else if(source.equals(view.getDeleteButton())){
            if (view.getPasswordText().getText().equals("") || view.getUsernameText().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Masukan Username dan Password");
            } else {
                Akun n = new Akun(nama, pass);
                Akun ne = null;
                for(Akun cari : model.getDaftarAkun()){
                    if(cari.getNamaAkun().equals(n.getNamaAkun())&& cari.getPassword().equals(n.getPassword())){
                        ne = n;
                        model.getDaftarAkun().remove(ne);
                        JOptionPane.showMessageDialog(view, "Delete sukses");
                    }
                }
                if(ne == null){
                    JOptionPane.showMessageDialog(view, "username tidak terdaftar");
                }
                    
            }
        }
    }
}
