package com.mycompany.listasdobles;

import javax.swing.JOptionPane;

public class ListasDobles {
    
    //insertar en posicion antes y despues

    NodoDoble inicio;

    ListasDobles() {
        inicio = null;
    }

    public void insertarInicio(String dato) {
        NodoDoble nuevo = new NodoDoble();

        nuevo.setAnterior(null);
        nuevo.setSgt(null);
        nuevo.setDato(dato);
        if (inicio != null) {
            nuevo.setSgt(inicio);
            inicio.setAnterior(nuevo);
        }
        inicio = nuevo;
    }

    public void imprimir() {
        NodoDoble temporal = inicio;

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        } else {
            while (temporal != null) {
                JOptionPane.showMessageDialog(null, "Datos: " + temporal.getDato());
                temporal = temporal.getSgt();
            }
        }
    }

    public void insertarFinal(String dato) {
        NodoDoble nuevo = new NodoDoble();

        nuevo.setAnterior(null);
        nuevo.setSgt(null);
        nuevo.setDato(dato);
        
        if (inicio == null) {
            inicio = nuevo;
        }else{
             NodoDoble temporal = inicio;
             while(temporal.getSgt() != null){
                 temporal = temporal.getSgt();
             }
             temporal.setSgt(nuevo);
             nuevo.setAnterior(temporal);
             nuevo.setSgt(null);
        }
    }

}
