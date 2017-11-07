/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 *
 * @author Jose Pablo Brenes
 */
public class Team extends Component{
    private int cantPlayer;
    private String coach;
    private String confederacy;
    private String assistant;

    private ArrayList<Player> players = new ArrayList();
    private ImageIcon imageTeam;
    public void update(int id,String name,String coach,String assistant,String confederacy,ImageIcon imageTeam){
        setId(id);
        setName(name);
        setCoach(coach);
        setAssistant(assistant);
        setConfederacy(confederacy);
        setImageTeam(imageTeam);

    }
    
    public int getCantPlayer() {
        return cantPlayer;
    }

    public void setCantPlayer(int cantPlayer) {
        this.cantPlayer = cantPlayer;
    }
    
    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getConfederacy() {
        return confederacy;
    }

    public void setConfederacy(String confederacy) {
        this.confederacy = confederacy;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public ImageIcon getImageTeam() {
        return imageTeam;
    }

    public void setImageTeam(ImageIcon imageTeam) {
        this.imageTeam = imageTeam;
    }
}
