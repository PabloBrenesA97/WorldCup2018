/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pk.codeapp.model.ExeptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.model.Team;

/**
 *
 * @author Daniel Amador
 */
public class AppController {

    private Maker masterMaker = new MasterMaker();

    private ArrayList<Team> teams = new ArrayList(); // List of Teams
    private ArrayList<Stadium> arrayStadiums = new ArrayList(); //List of Stadiums
     //<editor-fold desc="ControllertoTeams" defaultstate="collapsed">
    //<editor-fold desc="createDefaultTeams" defaultstate="collapsed">
    /**
     * Create teams to Default
     */
    public void createDefaultTeams() {
        String[] namesDeafaultTeam = {"Egypt", "Nigeria", "Saudi Arabia", "Iran", "Japan", "Korea", "Germany", "Belgium", "Spain", "France", "England", "Iceland", "Poland",
            "Portugal", "Russia", "Serbia", "Costa Rica", "Mexico", "Panama"};
        String[] coachDeafaultTeam = {"Héctor Cúper", "Salisu Yusuf", "Edgardo Bauza", "Carlos Queiroz", "Vahid Halilhodžić", "Shin Tae-Yong", "Joachim Löw", "Roberto Martínez Montoliú", "Julen Lopetegui", "Didier Deschamps",
            "Gareth Southgate", "Heimir Hallgrímsson", "Adam Nawałka", "Manuel Costa", "Stanislav Cherchésov", "Aleksandar Đorđević", "Óscar Ramírez", "Juan Carlos Osorio", "Hernán Darío Gómez"};
        String[] assistantsDefaultTeam = {"Hany Ramzy", "Anthony Olubunmi", "Mohámed bin Salmán", "Carlos Queiroz", "Jefu Yunaiteddo", "Pim Verbeek", "Joachim Löw", "Yves Soudan", "Migel Angel", "Guy Stéphan", "Alberto Rubio",
            "Lagerbäck", "Pogon Szczecin", "Tareyja Costa", "Zenit de San Petersburgo", "Sergei Gurenko", "Alejandro Larrea", "Leandro Augusto", "Édgar Carvajal"};
        String[] confederaciesDefaultTeam = {"CAF", "CAF", "AFC", "AFC", "AFC", "AFC", "UEFA", "UEFA", "UEFA", "UEFA", "UEFA", "UEFA", "UEFA", "UEFA", "UEFA", "UEFA", "CONCACAF", "CONCACAF", "CONCACAF", "CSF", "CSF", "CSF", "CSF"};

        for (int i = 0; i < namesDeafaultTeam.length; i++) {
            Team  newTeam = (Team) maker.factoryMethod("Team");
            newTeam.update(i,namesDeafaultTeam[i], coachDeafaultTeam[i], assistantsDefaultTeam[i], confederaciesDefaultTeam[i]);
            teams.add(newTeam);
        }
    }
     //</editor-fold>
    /**
     * Create or Update Team
     * @param id
     * @param name
     * @param coach
     * @param assistant
     * @param confederacy 
     */
    public void addDefaultTeam(int id,String name,String coach,String assistant,String confederacy){
        Team newTeam = searchTeam(name);
        //Update team
        if(newTeam!=null){
            newTeam.update(id, name, coach, assistant, confederacy);
        }else{
            newTeam = (Team) maker.factoryMethod("Team");
            newTeam.update(id,name, coach, assistant, confederacy);
            teams.add(newTeam);
        }
    }
    /**
     *  Search the Team
     * @param id
     * @return 
     */
    public Team searchTeam(String name){
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).getName().equals(name))
                return teams.get(i);
        }
        return null;
    }
    //</editor-fold>
    
    public void addDefaultPlayers(){
        try {
            //Try si existe el equipo sino msj
            addDefaultPlayerEgypt();
        } catch (ExeptionWorldCup ex) {
            new ExeptionWorldCup(5);
            ex.getMessage();
        }
    }
    private void addDefaultPlayerEgypt() throws ExeptionWorldCup{
        Team teamEgypt = searchTeam("Egypt");
        String[] namePlayers = {"Essam El-Hadary",""};
        String[] positionPlayers = {"POR"};
        int[] oldPlayers = {44};
        int[] cantCYellowPlayers ={};
    }
    
    //<editor-fold desc="createDefaultStadiums" defaultstate="collapsed">
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
            Stadium newStadium = (Stadium) masterMaker.factoryMethod("Stadium");
            newStadium.update(stadiumsName[i], capacityStadium[i], cityStadiums[i], capacityStadium[i]);
            arrayStadiums.add(newStadium);
        }
    }

    //</editor-fold>
    
    //<editor-fold desc="All Getter & Setter here" defaultstate="collapsed">
    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Stadium> getArrayStadiums() {
        return arrayStadiums;
    }

    public void setArrayStadiums(ArrayList<Stadium> arrayStadiums) {
        this.arrayStadiums = arrayStadiums;
    }
    //</editor-fold>
}
