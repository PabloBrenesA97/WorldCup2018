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
public class Result extends Component{
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

    public void update(int id,Team teamWinner,Team teamLoser,int cantGoalsTeam1,int cantGoalsTeam2,int minPlayed,int cantCardsYellow,int cantCardsRed,int cantFaults,int cantCornerKicks,int cantOffsides,int posBalonTeam1,
            int posBalonTeam2){
        this.id=id;
        this.teamWinner=teamWinner;
        this.teamLoser=teamLoser;
        this.cantGoalsTeam1=cantGoalsTeam1;
        this.cantGoalsTeam2=cantGoalsTeam2;
        this.minPlayed=minPlayed;
        this.cantCardsYellow=cantCardsYellow;
        this.cantCardsRed=cantCardsRed;
        this.cantFaults=cantFaults;
        this.cantCornerKicks=cantCornerKicks;
        this.cantOffsides=cantOffsides;
        this.posBalonTeam1=posBalonTeam1;
        this.posBalonTeam2=posBalonTeam2;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getTeamWinner() {
        return teamWinner;
    }

    public void setTeamWinner(Team teamWinner) {
        this.teamWinner = teamWinner;
    }

    public Team getTeamLoser() {
        return teamLoser;
    }

    public void setTeamLoser(Team teamLoser) {
        this.teamLoser = teamLoser;
    }

    public int getCantGoalsTeam1() {
        return cantGoalsTeam1;
    }

    public void setCantGoalsTeam1(int cantGoalsTeam1) {
        this.cantGoalsTeam1 = cantGoalsTeam1;
    }

    public int getCantGoalsTeam2() {
        return cantGoalsTeam2;
    }

    public void setCantGoalsTeam2(int cantGoalsTeam2) {
        this.cantGoalsTeam2 = cantGoalsTeam2;
    }

    public int getMinPlayed() {
        return minPlayed;
    }

    public void setMinPlayed(int minPlayed) {
        this.minPlayed = minPlayed;
    }

    public int getCantCardsYellow() {
        return cantCardsYellow;
    }

    public void setCantCardsYellow(int cantCardsYellow) {
        this.cantCardsYellow = cantCardsYellow;
    }

    public int getCantCardsRed() {
        return cantCardsRed;
    }

    public void setCantCardsRed(int cantCardsRed) {
        this.cantCardsRed = cantCardsRed;
    }

    public int getCantFaults() {
        return cantFaults;
    }

    public void setCantFaults(int cantFaults) {
        this.cantFaults = cantFaults;
    }

    public int getCantCornerKicks() {
        return cantCornerKicks;
    }

    public void setCantCornerKicks(int cantCornerKicks) {
        this.cantCornerKicks = cantCornerKicks;
    }

    public int getCantOffsides() {
        return cantOffsides;
    }

    public void setCantOffsides(int cantOffsides) {
        this.cantOffsides = cantOffsides;
    }

    public int getPosBalonTeam1() {
        return posBalonTeam1;
    }

    public void setPosBalonTeam1(int posBalonTeam1) {
        this.posBalonTeam1 = posBalonTeam1;
    }

    public int getPosBalonTeam2() {
        return posBalonTeam2;
    }

    public void setPosBalonTeam2(int posBalonTeam2) {
        this.posBalonTeam2 = posBalonTeam2;
    }

   
}
