/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import pk.codeapp.model.Group;
import pk.codeapp.model.Team;
import pk.codeapp.view.EditGroup;

/**
 *
 * @author Daniel Amador
 */
public class EditGroupController implements ActionListener {
    private Group editing;
    private ArrayList<Team> copy;
    private EditGroup window;
    public EditGroupController(Group group,EditGroup window) {
      this.editing=group;
      copy= editing.getTeams();
      this.window=window;
      changeData();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==window.btnBack){
           window.jumpBeforeWindow();
       }
    }

    private void changeData() {
     window.lblA1.setIcon(copy.get(0).getImageTeam());
     window.nameA1.setText(copy.get(0).getName());
     
     window.lblA2.setIcon(copy.get(1).getImageTeam());
     window.nameA2.setText(copy.get(1).getName());
     
     window.lblA3.setIcon(copy.get(2).getImageTeam());
     window.nameA3.setText(copy.get(2).getName());
     
     window.lblA4.setIcon(copy.get(3).getImageTeam());
     window.nameA4.setText(copy.get(3).getName());
     
    }
    
}
