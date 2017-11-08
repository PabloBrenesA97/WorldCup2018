/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.ShowStadium;

/**
 *
 * @author Daniel Amador
 */
public class ShowStadiumController implements ActionListener {
    private ShowStadium window;
    private Stadium stadium;
    private StadiumController controller;

    public ShowStadiumController(ShowStadium window, Stadium stadium, StadiumController controller) {
        this.window = window;
        this.stadium = stadium;
        this.controller = controller;
        chargeData();
    }
    public void chargeData(){
        window.lblImage.setIcon(controller.convertToImageIcon(stadium.getIcon(), window.lblImage));
        window.lblCapacity.setText("Capacity :"+stadium.getCapacity());
        window.lblId.setText("Id: "+stadium.getId());
        window.lblCity.setText("City: " +stadium.getCity());
        window.lblName.setText("Name: "+stadium.getName());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
