/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rename.interfaces;

import com.rename.model.DataName;

/**
 *
 * @author miguel
 */
public interface DataNameFactoryMethod {
    public DataName getDataNameFactory(String type);    
}
