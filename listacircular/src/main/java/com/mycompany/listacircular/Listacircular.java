package com.mycompany.listacircular;

import javax.swing.JOptionPane;

public class Listacircular {

    NodosCirculares inicio;

    Listacircular() {
        inicio = null;
    }

    public void solicitarTurno(String name, String Document, String gender) {
        NodosCirculares nuevo = new NodosCirculares();

        nuevo.setDocument(Document);
        nuevo.setGender(gender);
        nuevo.setName(name);
        nuevo.setSgt(nuevo);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
            inicio = nuevo;
        } else {
            nuevo.setSgt(inicio);
            inicio.setSgt(nuevo);
            inicio = nuevo;
        }
    }

    public void imprimir() {
        NodosCirculares temporal = inicio;
        
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        } else{
            do{
               JOptionPane.showMessageDialog(null, 
                       "Documento: " + temporal.getDocument() +
                       "Nombre: " + temporal.getName() + 
                       "Género: " + temporal.getGender());  
            } while(temporal != null);
        }
    }
}
