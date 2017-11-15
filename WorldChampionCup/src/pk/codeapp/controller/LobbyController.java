/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk.codeapp.model.Calendar;
import pk.codeapp.view.CalendarScreen;
import pk.codeapp.view.GroupScreen;
import pk.codeapp.view.Lobby;
import static pk.codeapp.view.Lobby.controller;
import pk.codeapp.view.MenuTeams;
import pk.codeapp.view.ResultScreen;
import pk.codeapp.view.ShowStadium;
import pk.codeapp.view.StadiumsScreen;

/**
 *
 * @author Jose Pablo Brenes
 */
public class LobbyController implements ActionListener{

    private GroupScreen group;
    private Lobby lobby;
    public LobbyController(Lobby lobby) {
        Lobby.controller.createDefaultTeams();
        Lobby.controller.addDefaultPlayers();
        
        this.lobby=lobby;
        group = new GroupScreen();
        controller.createDefaultTeams();
        controller.addDefaultPlayers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==lobby.getBtnCalendars()){
           CalendarScreen calendar = new CalendarScreen();
           lobby.setVisible(false);
           calendar.openWindow(lobby);
       }
       if(e.getSource()==lobby.getBtnGroups()){
           lobby.setVisible(false);
           group.openWindow(lobby);
       }
       if(e.getSource()==lobby.getBtnMenu()){
           move();
       }
       if(e.getSource()==lobby.getBtnResults()){
           ResultScreen result = new ResultScreen();
           lobby.setVisible(false);
           result.openWindow(lobby);
       }
       if(e.getSource()==lobby.getBtnStadiums()){
           StadiumsScreen stadium = new StadiumsScreen();
           lobby.setVisible(false);
           stadium.openWindow(lobby);
       }
       if(e.getSource()==lobby.getBtnTeams()){
           MenuTeams teams = new MenuTeams();
           lobby.setVisible(false);
           teams.openWindow(lobby);
       }
    }
    /**
     * Menu Slider
     */
    public synchronized void move() {
        if (lobby.getMenuToggle().getX() < 0) {
            lobby.getMenuToggle().setLocation(0, 0);

        } else {
            lobby.getMenuToggle().setLocation(-410, 0);

        }
    }
}
