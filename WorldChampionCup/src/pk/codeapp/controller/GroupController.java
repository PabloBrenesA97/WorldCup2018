/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Group;
import pk.codeapp.model.Team;
import pk.codeapp.view.EditGroup;
import pk.codeapp.view.GroupScreen;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Daniel Amador
 */
public class GroupController implements ActionListener {

    private Maker maker = new MasterMaker();
    private GroupScreen window;
    private ArrayList<Team> teams = new ArrayList();
    private ArrayList<Group> groups = new ArrayList();

    public GroupController(GroupScreen aThis) {
        window = aThis;
        managerMethods();
    }

    /**
     * In charge of receiving events
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack) {
            //call back method
            window.jumpBeforeWindow();
        } else {
            EditGroup edit = new EditGroup();
            window.setVisible(false);
            if (e.getSource() == window.btnEditA) {
                //call eedit Aif
                edit.initData(groups.get(0));
            } else if (e.getSource() == window.btnEditB) {
                //call eedit B
                edit.initData(groups.get(1));
            } else if (e.getSource() == window.btnEditC) {
                //call eedit C
                edit.initData(groups.get(2));
            } else if (e.getSource() == window.btnEditD) {
                //call eedit D
                edit.initData(groups.get(3));
            } else if (e.getSource() == window.btnEditE) {
                //call eedit E
                edit.initData(groups.get(4));
            } else if (e.getSource() == window.btnEditF) {
                //call eedit F
                edit.initData(groups.get(5));
            } else if (e.getSource() == window.btnEditG) {
                //call eedit G
                edit.initData(groups.get(6));
            } else if (e.getSource() == window.btnEditH) {
                //call eedit H
                edit.initData(groups.get(7));
            }
            edit.openWindow(window);
        }
    }

    /**
     * Copy teams list from AppController to show in this JFrame
     */
    public void copyTeamList() {
        for (int i = 0; i < Lobby.controller.getTeams().size(); i++) {
            teams.add(Lobby.controller.getTeams().get(i));
        }
    }

    /**
     * Manage the call of methods
     */
    private void managerMethods() {
        /*Copy the list*/
        copyTeamList();
        createGroup();
        try {
            /*Change the teams*/
            chargeTeams();
        } catch (ExceptionWorldCup ex) {
            JOptionPane.showMessageDialog(window, ex.getMessage());
        }
        showGroupData();
    }

    private void chargeTeams() throws ExceptionWorldCup {

        Lobby.controller.setGroups(groups);
    }

    public Team getRandom() {
        Random rand = new Random();
        Team aux = null;
        if ((teams.size() - 1) >= 0) {
            int randomNum = rand.nextInt(((teams.size() - 1) - 0) + 1) + 0;

            if (randomNum < teams.size() && randomNum >= 0) {
                aux = teams.get(randomNum);
                teams.remove(randomNum);
            }
        }
        return aux;
    }

