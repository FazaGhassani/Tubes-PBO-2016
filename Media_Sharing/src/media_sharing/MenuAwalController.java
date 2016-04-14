package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenuAwalController implements ActionListener{
    private MenuAwal view;
    private Console model;

    public MenuAwalController(){
        view = new MenuAwal();
        view.setController(this);
        view.setVisible(true);
        this.model = new Console();
    }
    
    public MenuAwalController(Console model){
        view = new MenuAwal();
        this.model = model;
        view.setController(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source.equals(view.getSignInButton())){
            LogIn c = new LogIn();
            c.setController(new LoginController(model, new LogIn()));
            view.setVisible(false);
            view.dispose();
        }else if (source.equals(view.getSignUpButton())){
            SignUp s = new SignUp();
            s.setController(new SignUpController(model, new SignUp()));
            view.setVisible(false);
            view.dispose();
        }else if (source.equals(view.getDeleteButton())){
            DeleteAkun d = new DeleteAkun();
            d.setController(new DeleteAkunController(model, new DeleteAkun()));
            view.setVisible(false);
            view.dispose();
        }
    }
    
}
