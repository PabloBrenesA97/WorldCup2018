/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pk.codeapp.model.Player;
import pk.codeapp.model.Team;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowScorers;

/**
 *
 * @author Daniel Amador
 */
public class ScoringController implements ActionListener {

    
    
    ArrayList<Team> teams = Lobby.controller.getTeams();
    ArrayList<Player> scorers = new ArrayList();
    ArrayList<String> countries = new ArrayList();
    private ShowScorers window;

    public ScoringController(ShowScorers window) {
        this.window = window;
        searchScorers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack1) {
            window.jumpBeforeWindow();
        }
    }

    private void searchScorers() {
        int maxGoals = 0;
        for (int i = 0; i < teams.size(); i++) {
            ArrayList<Player> aux = teams.get(i).getPlayers();
            for (int j = 0; j < aux.size(); j++) {
                if(aux.get(j).getGoals()>maxGoals){
                    scorers.add(0,aux.get(j));
                    countries.add(0,teams.get(i).getName());
                    maxGoals=aux.get(j).getGoals();
                }else{
                    searchPosition(aux.get(j),teams.get(i).getName());
                }
            }
        }
        showAllPlayers();
    }

    private void searchPosition(Player get,String name) {
        for (int i = 0; i < scorers.size(); i++) {
           if(scorers.get(i).getGoals()<get.getGoals()){
               scorers.add(i,get);
               countries.add(i,name);
               break;
           }           
        }
    }

    public void showAllPlayers() {
        
        Object[][] datas = new Object[scorers.size()][4];
        /*Fill information*/
        for (int i = 0; i < scorers.size(); i++) {
            datas[i][0] = scorers.get(i).getName();
             datas[i][1] = countries.get(i);
            datas[i][2] = scorers.get(i).getGoals();
        }
        /*Fill titles*/
        String[] titles = {"Name Player", "Country","NumberGoals"};
        
        DefaultTableModel dtm = new DefaultTableModel(datas, titles){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        window.getTablePlayers().setModel(dtm);
        window.getTablePlayers().setPreferredScrollableViewportSize(new Dimension(860, 540));
        window.getTablePlayers().setRowHeight(45);
        window.getTablePlayers().setColumnSelectionAllowed(false);
        window.getTablePlayers().setFocusable(false);
    }

   

}
