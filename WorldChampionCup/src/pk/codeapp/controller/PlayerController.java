/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import pk.codeapp.model.Team;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowPlayers;

/**
 *
 * @author Jose Pablo Brenes
 */
public class PlayerController implements ActionListener {

    private AppController controller = Lobby.controller;
    private ShowPlayers showPlayer;

    public PlayerController(ShowPlayers showPlayer) {
        this.showPlayer = showPlayer;
        showAllTeam();
        showAllPlayers();
    }

    /**
     * Show actual team datas
     */
    private void showAllTeam() {
        showPlayer.getLblName().setText(showPlayer.getActualTeam().getName());
        showPlayer.getLblCoach().setText(showPlayer.getActualTeam().getCoach());
        showPlayer.getLblAssistant().setText(showPlayer.getActualTeam().getAssistant());
        showPlayer.getLblConfederacy().setText(showPlayer.getActualTeam().getConfederacy());
    }

    /**
     * Show Actual Players of Team
     */
    private void showAllPlayers() {
        Team teamActual = showPlayer.getActualTeam();
        Object[][] datas = new Object[teamActual.getPlayers().size()][7];
        /*Fill information*/
        for (int i = 0; i < teamActual.getPlayers().size(); i++) {
            datas[i][0] = teamActual.getPlayers().get(i).getName();
            datas[i][1] = teamActual.getPlayers().get(i).getPosition();
            datas[i][2] = teamActual.getPlayers().get(i).getAge();
            datas[i][3] = teamActual.getPlayers().get(i).getCantCardYellow();
            datas[i][4] = teamActual.getPlayers().get(i).getCantCardRed();
            datas[i][5] = teamActual.getPlayers().get(i).getNumber();
            datas[i][6] = teamActual.getPlayers().get(i).getGoals();
        }
        /*Fill titles*/
        String[] titles = {"Name Player", "Position", "Age", "NCardYellow", "NCardRed", "Number", "NumberGoals"};
        
        DefaultTableModel dtm = new DefaultTableModel(datas, titles){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        showPlayer.getTablePlayers().setModel(dtm);
        showPlayer.getTablePlayers().setPreferredScrollableViewportSize(new Dimension(860, 540));
        showPlayer.getTablePlayers().setRowHeight(44);
        showPlayer.getTablePlayers().setColumnSelectionAllowed(false);
        showPlayer.getTablePlayers().setFocusable(false);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
