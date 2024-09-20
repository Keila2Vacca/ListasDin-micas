package com.mycompany.listacircular;

import javax.swing.JOptionPane;

public class ListaCircular {

    NodosCirculares inicio;

    ListaCircular() {
        inicio = null;
    }
    
    public void solicitarTurno(String name, String Document, String gender) {
        NodosCirculares nuevo = new NodosCirculares();

        nuevo.setDocument(Document);
        nuevo.setGender(gender);
        nuevo.setName(name);
        nuevo.setSgt(nuevo);
        NodosCirculares temporal = inicio;

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "!La lista está vacia¡, Hola esres el primero en llegar");
            inicio = nuevo;
        } else {
           while(temporal.getSgt() != inicio){
               temporal = temporal.getSgt();
           }
           temporal.setSgt(nuevo);
           nuevo.setSgt(inicio);
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
                temporal=temporal.getSgt();
            } while(temporal != inicio);
        }
    }
    
    public void atender(int numBoletas){
      
 
    }
}
