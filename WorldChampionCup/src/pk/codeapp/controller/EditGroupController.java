/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
public class EditGroupController implements ActionListener {

    private Group editing;
    private Group aux;
    private ArrayList<Group> listGroups = Lobby.controller.getGroups();
    private EditGroup window;

    /**
     * Constructor that inicializes the instance
     *
     * @param group
     * @param window
     */
    public EditGroupController(Group group, EditGroup window) {
        this.editing = group;
        this.window = window;
        window.btnMakeChange.setEnabled(false);
        managerMethods();
    }

    /**
     * Method that is in charge of events
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack) {
            window.jumpBeforeWindow();
        }
        if (e.getSource() == window.cmbTeams) {

            whatIs();
        }
        if (e.getSource() == window.btnMakeChange) {
            String name1 = null;
            String name2 = null;

            name1 = selectedOne();
            name2 = selectedTwo();
            letsDoIt(name1, name2);
            chargeData();
            whatIs();
            saveChanges();

        }

    }

    /**
     * Charge data in the panel called Editing
     */
    private void chargeData() {
        window.lblGroupEditing.setText(editing.getName());
        for (int i = 0; i < 4; i++) {
            chargeDataHelper(i);
        }
    }

    /**
     * Aux to chargeData that choose the labels add set information
     *
     * @param id
     */
    private void chargeDataHelper(int id) {
        ArrayList<Team> listCopy = editing.getTeams();
        switch (id) {
            case 0: {
                if (listCopy.size() > 0) {
                    window.lblA1.setIcon(listCopy.get(0).getImageTeam());
                    window.nameA1.setText(listCopy.get(0).getName());

                } else {
                    window.lblA1.setIcon(null);
                    window.nameA1.setText(null);
                }
                break;
            }
            case 1: {
                if (listCopy.size() > 1) {
                    window.lblA2.setIcon(listCopy.get(1).getImageTeam());
                    window.nameA2.setText(listCopy.get(1).getName());
                } else {
                    window.lblA2.setIcon(null);
                    window.nameA2.setText(null);
                }
                break;
            }
            case 2: {
                if (listCopy.size() > 2) {
                    window.lblA3.setIcon(listCopy.get(2).getImageTeam());
                    window.nameA3.setText(listCopy.get(2).getName());
                } else {
                    window.lblA3.setIcon(null);
                    window.nameA3.setText(null);
                }
                break;
            }
            case 3: {
                if (listCopy.size() > 3) {
                    window.lblA4.setIcon(listCopy.get(3).getImageTeam());
                    window.nameA4.setText(listCopy.get(3).getName());
                } else {
                    window.lblA4.setIcon(null);
                    window.nameA4.setText(null);
                }
                break;
            }
        }
    }

    /**
     * Charge groups in the ComboBox
     */
    private void fillComboBox() {
        for (int i = 0; i < listGroups.size(); i++) {
            if (!listGroups.get(i).getName().equals(editing.getName())) {
                window.cmbTeams.addItem(listGroups.get(i).getName());
            }
        }
    }

    /**
     * search in the list when a group is selected to charge data in the screen
     *
     * @param selected
     */
    private void whatIs() {
        String selected = (String) window.cmbTeams.getSelectedItem();
        
        if (selected.equals("Select a Group")) {
            window.btnMakeChange.setEnabled(false);
        } else {
            window.btnMakeChange.setEnabled(true);
            aux = searchList(selected);
            window.lblGroupChange.setText(aux.getName());
            chargeDataAux(aux);

        }
    }

    private void managerMethods() {
        chargeData();
        fillComboBox();
    }

    private Group searchList(String selected) {
        for (int i = 0; i < listGroups.size(); i++) {
            if (listGroups.get(i).getName().equals(selected)) {
                return listGroups.get(i);
            }
        }
        return null;
    }

    private void chargeDataAux(Group aux) {
        if (aux.getTeams().size() == 0) {
            JOptionPane.showMessageDialog(window, "There is not elements");
            window.btnMakeChange.setEnabled(false);
        }
        for (int i = 0; i < 4; i++) {
            chooseCase(i, aux.getTeams());
        }

    }

    private void chooseCase(int i, ArrayList<Team> reco) {
        switch (i) {
            case 0: {

                if (reco.size() > 0) {
                    window.lblC1.setIcon(reco.get(0).getImageTeam());
                    window.nameC1.setText(reco.get(0).getName());
                } else {
                    window.lblC1.setIcon(null);
                    window.nameC1.setText("");
                }
                break;
            }
            case 1: {
                if (reco.size() > 1) {
                    window.lblC2.setIcon(reco.get(1).getImageTeam());
                    window.nameC2.setText(reco.get(1).getName());
                } else {
                    window.lblC2.setIcon(null);
                    window.nameC2.setText("");
                }
                break;
            }
            case 2: {

                if (reco.size() > 2) {
                    window.lblC3.setIcon(reco.get(2).getImageTeam());
                    window.nameC3.setText(reco.get(2).getName());
                } else {
                    window.lblC3.setIcon(null);
                    window.nameC3.setText("");
                }
                break;
            }
            case 3: {

                if (reco.size() > 3) {
                    window.lblC4.setIcon(reco.get(3).getImageTeam());
                    window.nameC4.setText(reco.get(3).getName());
                } else {
                    window.lblC4.setIcon(null);
                    window.nameC4.setText("");
                }
                break;
            }
        }
    }

    /**
     * What check button is selected in the panel 1
     *
     * @return
     */
    private String selectedOne() {
        if (window.op1.isSelected()) {
            return window.nameA1.getText();
        }
        if (window.op2.isSelected()) {
            return window.nameA2.getText();
        }
        if (window.op3.isSelected()) {
            return window.nameA3.getText();
        }
        if (window.op4.isSelected()) {
            return window.nameA4.getText();
        }
        return null;
    }

    /**
     * What check button is selected in the panel 2
     *
     * @return
     */
    private String selectedTwo() {
        if (window.ch1.isSelected()) {
            return window.nameC1.getText();
        }
        if (window.ch2.isSelected()) {
            return window.nameC2.getText();
        }
        if (window.ch3.isSelected()) {
            return window.nameC3.getText();
        }
        if (window.ch4.isSelected()) {
            return window.nameC4.getText();
        }
        return null;
    }

    /**
     * Save all changes in the differents groups
     */
    private void saveChanges() {
        Lobby.controller.setGroups(listGroups);
        JOptionPane.showMessageDialog(window, "Successful");
        GroupScreen.gController.showGroupData();
        chargeData();
        whatIs();

    }

    /**
     * make change
     *
     * @param name1
     * @param name2
     */
    private void letsDoIt(String name1, String name2) {
        Team team1 = searchTeam(name1, editing);
        Team team2 = searchTeam(name2, aux);
        System.out.println(team1);
        System.out.println(team2);
        if (team1 != null & team2 != null) {
            editing.getTeams().remove(team1);
            editing.getTeams().add(team2);
            aux.getTeams().remove(team2);
            aux.getTeams().add(team1);
        } else {
            if (team1 == null) {
                aux.getTeams().remove(team2);
                editing.getTeams().add(team2);
            } else {
                editing.getTeams().remove(team1);
                aux.getTeams().add(team1);
            }
        }

    }

    public Team searchTeam(String name, Group aux) {
        for (int j = 0; j < aux.getTeams().size(); j++) {
            if (aux.getTeams().get(j).getName().equals(name)) {
                return aux.getTeams().get(j);
            }
        }
        return null;
    }

}
