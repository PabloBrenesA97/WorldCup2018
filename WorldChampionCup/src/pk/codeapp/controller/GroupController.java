/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk.codeapp.view.GroupScreen;

/**
 *
 * @author Daniel Amador
 */
public class GroupController implements ActionListener{
    private GroupScreen window;
    
    public GroupController(GroupScreen aThis) {
        window=aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==window.btnBack){
            //call back method
            window.jumpBeforeWindow();
        }
        else if(e.getSource()==window.btnEditA){
            //call eedit A
        }
        else if(e.getSource()==window.btnEditB){
            //call eedit B
        }
        else if(e.getSource()==window.btnEditC){
            //call eedit C
        }else if(e.getSource()==window.btnEditD){
            //call eedit D
        }
        else if(e.getSource()==window.btnEditE){
            //call eedit E
        }
        else if(e.getSource()==window.btnEditF){
            //call eedit F
        }
        else if(e.getSource()==window.btnEditG){
            //call eedit G
        }
        else if(e.getSource()==window.btnEditH){
            //call eedit H
        }
        
        
        
    }
    
}
