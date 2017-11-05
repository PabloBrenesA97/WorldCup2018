/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.awt.Frame;

/**
 *
 * @author Jose Pablo Brenes
 */
public interface jumpWindow {
    /**
     * Jump the next  Window 
     * @param beforeWindow 
     */
    public void openWindow(Frame beforeWindow);
    /**
     *  Jump the before Window
     */
    public void jumpBeforeWindow();
}
