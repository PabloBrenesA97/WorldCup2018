
import java.util.ArrayList;
import pk.codeapp.model.Group;
import pk.codeapp.model.Result;
import pk.codeapp.view.Lobby;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel Amador
 */
public class ShowTablePositionsController {
    private ArrayList<Group> group = Lobby.controller.getGroups();
    private ArrayList<Result> result = Lobby.controller.getListResults();
    private Data team1, team2, team3, team4;
    ArrayList<Data> aux = new ArrayList();
    
    private void fiilData(Data team) {
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getTeam1().getName().equals(team)) {
                isTeam1(team, result.get(i));
            } else {
                isTeam2(team, result.get(i));
            }
        }
    }
    private void isTeam1(Data team, Result get) {
        team.PJ++;
        team.GA += get.getCantGoalsTeam1();
        team.GE += get.getCantGoalsTeam2();
        team.GD=team.GA-team.GE;
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
    private void isTeam2(Data team, Result get) {
        team.PJ++;
        team.GA += get.getCantGoalsTeam2();
        team.GE += get.getCantGoalsTeam1();
        team.GD=team.GA-team.GE;
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
    private Data getMajor() {

        Data major = aux.get(0);
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i + 1) != null) {
                if (major.pts < aux.get(i + 1).pts) {
                    major = aux.get(i + 1);
                    aux.remove(i);
                }
            }
        }
        return major;
    }
    class Data {

        int PJ = 0, PG = 0, PE = 0, PP = 0, GA = 0, GE = 0, GD = 0, pts = 0;
        String nombre;
    }
    public void generateData(Group reco) {
        team1=new Data();
        team2= new Data();
        team3= new Data();
        team4= new Data();
        if (reco.getTeams() != null) {
            if (reco.getTeams().get(0) != null) {
                team1.nombre = reco.getTeams().get(0).getName();
                fiilData(team1);
                aux.add(team1);
            }

            if (reco.getTeams().get(1) != null) {
                team2.nombre = reco.getTeams().get(1).getName();
                fiilData(team2);
                aux.add(team2);
            }
            if (reco.getTeams().get(2) != null) {
                team3.nombre = reco.getTeams().get(2).getName();
                fiilData(team3);
                aux.add(team3);
            }
            if (reco.getTeams().get(3) != null) {
                team4.nombre = reco.getTeams().get(3).getName();
               aux.add(team4);
            }
        }
    }
    
}
