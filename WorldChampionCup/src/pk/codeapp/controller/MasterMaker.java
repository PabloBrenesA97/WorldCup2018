/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import pk.codeapp.model.Component;
import pk.codeapp.model.Group;
import pk.codeapp.model.Player;
import pk.codeapp.model.Stadium;
import pk.codeapp.model.Team;

/**
 *
 * @author Daniel Amador
 */
public class MasterMaker extends Maker {

    @Override
    public Component factoryMethod(String type) {
        switch (type) {
            case "Player":
                return new Player();
            case "Stadium":
                return new Stadium();
            case "Team":
                return new Team();
            case "Group":
                return new Group();
            default:
                break;
        }
        return null;
    }
    
}
