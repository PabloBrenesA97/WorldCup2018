/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import pk.codeapp.model.ExeptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Daniel Amador
 */
public class StadiumController {
    /*get list of stadiums*/
    private AppController controller = Lobby.controller;
    private ArrayList<Stadium> stadiumsCopy = controller.getArrayStadiums();
    /*index that is showing */
    private int showing = 0;
    
   /**
    * add or reduce the index for move in the array
    * @param flag 
    */
    public void IncOrDec(boolean flag) {

        if (flag) {
            showing++;
        } else {
            showing--;
        }
    }
    /**
     * Return the String with the path to load the image
     * @param id
     * @return 
     */
    public String getStadiumImage(int id) {
        String icon = null;
        int show = Integer.MIN_VALUE;
        if (showing >= 0 && showing < stadiumsCopy.size()) {
            switch (id) {
                case 0: {
                    show = showing - 1;
                    break;
                }
                case 1: {
                    show = showing;
                    break;
                }
                case 2: {
                    show = showing + 1;
                    break;
                }
            }
            /**
             * if the image don't exist catch the Exception
             */
            try {
                icon = stadiumsCopy.get(show).getIcon();
                return icon;
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        } else {
            return null;
        }
    }
    /**
     * Delete a stadium
     * @throws ExeptionWorldCup 
     */
    public void delete() throws ExeptionWorldCup {
        if (stadiumsCopy.size() != 0) {
            stadiumsCopy.remove(showing);
            showing = 0;
        }else{
            throw new ExeptionWorldCup(4);
        }

    }
    /*return the list*/
    public Stadium getFromList(){
        return stadiumsCopy.get(showing);
    }
    
    /**
     * Convert the image for each label size 
     * @param path
     * @param label
     * @return new ImageIcon
     */
    public ImageIcon convertToImageIcon(String path, JLabel label) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
        }
        ImageIcon imageIcon = null;
        try {
            Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(dimg); //modo imageicon pal label
        } catch (Exception e) {
            return null;
        }
        return imageIcon;
    }
    
}
