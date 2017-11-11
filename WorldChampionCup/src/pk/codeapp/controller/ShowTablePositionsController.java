package pk.codeapp.controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pk.codeapp.model.Group;
import pk.codeapp.model.Result;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowGroupPositions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel Amador
 */
public class ShowTablePositionsController implements ActionListener {

    private ArrayList<Group> group = Lobby.controller.getGroups();
    private ArrayList<Result> result = Lobby.controller.getListResults();
    private Data team1, team2, team3, team4;
    ArrayList<Data> aux = new ArrayList();
    private ShowGroupPositions window;

    public ShowTablePositionsController(ShowGroupPositions window) {
        this.window = window;
        manager();
    }

    /**
     * Charge data for each team in the group
     *
     * @param team
     */
    private void fiilData(Data team) {
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getTeam1().getName().equals(team.name)) {
                isTeam1(team, result.get(i));
            } else if (result.get(i).getTeam2().getName().equals(team.name)) {
                isTeam2(team, result.get(i));
            }
        }
    }

    /**
     * If is a team 1
     *
     * @param team
     * @param get
     */
    private void isTeam1(Data team, Result get) {
        team.PJ++;
        team.GA += get.getCantGoalsTeam1();
        team.GE += get.getCantGoalsTeam2();
        team.GD = team.GA - team.GE;
        if (get.getCantGoalsTeam1() > get.getCantGoalsTeam2()) {
            team.PG++;
            team.pts += 3;
        } else if (get.getCantGoalsTeam1() < get.getCantGoalsTeam2()) {
            team.PP++;
        } else {
            team.pts += 1;
            team.PE++;
        }
    }

    /**
     * If is a team 2
     *
     * @param team
     * @param get
     */
    private void isTeam2(Data team, Result get) {
        team.PJ++;
        team.GA += get.getCantGoalsTeam2();
        team.GE += get.getCantGoalsTeam1();
        team.GD = team.GA - team.GE;
        if (get.getCantGoalsTeam1() < get.getCantGoalsTeam2()) {
            team.PG++;
            team.pts += 3;
        } else if (get.getCantGoalsTeam1() > get.getCantGoalsTeam2()) {
            team.PP++;
        } else {
            team.pts += 1;
            team.PE++;
        }
    }

    /**
     * Get Major
     *
     * @return
     */
    private Data getMajor() {

        Data major = aux.get(0);
        for (int i = 0; i < aux.size() - 1; i++) {
            if (aux.get(i + 1) != null) {
                if (major.pts < aux.get(i + 1).pts) {
                    major = aux.get(i + 1);
                    aux.remove(i);
                }
            }
        }
        return major;
    }

    private void setGroupA() {
        generateData(group.get(0));
        showAllGroup(window.groupA);
    }

    private void setGroupB() {
        generateData(group.get(1));
        showAllGroup(window.GroupB);
    }

    private void setGroupC() {
        generateData(group.get(2));
        showAllGroup(window.GroupC);
    }

    private void setGroupD() {
        generateData(group.get(3));
        showAllGroup(window.GroupD);
    }

    private void setGroupE() {
        generateData(group.get(4));
        showAllGroup(window.GroupE);
    }

    private void setGroupF() {
        generateData(group.get(5));
        showAllGroup(window.GroupF);
    }

    private void setGroupG() {
        generateData(group.get(6));
        showAllGroup(window.GroupG);
    }

    private void setGroupH() {
        generateData(group.get(7));
        showAllGroup(window.GroupH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack) {
            window.jumpBeforeWindow();
        }
    }

    /**
     * Object creator
     */
    class Data {

        int PJ = 0, PG = 0, PE = 0, PP = 0, GA = 0, GE = 0, GD = 0, pts = 0;
        String name;
    }

    /**
     * generate datas
     *
     * @param reco
     */
    public void generateData(Group reco) {
        aux.clear();
        if (reco.getTeams().size() != 0) {
            team1 = new Data();
            team2 = new Data();
            team3 = new Data();
            team4 = new Data();
            try {
                if (reco.getTeams().get(0) != null) {
                    team1.name = reco.getTeams().get(0).getName();
                    fiilData(team1);
                    aux.add(team1);
                }

                if (reco.getTeams().get(1) != null) {
                    team2.name = reco.getTeams().get(1).getName();
                    fiilData(team2);
                    aux.add(team2);
                }

                if (reco.getTeams().get(2) != null) {
                    team3.name = reco.getTeams().get(2).getName();
                    fiilData(team3);
                    aux.add(team3);
                }

                if (reco.getTeams().get(3) != null) {
                    team4.name = reco.getTeams().get(3).getName();
                    aux.add(team4);
                }
            }catch(Exception e){
                
            }

        }

    }

    public void manager() {
        setGroupA();
        setGroupB();
        setGroupC();
        setGroupD();
        setGroupE();
        setGroupF();
        setGroupG();
        setGroupH();

    }

    public void showAllGroup(JTable table) {
        Object[][] datas = new Object[4][9];
        /*Fill information*/
        for (int i = 0; i < 4; i++) {
            if (i < aux.size()) {
                Data tmp = aux.get(i);
                datas[i][0] = tmp.name;
                datas[i][1] = tmp.PJ;
                datas[i][2] = tmp.PG;
                datas[i][3] = tmp.PE;
                datas[i][4] = tmp.PP;
                datas[i][5] = tmp.GA;
                datas[i][6] = tmp.GE;
                datas[i][7] = tmp.GD;
                datas[i][8] = tmp.pts;
            }
        }
        /*Fill titles*/
        String[] titles = {"Name", "PJ", "PG", "PE", "PP", "GA", "GE", "GD", "PTS"};

        DefaultTableModel dtm = new DefaultTableModel(datas, titles) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        table.setModel(dtm);
        table.setPreferredScrollableViewportSize(new Dimension(860, 540));
        table.setRowHeight(45);
        table.setColumnSelectionAllowed(false);
        table.setFocusable(false);
    }
}
