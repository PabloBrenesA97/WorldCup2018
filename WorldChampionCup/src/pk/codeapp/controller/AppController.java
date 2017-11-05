/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.util.ArrayList;
<<<<<<< HEAD
import pk.codeapp.model.Stadium;
=======
import pk.codeapp.model.Team;
>>>>>>> master

/**
 *
 * @author Daniel Amador
 */
public class AppController {
    private ArrayList<Team> teams = new ArrayList(); // List of Teams

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    
    
    
    ArrayList<Stadium> ArrayStadiums = new ArrayList();
    
    
    public void CreateDefaultStadiums(){
        String[] stadiumsName= {};
    }
}
