/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
            }
        }
    }

    /**
     * Update Actual Player
     *
     * @throws ExceptionWorldCup
     */
    public void updatePlayer() throws ExceptionWorldCup {
        if (Integer.parseInt(windowAux.getTxtAge().getText()) < 20) {
            throw new ExceptionWorldCup(12);
        } else if (windowAux.getTxtName().getText().equals("") || windowAux.getTxtNumber().getText().equals("") || windowAux.getTxtPosition().getText().equals("") || windowAux.getTxtNYellowCard1().getText().equals("") || windowAux.getTxtNRedCard().getText().equals("") || windowAux.getTxtGoals().getText().equals("")
                || windowAux.getTxtAge().getText().equals("")) {
            throw new ExceptionWorldCup(6);
        }
        try {
            actualPlayer.update(actualPlayer.getId(), windowAux.getTxtName().getText(), windowAux.getTxtPosition().getText(), Integer.parseInt(windowAux.getTxtAge().getText()), Integer.parseInt(windowAux.getTxtNYellowCard1().getText()),
                    Integer.parseInt(windowAux.getTxtNRedCard().getText()), Integer.parseInt(windowAux.getTxtNumber().getText()), Integer.parseInt(windowAux.getTxtGoals().getText()));
        } catch (Exception ex) {
            throw new ExceptionWorldCup(8);
        }
    }

    /**
     * Add Player in the List
     */
    public void createPlayer() throws ExceptionWorldCup {

        if (windowAux.getTxtName().getText().equals("") || windowAux.getTxtNumber().getText().equals("") || windowAux.getTxtPosition().getText().equals("") || windowAux.getTxtNYellowCard1().getText().equals("") || windowAux.getTxtNRedCard().getText().equals("") || windowAux.getTxtGoals().getText().equals("")
                || windowAux.getTxtAge().getText().equals("")) {

            if (Integer.parseInt(windowAux.getTxtAge().getText()) < 20) {
                throw new ExceptionWorldCup(12);
            }
            if (windowAux.getTxtName().getText() == null || windowAux.getTxtNumber().getText() == null || windowAux.getTxtPosition().getText() == null || windowAux.getTxtNYellowCard1().getText() == null || windowAux.getTxtNRedCard().getText() == null || windowAux.getTxtGoals().getText() == null
                    || windowAux.getTxtAge().getText() == null) {
                throw new ExceptionWorldCup(6);
            }
            if (Integer.parseInt(windowAux.getTxtAge().getText()) < 20) {
                throw new ExceptionWorldCup(12);
            }
            Player newPlayer = (Player) Lobby.controller.getMasterMaker().factoryMethod("Player");
            try {
                newPlayer.update(windowAux.getBeforeWindow().getActualTeam().getPlayers().size(), windowAux.getTxtName().getText(), windowAux.getTxtPosition().getText(), Integer.parseInt(windowAux.getTxtAge().getText()), Integer.parseInt(windowAux.getTxtNYellowCard1().getText()),
                        Integer.parseInt(windowAux.getTxtNRedCard().getText()), Integer.parseInt(windowAux.getTxtNumber().getText()), Integer.parseInt(windowAux.getTxtGoals().getText()));
                windowAux.getBeforeWindow().getActualTeam().getPlayers().add(newPlayer);
            } catch (Exception ex) {
                throw new ExceptionWorldCup(8);
            }
        }

    }

    /**
     * Fill Data of Player if update
     *
     * @param actualPlayer
     */
    public void fillData(Player actualPlayer) {
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

}
