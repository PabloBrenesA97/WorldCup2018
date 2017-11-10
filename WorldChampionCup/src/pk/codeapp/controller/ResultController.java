/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk.codeapp.view.ResultScreen;

/**
 *
 * @author Jose Pablo Brenes
 */
public class ResultController implements ActionListener{

     private ResultScreen resultScreen;
     
     public ResultController (ResultScreen window){
         this.resultScreen=window;
     }

    public ResultScreen getResultScreen() {
        return resultScreen;
    }

    public void setResultScreen(ResultScreen resultScreen) {
        this.resultScreen = resultScreen;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==resultScreen.getBtnBack()){
           resultScreen.jumpBeforeWindow();
       }
    }
    
}
