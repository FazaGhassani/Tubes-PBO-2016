package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SignUpController implements ActionListener {

    private Console model;
    private SignUp view;

    public SignUpController(Console model, SignUp view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String nama = view.getUsernameText().getText();
        String pass = view.getPasswordText().getText();
        
        
        if (source.equals(view.getBackButton())){
            MenuAwal MA = new MenuAwal();
            MA.setController(new MenuAwalController(model));
            view.setVisible(false);
            view.dispose();
        }else if(source.equals(view.getMasukButton())){
            if (view.getPasswordText().getText().equals("") || view.getUsernameText().getText().equals("")){
                JOptionPane.showMessageDialog(null, "SIGN UP GAGAL");
            } else {
                Akun n = new Akun(nama, pass);
                model.addAkun(n);
                JOptionPane.showMessageDialog(view, "SIGN UP SUKSES");
            }
        }
    }
}
