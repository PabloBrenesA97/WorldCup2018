/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose Pablo Brenes
 * 
 */
public class Stadium extends Component {
    private String city;
    private int capacity;
    private String icon;
    public void update(String name, int id, String city, int capacity) {
        super.setName(name);
        super.setId(id);
        this.capacity=capacity;
        this.city=city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon= icon;
    }
    
        
}
