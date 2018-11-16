/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uttt.front.controller.dispatcher;

/**
 *
 * @author Jonathan Aldair
 */
public class Dispatcher {
        private vista1 v1;
        private Vista2 v2;
    
    public Dispatcher(){
        v1=new vista1();
        v2=new Vista2();
    }
    public void dispatch(String request){
        MenuInicial mi = new MenuInicial();
        if (request.equalsIgnoreCase(mi.jButton1.toString())) {
            v1.show();
        }else if(request.equalsIgnoreCase(mi.jButton2.toString())) {
            v2.show();
        }
    }
}
}
