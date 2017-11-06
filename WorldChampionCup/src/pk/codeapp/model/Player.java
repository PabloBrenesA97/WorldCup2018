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
public class Player extends Component {
    private String position;
    private int age;
    private int cantCardYellow;
    private int cantCardRed;
    private int number;
    private int goals;
    
    /**
     * Update or Create Player
     * @param id
     * @param name
     * @param position
     * @param age
     * @param cantY
     * @param cantR
     * @param number
     * @param goals 
     */
    public void update(int id,String name,String position,int age,int cantY,int cantR,int number,int goals){
        setId(id);
        setName(name);
        setPosition(position);
        setAge(age);
        setCantCardYellow(cantY);
        setCantCardRed(cantR);
        setNumber(number);
        setGoals(goals);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCantCardYellow() {
        return cantCardYellow;
    }

    public void setCantCardYellow(int cantCardYellow) {
        this.cantCardYellow = cantCardYellow;
    }

    public int getCantCardRed() {
        return cantCardRed;
    }

    public void setCantCardRed(int cantCardRed) {
        this.cantCardRed = cantCardRed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    
  

   
    
    
}
