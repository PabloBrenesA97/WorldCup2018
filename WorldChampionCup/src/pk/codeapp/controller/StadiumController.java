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
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.CreateStadium;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Daniel Amador
 */
public class StadiumController {

    /*get list of stadiums*/
    private AppController controller = Lobby.controller;
    private Maker maker = new MasterMaker();
    private ArrayList<Stadium> stadiumsCopy = controller.getArrayStadiums();
    /*index that is showing */
    private int showing = 0;

    /**
     * add or reduce the index for move in the array
     *
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
     *
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
     *
     * @throws ExceptionWorldCup
     */
    public void delete() throws ExceptionWorldCup {
        if (stadiumsCopy.size() != 0) {
            stadiumsCopy.remove(showing);
            showing = 0;
        } else {
            throw new ExceptionWorldCup(5);
        }

    }

    /*return the list*/
    public Stadium getFromList() {
        return stadiumsCopy.get(showing);
    }

    /**
     * Convert the image for each label size
     *
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

    public void createStadium(String name, String city, String capacity, String id, String path, boolean state) throws ExceptionWorldCup {
       
        if (name == null | city == null | path == null | capacity == null | id == null) {
            throw new ExceptionWorldCup(6);
        } else {
            int capacityEx = 0;
            int ident = 0;
            try {
                capacityEx = Integer.parseInt(capacity);
                ident = Integer.parseInt(id);

            } catch (Exception e) {

            }
            if (capacityEx != 0 && ident != 0) {
                if (capacityEx < 100) {
                    throw new ExceptionWorldCup(7);
                } else {
                    if (exist(ident = Integer.parseInt(id))) {
                        throw new ExceptionWorldCup(9);
                    } else {
                        if (state) {
                            Stadium newStadium = (Stadium) maker.factoryMethod("Stadium");
                            newStadium.update(name, ident, city, capacityEx);
                            newStadium.setIcon(path);
                            controller.addStadium(newStadium);
                        }else{
                            controller.getArrayStadiums().get(showing).update(name, ident, city, capacityEx);
                             controller.getArrayStadiums().get(showing).setIcon(path);
                        }
                    }
                }
            }
        }
    }

    private boolean exist(int id) {
        for (int i = 0; i < stadiumsCopy.size(); i++) {
            if (stadiumsCopy.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void chargeInfo(CreateStadium sc) {
        Stadium stadium = getFromList();
        sc.getLblCapacity().setText(stadium.getCapacity() + "");
        sc.getLblId().setText(stadium.getId() + "");
        sc.getLblName().setText(stadium.getName());
        sc.getLblCity().setText(stadium.getCity());
        sc.setPath(stadium.getIcon());
    }

    public void update() {
    }

}
