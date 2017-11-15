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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.CatchNode;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Player;
import pk.codeapp.view.CreateorUpdatePlayer;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowPlayers;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateorUpdatePlayerController implements ActionListener {

    private CreateorUpdatePlayer windowAux;
    private Player actualPlayer;

    public CreateorUpdatePlayerController(CreateorUpdatePlayer windows) {
        this.windowAux = windows;
    }

    public CreateorUpdatePlayer getController() {
        return windowAux;
    }

    public void setController(CreateorUpdatePlayer controller) {
        this.windowAux = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == windowAux.getBtnBack()) {
            windowAux.jumpBeforeWindow();
        } else {
            if (e.getSource() == windowAux.getBtnAdd()) {
                try {
                    checkSpaces();
                    JButton button = (JButton) e.getSource();
                String action = (String) button.getText();
                if (action.equals("Create")) {
                    try {
                        createPlayer();
                        ShowPlayers.controller.showAllPlayers();
                        windowAux.jumpBeforeWindow();
                    } catch (ExceptionWorldCup ex) {
                        JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                    }
                } else {
                    try {
                        updatePlayer();
                        ShowPlayers.controller.showAllPlayers();
                        windowAux.jumpBeforeWindow();
                    } catch (ExceptionWorldCup ex) {
                        JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                    }
                }
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                }
                
            }
        }
    }

    /**
     * Update Actual Player
     *
     * @throws ExceptionWorldCup
     */

    public void updatePlayer() throws ExceptionWorldCup {
        
            actualPlayer.update(actualPlayer.getId(), windowAux.getTxtName().getText(), windowAux.getTxtPosition().getText(), Integer.parseInt(windowAux.getTxtAge().getText()), Integer.parseInt(windowAux.getTxtNYellowCard1().getText()),
                    Integer.parseInt(windowAux.getTxtNRedCard().getText()), Integer.parseInt(windowAux.getTxtNumber().getText()), Integer.parseInt(windowAux.getTxtGoals().getText()));}
        

    /**
     * Add Player in the List
     * @throws pk.codeapp.model.ExceptionWorldCup
     */
    public void createPlayer() throws ExceptionWorldCup {
               
                Player newPlayer = (Player) Lobby.controller.getMasterMaker().factoryMethod("Player");
                newPlayer.update(windowAux.getBeforeWindow().getActualTeam().getPlayers().size(), windowAux.getTxtName().getText(), windowAux.getTxtPosition().getText(), Integer.parseInt(windowAux.getTxtAge().getText()), Integer.parseInt(windowAux.getTxtNYellowCard1().getText()),
                        Integer.parseInt(windowAux.getTxtNRedCard().getText()), Integer.parseInt(windowAux.getTxtNumber().getText()), Integer.parseInt(windowAux.getTxtGoals().getText()));
                windowAux.getBeforeWindow().getActualTeam().getPlayers().add(newPlayer);}
    /**
     * Fill Data of Player if update
     *
     * @param actualPlayer
     */
    public void fillData(Player actualPlayer){
        this.actualPlayer = actualPlayer;
        if (actualPlayer != null) {
            windowAux.getBtnAdd().setText("Update");
            windowAux.getTxtName().setText(actualPlayer.getName());
            windowAux.getTxtNumber().setText(actualPlayer.getNumber() + "");
            windowAux.getTxtPosition().setText(actualPlayer.getPosition());
            windowAux.getTxtAge().setText(actualPlayer.getAge() + "");
            windowAux.getTxtGoals().setText(actualPlayer.getGoals() + "");
            windowAux.getTxtNRedCard().setText(actualPlayer.getCantCardRed() + "");
            windowAux.getTxtNYellowCard1().setText(actualPlayer.getCantCardYellow() + "");
        } else {
            windowAux.getBtnAdd().setText("Create");
        }
    }
    /**
     * Check Spaces and all validations
     * @throws ExceptionWorldCup 
     */
    private void checkSpaces() throws ExceptionWorldCup{
        if (windowAux.getTxtName().getText().equals("") || windowAux.getTxtNumber().getText().equals("") || windowAux.getTxtPosition().getText().equals("") || windowAux.getTxtNYellowCard1().getText().equals("") || windowAux.getTxtNRedCard().getText().equals("") || windowAux.getTxtGoals().getText().equals("")
                || windowAux.getTxtAge().getText().equals("")) {
            throw new ExceptionWorldCup(6);
        }
        if (Integer.parseInt(windowAux.getTxtAge().getText()) < 20) {
            throw new ExceptionWorldCup(12);}
        if (Integer.parseInt(windowAux.getTxtAge().getText())>100) {
            throw new ExceptionWorldCup(15);}
        try{
        Lobby.controller.haveNumber(windowAux.getTxtName());
        Lobby.controller.haveNumber(windowAux.getTxtPosition());
        if(Lobby.controller.isNumber(windowAux.getTxtNumber().getText())==false || Lobby.controller.isNumber(windowAux.getTxtNYellowCard1().getText())==false || Lobby.controller.isNumber(windowAux.getTxtNRedCard().getText())== false ||
                Lobby.controller.isNumber(windowAux.getTxtGoals().getText())==false || Lobby.controller.isNumber(windowAux.getTxtAge().getText())==false){
            throw new ExceptionWorldCup(17);
        }
         if(Integer.parseInt(windowAux.getTxtAge().getText()) < 20){
            throw new ExceptionWorldCup(12);
        }
    }catch(Exception e){
        throw new ExceptionWorldCup(16);
    }
    }}

