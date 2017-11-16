/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
public class EditGroupController implements ActionListener {

    private Group editing;
    private ArrayList<Team> listCopy;
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
        listCopy = editing.getTeams();
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
            try {
                name1 = selectedOne();
                name2 = selectedTwo();
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(window, ex.getMessage());
            }
            letsDoIt(name1, name2);
            saveChanges();
        }

    }

    /**
     * Charge data in the panel called Editing
     */
    private void chargeData() {
        for (int i = 0; i < listCopy.size(); i++) {
            chargeDataAux(i);
        }
    }

    /**
     * Aux to chargeData that choose the labels add set information
     *
     * @param id
     */
    private void chargeDataAux(int id) {
        switch (id) {
            case 0: {
                if (listCopy.get(0) != null) {
                    
                    window.lblA1.setIcon(listCopy.get(0).getImageTeam());
                    window.nameA1.setText(listCopy.get(0).getName());

                }else{
                    window.op1.setEnabled(false);
                }
                break;
            }
            case 1: {
                if (listCopy.get(1) != null) {
                    window.lblA2.setIcon(listCopy.get(1).getImageTeam());
                    window.nameA2.setText(listCopy.get(1).getName());
                }else{
                    window.op2.setEnabled(false);
                }
                break;
            }
            case 2: {
                if (listCopy.get(2) != null) {
                    window.lblA3.setIcon(listCopy.get(2).getImageTeam());
                    window.nameA3.setText(listCopy.get(2).getName());
                }else{
                    window.op3.setEnabled(false);
                }
                break;
            }
            case 3: {
                if (listCopy.get(3) != null) {
                    window.lblA4.setIcon(listCopy.get(3).getImageTeam());
                    window.nameA4.setText(listCopy.get(3).getName());
                }else{
                    window.op4.setEnabled(false);
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
            Group aux = searchList(selected);
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
        ArrayList<Team> reco = aux.getTeams();
        if (reco.size() == 0) {
            JOptionPane.showMessageDialog(window, "There is not elements");
            window.btnMakeChange.setEnabled(false);
        }

        for (int i = 0; i < reco.size(); i++) {
            chooseCase(i, reco);
        }

    }

    private void chooseCase(int i, ArrayList<Team> reco) {
        switch (i) {
            case 0: {

                if (reco.get(0) != null) {
                    window.lblC1.setIcon(reco.get(0).getImageTeam());
                    window.nameC1.setText(reco.get(0).getName());
                } else {
                    window.lblC1.setIcon(null);
                    window.nameC1.setText("");
                }
                break;
            }
            case 1: {
                if (reco.get(1) != null) {
                    window.lblC2.setIcon(reco.get(1).getImageTeam());
                    window.nameC2.setText(reco.get(1).getName());
                } else {
                    window.lblC2.setIcon(null);
                    window.nameC2.setText("");
                }
                break;
            }
            case 2: {

                if (reco.get(2) != null) {
                    window.lblC3.setIcon(reco.get(2).getImageTeam());
                    window.nameC3.setText(reco.get(2).getName());
                } else {
                    window.lblC3.setIcon(null);
                    window.nameC3.setText("");
                }
                break;
            }
            case 3: {

                if (reco.get(1) != null) {
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

    private String selectedOne() throws ExceptionWorldCup {
        if (window.op1.isSelected()) {
            return window.nameA1.getText();
        } else if (window.op2.isSelected()) {
            return window.nameA2.getText();
        } else if (window.op3.isSelected()) {
            return window.nameA3.getText();
        } else if (window.op4.isSelected()) {
            return window.nameA4.getText();
        } else {
            throw new ExceptionWorldCup(6);
        }
    }

    private String selectedTwo() throws ExceptionWorldCup {
        if (window.ch1.isSelected()) {
            return window.nameC1.getText();
        } else if (window.ch1.isSelected()) {
            return window.nameC2.getText();
        } else if (window.ch1.isSelected()) {
            return window.nameC3.getText();
        } else if (window.ch1.isSelected()) {
            return window.nameC4.getText();
        } else {
            throw new ExceptionWorldCup(6);
        }

    }

    private void saveChanges() {
        Lobby.controller.setGroups(listGroups);
        JOptionPane.showMessageDialog(window, "Successful");
        GroupScreen.gController.showGroupData();
        chargeData();
        whatIs();

    }

    private void letsDoIt(String name1, String name2) {
        Group edit = null;
        Team aux = null;
        for (int i = 0; i < listGroups.size(); i++) {
            if (listGroups.get(i).getName().equals(editing.getName())) {
                edit = listGroups.get(i);
                aux = searchTeam(name1, edit.getTeams());
                edit.getTeams().remove(aux);
            }
        }

        for (int i = 0; i < listGroups.size(); i++) {
            for (int j = 0; j < listGroups.get(i).getTeams().size(); j++) {
                if (listGroups.get(i).getTeams().get(j).getName().equals(name2)) {
                    edit.getTeams().add(listGroups.get(i).getTeams().get(j));
                    listGroups.get(i).getTeams().remove(listGroups.get(i).getTeams().get(j));
                    listGroups.get(i).getTeams().add(aux);
                }
            }
        }

    }

    public Team searchTeam(String name, ArrayList<Team> aux) {
        for (int j = 0; j < aux.size(); j++) {
            if (aux.get(j).getName().equals(name)) {
                return aux.get(j);
            }
        }
        return null;
    }

}
