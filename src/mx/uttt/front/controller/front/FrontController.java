/*
* @author samuel
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uttt.front.controller.front;

import javax.swing.JButton;
import mx.uttt.front.controller.dispatcher.Dispatcher;

/**
 *
* @author samuel
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticCompany() {
        System.out.println("El Modelo del Telefono se Autentico Satisfactoriamente");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Petición de la pagina: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticCompany()) {
            dispatcher.dispatch(request);
        }
    }

    public void dispatchRequest(JButton jButton1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
