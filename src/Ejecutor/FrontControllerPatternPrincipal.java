/*
 * @author samuel
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejecutor;


import javax.swing.JButton;
import javax.swing.JOptionPane;
import mx.uttt.front.controller.front.FrontController;

/**
 *
 * @author samuel
 */
public class FrontControllerPatternPrincipal {
    public static void main(String[] Sam) {
        JOptionPane.showMessageDialog(null, "Bienvenido a Compañia Movil");
       MenuInicial mi = new MenuInicial();
       
       FrontController fc = new FrontController();
       fc.dispatchRequest(mi.jButton1.toString());
       fc.dispatchRequest(mi.jButton2.toString());
    }
}
