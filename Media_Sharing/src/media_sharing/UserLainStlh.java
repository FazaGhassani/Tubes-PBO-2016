/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author User
 */
public class UserLainStlh extends MouseAdapter implements ActionListener{
    private Console model;
    private HalamanUserStlhFollow view;
    private String status;

    public UserLainStlh(Console model, HalamanUserStlhFollow view) {
        this.model = model;
        this.view = view;
        view.setController(this);
        view.setVisible(true);
        view.MouseListener(this);
        view.getjLabel2().setText(model.UserAkun.getNamaAkun());
        if(status.equals("follow")){
            view.getUnfollowButton().setText("Follow");
        }else if(status.equals("unfollow")){
            view.getUnfollowButton().setText("Unfollow");
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
        }else if(source.equals(view.getUnfollowButton())){
            if(status == "follow"){
                model.UserAkun.followFriend(model.UserLain);
                status = "unfollow";
                view.getUnfollowButton().setText("unfollow");
            }else if(status == "unfollow"){
                model.UserAkun.removeFriends(model.UserLain);
                status = "follow";
                view.getUnfollowButton().setText("follow");
            }
        } 
    }
    
    
}
