/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication200;

import org.opencv.core.Core;

/**
 *
 * @author moh
 */
public class JavaApplication200 {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    
    public static void main(String[] args) {
        new MainFrame("GUI",700,400);
    }
    
}