    //<editor-fold defaultstate="collapsed" desc="SetGroups">
    public void setGroupA(Team team, int id) {
        switch (id) {
            case 1: {
                window.lblA1.setIcon(team.getImageTeam());
                window.nameA1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblA2.setIcon(team.getImageTeam());
                window.nameA2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblA3.setIcon(team.getImageTeam());
                window.nameA3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblA4.setIcon(team.getImageTeam());
                window.nameA4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupB(Team team, int id) {
        switch (id) {
            case 1: {
                window.lblB1.setIcon(team.getImageTeam());
                window.nameB1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblB2.setIcon(team.getImageTeam());
                window.nameB2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblB3.setIcon(team.getImageTeam());
                window.nameB3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblB4.setIcon(team.getImageTeam());
                window.nameB4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupC(Team team, int id) {

        switch (id) {
            case 1: {
                window.lblC1.setIcon(team.getImageTeam());
                window.nameC1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblC2.setIcon(team.getImageTeam());
                window.nameC2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblC3.setIcon(team.getImageTeam());
                window.nameC3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblC4.setIcon(team.getImageTeam());
                window.nameC4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupD(Team team, int id) {
        switch (id) {
            case 1: {
                window.lblD1.setIcon(team.getImageTeam());
                window.nameD1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblD2.setIcon(team.getImageTeam());
                window.nameD2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblD3.setIcon(team.getImageTeam());
                window.nameD3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblD4.setIcon(team.getImageTeam());
                window.nameD4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupE(Team team, int id) {
        switch (id) {
            case 1: {
                window.lblE1.setIcon(team.getImageTeam());
                window.nameE1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblE2.setIcon(team.getImageTeam());
                window.nameE2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblE3.setIcon(team.getImageTeam());
                window.nameE3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblE4.setIcon(team.getImageTeam());
                window.nameE4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupF(Team team, int id) {
        switch (id) {
            case 1: {
                window.lblF1.setIcon(team.getImageTeam());
                window.nameF1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblF2.setIcon(team.getImageTeam());
                window.nameF2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblF3.setIcon(team.getImageTeam());
                window.nameF3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblF4.setIcon(team.getImageTeam());
                window.nameF4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupG(Team team, int id) {

        switch (id) {
            case 1: {
                window.lblG1.setIcon(team.getImageTeam());
                window.nameG1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblG2.setIcon(team.getImageTeam());
                window.nameG2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblG3.setIcon(team.getImageTeam());
                window.nameG3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblG4.setIcon(team.getImageTeam());
                window.nameG4.setText(team.getName());
                break;
            }
        }
    }

    public void setGroupH(Team team, int id) {

        switch (id) {
            case 1: {
                window.lblH1.setIcon(team.getImageTeam());
                window.nameH1.setText(team.getName());
                break;
            }
            case 2: {
                window.lblH2.setIcon(team.getImageTeam());
                window.nameH2.setText(team.getName());
                break;
            }
            case 3: {
                window.lblH3.setIcon(team.getImageTeam());
                window.nameH3.setText(team.getName());
                break;
            }
            case 4: {
                window.lblH4.setIcon(team.getImageTeam());
                window.nameH4.setText(team.getName());
                break;
            }
        }
    }

    public void createGroup() {
        String[] names = {"Group A", "Group B", "Group C", "Group D", "Group E", "Group F", "Group G", "Group H"};
        int index = 0;
        for (int i = 0; i < 8; i++) {
            Group gr = (Group) maker.factoryMethod("Group");
            gr.update(index, names[index]);
            for (int j = 0; j < 4; j++) {
                try {
                    Team team = getRandom();
                    if (team != null) {
                        gr.setTeams(team);
                    }
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(window, ex.getMessage(), "Sorry an error occurred", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            groups.add(gr);
            index++;
        }
    }
    //</editor-fold>

    public void showGroupData() {
        ArrayList<Group> aux = Lobby.controller.getGroups();
        for (int i = 0; i < aux.size(); i++) {
            Group gr = aux.get(i);
            for (int j = 0; j < gr.getTeams().size(); j++) {
                managerSetGroups(i, gr.getTeams().get(j), j);
            }
        }
    }

    private void managerSetGroups(int i, Team get, int index) {
        switch (i) {
            case 0: {
                window.btnEditA.setEnabled(true);
                setGroupA(get, index + 1);
                break;
            }
            case 1: {
                window.btnEditB.setEnabled(true);
                setGroupB(get, index + 1);
                break;
            }
            case 2: {
                window.btnEditC.setEnabled(true);
                setGroupC(get, index + 1);
                break;
            }
            case 3: {
                window.btnEditD.setEnabled(true);
                setGroupD(get, index + 1);
                break;
            }
            case 4: {
                window.btnEditE.setEnabled(true);
                setGroupE(get, index + 1);
                break;
            }
            case 5: {
                window.btnEditF.setEnabled(true);
                setGroupF(get, index + 1);
                break;
            }
            case 6: {
                window.btnEditG.setEnabled(true);
                setGroupG(get, index + 1);
                break;
            }
            case 7: {
                window.btnEditH.setEnabled(true);
                setGroupH(get, index + 1);
                break;
            }
        }
    }

    public void addNewTeam(Team team) {
        for (int i = 0; i < Lobby.controller.getGroups().size(); i++) {
            if (Lobby.controller.getGroups().get(i).getTeams().size() < 4) {
                Lobby.controller.getGroups().get(i).getTeams().add(team);
                try {
                    chargeTeams();
                } catch (ExceptionWorldCup ex) {
                   
                }
                break;
            }
        }
    }
}
