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
public class Result implements Edit{
    private int id;
    private Team teamWinner;
    private Team teamLoser;
    private int cantGoalsTeam1;
    private int cantGoalsTeam2;
    private int minPlayed;
    private int cantCardsYellow;
    private int cantCardsRed;
    private int cantFaults;
    private int cantCornerKicks;
    private int cantOffsides;
    private int posBalonTeam1;
    private int posBalonTeam2;

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
