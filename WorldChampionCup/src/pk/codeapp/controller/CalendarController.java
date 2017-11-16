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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pk.codeapp.model.Calendar;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Stadium;
import pk.codeapp.view.CalendarScreen;
import pk.codeapp.view.CreateorUpdateCalendar;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CalendarController implements ActionListener{

    private CalendarScreen windowAux;
    
    
    public CalendarController(CalendarScreen windowAux) {
        this.windowAux = windowAux;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==windowAux.getBtnBack()){
            windowAux.jumpBeforeWindow();
        }
        if(e.getSource()==windowAux.getBtnCreate()){
            jumpToCreate();
        }
        if(e.getSource()==windowAux.getBtnUpdate()){
            if(windowAux.getActualCalendar()!=null)
                try {
                    jumpToUpdate();
            } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                    return;
            }
        }if(e.getSource()==windowAux.getCmbCalendar()){
            JComboBox cmbAux = (JComboBox) e.getSource();
            String txtCalendar = (String) cmbAux.getSelectedItem();
            if(!txtCalendar.equals("")){
            windowAux.setActualCalendar(Lobby.controller.searchCalendar(Integer.parseInt(txtCalendar)));
            completeInformation();}
        }if(e.getSource()==windowAux.getBtnDelete()){
            if(windowAux.getActualCalendar()!=null){
            try {
                jumpToDelete();
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(windowAux, ex.getMessage());
            }}
        }
        
        
    }
    
    public void jumpToDelete() throws ExceptionWorldCup{
       for (int i = 0; i < Lobby.controller.getListResults().size(); i++) {
            if(Lobby.controller.getListResults().get(i).getTeam1().equals(windowAux.getActualCalendar().getTeam1()) || Lobby.controller.getListResults().get(i).getTeam2().equals(windowAux.getActualCalendar().getTeam1()) || Lobby.controller.getListResults().get(i).getTeam1().equals(windowAux.getActualCalendar().getTeam2()) || Lobby.controller.getListResults().get(i).getTeam2().equals(windowAux.getActualCalendar().getTeam2()))
                throw new ExceptionWorldCup(18);
        }
        for (int i = 0; i < Lobby.controller.getCalendars().size(); i++) {
            if(windowAux.getActualCalendar().equals(Lobby.controller.getCalendars().get(i))){
                Lobby.controller.getCalendars().remove(i);   
            }
        }
        
        windowAux.jumpBeforeWindow();
    }
    /**
     * Fill all Information in the window
     */
    public void completeInformation(){
        windowAux.getLblTeam1().setText(windowAux.getActualCalendar().getTeam1().getName());
        windowAux.getLblTeam2().setText(windowAux.getActualCalendar().getTeam2().getName());
        windowAux.getLblNameStadium().setText(windowAux.getActualCalendar().getStadium().getName());
        windowAux.getLblImg1().setText("");
        windowAux.getLblImg1().setIcon(windowAux.getActualCalendar().getTeam1().getImageTeam());
        windowAux.getLblImg2().setText("");
        windowAux.getLblImg2().setIcon(windowAux.getActualCalendar().getTeam2().getImageTeam());
        windowAux.getLblDate().setText(windowAux.getActualCalendar().getDate());
        Stadium actualStadium = windowAux.getActualCalendar().getStadium();
        windowAux.getLblImageStadium().setIcon(convertToImageIcon(actualStadium.getIcon(),windowAux.getLblImageStadium()));
        
    }
    /**
     * Fill ComboBox calendar
     */
    public void fillData(){
        DefaultComboBoxModel<String> listCalendars = new DefaultComboBoxModel();
        for (int i = 0; i < Lobby.controller.getCalendars().size(); i++) {
            listCalendars.addElement(Lobby.controller.getCalendars().get(i).getId()+"");
        }
        windowAux.getCmbCalendar().setModel(listCalendars);
        if(Lobby.controller.getCalendars().size()>0){
            windowAux.setActualCalendar(Lobby.controller.getCalendars().get(0));
            completeInformation();
        }
    }
    /**
     * Bridge to Jump to Create Calendar
     */
    public void jumpToCreate(){
            for (int i = 0; i < Lobby.controller.getCalendars().size(); i++) {
                for (int j = 0; j < Lobby.controller.getListResults().size(); j++) {
                    if(Lobby.controller.getListResults().get(j).getId()== Lobby.controller.getCalendars().get(i).getId())
                        JOptionPane.showMessageDialog(windowAux,"No more results can be created");
                }
            }
        windowAux.setVisible(false);
        CreateorUpdateCalendar calendarAux = new CreateorUpdateCalendar();
        calendarAux.setFuction("Create");
        calendarAux.openWindow(windowAux);
    }
    /**
     * Bridge to Jump to Update Calendar
     */
    public void jumpToUpdate() throws ExceptionWorldCup{
        for (int i = 0; i < Lobby.controller.getListResults().size(); i++) {
            if(Lobby.controller.getListResults().get(i).getTeam1().equals(windowAux.getActualCalendar().getTeam1()) || Lobby.controller.getListResults().get(i).getTeam2().equals(windowAux.getActualCalendar().getTeam1()) || Lobby.controller.getListResults().get(i).getTeam1().equals(windowAux.getActualCalendar().getTeam2()) || Lobby.controller.getListResults().get(i).getTeam2().equals(windowAux.getActualCalendar().getTeam2()))
                throw new ExceptionWorldCup(18);
        }
        windowAux.setVisible(false);
        CreateorUpdateCalendar calendarAux = new CreateorUpdateCalendar();
        calendarAux.setFuction("Update");
        calendarAux.openWindow(windowAux);
    }
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
    public CalendarScreen getWindowAux() {
        return windowAux;
    }

    public void setWindowAux(CalendarScreen windowAux) {
        this.windowAux = windowAux;
    }
    
}
