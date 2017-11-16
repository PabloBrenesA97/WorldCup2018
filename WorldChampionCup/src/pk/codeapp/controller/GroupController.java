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
    public void setGroupA(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblA1.setIcon(teams.get(0).getImageTeam());
                    window.nameA1.setText(teams.get(0).getName());
                }else{
                    window.lblA1.setIcon(null);
                    window.nameA1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblA2.setIcon(teams.get(1).getImageTeam());
                    window.nameA2.setText(teams.get(1).getName());
                }else{
                    window.lblA2.setIcon(null);
                    window.nameA2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblA3.setIcon(teams.get(2).getImageTeam());
                    window.nameA3.setText(teams.get(2).getName());
                }else{
                    window.lblA3.setIcon(null);
                    window.nameA3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblA4.setIcon(teams.get(3).getImageTeam());
                    window.nameA4.setText(teams.get(3).getName());
                }else{
                    window.lblA4.setIcon(null);
                    window.nameA4.setText(null);
                }
                break;
            }
        }
    }

    public void setGroupB(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblB1.setIcon(teams.get(0).getImageTeam());
                    window.nameB1.setText(teams.get(0).getName());
                }else{
                    window.lblB1.setIcon(null);
                    window.nameB1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblB2.setIcon(teams.get(1).getImageTeam());
                    window.nameB2.setText(teams.get(1).getName());
                }else{
                    window.lblB2.setIcon(null);
                    window.nameB2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblB3.setIcon(teams.get(2).getImageTeam());
                    window.nameB3.setText(teams.get(2).getName());
                }else{
                    window.lblB3.setIcon(null);
                    window.nameB3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblB4.setIcon(teams.get(3).getImageTeam());
                    window.nameB4.setText(teams.get(3).getName());
                }else{
                    window.lblB4.setIcon(null);
                    window.nameB4.setText(null);
                }
                break;
            }
        }
    }

    public void setGroupC(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblC1.setIcon(teams.get(0).getImageTeam());
                    window.nameC1.setText(teams.get(0).getName());
                }else{
                    window.lblC1.setIcon(null);
                    window.nameC1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblC2.setIcon(teams.get(1).getImageTeam());
                    window.nameC2.setText(teams.get(1).getName());
                }else{
                    window.lblC2.setIcon(null);
                    window.nameC2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblC3.setIcon(teams.get(2).getImageTeam());
                    window.nameC3.setText(teams.get(2).getName());
                }else{
                    window.lblC3.setIcon(null);
                    window.nameB3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblC4.setIcon(teams.get(3).getImageTeam());
                    window.nameC4.setText(teams.get(3).getName());
                }else{
                    window.lblC4.setIcon(null);
                    window.nameC4.setText(null);
                }
                break;
            }
        }
    }

   public void setGroupD(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblD1.setIcon(teams.get(0).getImageTeam());
                    window.nameD1.setText(teams.get(0).getName());
                }else{
                    window.lblD1.setIcon(null);
                    window.nameD1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblD2.setIcon(teams.get(1).getImageTeam());
                    window.nameD2.setText(teams.get(1).getName());
                }else{
                    window.lblD2.setIcon(null);
                    window.nameD2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblD3.setIcon(teams.get(2).getImageTeam());
                    window.nameD3.setText(teams.get(2).getName());
                }else{
                    window.lblD3.setIcon(null);
                    window.nameD3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblD4.setIcon(teams.get(3).getImageTeam());
                    window.nameD4.setText(teams.get(3).getName());
                }else{
                    window.lblD4.setIcon(null);
                    window.nameD4.setText(null);
                }
                break;
            }
        }
    }

   public void setGroupE(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblE1.setIcon(teams.get(0).getImageTeam());
                    window.nameE1.setText(teams.get(0).getName());
                }else{
                    window.lblE1.setIcon(null);
                    window.nameE1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblE2.setIcon(teams.get(1).getImageTeam());
                    window.nameE2.setText(teams.get(1).getName());
                }else{
                    window.lblE2.setIcon(null);
                    window.nameE2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblE3.setIcon(teams.get(2).getImageTeam());
                    window.nameE3.setText(teams.get(2).getName());
                }else{
                    window.lblE3.setIcon(null);
                    window.nameE3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblE4.setIcon(teams.get(3).getImageTeam());
                    window.nameE4.setText(teams.get(3).getName());
                }else{
                    window.lblE4.setIcon(null);
                    window.nameE4.setText(null);
                }
                break;
            }
        }
    }

     public void setGroupF(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblF1.setIcon(teams.get(0).getImageTeam());
                    window.nameF1.setText(teams.get(0).getName());
                }else{
                    window.lblF1.setIcon(null);
                    window.nameF1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblF2.setIcon(teams.get(1).getImageTeam());
                    window.nameF2.setText(teams.get(1).getName());
                }else{
                    window.lblF2.setIcon(null);
                    window.nameF2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblF3.setIcon(teams.get(2).getImageTeam());
                    window.nameF3.setText(teams.get(2).getName());
                }else{
                    window.lblF3.setIcon(null);
                    window.nameF3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblF4.setIcon(teams.get(3).getImageTeam());
                    window.nameF4.setText(teams.get(3).getName());
                }else{
                    window.lblF4.setIcon(null);
                    window.nameF4.setText(null);
                }
                break;
            }
        }
    }

    public void setGroupG(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblG1.setIcon(teams.get(0).getImageTeam());
                    window.nameG1.setText(teams.get(0).getName());
                }else{
                    window.lblG1.setIcon(null);
                    window.nameG1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblG2.setIcon(teams.get(1).getImageTeam());
                    window.nameG2.setText(teams.get(1).getName());
                }else{
                    window.lblG2.setIcon(null);
                    window.nameG2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblG3.setIcon(teams.get(2).getImageTeam());
                    window.nameG3.setText(teams.get(2).getName());
                }else{
                    window.lblG3.setIcon(null);
                    window.nameG3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblG4.setIcon(teams.get(3).getImageTeam());
                    window.nameG4.setText(teams.get(3).getName());
                }else{
                    window.lblG4.setIcon(null);
                    window.nameG4.setText(null);
                }
                break;
            }
        }
    }

    public void setGroupH(ArrayList<Team> teams, int id) {
        switch (id) {
            case 1: {
                if (teams.size() > 0) {
                    window.lblH1.setIcon(teams.get(0).getImageTeam());
                    window.nameH1.setText(teams.get(0).getName());
                }else{
                    window.lblH1.setIcon(null);
                    window.nameH1.setText(null);
                }
                break;
            }
            case 2: {
                if (teams.size() > 1) {
                    window.lblH2.setIcon(teams.get(1).getImageTeam());
                    window.nameH2.setText(teams.get(1).getName());
                }else{
                    window.lblH2.setIcon(null);
                    window.nameH2.setText(null);
                }
                break;
            }
            case 3: {
                 if (teams.size() > 2) {
                    window.lblH3.setIcon(teams.get(2).getImageTeam());
                    window.nameH3.setText(teams.get(2).getName());
                }else{
                    window.lblH3.setIcon(null);
                    window.nameH3.setText(null);
                }
                break;
            }
            case 4: {
                if (teams.size() > 3) {
                    window.lblH4.setIcon(teams.get(3).getImageTeam());
                    window.nameH4.setText(teams.get(3).getName());
                }else{
                    window.lblH4.setIcon(null);
                    window.nameH4.setText(null);
                }
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

            for (int j = 1; j < 5; j++) {
                managerSetGroups(i, gr.getTeams(), j);
            }
        }
    }

    private void managerSetGroups(int i, ArrayList<Team> get, int index) {
        switch (i) {
            case 0: {
                window.btnEditA.setEnabled(true);
                setGroupA(get, index);
                break;
            }
            case 1: {
                window.btnEditB.setEnabled(true);
                setGroupB(get, index);
                break;
            }
            case 2: {
                window.btnEditC.setEnabled(true);
                setGroupC(get, index);
                break;
            }
            case 3: {
                window.btnEditD.setEnabled(true);
                setGroupD(get, index);
                break;
            }
            case 4: {
                window.btnEditE.setEnabled(true);
                setGroupE(get, index);
                break;
            }
            case 5: {
                window.btnEditF.setEnabled(true);
                setGroupF(get, index);
                break;
            }
            case 6: {
                window.btnEditG.setEnabled(true);
                setGroupG(get, index);
                break;
            }
            case 7: {
                window.btnEditH.setEnabled(true);
                setGroupH(get, index);
                break;
            }
        }
    }

    public void addNewTeam(Team team) {
        for (int i = 0; i < Lobby.controller.getGroups().size(); i++) {
            if (Lobby.controller.getGroups().get(i).getTeams().size() < 4) {
                Lobby.controller.getGroups().get(i).getTeams().add(team);
                showGroupData();

                break;
            }
        }
    }
}
