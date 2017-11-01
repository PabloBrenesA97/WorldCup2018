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
public class Player extends Component implements Edit{
    private String position;
    private int age;
    private int cantCardYellow;
    private int cantCardRed;
    private int number;
    private int goals;

    public Player(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void create() {
       
    }

    @Override
    public void update() {
        
    }

    @Override
    public void delete() {
        
    }
    
    
}
