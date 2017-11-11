/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import pk.codeapp.model.Player;
import pk.codeapp.model.Team;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowPlayerInfo;

/**
 *
 * @author Daniel Amador
 */
public class ShowPlayerInfoController implements ActionListener {

    private ShowPlayerInfo window;

    public ShowPlayerInfoController(ShowPlayerInfo window) {
        this.window = window;
        fillComboBox();
        manager();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack1) {
            window.jumpBeforeWindow();
        }
        if (e.getSource() == window.jRadioButton1 | e.getSource() == window.jRadioButton2 | e.getSource() == window.cmbTeams) {
            manager();
        }
    }

    private void manager() {
        String selected = (String) window.cmbTeams.getSelectedItem();
        Team found = search(selected);
        if (window.jRadioButton1.isSelected()) {
            findOldest(found);
        } else {
            findYoungest(found);
        }

    }

    private Team search(String selected) {
        ArrayList<Team> teams = Lobby.controller.getTeams();
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getName().equals(selected)) {
                return teams.get(i);
            }
        }
        return null;
    }

    private void findOldest(Team found) {
        ArrayList<Player> aux = found.getPlayers();
        Player oldest = aux.get(0);
        for (int i = 0; i < aux.size(); i++) {
            if (oldest.getAge() < aux.get(i).getAge()) {
                oldest = aux.get(i);
            }
        }
        setData(oldest);
    }

    private void findYoungest(Team found) {
        ArrayList<Player> aux = found.getPlayers();
        Player youngest = aux.get(0);
        for (int i = 0; i < aux.size(); i++) {
            if (youngest.getAge() > aux.get(i).getAge()) {
                youngest = aux.get(i);
            }
        }
        setData(youngest);
    }

    private void setData(Player player) {
     window.lblAge.setText(player.getAge()+"");
     window.lblGoals.setText(player.getGoals()+"");
     window.lblId.setText(+player.getId()+"");
     window.lblName.setText(player.getName());
     window.lblNumber.setText(player.getNumber()+"");
     window.lblPosition.setText(player.getPosition());
     window.lblRedCards.setText(player.getCantCardRed()+"");
     window.lblYellowCards.setText(""+ player.getCantCardYellow());
    }

    private void fillComboBox() {
       ArrayList<Team> teams = Lobby.controller.getTeams();
        for (int i = 0; i < teams.size(); i++) {
           window.cmbTeams.addItem(teams.get(i).getName());
            
        }
    }

}
