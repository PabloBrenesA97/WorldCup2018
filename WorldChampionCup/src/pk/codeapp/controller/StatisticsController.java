/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pk.codeapp.view.ShowGroupPositions;
import pk.codeapp.view.ShowPlayerInfo;
import pk.codeapp.view.ShowScorers;
import pk.codeapp.view.StatisticsScreen;

/**
 *
 * @author Daniel Amador
 */
public class StatisticsController implements ActionListener {

    private StatisticsScreen window;

    public StatisticsController(StatisticsScreen window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == window.btnBack1) {
            window.jumpBeforeWindow();
        } else if (e.getSource() == window.btnSeePlayerAge) {
            //jump see players age
            ShowPlayerInfo show= new ShowPlayerInfo();
            window.setEnabled(false);
            show.setLocationRelativeTo(window);
            show.openWindow(window);
        } else if (e.getSource() == window.btnSeeScorers) {
            //jump see player scorers
            ShowScorers show= new ShowScorers();
            show.openWindow(window);
        } else if (e.getSource() == window.btnSeeTable) {
            
            ShowGroupPositions show= new ShowGroupPositions();
            show.setLocationRelativeTo(window);
            window.setVisible(false);
            show.openWindow(window);
        }
    }
}
