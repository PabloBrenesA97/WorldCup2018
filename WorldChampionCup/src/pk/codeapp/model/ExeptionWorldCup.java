/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

/**
 *Handle of throw all exxeptions
 * @author Jose Pablo Brenes
 */
public class ExeptionWorldCup extends Exception{
    /*All varibles here*/
    private String message;
    private final String[] LIST_EXCEPTION = {"You can not eliminate stadiums that have matches",
        "You can not eliminate teams that have players", "You can not eliminate player",
        "you can not eliminate players who have scored or who have played a match","equipment does not exist","This is an empty field ","Team does not exist","Team already exist"};
    
    /**
     * Defualt constructor that instance this class
     * @param index 
     */
    public ExeptionWorldCup(int index) {
        message=LIST_EXCEPTION[index];
    }
    /**
     * Return exception message
     * @return 
     */
    @Override
    public String getMessage() {
        return message;
    } 
}
