/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk.codeapp.view.CalendarScreen;
import pk.codeapp.view.CreateorUpdateCalendar;

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
            System.out.println("Back");
            windowAux.jumpBeforeWindow();
        }
        if(e.getSource()==windowAux.getBtnCreate()){
            System.out.println("Create");
            jumpToCreate();
        }
        
        
    }
    public void jumpToCreate(){
        windowAux.setVisible(false);
        CreateorUpdateCalendar calendarAux = new CreateorUpdateCalendar();
        calendarAux.openWindow(windowAux);
        
        
    }
    public CalendarScreen getWindowAux() {
        return windowAux;
    }

    public void setWindowAux(CalendarScreen windowAux) {
        this.windowAux = windowAux;
    }
    
}
