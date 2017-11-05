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
public class Stadium extends Component {
    private String city;
    private int capacity;
    
    public void update(String name, int id, String city, int capacity) {
        super.setName(name);
        super.setId(id);
        this.capacity=capacity;
        this.city=city;
    }
        
}
