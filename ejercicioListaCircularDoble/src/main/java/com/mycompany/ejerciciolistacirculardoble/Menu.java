
package com.mycompany.ejerciciolistacirculardoble;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

  EjercicioListaCircularDoble objLista = new EjercicioListaCircularDoble();
    public Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tittle = new javax.swing.JLabel();
        addLast = new javax.swing.JButton();
        search = new javax.swing.JButton();
        addFirst = new javax.swing.JButton();
        searchposition = new javax.swing.JButton();
        searchAdult = new javax.swing.JButton();
        removeUnderAge = new javax.swing.JButton();
        removePosition = new javax.swing.JButton();
        removeName = new javax.swing.JButton();
        removeAge = new javax.swing.JButton();
        actualizeName = new javax.swing.JButton();
        actualizeAge = new javax.swing.JButton();
        addBeforePositon = new javax.swing.JButton();
        addAfterPosition = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Práctica");

        addLast.setText("Agregar al final");
        addLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLastActionPerformed(evt);
            }
        });

        search.setText("Imprimir");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        addFirst.setText("Agregar al principio");
        addFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFirstActionPerformed(evt);
            }
        });

        searchposition.setText("Buscar posición anterior y siguiente");
        searchposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpositionActionPerformed(evt);
            }
        });

        searchAdult.setText("Consultar adultos");
        searchAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAdultActionPerformed(evt);
            }
        });

        removeUnderAge.setText("Eliminar menores");
        removeUnderAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUnderAgeActionPerformed(evt);
            }
        });

        removePosition.setText("Eliminar por posición");
        removePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePositionActionPerformed(evt);
            }
        });

        removeName.setText("Eliminar por nombre");
        removeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNameActionPerformed(evt);
            }
        });

        removeAge.setText("Eliminar por edad");
        removeAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAgeActionPerformed(evt);
            }
        });

        actualizeName.setText("Actualizar nombre");
        actualizeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizeNameActionPerformed(evt);
            }
        });

        actualizeAge.setText("Actualizar edad");
        actualizeAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizeAgeActionPerformed(evt);
            }
        });

        addBeforePositon.setText("Agregar antes de una posición");
        addBeforePositon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBeforePositonActionPerformed(evt);
            }
        });

        addAfterPosition.setText("Agregar después de una posición");
        addAfterPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAfterPositionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLast)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addFirst))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(tittle))
                    .addComponent(searchposition)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(searchAdult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(removeUnderAge))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addAfterPosition))
                            .addComponent(addBeforePositon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeName)
                            .addComponent(removePosition)
                            .addComponent(removeAge)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(actualizeAge))
                                    .addComponent(actualizeName))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tittle)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLast)
                    .addComponent(removePosition))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addFirst))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(removeName)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchposition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchAdult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeUnderAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBeforePositon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAfterPosition))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(removeAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizeName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizeAge)
                        .addGap(18, 18, 18)
                        .addComponent(search)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLastActionPerformed
        objLista.insertarFinal(JOptionPane.showInputDialog("Diga el nombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_addLastActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        objLista.imprimir();
    }//GEN-LAST:event_searchActionPerformed

    private void addFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFirstActionPerformed
        objLista.insertarInicio(JOptionPane.showInputDialog("Diga el nombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_addFirstActionPerformed

    private void searchpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpositionActionPerformed
       objLista.buscarPocisionAnteriorySiguiente();
    }//GEN-LAST:event_searchpositionActionPerformed

    private void searchAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAdultActionPerformed
       objLista.consultarAdultos();
    }//GEN-LAST:event_searchAdultActionPerformed

    private void removeUnderAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUnderAgeActionPerformed
        objLista.eliminarMenores();
    }//GEN-LAST:event_removeUnderAgeActionPerformed

    private void removePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePositionActionPerformed
        objLista.eliminarPorPosicion();
    }//GEN-LAST:event_removePositionActionPerformed

    private void removeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNameActionPerformed
        objLista.eliminarPorNombre();
    }//GEN-LAST:event_removeNameActionPerformed

    private void removeAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAgeActionPerformed
       objLista.eliminarPorEdad();
    }//GEN-LAST:event_removeAgeActionPerformed

    private void actualizeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizeNameActionPerformed
        objLista.actualizarNombre();
    }//GEN-LAST:event_actualizeNameActionPerformed

    private void actualizeAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizeAgeActionPerformed
        objLista.actualizarEdad();
    }//GEN-LAST:event_actualizeAgeActionPerformed

    private void addBeforePositonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBeforePositonActionPerformed
        objLista.insertarAntesDePosicion();
    }//GEN-LAST:event_addBeforePositonActionPerformed

    private void addAfterPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAfterPositionActionPerformed
       objLista.insertarDespuesDePosicion();
    }//GEN-LAST:event_addAfterPositionActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
      public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Integer.parseInt(str);
    }

    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizeAge;
    private javax.swing.JButton actualizeName;
    private javax.swing.JButton addAfterPosition;
    private javax.swing.JButton addBeforePositon;
    private javax.swing.JButton addFirst;
    private javax.swing.JButton addLast;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton removeAge;
    private javax.swing.JButton removeName;
    private javax.swing.JButton removePosition;
    private javax.swing.JButton removeUnderAge;
    private javax.swing.JButton search;
    private javax.swing.JButton searchAdult;
    private javax.swing.JButton searchposition;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
