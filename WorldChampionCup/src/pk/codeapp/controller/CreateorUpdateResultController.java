/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pk.codeapp.model.Calendar;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Result;
import pk.codeapp.model.Team;
import pk.codeapp.view.CreateorUpdateResult;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateorUpdateResultController implements ActionListener {

    private CreateorUpdateResult windowAux;

    public CreateorUpdateResultController(CreateorUpdateResult windowAux) {
        this.windowAux = windowAux;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == windowAux.getBtnBack()) {
            windowAux.jumpBeforeWindow();
        }
        if(e.getSource()==windowAux.getCmbList()){
            JComboBox box = (JComboBox)e.getSource();
            Calendar calendar = Lobby.controller.searchCalendar(Integer.parseInt((String)box.getSelectedItem()));
            windowAux.getLblTeam1().setText(calendar.getTeam1().getName());
            windowAux.getLblTeam2().setText(calendar.getTeam2().getName());
        }
        if (e.getSource() == windowAux.getBtnAdd()) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("Create")) {

                jumpToCreate();
                 
                if(Lobby.controller.getListResults().size()>0){
                windowAux.getResultScreen().getController().fillComboBox();
               
                windowAux.getResultScreen().setActualResult(Lobby.controller.getListResults().get(Lobby.controller.getListResults().size() - 1));
                windowAux.getResultScreen().getController().fillAllInformation();
                windowAux.jumpBeforeWindow();}
             }else {
                try {
                    jumpToUpdate();
                    windowAux.getResultScreen().getController().fillComboBox();
                    windowAux.getResultScreen().getController().fillAllInformation();
                    windowAux.jumpBeforeWindow();
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                }
            }
        }
    }

    /**
     * Update Actual Result
     *
     * @throws pk.codeapp.model.ExceptionWorldCup
     */
    public void jumpToUpdate() throws ExceptionWorldCup {
        checkException();

        Result result = Lobby.controller.searchResult(windowAux.getResultScreen().getActualResult().getId());
            if ((Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()))>(Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()))) {
                System.out.println("Arrba "+windowAux.getTxtGoalsTeam1().getText());
                result.update(result.getId(), result.getTeam1(), result.getTeam2(), result.getTeam1().getName(), result.getTeam2().getName(), Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()), Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()), Integer.parseInt(windowAux.getTxtMinPlayed().getText()),
                        Integer.parseInt(windowAux.getTxtYellowCard().getText()), Integer.parseInt(windowAux.getTxtRedCard().getText()), Integer.parseInt(windowAux.getTxtFaults().getText()), Integer.parseInt(windowAux.getTxtCorners().getText()),
                        Integer.parseInt(windowAux.getTxtOffsides().getText()), Integer.parseInt(windowAux.getTxtPosBalonE1().getText()), Integer.parseInt(windowAux.getTxtPosBalonE2().getText()));
            } else if ((Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()))<(Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()))) {
                System.out.println("Abajo "+windowAux.getTxtGoalsTeam2().getText());
                  System.out.println(result.getId());
                result.update(result.getId(), result.getTeam1(), result.getTeam2(), result.getTeam2().getName(), result.getTeam1().getName(), Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()), Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()), Integer.parseInt(windowAux.getTxtMinPlayed().getText()),
                        Integer.parseInt(windowAux.getTxtYellowCard().getText()), Integer.parseInt(windowAux.getTxtRedCard().getText()), Integer.parseInt(windowAux.getTxtFaults().getText()), Integer.parseInt(windowAux.getTxtCorners().getText()),
                        Integer.parseInt(windowAux.getTxtOffsides().getText()), Integer.parseInt(windowAux.getTxtPosBalonE1().getText()), Integer.parseInt(windowAux.getTxtPosBalonE2().getText()));
            } else {
                result.update(result.getId(), result.getTeam1(), result.getTeam2(), result.getTeam1().getName(), result.getTeam1().getName(), Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()), Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()), Integer.parseInt(windowAux.getTxtMinPlayed().getText()),
                        Integer.parseInt(windowAux.getTxtYellowCard().getText()), Integer.parseInt(windowAux.getTxtRedCard().getText()), Integer.parseInt(windowAux.getTxtFaults().getText()), Integer.parseInt(windowAux.getTxtCorners().getText()),
                        Integer.parseInt(windowAux.getTxtOffsides().getText()), Integer.parseInt(windowAux.getTxtPosBalonE1().getText()), Integer.parseInt(windowAux.getTxtPosBalonE2().getText()));
            }
    
        } 
    

    /**
     * Create Result
     */
    public void jumpToCreate() {
        try {
            checkException();
            Result newResult = new Result();
            
            Calendar calendar = Lobby.controller.searchCalendar(Integer.parseInt((String)windowAux.getCmbList().getSelectedItem()));
            Team team1 = calendar.getTeam1();
            Team team2 = calendar.getTeam2();
            try {
                
                if (Integer.parseInt(windowAux.getTxtGoalsTeam1().getText())>Integer.parseInt(windowAux.getTxtGoalsTeam2().getText())) {
                    newResult.update(Lobby.controller.getListResults().size(), team1, team2, team1.getName(), team2.getName(), Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()), Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()), Integer.parseInt(windowAux.getTxtMinPlayed().getText()),
                            Integer.parseInt(windowAux.getTxtYellowCard().getText()), Integer.parseInt(windowAux.getTxtRedCard().getText()), Integer.parseInt(windowAux.getTxtFaults().getText()), Integer.parseInt(windowAux.getTxtCorners().getText()),
                            Integer.parseInt(windowAux.getTxtOffsides().getText()), Integer.parseInt(windowAux.getTxtPosBalonE1().getText()), Integer.parseInt(windowAux.getTxtPosBalonE2().getText()));

                } else if (Integer.parseInt(windowAux.getTxtGoalsTeam1().getText())<Integer.parseInt(windowAux.getTxtGoalsTeam2().getText())) {
                    newResult.update(Lobby.controller.getListResults().size(), team1, team2, team2.getName(), team1.getName(), Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()), Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()), Integer.parseInt(windowAux.getTxtMinPlayed().getText()),
                            Integer.parseInt(windowAux.getTxtYellowCard().getText()), Integer.parseInt(windowAux.getTxtRedCard().getText()), Integer.parseInt(windowAux.getTxtFaults().getText()), Integer.parseInt(windowAux.getTxtCorners().getText()),
                            Integer.parseInt(windowAux.getTxtOffsides().getText()), Integer.parseInt(windowAux.getTxtPosBalonE1().getText()), Integer.parseInt(windowAux.getTxtPosBalonE2().getText()));
                } else {
                    newResult.update(Lobby.controller.getListResults().size(), team1, team2, team1.getName(), team1.getName(), Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()), Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()), Integer.parseInt(windowAux.getTxtMinPlayed().getText()),
                            Integer.parseInt(windowAux.getTxtYellowCard().getText()), Integer.parseInt(windowAux.getTxtRedCard().getText()), Integer.parseInt(windowAux.getTxtFaults().getText()), Integer.parseInt(windowAux.getTxtCorners().getText()),
                            Integer.parseInt(windowAux.getTxtOffsides().getText()), Integer.parseInt(windowAux.getTxtPosBalonE1().getText()), Integer.parseInt(windowAux.getTxtPosBalonE2().getText()));
                }
                Lobby.controller.getListResults().add(newResult);

            } catch (Exception e) {
                return;
            }
        } catch (ExceptionWorldCup ex) {
            JOptionPane.showMessageDialog(windowAux, ex.getMessage());
            return;
        }
    }

    /**
     * Check blank spaces
     */
    private void checkException() throws ExceptionWorldCup {
        if (windowAux.getTxtCorners().getText().equals("") || windowAux.getTxtFaults().getText().equals("") || windowAux.getTxtGoalsTeam1().getText().equals("") || windowAux.getTxtGoalsTeam2().getText().equals("")
                || windowAux.getTxtMinPlayed().getText().equals("") || windowAux.getTxtOffsides().getText().equals("") || windowAux.getTxtPosBalonE1().getText().equals("") || windowAux.getTxtPosBalonE2().getText().equals("")
                || windowAux.getTxtRedCard().getText().equals("") || windowAux.getTxtYellowCard().getText().equals("")) {
            throw new ExceptionWorldCup(6);
        }
        if (Integer.parseInt(windowAux.getTxtCorners().getText()) < 0 || Integer.parseInt(windowAux.getTxtFaults().getText()) < 0 || Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()) < 0 || Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()) < 0 || (Integer.parseInt(windowAux.getTxtMinPlayed().getText()) < 0 || Integer.parseInt(windowAux.getTxtOffsides().getText()) < 0 || Integer.parseInt(windowAux.getTxtPosBalonE1().getText()) < 0 || Integer.parseInt(windowAux.getTxtPosBalonE2().getText()) < 0)
                || Integer.parseInt(windowAux.getTxtRedCard().getText()) < 0 || Integer.parseInt(windowAux.getTxtYellowCard().getText()) < 0) {
            throw new ExceptionWorldCup(14);
        }
        if(Integer.parseInt(windowAux.getTxtCorners().getText()) > 100 || Integer.parseInt(windowAux.getTxtFaults().getText()) > 100 || Integer.parseInt(windowAux.getTxtGoalsTeam1().getText()) > 100 || Integer.parseInt(windowAux.getTxtGoalsTeam2().getText()) > 100 || (Integer.parseInt(windowAux.getTxtMinPlayed().getText()) > 100 || Integer.parseInt(windowAux.getTxtOffsides().getText()) > 100 || Integer.parseInt(windowAux.getTxtPosBalonE1().getText()) > 100|| Integer.parseInt(windowAux.getTxtPosBalonE2().getText()) > 100
                || Integer.parseInt(windowAux.getTxtRedCard().getText()) >100 || Integer.parseInt(windowAux.getTxtYellowCard().getText()) >100))
            throw new ExceptionWorldCup(15);
    }

    /**
     * Fill information
     */
    public void fillData() {
        Result actualResult = windowAux.getResultScreen().getActualResult();
        if (windowAux.getFuction().equals("Update")) {
            windowAux.getCmbList().setVisible(false);
            windowAux.getBtnAdd().setText("Update");
            windowAux.getLblTeam1().setText(actualResult.getTeam1().getName());
            windowAux.getLblTeam2().setText(actualResult.getTeam2().getName());
            windowAux.getTxtCorners().setText("" + actualResult.getCantCornerKicks());
            windowAux.getTxtFaults().setText("" + actualResult.getCantFaults());
            windowAux.getTxtGoalsTeam1().setText("" + actualResult.getCantGoalsTeam1());
            windowAux.getTxtGoalsTeam2().setText("" + actualResult.getCantGoalsTeam2());
            windowAux.getTxtMinPlayed().setText("" + actualResult.getMinPlayed());
            windowAux.getTxtOffsides().setText("" + actualResult.getCantOffsides());
            windowAux.getTxtPosBalonE1().setText(actualResult.getPosBalonTeam1() + "");
            windowAux.getTxtPosBalonE2().setText(actualResult.getPosBalonTeam2() + "");
            windowAux.getTxtRedCard().setText("" + actualResult.getCantCardsRed());
            windowAux.getTxtYellowCard().setText("" + actualResult.getCantCardsYellow());
        } else {
            windowAux.getBtnAdd().setText("Create");
            windowAux.getCmbList().setVisible(true);
            DefaultComboBoxModel<String> listTeam1 = new DefaultComboBoxModel();

            for (int i = 0; i < Lobby.controller.getCalendars().size(); i++) {
                listTeam1.addElement(Lobby.controller.getCalendars().get(i).getId()+"");
            }
            windowAux.getCmbList().setModel(listTeam1);
            
        }
        windowAux.getLblTeam1().setText(Lobby.controller.getCalendars().get(0).getTeam1().getName());
        windowAux.getLblTeam2().setText(Lobby.controller.getCalendars().get(0).getTeam2().getName());
    }

}
