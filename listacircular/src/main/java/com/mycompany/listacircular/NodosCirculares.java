
package com.mycompany.listacircular;


public class NodosCirculares {
   private String name;
   private String Document;
   private String gender;
   private NodosCirculares sgt;

    public NodosCirculares getSgt() {
        return sgt;
    }

    public void setSgt(NodosCirculares sgt) {
        this.sgt = sgt;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String Document) {
        this.Document = Document;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
   
           
}
