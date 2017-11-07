/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import pk.codeapp.model.ExeptionWorldCup;
import pk.codeapp.model.Player;
import pk.codeapp.model.Stadium;
import pk.codeapp.model.Team;

/**
 *
 * @author Daniel Amador
 */
public class AppController {

    private Maker masterMaker = new MasterMaker();
    private  DefaultListModel<String> listModel = new DefaultListModel();
    private ArrayList<Team> teams = new ArrayList(); // List of Teams
    private ArrayList<Stadium> arrayStadiums = new ArrayList(); //List of Stadiums
    private Team viewTeam;
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
        String[] images ={"src/pk/codeapp/view/image/flagTeams/egy.png","src/pk/codeapp/view/image/flagTeams/nga.png","src/pk/codeapp/view/image/flagTeams/ksa.png","src/pk/codeapp/view/image/flagTeams/irn.png","src/pk/codeapp/view/image/flagTeams/jpn.png","src/pk/codeapp/view/image/flagTeams/kor.png",
        "src/pk/codeapp/view/image/flagTeams/ger.png","src/pk/codeapp/view/image/flagTeams/bel.png","src/pk/codeapp/view/image/flagTeams/esp.png","src/pk/codeapp/view/image/flagTeams/fra.png","src/pk/codeapp/view/image/flagTeams/eng.png",
        "src/pk/codeapp/view/image/flagTeams/isl.png","src/pk/codeapp/view/image/flagTeams/pol.png","src/pk/codeapp/view/image/flagTeams/por.png","src/pk/codeapp/view/image/flagTeams/rus.png","src/pk/codeapp/view/image/flagTeams/srb.png",
        "src/pk/codeapp/view/image/flagTeams/crc.png","src/pk/codeapp/view/image/flagTeams/mex.png","src/pk/codeapp/view/image/flagTeams/pan.png"};
        for (int i = 0; i < namesDeafaultTeam.length; i++) {
            Team  newTeam = (Team) masterMaker.factoryMethod("Team");
            newTeam.update(i,namesDeafaultTeam[i], coachDeafaultTeam[i], assistantsDefaultTeam[i], confederaciesDefaultTeam[i],new ImageIcon(images[i]));
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
    public boolean addTeam(int id,String name,String coach,String assistant,String confederacy) throws ExeptionWorldCup{
        Team newTeam = searchTeam(name);
        //Update team
        if(newTeam==null){
            newTeam = (Team) masterMaker.factoryMethod("Team");
            newTeam.update(id,name, coach, assistant, confederacy,null);
            teams.add(newTeam);
            return true;
        }
        return false;
    }
    
//    public DefaultListModel<String> viewPlayerInList(Team team){
//        DefaultListModel<String> list = new DefaultListModel();
//       
//    }
   
    /**
     * Update Team 
     * @param name
     * @param coach
     * @param assistant
     * @param confederacy
     * @return
     * @throws ExeptionWorldCup 
     */
    public boolean updateTeam(String name,String coach,String assistant,String confederacy) throws ExeptionWorldCup{
        Team newTeam = searchTeam(name);
         if(newTeam!=null){
             newTeam.update(newTeam.getId(),name, coach, assistant, confederacy,newTeam.getImageTeam());
             return true;
         }
             return false;
    }
    public boolean deleteTeam(Team teamDelete){
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).equals(teamDelete)){
                if(teams.get(i).getPlayers().isEmpty())
                    return false;
                else{
                teams.remove(i);
                return true;}
            }
        }
        return false;
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
    //<editor-fold desc="ControllertoPlayers" defaultstate="collapsed">
    public void addDefaultPlayers(){
        try {
            //Try si existe el equipo sino msj
            addDefaultPlayerEgypt();
            addDefaultPlayerNigeria();
            addDefaultPlayerSaudiArabia();
            addDefaultPlayerIran();
            addDefaultPlayerJapan();
            addDefaultPlayerKorea();
            addDefaultPlayerGermany();
            addDefaultPlayerBelgium();
            addDefaultPlayerSpain();
            addDefautlPlayerFrance();
            addDefaultPlayerEngland();
            addDefaultPlayerIceland();
            addDefaultPlayerPoland();
            addDefaultPlayerPortugal();
            addDefaultPlayerRussia();
            addDefaultPlayerSerbia();
            addDefaultPlayerCostaRica();
            addDefaultPlayerMexico();
            addDefaultPlayerPanama();
        } catch (ExeptionWorldCup ex) {
            new ExeptionWorldCup(5);
            ex.getMessage();
        }
    }
    //<editor-fold desc="addDefaultPlayerPanama" defaultstate="collapsed">
   /**
    * Add Default player in Panama
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerPanama() throws ExeptionWorldCup{
        Team panama = searchTeam("Panama");
        String[] namePlayers = {"Alex Rodríguez","José Calderón","Roderick Miller","Erick Davis","Luis Ovalle","Roberto Chen",
        "Gabriel Gómez","Édgar Bárcenas","Armando Cooper","Ricardo Clarke","Gabriel Torres","Ismael Díaz"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {27,32,25,26,29,23,33,24,29,25,29,20};
        int[] cantCYellowPlayers ={1,0,0,0,0,1,0,2,0,0,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,1,0,0,0};
        int[] numUsePlayers ={1,12,13,15,17,23,6,8,11,7,9,10};
        int[] cantGoals = {0,0,0,0,0,2,0,0,0,1,3,0};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            panama.getPlayers().add(newPlayer);
        }
        panama.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
     //<editor-fold desc="addDefaultPlayerMexico" defaultstate="collapsed">
   /**
    * Add Default player in Mexico
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerMexico() throws ExeptionWorldCup{
        Team mexico = searchTeam("Mexico");
        String[] namePlayers = {"Guillermo Ochoa","Jesús Corona","Héctor Moreno","Miguel Layun","Diego Reyes","Hugo Ayala",
        "Andrés Guardado","Giovani dos Santos","Héctor Herrera","Hirving Lozano","Javier Hernández","	Carlos Vela"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {31,36,29,29,25,30,31,28,27,22,29,28};
        int[] cantCYellowPlayers ={0,0,1,0,1,0,0,0,0,0,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,0,1,1,0};
        int[] numUsePlayers ={13,1,15,7,5,4,18,10,16,8,14,11};
        int[] cantGoals = {0,0,0,0,0,0,0,0,0,1,2,1};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            mexico.getPlayers().add(newPlayer);
        }
        mexico.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerSerbia" defaultstate="collapsed">
   /**
    * Add Default player in Serbia
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerCostaRica() throws ExeptionWorldCup{
        Team costaRica = searchTeam("Costa Rica");
        String[] namePlayers = {"Patrick Pemberton","Keylor Navas","Cristian Gamboa","José Salvatierra","Bryan Oviedo","Kendall Waston",
        "Celso Borges","David Guzmán","Yeltsin Tejeda","Bryan Ruiz","Marco Ureña","Christian Bolaños"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {35,30,28,28,27,29,29,27,25,32,27,33};
        int[] cantCYellowPlayers ={0,0,1,0,0,0,1,0,0,0,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,0,0,0,0};
        int[] numUsePlayers ={18,1,16,6,8,19,5,20,17,10,21,7};
        int[] cantGoals = {0,0,0,1,0,0,0,2,0,1,3,5};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            costaRica.getPlayers().add(newPlayer);
        }
        costaRica.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerSerbia" defaultstate="collapsed">
   /**
    * Add Default player in Serbia
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerSerbia() throws ExeptionWorldCup{
        Team serbia = searchTeam("Serbia");
        String[] namePlayers = {"Vladimir Stojković","Željko Brkić","Ivan Obradovic","Nenad Tomović","Branislav Ivanović","Aleksandar Kolarov",
        "Nemanja Gudelj","Zoran Tošić","Radosav Petrović","Aleksandar Mitrović","Filip Kostić","Andrija Živković"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {34,31,29,30,33,31,25,30,28,23,25,21};
        int[] cantCYellowPlayers ={0,0,1,0,1,0,0,1,0,0,2,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,1,0,0,0,1,0};
        int[] numUsePlayers ={1,25,2,4,6,11,5,7,8,9,17,18};
        int[] cantGoals = {0,0,0,0,1,0,0,1,0,0,4,1};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            serbia.getPlayers().add(newPlayer);
        }
        serbia.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerRussia" defaultstate="collapsed">
   /**
    * Add Default player in Russia
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerRussia() throws ExeptionWorldCup{
        Team portugal = searchTeam("Russia");
        String[] namePlayers = {"Ígor Akinféyev","Yuri Lodyguin","Román Shishkin","Ígor Smólnikov","Serguéi Ignashévich","Ilya Kutepov",
        "Artur Yusúpov","Denís Glushakov","Pável Mamáyev","Aleksandr Kokorin","Fiódor Smólov","Artiom Dziuba"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {31,27,30,29,38,23,28,30,29,26,27,29};
        int[] cantCYellowPlayers ={0,0,2,0,0,0,0,0,0,0,0,0};
        int[] cantCRedPlayers = {0,0,1,0,0,0,0,0,0,0,0,0};
        int[] numUsePlayers ={1,12,2,3,4,5,7,8,11,9,10,22};
        int[] cantGoals = {0,0,1,0,0,0,0,2,0,1,3,2};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            portugal.getPlayers().add(newPlayer);
        }
        portugal.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerPortugal" defaultstate="collapsed">
   /**
    * Add Default player in Portugal
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerPortugal() throws ExeptionWorldCup{
         Team portugal = searchTeam("Portugal");
        String[] namePlayers = {"Rui Patrício","José Sá","Bruno Alves","	Pepe","Luís Neto","Raphaël Guerreiro",
        "João Moutinho","Danilo Pereira","William Carvalho","Cristiano Ronaldo","André Silva","Bernardo Silva"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {29,24,35,34,28,23,30,24,24,32,21,22};
        int[] cantCYellowPlayers ={0,0,0,0,1,0,0,1,0,1,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,0,0,0,0};
        int[] numUsePlayers ={1,12,2,3,4,5,8,13,14,7,9,10};
        int[] cantGoals = {0,0,0,0,0,0,1,2,1,2,6,4};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            portugal.getPlayers().add(newPlayer);
        }
        portugal.setCantPlayer(namePlayers.length);
    }
     //</editor-fold>
    
    //<editor-fold desc="addDefaultPlayerPoland" defaultstate="collapsed">
   /**
    * Add Default player in Poland
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerPoland() throws ExeptionWorldCup{
        Team poland = searchTeam("Poland");
        String[] namePlayers = {"Artur Boruc","Łukasz Fabiański","Kamil Glik","Maciej Rybus","Artur Jędrzejczyk","Michał Pazdan","Jakub Błaszczykowski",
        "Kamil Grosicki","	Grzegorz Krychowiak","Robert Lewandowski","Mariusz Stępiński","Kamil Wilczek"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {37,32,29,28,30,30,31,29,27,29,22,29};
        int[] cantCYellowPlayers ={0,0,1,0,1,0,0,0,0,0,1,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,1,0,0,0};
        int[] numUsePlayers ={12,22,15,13,3,2,16,11,10,9,27,23};
        int[] cantGoals = {0,0,0,0,0,0,1,1,0,2,4,0};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            poland.getPlayers().add(newPlayer);
        }
        poland.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerIceland" defaultstate="collapsed">
   /**
    * Add Default player in Iceland
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerIceland() throws ExeptionWorldCup{
        Team iceland = searchTeam("Iceland");
        String[] namePlayers = {"Hannes Halldórsson","Ögmundur Kristinsson","Birkir Már Sævarsson","Ragnar Sigurðsson","Kári Árnason","Ari Freyr Skúlason",
        "Aron Gunnarsson","Jóhann Berg Guðmundsson","Birkir Bjarnason","Alfreð Finnbogason","Viðar Kjartansson","Kjartan Finnbogason"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {33,28,32,31,35,30,28,27,29,28,27,31};
        int[] cantCYellowPlayers ={0,0,1,0,1,0,0,0,0,0,1,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,1,0,0,0};
        int[] numUsePlayers ={1,14,6,13,23,50,7,5,11,10,27,24};
        int[] cantGoals = {0,0,0,0,0,2,0,1,0,1,2,1};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            iceland.getPlayers().add(newPlayer);
        }
        iceland.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    
    //<editor-fold desc="addDefaultPlayerEngland" defaultstate="collapsed">
   /**
    * Add Default player in England
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerEngland() throws ExeptionWorldCup{
        Team england = searchTeam("England");
        String[] namePlayers = {"Joe Hart","Jack Butland","Gary Cahill","Kyle Walker","Phil Jones","John Stones",
        "Jordan Henderson","Raheem Sterling","Ashley Young","Harry Kane","Jamie Vardy","Marcus Rashford"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {30,24,31,27,25,23,27,22,32,24,30,20};
        int[] cantCYellowPlayers ={0,0,1,0,1,0,0,0,0,0,1,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,1,0,0,0};
        int[] numUsePlayers ={1,1,24,2,28,16,14,18,9,9,7,10};
        int[] cantGoals = {0,0,0,1,0,0,4,0,1,0,2,3,7};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            england.getPlayers().add(newPlayer);
        }
        england.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
     //<editor-fold desc="addDefaultPlayerFrance" defaultstate="collapsed">
   /**
    * Add Default player in France
    * @throws ExeptionWorldCup 
    */
    private void addDefautlPlayerFrance() throws ExeptionWorldCup{
        Team france = searchTeam("France");
        String[] namePlayers = {"Steve Mandanda","Benoît Costil","Laurent Koscielny","Raphaël Varane","Lucas Digne","Christophe Jallet",
        "Blaise Matuidi","Moussa Sissoko","Adrien Rabiot","Antoine Griezmann","Olivier Giroud","Anthony Martial"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {32,30,32,24,24,34,30,28,22,26,31,21};
        int[] cantCYellowPlayers ={0,0,1,0,0,0,1,0,0,0,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,0,0,0,0};
        int[] numUsePlayers ={16,1,21,4,17,2,14,18,15,7,9,11};
        int[] cantGoals = {0,0,0,1,0,0,4,0,1,0,2,3};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            france.getPlayers().add(newPlayer);
        }
        france.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
     //<editor-fold desc="addDefaultPlayerSpain" defaultstate="collapsed">
   /**
    * Add Default player in Spain
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerSpain() throws ExeptionWorldCup{
        Team spain = searchTeam("Spain");
        String[] namePlayers = {"David de Gea","Pepe Reina","Alberto Moreno","Marc Bartra","Gerard Piqué","Sergio Ramos",
        "David Silva","Isco","Sergio Busquets","Álvaro Morata","Iago Aspas","Rodrigo"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {26,35,25,26,30,31,31,25,29,25,30,26};
        int[] cantCYellowPlayers ={0,0,0,0,1,0,0,0,0,2,0,1};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,0,1,0,0};
        int[] numUsePlayers ={1,25,18,3,15,13,21,22,5,7,17,19};
        int[] cantGoals = {0,1,0,0,0,0,2,0,1,0,3,4};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            spain.getPlayers().add(newPlayer);
        }
        spain.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerBelgium" defaultstate="collapsed">
   /**
    * Add Default player in Belgium
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerBelgium() throws ExeptionWorldCup{
        Team belgium = searchTeam("Belgium");
        String[] namePlayers = {"Thibaut Courtois","Simon Mignolet","Jan Vertonghen","Thomas Vermaelen","Thomas Meunier","Laurent Ciman",
        "Axel Witsel","Mousa Dembélé","Kevin De Bruyne","Eden Hazard","Romelu Lukaku","Dries Mertens"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {25,29,30,31,26,32,28,30,26,26,24,30};
        int[] cantCYellowPlayers ={0,1,0,0,0,0,0,1,0,0,0,2};
        int[] cantCRedPlayers = {0,0,0,1,0,1,0,0,0,0,0,1};
        int[] numUsePlayers ={53,19,94,61,19,18,83,70,53,80,60,61};
        int[] cantGoals = {0,1,0,0,0,0,2,0,1,0,3,4};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            belgium.getPlayers().add(newPlayer);
            
        }
        belgium.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerGermany" defaultstate="collapsed">
   /**
    * Add Default player in Germany
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerGermany() throws ExeptionWorldCup{
        Team germany = searchTeam("Germany");
        String[] namePlayers = {"Kevin Trapp","Bernd Leno","Niklas Süle","Marvin Plattenhardt","Matthias Ginter","Mats Hummels",            
        "Sami Khedira","Julian Draxler","Toni Kroos","Mesut Özil","Thomas Müller","Mario Gómez"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {27,25,22,25,23,28,30,24,27,29,28,32};
        int[] cantCYellowPlayers ={0,0,0,1,0,1,0,0,0,0,0,1};
        int[] cantCRedPlayers = {0,1,0,0,0,0,0,0,0,0,1,0};
        int[] numUsePlayers ={1,6,7,4,16,60,12,11,10,89,71,13};
        int[] cantGoals = {0,0,0,0,0,3,0,0,2,0,1,0};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            germany.getPlayers().add(newPlayer);
            
        }
        germany.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
     //<editor-fold desc="addDefaultPlayerKorea" defaultstate="collapsed">
   /**
    * Add Default player in Korea
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerKorea() throws ExeptionWorldCup{
        Team korea = searchTeam("Korea");
        String[] namePlayers = {"Kim Seunggyu","Kim Jinhyeon","Kim Younggwon","Jang Hyunsoo","Kim Jinsu","Kim Minwoo",
        "Ki Sungyueng","Koo Jacheol","Son Heungmin","Lee Keunho","Lee Jeonghyeop","Lee Changmin"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {27,30,27,26,25,27,28,28,25,32,26,23};
        int[] cantCYellowPlayers ={0,0,0,2,0,0,0,0,0,1,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,0,0,0,0,0,1,0};
        int[] numUsePlayers ={26,13,48,40,26,12,95,63,59,78,18,0};
        int[] cantGoals = {0,0,0,1,0,0,0,0,3,0,2,0};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            korea.getPlayers().add(newPlayer);
            
        }
        korea.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerJapan" defaultstate="collapsed">
   /**
    * Add Default player in Japan
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerJapan() throws ExeptionWorldCup{
        Team japan = searchTeam("Japan");
        String[] namePlayers = {"Eiji Kawashima","Masaaki Higashiguchi","Yūto Nagatomo","Tomoaki Makino","Maya Yoshida","Hiroki Sakai",
        "Shu Kurata","Shinji Kagawa","Yūki Kobayashi","Takashi Inui","Yuya Osako","Takuma Asano"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {34,31,31,30,29,27,28,28,25,29,27,22};
        int[] cantCYellowPlayers ={0,1,0,0,0,0,1,0,0,1,0,0};
        int[] cantCRedPlayers = {0,0,1,0,0,0,0,0,1,0,0,0};
        int[] numUsePlayers ={78,3,99,20,78,38,6,89,4,23,9,14};
        int[] cantGoals = {0,1,0,0,0,0,3,0,2,1,0,1};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            japan.getPlayers().add(newPlayer);
            
        }
        japan.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerIran" defaultstate="collapsed">
   /**
    * Add Default player in Iran
    * @throws ExeptionWorldCup 
    */
    private void addDefaultPlayerIran() throws ExeptionWorldCup{
        Team iran = searchTeam("Iran");
        String[] namePlayers = {"Alireza Beiranvand","Mohammad Rashid Mazaheri","Jalal Hosseini","Morteza Pouraliganji","Ramin Rezaeian","Vouria Ghafouri",
        "Ehsan Hajsafi","Ashkan Dejagah","Alireza Jahanbakhsh","Karim Ansarifard","Reza Ghoochannejhad","Sardar Azmoun"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {25,28,35,25,27,30,27,31,24,27,30,22};
        int[] cantCYellowPlayers ={0,0,0,0,1,1,1,0,0,0,0,0};
        int[] cantCRedPlayers = {0,0,0,0,0,1,0,0,0,0,1,0};
        int[] numUsePlayers ={16,2,112,23,22,17,88,42,32,58,38,28};
        int[] cantGoals = {0,1,0,0,0,0,3,0,2,1,0,1};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            iran.getPlayers().add(newPlayer);
            
        }
        iran.setCantPlayer(namePlayers.length);
    } 
    //</editor-fold>
    //<editor-fold desc="addDefaultPlayerSaudiArabia" defaultstate="collapsed">
    /**
     *  Add Default player in SaudiArabia
     * @throws ExeptionWorldCup 
     */
    private void addDefaultPlayerSaudiArabia() throws ExeptionWorldCup{
        Team saudiArabia = searchTeam("Saudi Arabia");
        String[] namePlayers = {"Waleed Abdullah","Abdullah Al-Mayouf","Hassan Muath","Mansoor Al-Harbi","Omar Hawsawi","Yasser Al-Shahrani",
        "Taisir Al-Jassim","Yahya Al-Shehri","Salman Al-Faraj","Muhannad Assiri","	Mukhtar Fallatah","Hazaa Al-Hazaa"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {31,30,31,30,32,25,33,27,28,31,30,26};
        int[] cantCYellowPlayers ={0,0,1,0,0,0,0,2,0,1,0,0};
        int[] cantCRedPlayers = {0,0,0,0,1,0,0,0,0,1,0,0};
        int[] numUsePlayers ={70,7,63,33,31,28,121,49,36,13,8,2};
        int[] cantGoals = {0,1,0,0,0,0,3,0,2,1,0,1};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            saudiArabia.getPlayers().add(newPlayer);
            
        }
        saudiArabia.setCantPlayer(namePlayers.length);
    }
     //</editor-fold>
    //<editor-fold desc="addDefaultPlayerNigeria" defaultstate="collapsed">
    /**
     * Add Default player in Nigeria
     * @throws ExeptionWorldCup 
     */
    private void addDefaultPlayerNigeria() throws ExeptionWorldCup{
        Team teamNigeria = searchTeam("Nigeria");
        String[] namePlayers = {"Ikechukwu Ezenwa","Austin Ejide","Elderson Echiéjilé","Efe Ambrose","Azubuike Egwuekwe","Kunle Odunlami","Ejike Uzoenyi",
        "John Obi Mikel","Victor Moses","Ahmed Musa","Obafemi Martins","Emmanuel Emenike"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {29,33,29,29,28,27,29,30,26,25,33,30};
        int[] cantCYellowPlayers ={0,0,0,0,0,1,0,1,0,1,0,1};
        int[] cantCRedPlayers = {0,0,0,0,0,0,1,0,0,0,0,1};
        int[] numUsePlayers ={1,16,2,5,6,12,3,10,11,7,8,9};
        int[] cantGoals = {0,0,0,1,1,0,2,0,0,2,1,2};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            teamNigeria.getPlayers().add(newPlayer);
            
        }
        teamNigeria.setCantPlayer(namePlayers.length);
    }
    //</editor-fold>
    
    //<editor-fold desc="addDefaultPlayerEgypt" defaultstate="collapsed">
    /**
     * Add Default player in Egypt
     * @throws ExeptionWorldCup 
     */
    private void addDefaultPlayerEgypt() throws ExeptionWorldCup{
        Team teamEgypt = searchTeam("Egypt");
        String[] namePlayers = {"Essam El-Hadary","Sherif Ekramy","Ahmed Elmohamady","Ahmed Fathy","Ahmed Hegazy","Saad Samir","Amr Warda","Mohamed Elneny","Ramadan Sobhi","Mohamed Salah"
        ,"Kahraba","Ahmed Hassan"};
        String[] positionPlayers = {"POR","POR","DEF","DEF","DEF","DEF","MED","MED","MED","DEL","DEL","DEL"};
        int[] agePlayers = {44,34,30,32,26,28,24,25,20,25,23,24};
        int[] cantCYellowPlayers ={1,0,1,1,0,0,0,1,0,1,0,1};
        int[] cantCRedPlayers = {0,0,0,1,0,0,0,0,0,0,0,1};
        int[] numUsePlayers ={1,16,3,7,6,20,22,17,14,10,11,9};
        int[] cantGoals = {0,0,0,0,1,0,2,0,1,4,1,2};
        for (int i = 0; i < namePlayers.length; i++) {
            Player newPlayer = (Player) masterMaker.factoryMethod("Player");
            newPlayer.update(i, namePlayers[i], positionPlayers[i], agePlayers[i],cantCYellowPlayers[i] ,cantCRedPlayers[i],numUsePlayers[i],cantGoals[i]);
            teamEgypt.getPlayers().add(newPlayer);
            
        }
        teamEgypt.setCantPlayer(namePlayers.length);
    }
     //</editor-fold>
    
//</editor-fold>
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

    public Team getViewTeam() {
        return viewTeam;
    }

    public void setViewTeam(Team viewTeam) {
        this.viewTeam = viewTeam;
    }
}
