/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Player;
import pk.codeapp.model.Team;
import pk.codeapp.view.CreateorUpdatePlayer;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ShowPlayers;

/**
 *
 * @author Jose Pablo Brenes
 */
public class PlayerController implements ActionListener {

    private AppController controller = Lobby.controller;
    private ShowPlayers showPlayer;

    public PlayerController(ShowPlayers showPlayer) {
        this.showPlayer = showPlayer;
        showAllTeam();
        showAllPlayers();
    }

    /**
     * Show actual team datas
     */
    public void showAllTeam() {
        showPlayer.getLblName().setText(showPlayer.getActualTeam().getName());
        showPlayer.getLblCoach().setText(showPlayer.getActualTeam().getCoach());
        showPlayer.getLblAssistant().setText(showPlayer.getActualTeam().getAssistant());
        showPlayer.getLblConfederacy().setText(showPlayer.getActualTeam().getConfederacy());
    }

    /**
     * Show Actual Players of Team
     */
    public void showAllPlayers() {
        Team teamActual = showPlayer.getActualTeam();
        Object[][] datas = new Object[teamActual.getPlayers().size()][7];
        /*Fill information*/
        for (int i = 0; i < teamActual.getPlayers().size(); i++) {
            datas[i][0] = teamActual.getPlayers().get(i).getName();
            datas[i][1] = teamActual.getPlayers().get(i).getPosition();
            datas[i][2] = teamActual.getPlayers().get(i).getAge();
            datas[i][3] = teamActual.getPlayers().get(i).getCantCardYellow();
            datas[i][4] = teamActual.getPlayers().get(i).getCantCardRed();
            datas[i][5] = teamActual.getPlayers().get(i).getNumber();
            datas[i][6] = teamActual.getPlayers().get(i).getGoals();
        }
        /*Fill titles*/
        String[] titles = {"Name Player", "Position", "Age", "NCardYellow", "NCardRed", "Number", "NumberGoals"};
        
        DefaultTableModel dtm = new DefaultTableModel(datas, titles){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        showPlayer.getTablePlayers().setModel(dtm);
        showPlayer.getTablePlayers().setPreferredScrollableViewportSize(new Dimension(860, 540));
        showPlayer.getTablePlayers().setRowHeight(45);
        showPlayer.getTablePlayers().setColumnSelectionAllowed(false);
        showPlayer.getTablePlayers().setFocusable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==showPlayer.getBtnBack()){
            showPlayer.jumpBeforeWindow();
        }else if(e.getSource()==showPlayer.getBtnCreate()){
            jumpToCreatePlayer();
        }else if(e.getSource()==showPlayer.getBtnUpdate()){
            jumpToUpdatePlayer();
        }else if(e.getSource()==showPlayer.getBtnDelete()){
            try {
                jumpToDeleteTeam();
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(showPlayer, ex.getMessage());
            }
        }
        
    }
    public void jumpToDeleteTeam() throws ExceptionWorldCup{
        Player playerDelete=selectPlayer();
        for (int i = 0; i < showPlayer.getActualTeam().getPlayers().size(); i++) {
            if(showPlayer.getActualTeam().getPlayers().get(i).equals(playerDelete)){
                if(showPlayer.getActualTeam().getPlayers().get(i).getGoals()==0)
                    showPlayer.getActualTeam().getPlayers().remove(i);
                else
                    throw new ExceptionWorldCup(3);
            }
            
        }
        showAllPlayers();
        showPlayer.jumpBeforeWindow();
    }
    /**
     * Update Player selected
     */
    public void jumpToUpdatePlayer(){
        
        Player actualPlayer = selectPlayer();
        showPlayer.setVisible(false);
        CreateorUpdatePlayer windowAux = new CreateorUpdatePlayer();
        System.out.println("EL nombre del jugador es: "+actualPlayer.getName());
        windowAux.setActualPlayer(actualPlayer);
        showPlayer.setVisible(false);
        windowAux.openWindow(showPlayer);
    }
    /**
     * Bridge to jump to Create Player
     */
    public void jumpToCreatePlayer(){
        showPlayer.setVisible(false);
        CreateorUpdatePlayer windowAux = new CreateorUpdatePlayer();
        windowAux.setActualPlayer(null);
        showPlayer.setVisible(false);
        windowAux.openWindow(showPlayer);
    }
    
    /**
     * Select player 
     * @return 
     */
    public Player selectPlayer() {
        
        String[] list = new String[showPlayer.getActualTeam().getPlayers().size()];
        for (int i = 0; i < showPlayer.getActualTeam().getPlayers().size(); i++) {
            list[i] = showPlayer.getActualTeam().getPlayers().get(i).getName();
        }
        JComboBox cmbOption = new JComboBox(list);
        int input = JOptionPane.showOptionDialog(null, cmbOption, "Select Player that your like choose",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
       if(input==-1){
           return null;
       }
        Player playerAux = searchPlayer((String) cmbOption.getSelectedItem());
        return playerAux;
    }
    /**
     * Search Player
     * @param name
     * @return 
     */
    public Player searchPlayer(String name){
        for (int i = 0; i < showPlayer.getActualTeam().getPlayers().size(); i++) {
            if(showPlayer.getActualTeam().getPlayers().get(i).getName().equals(name))
                return showPlayer.getActualTeam().getPlayers().get(i);
        }
        return null;
    }



}
