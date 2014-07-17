/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rename.model;

import com.rename.interfaces.DataNameFactoryMethod;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguel
 */
public class DataNameFactory implements DataNameFactoryMethod{
    private String type;
    @Override
    public DataName getDataNameFactory(String type) {
        this.type=type.toUpperCase();
        DataName dn=null;
        try {
            Class clazz;
            clazz = Class.forName("DataName"+this.type);
            try {
                dn=(DataName) clazz.getConstructor((Class) null).newInstance((Object[]) null);
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(DataNameFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(DataNameFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dn;
    }

    
}
