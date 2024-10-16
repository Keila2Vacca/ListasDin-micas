
package com.mycompany.ejerciciolistadoble;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
    EjercicioListaDoble objLista = new EjercicioListaDoble();
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        tittle = new javax.swing.JLabel();
        AddLast = new javax.swing.JButton();
        SearchPosition = new javax.swing.JButton();
        SearchAdultAndPosition = new javax.swing.JButton();
        DeleteUnderAge = new javax.swing.JButton();
        SearchList = new javax.swing.JButton();
        addFirst = new javax.swing.JButton();
        addBeforePosition = new javax.swing.JButton();
        addAfterPosition = new javax.swing.JButton();
        deletePosition = new javax.swing.JButton();
        deleteName = new javax.swing.JButton();
        deleteAge = new javax.swing.JButton();
        actualizeName = new javax.swing.JButton();
        actualizeAge = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Práctica");

        AddLast.setText("Agregar de último");
        AddLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLastActionPerformed(evt);
            }
        });

        SearchPosition.setText("Consultar quién está antes y después");
        SearchPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPositionActionPerformed(evt);
            }
        });

        SearchAdultAndPosition.setText("Buscar adultos y su posición");
        SearchAdultAndPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchAdultAndPositionActionPerformed(evt);
            }
        });

        DeleteUnderAge.setText("Eliminar menores de edad");
        DeleteUnderAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUnderAgeActionPerformed(evt);
            }
        });

        SearchList.setText("Imprimir");
        SearchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchListActionPerformed(evt);
            }
        });

        addFirst.setText("Agregar de primero");
        addFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFirstActionPerformed(evt);
            }
        });

        addBeforePosition.setText("Agregar antes de una posición");
        addBeforePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBeforePositionActionPerformed(evt);
            }
        });

        addAfterPosition.setText("Agregar después de una posición");
        addAfterPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAfterPositionActionPerformed(evt);
            }
        });

        deletePosition.setText("Eliminar por posición");
        deletePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePositionActionPerformed(evt);
            }
        });

        deleteName.setText("Eliminar por nombre");
        deleteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNameActionPerformed(evt);
            }
        });

        deleteAge.setText("eliminar por edad");
        deleteAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAgeActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(AddLast))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SearchPosition)
                                .addGap(44, 44, 44)
                                .addComponent(SearchList))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DeleteUnderAge)
                                            .addComponent(SearchAdultAndPosition)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(addFirst)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(addBeforePosition))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(addAfterPosition)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tittle)
                        .addGap(119, 119, 119)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletePosition)
                            .addComponent(actualizeName)
                            .addComponent(deleteName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(deleteAge)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(actualizeAge)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(tittle)
                        .addGap(2, 2, 2)
                        .addComponent(AddLast))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(deletePosition)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SearchPosition)
                        .addGap(18, 18, 18)
                        .addComponent(SearchAdultAndPosition)
                        .addGap(31, 31, 31)
                        .addComponent(addBeforePosition)
                        .addGap(18, 18, 18)
                        .addComponent(addAfterPosition))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(deleteName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchList)
                            .addComponent(deleteAge)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteUnderAge)
                            .addComponent(actualizeName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizeAge)
                            .addComponent(addFirst))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchListActionPerformed
        objLista.imprimir();
    }//GEN-LAST:event_SearchListActionPerformed

    private void AddLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLastActionPerformed
        objLista.insertarFinal(JOptionPane.showInputDialog("Diga el nombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_AddLastActionPerformed

    private void SearchAdultAndPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchAdultAndPositionActionPerformed
        objLista.consultarAdultos(); 
    }//GEN-LAST:event_SearchAdultAndPositionActionPerformed

    private void SearchPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPositionActionPerformed
        objLista.buscarPocisionAnteriorySiguiente();
        
    }//GEN-LAST:event_SearchPositionActionPerformed

    private void DeleteUnderAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUnderAgeActionPerformed
        objLista.eliminarMenores();
    }//GEN-LAST:event_DeleteUnderAgeActionPerformed

    private void addFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFirstActionPerformed
        objLista.insertarInicio(JOptionPane.showInputDialog("Diga el nombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_addFirstActionPerformed

    private void addBeforePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBeforePositionActionPerformed
        objLista.insertarAntesDePosicion();
    }//GEN-LAST:event_addBeforePositionActionPerformed

    private void addAfterPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAfterPositionActionPerformed
       objLista.insertarDespuesDePosicion();
    }//GEN-LAST:event_addAfterPositionActionPerformed

    private void deletePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePositionActionPerformed
        objLista.eliminarPorPosicion();
    }//GEN-LAST:event_deletePositionActionPerformed

    private void deleteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNameActionPerformed
       objLista.eliminarPorNombre();
    }//GEN-LAST:event_deleteNameActionPerformed

    private void deleteAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAgeActionPerformed
        objLista.eliminarPorEdad();
    }//GEN-LAST:event_deleteAgeActionPerformed

    private void actualizeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizeNameActionPerformed
        objLista.actualizarNombre();
    }//GEN-LAST:event_actualizeNameActionPerformed

    private void actualizeAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizeAgeActionPerformed
       objLista.actualizarEdad();
    }//GEN-LAST:event_actualizeAgeActionPerformed

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
    private javax.swing.JButton AddLast;
    private javax.swing.JButton DeleteUnderAge;
    private javax.swing.JButton SearchAdultAndPosition;
    private javax.swing.JButton SearchList;
    private javax.swing.JButton SearchPosition;
    private javax.swing.JButton actualizeAge;
    private javax.swing.JButton actualizeName;
    private javax.swing.JButton addAfterPosition;
    private javax.swing.JButton addBeforePosition;
    private javax.swing.JButton addFirst;
    private javax.swing.JButton deleteAge;
    private javax.swing.JButton deleteName;
    private javax.swing.JButton deletePosition;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
