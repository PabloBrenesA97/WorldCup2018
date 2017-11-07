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
public class ExceptionWorldCup extends Exception{
    /*All varibles here*/
    private String message;
    private final String[] LIST_EXCEPTION = {"1) You can not eliminate stadiums that have matches",
        "2) You can not eliminate teams that have players", "3) You can not eliminate player",
        "4) You can not eliminate players who have scored or who have played a match","5) There are no elements",
        "6) Don't leave spaces in blank","7) The capacity must exceed 1000 spectators","8) Only numbers are accepted"};
    
    /**
     * Defualt constructor that instance this class
     * @param index 
     */
    public ExceptionWorldCup(int index) {
        message=LIST_EXCEPTION[index-1];
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
