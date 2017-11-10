/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.CreateStadium;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowStadium;
import pk.codeapp.view.StadiumsScreen;

/**
 * controller from stadium screen
 *
 * @author Daniel Amador
 */
public class StadiumController implements ActionListener {

    private StadiumsScreen window;
    private AppController controller = Lobby.controller;
    private ArrayList<Stadium> stadiumsCopy = controller.getArrayStadiums();
    /*index that is showing */
    private int showing = 0;

    public StadiumController(StadiumsScreen window) {
        this.window = window;
        setImageInScreen();
    }

    /**
     * Handle event in their screen
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == window.getBtnBack()) {
            window.jumpBeforeWindow();
        }
        if (e.getSource() == window.getBtnCreate()) {
            //jumping create method
            openCreateStadium();
        }
        if (e.getSource() == window.getBtnDelete()) {
            try {
                //jumping delete method
                deleteStadium();
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(window, ex.getMessage());
            }
        }
        if (e.getSource() == window.getBtnLeft()) {
            IncOrDec(false);
            setImageInScreen();
        }
        if (e.getSource() == window.getBtnRight()) {
            IncOrDec(true);
            setImageInScreen();
        }
        if (e.getSource() == window.getBtnShow()) {
            if (stadiumsCopy.size() != 0) {
                openShowStadium();
            } else {
                try {
                    throw new ExceptionWorldCup(5);
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(window, ex.getMessage());
                }
            }

        }
        if (e.getSource() == window.getBtnUpdate()) {
            if (stadiumsCopy.size() != 0) {
                openCreateStadium(getFromList());
            } else {
                try {
                    throw new ExceptionWorldCup(5);
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(window, ex.getMessage());
                }
            }
        }
    }

    /**
     * Increase o decrease the index to show this elements in the screen
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
     * Open the screen interface
     */
    public void openShowStadium() {
        ShowStadium sc = new ShowStadium();
        sc.setData(this, getFromList());
        sc.openWindow(window);

        window.setVisible(false);
    }

    public void openCreateStadium() {
        CreateStadium sc = new CreateStadium(this);
        sc.openWindow(window);
        window.setVisible(false);
    }

    public void openCreateStadium(Stadium show) {
        CreateStadium sc = new CreateStadium(show, this);
        sc.openWindow(window);
        window.setVisible(false);
    }

    /**
     * return the path of the image to show in the screen
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
     * Transform the image to each image
     *
     * @param path
     * @param label
     * @return
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

    /*Set Image in each label*/
    private void setImageInScreen() {
        /*Left Label*/
        String path = getStadiumImage(0);
        ImageIcon newIcon = null;
        if (path != null) {
            newIcon = convertToImageIcon(path, window.lblViewLeft);
        }
        window.lblViewLeft.setIcon(newIcon);
        /*Center Label*/
        path = getStadiumImage(1);
        newIcon = null;
        if (path != null) {
            newIcon = convertToImageIcon(path, window.lblViewCenter);
        }
        window.lblViewCenter.setIcon(newIcon);
        /*Right Label*/
        path = getStadiumImage(2);
        newIcon = null;
        if (path != null) {
            newIcon = convertToImageIcon(path, window.lblViewRight);
        }
        window.lblViewRight.setIcon(newIcon);
        checkNulls();
    }

    /*Check if one label's icon is null and set enable their button*/
    private String checkNulls() {
        if (window.lblViewRight.getIcon() == null) {
            window.getBtnRight().setEnabled(false);
            return "right";
        } else {
            window.getBtnRight().setEnabled(true);
        }
        if (window.lblViewLeft.getIcon() == null) {
            window.getBtnLeft().setEnabled(false);
            return "left";
        } else {
            window.getBtnLeft().setEnabled(true);
        }
        return "nobody";
    }

    public Stadium getFromList() {
        return stadiumsCopy.get(showing);
    }

    private void deleteStadium() throws ExceptionWorldCup {

        if (stadiumsCopy.size() != 0) {
            boolean isCan = Lobby.controller.isInList(getFromList());
            if (!isCan) {
                stadiumsCopy.remove(showing);
                showing = 0;
                setImageInScreen();
            } else {
                throw new ExceptionWorldCup(1);
            }
        } else {
            throw new ExceptionWorldCup(5);
        }

    }

}
