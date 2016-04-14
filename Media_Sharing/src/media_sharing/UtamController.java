
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class UtamController implements ActionListener{
    
    private Console model;
    private HalamanUtama view;
    
    public UtamController(Console model, HalamanUtama view){
        this.model = model;
        this.view=view;
        this.view.setController(this);
        this.view.setVisible(true);
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
            String cari = view.getSearchLabel().getText();
            
            if(!"".equals(cari)){
                HalamanSearch HS = new HalamanSearch();
                HS.setController(new SearchController(model, new HalamanSearch(), cari));
                view.setVisible(false);
                view.dispose();
            }else{view.getSearchLabel().setText("masukan username");}
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
