/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import pk.codeapp.model.Calendar;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.model.Team;
import pk.codeapp.view.CreateorUpdateCalendar;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateorUpdateCalendarController implements ActionListener {

    private CreateorUpdateCalendar windowAux;

    public CreateorUpdateCalendarController(CreateorUpdateCalendar window) {
        this.windowAux = window;
        
    }

    /**
     * Fill Information in Cmb
     */
    public void fillData() {
      
        if (windowAux.getFuction().equals("Create")) {
            windowAux.getBtnAdd().setText("Create");
        }
        if (windowAux.getFuction().equals("Update")) {
            windowAux.getCmbTeam1().setVisible(false);
            windowAux.getCmbTeam2().setVisible(false);
            windowAux.getLblTeam1().setText(windowAux.getCalendarScreen().getActualCalendar().getTeam1().getName());
            windowAux.getLblTeam2().setText(windowAux.getCalendarScreen().getActualCalendar().getTeam2().getName());
            windowAux.getLblImg1().setText("");
            windowAux.getLblImg2().setText("");
            windowAux.getLblImg1().setIcon(windowAux.getCalendarScreen().getActualCalendar().getTeam1().getImageTeam());
            windowAux.getLblImg2().setIcon(windowAux.getCalendarScreen().getActualCalendar().getTeam2().getImageTeam());
            windowAux.getBtnAdd().setText("Update");
        }
        DefaultComboBoxModel<String> listTeams = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> listTeams2 = new DefaultComboBoxModel();
        /* Teams*/
        for (int i = 0; i < Lobby.controller.getTeams().size(); i++) {
            listTeams.addElement(Lobby.controller.getTeams().get(i).getName());
            listTeams2.addElement(Lobby.controller.getTeams().get(i).getName());
        }
        
        windowAux.getCmbTeam1().setModel(listTeams);
        windowAux.getCmbTeam1().setForeground(Color.white);
        windowAux.getCmbTeam2().setModel(listTeams2);
        windowAux.getCmbTeam2().setForeground(Color.white);
        /*Stadiums*/
        DefaultComboBoxModel<String> listStadiums = new DefaultComboBoxModel();
        for (int i = 0; i < Lobby.controller.getArrayStadiums().size(); i++) {
            listStadiums.addElement(Lobby.controller.getArrayStadiums().get(i).getName());
        }
        windowAux.getCmbStadiums().setModel(listStadiums);
        windowAux.getCmbStadiums().setForeground(Color.white);
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == windowAux.getBtnBack()) {
            windowAux.jumpBeforeWindow();
        }
        
        if (e.getSource() == windowAux.getBtnAdd()) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("Create")) {
                try {
                    jumpCreateCalendar();
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                }
            } else {
                jumpUpdateCalendar();
            }
        }
    }

    /**
     * Create a new Calendar
     */
    public void jumpCreateCalendar() throws ExceptionWorldCup{
        String txtTeam1 = (String) windowAux.getCmbTeam1().getSelectedItem();
        String txtTeam2 = (String) windowAux.getCmbTeam2().getSelectedItem();
        if(txtTeam1.equals(txtTeam2)){
            throw new ExceptionWorldCup(13);
        }
        String txtStadium = (String) windowAux.getCmbStadiums().getSelectedItem();
        String txtDay = (String) windowAux.getCmbDay().getSelectedItem();
        String txtMonth = (String) windowAux.getCmbMonth().getSelectedItem();
        String txtDate = txtMonth + " - " + txtDay;

        Team team1 = Lobby.controller.searchTeam(txtTeam1);
        Team team2 = Lobby.controller.searchTeam(txtTeam2);
        Stadium stadium = Lobby.controller.searchStadium(txtStadium);
        
        Calendar newCalendar = new Calendar(Lobby.controller.getCalendars().size(), team1, team2, txtDate, stadium);
        stadium.addCalendar(newCalendar);
        Lobby.controller.getCalendars().addElement(newCalendar);
        windowAux.getCalendarScreen().controller.fillData();
        windowAux.getCalendarScreen().setActualCalendar(newCalendar);
        windowAux.getCalendarScreen().controller.completeInformation();
        windowAux.jumpBeforeWindow();
    }

    public void jumpUpdateCalendar() {
        String txtStadium = (String) windowAux.getCmbStadiums().getSelectedItem();
        String txtDay = (String) windowAux.getCmbDay().getSelectedItem();
        String txtMonth = (String) windowAux.getCmbMonth().getSelectedItem();
        String txtDate = txtMonth + " - " + txtDay;
        
        Stadium stadium = Lobby.controller.searchStadium(txtStadium);
        
        //Falta validar si ya se jugo un partido
        windowAux.getCalendarScreen().getActualCalendar().update(txtDate, stadium);
        windowAux.getCalendarScreen().controller.fillData();
        windowAux.getCalendarScreen().controller.completeInformation();
        windowAux.jumpBeforeWindow();
    }

}
