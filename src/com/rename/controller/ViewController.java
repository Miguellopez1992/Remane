/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rename.controller;

import javax.swing.JFileChooser;
import com.rename.view.View;

/**
 *
 * @author Victor L
 */
public class ViewController {
    private View view;

    public ViewController(View view) {
        this.view = view;
    }

    public void loadView(){
        this.view.getjFileChooser1().setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }
}
