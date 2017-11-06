/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.util.ArrayList;
import pk.codeapp.model.Stadium;
import pk.codeapp.model.Team;

/**
 *
 * @author Daniel Amador
 */
public class AppController {

    private Maker maker = new MasterMaker();

    private ArrayList<Team> teams = new ArrayList(); // List of Teams
    private ArrayList<Stadium> arrayStadiums = new ArrayList();

    public void createDefaultStadiums() {
        String[] stadiumsName
                = {"Kaliningrad Stadium", "Saint Petersburg Stadium", "Luzhniki Stadium",
                    "Spartak Stadium", "Kazan Arena", "Nizhny Novgorod Stadium", "Samara Arena",
                    "Mordovia Arena", "Volgograd Arena", "Rostov Arena", "Fisht Stadium",
                    "Ekaterinburg Arena"};
        int[] stadiumsCapacity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] capacityStadium = {45015, 68134, 81500, 45360, 45379, 44899, 63000, 45100, 45568, 43702, 47659};
        String[] cityStadiums = {"Kalingrand", "Saint Petersburg", "Moscow", "Moscow",
            "Kazan", "Nizhny Novgorod", "Samara", "Saransk", "Volgograd", "Rostov-on-Don",
            "Sochi", "Ekateringburg"};
        for (int i = 0; i < stadiumsName.length; i++) {
            Stadium newStadium = (Stadium) maker.factoryMethod("Stadium");
            newStadium.update(stadiumsName[i], capacityStadium[i], cityStadiums[i], capacityStadium[i]);
            arrayStadiums.add(newStadium);
        }
    }
    //<editor-fold desc="All Getter & Setter here" defaultstate="collapsed">

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    
    

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public ArrayList<Stadium> getArrayStadiums() {
        return arrayStadiums;
    }

    public void setArrayStadiums(ArrayList<Stadium> arrayStadiums) {
        this.arrayStadiums = arrayStadiums;
    }
    //</editor-fold>
}
