/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.awt.Frame;
import java.util.ArrayList;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Group extends Component {

    private ArrayList<Team> teams = new ArrayList();

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(Team team) throws ExceptionWorldCup {
        if(this.teams.size()<5){
            this.teams.add(team);
        }else{
            throw new ExceptionWorldCup(11);
        }
    }

    public void update(int id, String name) {
        super.setId(id);
        super.setName(name);
    }
  
}
