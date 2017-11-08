/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.awt.Frame;

/**
 *
 * @author Daniel Amador
 */
public interface JumpWindows {
    public void openWindow(Frame beforeWindow);
    public void jumpBeforeWindow();
}
