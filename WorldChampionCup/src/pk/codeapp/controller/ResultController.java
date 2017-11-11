/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pk.codeapp.model.Result;
import pk.codeapp.view.CreateorUpdateResult;
import pk.codeapp.view.Lobby;
import pk.codeapp.view.ResultScreen;

/**
 *
 * @author Jose Pablo Brenes
 */
public class ResultController implements ActionListener {
    
    private ResultScreen resultScreen;
    
    public ResultController(ResultScreen window) {
        this.resultScreen = window;
    }
    
    public ResultScreen getResultScreen() {
        return resultScreen;
    }
    
    public void setResultScreen(ResultScreen resultScreen) {
        this.resultScreen = resultScreen;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resultScreen.getBtnBack()) {
            resultScreen.jumpBeforeWindow();
        }
        if (e.getSource() == resultScreen.getCmbResult()) {
            JComboBox comboBox = (JComboBox) e.getSource();
            if ("".equals((String) comboBox.getSelectedItem())) {
                return;
            }
            int id = Integer.parseInt((String) comboBox.getSelectedItem());
            resultScreen.setActualResult(Lobby.controller.searchResult(id));
            fillAllInformation();
        }if(e.getSource()==resultScreen.getBtnCreate()){
            
            jumpToWinAux("Create");
        }
        if(e.getSource()==resultScreen.getBtnUpdate()){
            if(resultScreen.getActualResult()!=null){
                jumpToWinAux("Update");
            }
        }if(e.getSource()==resultScreen.getBtnDelete()){
            jumpToDelete();
        }
    }
    public void jumpToDelete(){
        
        
        String[] list = new String[Lobby.controller.getListResults().size()];
        for (int i = 0; i < Lobby.controller.getListResults().size(); i++) {
            list[i] = ""+Lobby.controller.getListResults().get(i).getId();
        }
        JComboBox cmbOption = new JComboBox(list);
        int input = JOptionPane.showOptionDialog(null, cmbOption, "Select Player that your like choose",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
   
        if(input==-1){
           return ;
       }
        try{
        Result resultAux = Lobby.controller.searchResult(Integer.parseInt((String) cmbOption.getSelectedItem()));
        for (int i = 0; i < Lobby.controller.getListResults().size(); i++) {
            if(Lobby.controller.getListResults().get(i).equals(resultAux)){
                Lobby.controller.getListResults().remove(i);
            }
        }}catch(Exception ex){
            return;
        }
        
        fillComboBox();
        fillAllInformation();
    }
    /**
     * Bridfe to Create or Update Results
     */
    public void jumpToWinAux(String fuction){
        resultScreen.setVisible(false);
        CreateorUpdateResult windowAux = new CreateorUpdateResult();
        windowAux.setFuction(fuction);
        windowAux.openWindow(resultScreen);
    }
    /**
     *
     */
    public void fillComboBox() {
        DefaultComboBoxModel<String> list = new DefaultComboBoxModel();
        for (int i = 0; i < Lobby.controller.getListResults().size(); i++) {
            list.addElement(Lobby.controller.getListResults().get(i).getId() + "");
        }
        resultScreen.getCmbResult().setModel(list);
    }

    /**
     * Fill information
     */
    public void fillAllInformation() {
        if (resultScreen.getActualResult().getTeamWinnew().equals(resultScreen.getActualResult().getTeamLoser())) {
            resultScreen.getLblNameTeamWinner().setText("");
            resultScreen.getLblNameTeamLoser().setText("");
            resultScreen.getLblTeamWinner().setText("");
            resultScreen.getLblTeamLoser().setText("");
        } else {
            resultScreen.getLblTie().setText("");
        }
        resultScreen.getLblTeamWinner().setText(resultScreen.getActualResult().getTeamWinnew());
        resultScreen.getLblTeamLoser().setText(resultScreen.getActualResult().getTeamLoser());
        resultScreen.getLblTeam1().setText(resultScreen.getActualResult().getTeam1().getName());
        resultScreen.getLblTeam2().setText(resultScreen.getActualResult().getTeam2().getName());
        resultScreen.getLblGoalsTeam1().setText("" + resultScreen.getActualResult().getCantGoalsTeam1());
        resultScreen.getLblGoalsTeam2().setText("" + resultScreen.getActualResult().getCantGoalsTeam2());
        resultScreen.getLblimg1().setIcon(resultScreen.getActualResult().getTeam1().getImageTeam());
        resultScreen.getLblimg2().setIcon(resultScreen.getActualResult().getTeam2().getImageTeam());
        resultScreen.getLblMinutes().setText("" + resultScreen.getActualResult().getMinPlayed());
        resultScreen.getLblTotalYC().setText(resultScreen.getActualResult().getCantCardsYellow() + "");
        resultScreen.getLblTotalRC().setText(resultScreen.getActualResult().getCantCardsRed() + "");
        resultScreen.getLblTotalFaults().setText(resultScreen.getActualResult().getCantFaults() + "");
        resultScreen.getLblTotalCorner().setText(resultScreen.getActualResult().getCantCornerKicks() + "");
        resultScreen.getLblTotalOffsides().setText(resultScreen.getActualResult().getCantOffsides() + "");
        resultScreen.getLblPositionBalonT1().setText(resultScreen.getActualResult().getPosBalonTeam1() + "%");
        resultScreen.getLblPositionBalonT2().setText(resultScreen.getActualResult().getPosBalonTeam2() + "%");
    }
    
}
