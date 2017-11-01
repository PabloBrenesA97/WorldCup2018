/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Pablo Brenes
 * 
 */
public class Stadium extends Component implements Edit{
    private String city;
    private int capacity;
    //listPartidos

    public Stadium(int id, String nombre) {
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
