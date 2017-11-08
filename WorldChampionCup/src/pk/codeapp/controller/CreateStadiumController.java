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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.CreateStadium;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Daniel Amador
 */
public class CreateStadiumController implements ActionListener {

    private CreateStadium window;
    private String path;
    private StadiumController controller;
    private Stadium stadium;
    private Maker maker = new MasterMaker();
    private String mode = "Creating";

    public CreateStadiumController(CreateStadium window, StadiumController controller) {
        this.window = window;
        this.controller = controller;
        addActionsLister();
        mode = "Creating";
    }

    public CreateStadiumController(CreateStadium aThis, StadiumController control, Stadium show) {
        this.stadium = show;
        this.window = aThis;
        this.controller = control;
        addActionsLister();
        mode = "Editing";
        window.lblName.setEditable(false);
        chargeData();
    }

    /**
     * Handle of events that are throws in the Create Stadium Screen
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.getBtnBack()) {
            window.jumpBeforeWindow();
        }
        if (e.getSource() == window.getBtnSave()) {
            saveNewStadium();
        }
        if (e.getSource() == window.getBtnSearch()) {
            openFileChooser();
        }
    }

    private void saveNewStadium() {

        try {
            createStadium(window.getLblName().getText(), window.getLblCity().getText(), window.getLblCapacity().getText(), window.getLblId().getText(), path);
            JOptionPane.showMessageDialog(window, "Succesful");
        } catch (ExceptionWorldCup ex) {
            JOptionPane.showMessageDialog(window, ex.getMessage());
        }
    }

    private void openFileChooser() {
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        int returnValue = chooser.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            try {
                window.getShowImage().setIcon(controller.convertToImageIcon(path, window.getShowImage()));
            } catch (Exception e) {

            }
        }
    }

    private void createStadium(String name, String city, String capacity, String id, String path) throws ExceptionWorldCup {
        if (name == null | city == null | capacity == null | id == null | path == null) {
            throw new ExceptionWorldCup(6);
        } else {
            int idInt = Integer.parseInt(id);
            int capacityInt = Integer.parseInt(capacity);
            
            if (mode.equalsIgnoreCase("creating")) {
                if (exist(idInt)==null) {
                    throw new ExceptionWorldCup(9);
                } else {
                    
                    Stadium stadium = (Stadium) maker.factoryMethod("Stadium");
                    stadium.update(name, idInt, city, capacityInt);
                    stadium.setIcon(path);
                    Lobby.controller.addStadium(stadium);
                }
            } else {
                updateData(name, idInt, city, capacityInt,path);
            }

        }
    }

    public void addActionsLister() {
        window.getBtnBack().addActionListener(this);
        window.getBtnSave().addActionListener(this);
        window.getBtnSearch().addActionListener(this);
    }

    public Stadium exist(int id) {
        for (int i = 0; i < Lobby.controller.getArrayStadiums().size(); i++) {
            if (Lobby.controller.getArrayStadiums().get(i).getId() == id) {
                return Lobby.controller.getArrayStadiums().get(i) ;
            }
        }
        return null;
    }

    private void updateData(String name, int idInt, String city, int capacityInt,String path) throws ExceptionWorldCup {
        Stadium stadium = exist(idInt);
        if(stadium!=null){
            stadium.update(name, idInt, city, capacityInt);
            stadium.setIcon(path);
        }else{
            throw new ExceptionWorldCup(10);
        }
    }

    private void chargeData() {
       window.lblName.setText(stadium.getName());
       window.lblCity.setText(stadium.getCity());
       window.lblCapacity.setText(stadium.getCapacity()+"");
       window.lblId.setText(stadium.getId()+"");
       window.getShowImage().setIcon(controller.convertToImageIcon(stadium.getIcon(), window.getShowImage()));
    }
}
