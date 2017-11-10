/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pk.codeapp.model.ExceptionWorldCup;
import pk.codeapp.model.Team;
import pk.codeapp.view.CreateorUpdateTeam;
import pk.codeapp.view.Lobby;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateorUpdateTeamController implements ActionListener {

    private AppController controller = Lobby.controller;
    private CreateorUpdateTeam windowAux;
    public static Team teamUpdate;

    public CreateorUpdateTeamController(CreateorUpdateTeam windowAux) {
        this.windowAux = windowAux;
        
    }

    /**
     * Fill lines in case of be Update and change text button
     */
    public void fillLines() {
        teamUpdate = windowAux.getUpdateTeam();
        if (windowAux.getFunctiontoRealize().equals("Update")){
            windowAux.getBtnAdd().setText("Update");
            windowAux.txtName.setText(teamUpdate.getName());
            windowAux.txtAssistant.setText(teamUpdate.getAssistant());
            windowAux.txtCoach.setText(teamUpdate.getCoach());
        } else {
            windowAux.getBtnAdd().setText("Create");
        }
    }

    /**
     * Create  Team
     *
     * @param id
     * @param name
     * @param coach
     * @param assistant
     * @param confederacy
     */
    public void createTeam(int id, String name, String coach, String assistant, String confederacy) throws ExceptionWorldCup {
        Team newTeam = controller.searchTeam(name);
        //Update team
        if (newTeam != null) {
            throw new ExceptionWorldCup(9);
        } else {
            newTeam = (Team) controller.getMasterMaker().factoryMethod("Team");
            newTeam.update(id, name, coach, assistant, confederacy, null);
            controller.getTeams().add(newTeam);
        }
    }

    /**
     * Update Team
     *
     * @param name
     * @param coach
     * @param assistant
     * @param confederacy
     * @throws ExceptionWorldCup
     */
    public void updateTeam(String name, String coach, String assistant, String confederacy){
        Team newTeam = controller.searchTeam(name);
        if (newTeam != null) {
            newTeam.update(newTeam.getId(), name, coach, assistant, confederacy, newTeam.getImageTeam());
        } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==windowAux.getBtnAdd()){
            String confederacy=(String)windowAux.cmbConfederacy.getSelectedItem();
            try {
                checkSpaces(); // Check spaces blank
                 if(windowAux.getFunctiontoRealize().equals("Update")){ // Update 
                    updateTeam(windowAux.txtName.getText(),windowAux.txtCoach.getText(), windowAux.txtAssistant.getText(),confederacy);
                    windowAux.jumpBeforeWindow();
            }else{ //Create
                try {
                    createTeam(controller.getTeams().size(),windowAux.txtName.getText(),windowAux.txtCoach.getText(), windowAux.txtAssistant.getText(),confederacy);
                    windowAux.jumpBeforeWindow();
                } catch (ExceptionWorldCup ex) {
                    JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                }
            }
            } catch (ExceptionWorldCup ex) {
                JOptionPane.showMessageDialog(windowAux, ex.getMessage());
                windowAux.jumpBeforeWindow();
            }
           
        }
        if(e.getSource()==windowAux.getBtnBack()){ //Back
            windowAux.jumpBeforeWindow();
        }
    }
    /**
     * Check spaces in Blank
     * @throws ExceptionWorldCup 
     */
    private void checkSpaces() throws ExceptionWorldCup{
        System.out.println("Entro a chequear espacios");
        String conferancy = (String) windowAux.cmbConfederacy.getSelectedItem();
        if(windowAux.txtName.getText().equals("") || windowAux.txtCoach.getText().equals("")|| windowAux.txtAssistant.getText().equals("") ||conferancy.equals("")){
            throw new ExceptionWorldCup(6);
        }
    }
}
