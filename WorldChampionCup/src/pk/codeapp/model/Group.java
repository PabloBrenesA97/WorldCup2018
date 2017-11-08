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

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
}
