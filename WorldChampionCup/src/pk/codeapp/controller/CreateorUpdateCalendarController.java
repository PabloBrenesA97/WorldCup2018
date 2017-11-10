/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import pk.codeapp.view.CreateorUpdateCalendar;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateorUpdateCalendarController implements ActionListener{
    
    private CreateorUpdateCalendar windowAux;

    public CreateorUpdateCalendarController(CreateorUpdateCalendar window) {
        this.windowAux = window;
        fillData();
    }
    
    /**
     * Fill Information in Cmb
     */
    public void fillData(){
        DefaultComboBoxModel<String> listTeams = new DefaultComboBoxModel();
        /* Teams*/
        for (int i = 0; i < Lobby.controller.getTeams().size(); i++) {
            listTeams.addElement(Lobby.controller.getTeams().get(i).getName());
        }
        windowAux.getCmbTeam1().setModel(listTeams);
        windowAux.getCmbTeam2().setModel(listTeams);
        
        /*Stadiums*/
        DefaultComboBoxModel<String> listStaddiums = new DefaultComboBoxModel();
        for (int i = 0; i < Lobby.controller.getArrayStadiums().size(); i++) {
            listStaddiums.addElement(Lobby.controller.getArrayStadiums().get(i).getName());
        }
        windowAux.getCmbStadiums().setModel(listTeams);
    }
    /**
     * Block the selected Team
     * @param cmbAux
     * @param name
     */
    public void blockTeamSelected(JComboBox cmbAux,String name){
        DefaultComboBoxModel<String> listTeams = new DefaultComboBoxModel();
        for (int i = 0; i < Lobby.controller.getTeams().size(); i++) {
            if(!Lobby.controller.getTeams().get(i).getName().equals(name)){
                listTeams.addElement(Lobby.controller.getTeams().get(i).getName());
            }
        }
        cmbAux.setModel(listTeams);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==windowAux.getBtnBack()){
            windowAux.jumpBeforeWindow();}
        if(e.getSource()==windowAux.getBtnAdd()){
            
        }
        if(e.getSource()==windowAux.getCmbTeam1()){
            JComboBox cmbAux = (JComboBox)e.getSource();
            String txtTeam = (String)cmbAux.getSelectedItem();
            blockTeamSelected(windowAux.getCmbTeam2(), txtTeam);
        }
          if(e.getSource()==windowAux.getCmbTeam2()){
            JComboBox cmbAux = (JComboBox)e.getSource();
            String txtTeam = (String)cmbAux.getSelectedItem();
            blockTeamSelected(windowAux.getCmbTeam1(), txtTeam);
        }
    }
    
}
