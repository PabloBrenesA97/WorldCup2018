/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.controller;

import pk.codeapp.model.Component;

/**
 *
 * @author Daniel Amador
 */
public abstract class Maker {
    public abstract Component factoryMethod(String type);
}
