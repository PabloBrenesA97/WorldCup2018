/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Team extends Component{
    private int cantPlayer;
    private String coach;
    private String confederacy;
    private ArrayList<Player> players = new ArrayList();
    
    
     @Override
    public Component create() {
    
        return null;
    }

    @Override
    public void update() {
      
    }

    @Override
    public void delete() {
      
    }
    
}
