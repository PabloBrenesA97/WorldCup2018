/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

//<editor-fold defaultstate="collapsed" desc="Imports">
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.CreateStadium;
import pk.codeapp.view.Lobby;
//</editor-fold>

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
    
    /**
     * Mode create, make a new stadium
     * @param window
     * @param controller 
     */
    public CreateStadiumController(CreateStadium window, StadiumController controller) {
        this.window = window;
        this.controller = controller;
        addActionsLister();
        mode = "Creating";
    }
    /**
     * Mode editing, update information from any stadium
     * @param aThis
     * @param control
     * @param show 
     */
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
    
    /**
     * Save a new Stadium that was created
     */
    private void saveNewStadium() {
        try {
            createStadium(window.getLblName().getText(), window.getLblCity().getText(), window.getLblCapacity().getText(), window.getLblId().getText(), path);
            JOptionPane.showMessageDialog(window, "Succesful");
        } catch (ExceptionWorldCup ex) {
            JOptionPane.showMessageDialog(window, ex.getMessage());
        }
    }
    /**
     * Open a file choose to select any image
     */
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
    /**
     * Create or update any stadium
     *  this method can make a new instance or update one that is already exists
     * @param name
     * @param city
     * @param capacity
     * @param id
     * @param path
     * @throws ExceptionWorldCup 
     */
    private void createStadium(String name, String city, String capacity, String id, String path) throws ExceptionWorldCup {
        if (name == null | city == null | capacity == null | id == null | path == null) {
            throw new ExceptionWorldCup(6);
        } else {
            int idInt = Integer.parseInt(id);
            int capacityInt = Integer.parseInt(capacity);
            /*mode creating*/
            if (mode.equalsIgnoreCase("creating")) {
                if (exist(idInt)!=null) {
                    throw new ExceptionWorldCup(9);
                } else {
                    Stadium stadium = (Stadium) maker.factoryMethod("Stadium");
                    stadium.update(name, idInt, city, capacityInt);
                    stadium.setIcon(path);
                    Lobby.controller.addStadium(stadium);
                }
            /*Mode editing*/
            } else {
                updateData(name, idInt, city, capacityInt,path);
            }

        }
    }
    /**
     * Add this components into the handle of events
     */
    public void addActionsLister() {
        window.getBtnBack().addActionListener(this);
        window.getBtnSave().addActionListener(this);
        window.getBtnSearch().addActionListener(this);
    }
    /**
     * Seach a element into the list
     * @param id
     * @return 
     */
    public Stadium exist(int id) {
        for (int i = 0; i < Lobby.controller.getArrayStadiums().size(); i++) {
            if (Lobby.controller.getArrayStadiums().get(i).getId() == id) {
                return Lobby.controller.getArrayStadiums().get(i) ;
            }
        }
        return null;
    }
    /**
     * Update data
     * @param name
     * @param idInt
     * @param city
     * @param capacityInt
     * @param path
     * @throws ExceptionWorldCup 
     */
    private void updateData(String name, int idInt, String city, int capacityInt,String path) throws ExceptionWorldCup {
        Stadium stadium = exist(idInt);
        if(stadium!=null){
            stadium.update(name, idInt, city, capacityInt);
            stadium.setIcon(path);
        }else{
            throw new ExceptionWorldCup(10);
        }
    }
    /**
     * Charge data in the screen
     */
    private void chargeData() {
       window.lblName.setText(stadium.getName());
       window.lblCity.setText(stadium.getCity());
       window.lblCapacity.setText(stadium.getCapacity()+"");
       window.lblId.setText(stadium.getId()+"");
       window.getShowImage().setIcon(controller.convertToImageIcon(stadium.getIcon(), window.getShowImage()));
    }
}
