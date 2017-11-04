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
public class Calendar implements Edit{
    private int id;
    private Team team1;
    private Team team2;
    private String date;
    private Stadium stadium;

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
