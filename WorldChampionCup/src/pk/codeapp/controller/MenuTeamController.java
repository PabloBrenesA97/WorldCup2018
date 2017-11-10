/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Team;
import pk.codeapp.view.CreateorUpdateTeam;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.MenuTeams;
import pk.codeapp.view.ShowPlayers;

/**
 *
 * @author Jose Pablo Brenes
 */
public class MenuTeamController implements ActionListener {

    public AppController controller = Lobby.controller;
    private MenuTeams menuTeams;

    public MenuTeamController(MenuTeams menuTeams) {
        this.menuTeams = menuTeams;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuTeams.getBtnCrate()) {
            jumpToCreateorUpdate("Create", null);
            return;
        }
        if (e.getSource() == menuTeams.getBtnUpdate()) {
            Team teamUpdate = selectTeam();
            if(teamUpdate!=null){
            jumpToCreateorUpdate("Update", teamUpdate);
            return;
            }
            else
                return;
        }
        if (e.getSource() == menuTeams.getBtnDelete()) {
            try {
                jumpToDelete();
                return;
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(menuTeams, ex.getMessage());
                return;
            }
        }
        if (e.getSource() == menuTeams.getBtnBack()) {
            menuTeams.jumpBeforeWindow();
        }else{
            JButton button = (JButton) e.getSource();
            if (button != null) {
                String txtTeam = button.getText();
                Team team = controller.searchTeam(txtTeam);
                menuTeams.setVisible(false);
                ShowPlayers showPlayers = new ShowPlayers(team);
                showPlayers.openWindow(menuTeams);
                
            }
        }
    }

    /**
     * Add Button to reference teams
     *
     * @param listTeams
     */
    public void addTeamInGridPane(ArrayList<Team> listTeams) {
        menuTeams.viewTeams.removeAll();
        Font font = new Font("Book Antiqua", 5, 20);
        menuTeams.viewTeams.setLayout(new GridLayout(8, 5));
        menuTeams.viewTeams.setOpaque(false);
        for (int i = 0; i < controller.getTeams().size(); i++) {
            JButton button = new JButton(controller.getTeams().get(i).getImageTeam());
            button.setText(controller.getTeams().get(i).getName());
            button.addActionListener(this);
            button.setVisible(true);
            button.setFont(font);
            button.setBackground(Color.black);
            button.setForeground(Color.white);
            menuTeams.viewTeams.add(button);
        }
    }

    /**
     * Bridge to windows of Create or Update
     */
    private void jumpToCreateorUpdate(String action, Team update) {
        CreateorUpdateTeam windowAux = new CreateorUpdateTeam();
        menuTeams.setVisible(false);
        windowAux.setUpdateTeam(update);
        windowAux.setFunctiontoRealize(action);
        windowAux.openWindow(menuTeams);
    }

    /**
     * Delete Team
     *
     * @throws ExceptionWorldCup
     */
    private void jumpToDelete() throws ExceptionWorldCup {
        Team teamDelete = selectTeam();
        if (teamDelete != null && !teamDelete.getPlayers().isEmpty()) {
            throw new ExceptionWorldCup(2);
        } else {
            deleteTeam(teamDelete);
            MenuTeams.controller.addTeamInGridPane(Lobby.controller.getTeams());
            menuTeams.jumpBeforeWindow();
        }

    }

    /**
     * Show List of Teams to select one Team
     *
     * @return
     */
    public Team selectTeam() {
        
        String[] list = new String[controller.getTeams().size()];
        for (int i = 0; i < controller.getTeams().size(); i++) {
            list[i] = controller.getTeams().get(i).getName();
        }

        JComboBox cmbOption = new JComboBox(list);
        int input = JOptionPane.showOptionDialog(null, cmbOption, "Select Team that your like Delete",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
       if(input==-1){
           return null;
       }
        Team teamAux = controller.searchTeam((String) cmbOption.getSelectedItem());
        return teamAux;
    }

    /**
     * Delete Team
     *
     * @param teamDelete
     */
    public void deleteTeam(Team teamDelete) throws ExceptionWorldCup {
        for (int i = 0; i < controller.getTeams().size(); i++) {
            if (controller.getTeams().get(i).equals(teamDelete)) {
                if (controller.getTeams().get(i).getPlayers().isEmpty()) {
                    controller.getTeams().remove(i);
                } else {
                    throw new ExceptionWorldCup(2);
                }
            }
        }
    }
}
