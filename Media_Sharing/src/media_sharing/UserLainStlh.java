/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class UserLainStlh implements ActionListener{
    private Console model;
    private HalamanUserStlhFollow view;

    public UserLainStlh(Console model, HalamanUserStlhFollow view) {
        this.model = model;
        this.view = view;
        view.setController(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
