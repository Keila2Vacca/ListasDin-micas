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

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacia");
            nuevo.setSgt(nuevo);
            inicio = nuevo;
        } else {
           NodosCirculares nodoFinal;
           NodosCirculares temporal = inicio;
           
           while(temporal.getSgt() != inicio){
               temporal = temporal.getSgt();
           }
           nodoFinal = temporal;
           nuevo.setSgt(inicio);
           nodoFinal.setSgt(nuevo);
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
