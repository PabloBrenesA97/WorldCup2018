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

    public void update(int id, Team team1, Team team2, String date, Stadium stadium) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.stadium = stadium;
    }
    

}
