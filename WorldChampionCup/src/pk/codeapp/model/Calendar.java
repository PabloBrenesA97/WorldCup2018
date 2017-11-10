/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Calendar{
    private int id;
    private Team team1;
    private Team team2;
    private String date;
    private Stadium stadium;

    public  Calendar(int id, Team team1, Team team2, String date, Stadium stadium) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.stadium = stadium;
        
    }
    public void update(String date, Stadium stadium){
        this.date = date;
        this.stadium = stadium;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
    

}
