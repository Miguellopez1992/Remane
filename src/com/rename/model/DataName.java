/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rename.model;

import java.util.List;

/**
 *
 * @author miguel
 */
public abstract class DataName {
    protected List<Name> names;

    public DataName() {
        loadDataName();
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
    
    abstract public void loadDataName();
    
}
