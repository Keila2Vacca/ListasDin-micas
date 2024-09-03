

package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class ListaSimple {
    
    //el nodo que se añade siempre queda de primero
    
    Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }

   

    public void insertarInicio (String name, int age, float average){
        Nodo nuevo = new Nodo();
        
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista está vacia");
            inicio = nuevo;
        } else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }    
    }
    
    public void consultar(){
        Nodo temporal = inicio;
         
       if(inicio == null){
           JOptionPane.showMessageDialog(null, "La lista está vacia");
       } else {
           do{
            JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getName() + temporal.getAge() + temporal.getAverage());
           }while(temporal.getEnlace() != null);
       }
    }
}
