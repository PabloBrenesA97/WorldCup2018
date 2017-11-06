/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import pk.codeapp.model.ExeptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Daniel Amador
 */
public class StadiumController {

    private AppController controller = Lobby.controller;
    private ArrayList<Stadium> stadiumsCopy = controller.getArrayStadiums();
    private int showing = 0;

    public void IncOrDec(boolean flag) {

        if (flag) {
            showing++;
        } else {
            showing--;
        }
    }

    public String getStadiumImage(int id) {
        String icon = null;
        int show = Integer.MIN_VALUE;
        if (showing >= 0 && showing < stadiumsCopy.size()) {
            switch (id) {
                case 0: {
                    show = showing - 1;
                    break;
                }
                case 1: {
                    show = showing;
                    break;
                }
                case 2: {
                    show = showing + 1;
                    break;
                }
            }
            try {
                icon = stadiumsCopy.get(show).getIcon();
                return icon;
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public void delete() throws ExeptionWorldCup {
        if (stadiumsCopy.size() != 0) {
            stadiumsCopy.remove(showing);
            showing = 0;
        }else{
            throw new ExeptionWorldCup(4);
        }

    }
    public Stadium getFromList(){
        return stadiumsCopy.get(showing);
    }
    
}
