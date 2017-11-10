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
import pk.codeapp.view.Lobby;

/**
 *
 * @author Daniel Amador
 */
public class EditGroupController implements ActionListener {

    private Group editing;
    private ArrayList<Team> copy;
    private ArrayList<Group> groups = Lobby.controller.getGroups();
    private EditGroup window;

    public EditGroupController(Group group, EditGroup window) {
        this.editing = group;
        copy = editing.getTeams();
        this.window = window;
        window.btnSave.setEnabled(false);
        managerMethods();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack) {
            window.jumpBeforeWindow();
        }
        if (e.getSource() == window.cmbTeams) {
            String selected = (String) window.cmbTeams.getSelectedItem();
            whatIs(selected);
        }
        if (e.getSource() == window.btnMakeChange) {
            makeChangeSelected();
        }
    }

    private void chargeData() {
        for (int i = 0; i < copy.size(); i++) {
            chooseData(i);
        }
    }

    private void chooseData(int id) {
        switch (id) {
            case 0: {
                if (copy.get(0) != null) {
                    window.lblA1.setIcon(copy.get(0).getImageTeam());
                    window.nameA1.setText(copy.get(0).getName());

                }
                break;
            }
            case 1: {
                if (copy.get(1) != null) {
                    window.lblA2.setIcon(copy.get(1).getImageTeam());
                    window.nameA2.setText(copy.get(1).getName());
                }
                break;
            }
            case 2: {
                if (copy.get(2) != null) {
                    window.lblA3.setIcon(copy.get(2).getImageTeam());
                    window.nameA3.setText(copy.get(2).getName());
                }
                break;
            }
            case 3: {
                if (copy.get(3) != null) {
                    window.lblA4.setIcon(copy.get(3).getImageTeam());
                    window.nameA4.setText(copy.get(3).getName());
                }
                break;
            }
        }
    }

    private void fillComboBox() {
        for (int i = 0; i < groups.size(); i++) {
            window.cmbTeams.addItem(groups.get(i).getName());
        }
    }

    private void whatIs(String selected) {
        if (selected.equals("Select a Group")) {
            window.btnSave.setEnabled(false);
        } else {
            window.btnSave.setEnabled(true);
            Group aux = searchList(selected);
            try {
                chargeDataAux(aux);
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(window, ex.getMessage());
            }
        }
    }

    private void managerMethods() {
        chargeData();
        fillComboBox();
    }

    private Group searchList(String selected) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getName().equals(selected)) {
                return groups.get(i);
            }
        }
        return null;
    }

    private void chargeDataAux(Group aux) throws ExceptionWorldCup {
        ArrayList<Team> reco = aux.getTeams();
        if (reco.size() == 0) {
            throw new ExceptionWorldCup(10);
        } else {
            for (int i = 0; i < reco.size(); i++) {
                chooseCase(i, reco);
            }
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

    private void makeChangeSelected() {
        String name1 = null;
        String name2 = null;
        try {
            name1 = selectedOne();
            name2 = selectedTwo();
        } catch (ExceptionWorldCup ex) {
            JOptionPane.showMessageDialog(window, ex.getMessage());
        }
        makeChange(name1, name2);
    }

    private String selectedOne() throws ExceptionWorldCup {
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
        throw new ExceptionWorldCup(6);
    }

    private String selectedTwo() throws ExceptionWorldCup {
        if (window.ch1.isSelected()) {
            return window.nameC1.getText();
        }
        if (window.ch1.isSelected()) {
            return window.nameC2.getText();
        }
        if (window.ch1.isSelected()) {
            return window.nameC3.getText();
        }
        if (window.ch1.isSelected()) {
            return window.nameC4.getText();
        }
        throw new ExceptionWorldCup(6);
    }

    private void makeChange(String name1, String name2) {
        Lobby.controller.makeChange(name1,name2);
    }

}
