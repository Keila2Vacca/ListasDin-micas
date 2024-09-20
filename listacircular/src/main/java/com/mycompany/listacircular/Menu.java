package com.mycompany.listacircular;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    ListaCircular objLista = new ListaCircular();

    int numeroBoletas;
    int boletasVendidas = 0;
    int boletasDis;

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        number = new javax.swing.JButton();
        attend = new javax.swing.JButton();
        request = new javax.swing.JButton();
        search = new javax.swing.JButton();
        sold = new javax.swing.JButton();
        searchDocument = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Venta  de boletas");

        number.setText("número de boletas");

        attend.setText("atender");
        attend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendActionPerformed(evt);
            }
        });

        request.setText("solicitar turno");
        request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestActionPerformed(evt);
            }
        });

        search.setText("cunsultar lista");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        sold.setText("boletas vendidas");
        sold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldActionPerformed(evt);
            }
        });

        searchDocument.setText("consultar por documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(tittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(attend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(request, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchDocument, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number)
                    .addComponent(request))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attend)
                    .addComponent(search))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchDocument)
                    .addComponent(sold))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestActionPerformed
        objLista.solicitarTurno(
                JOptionPane.showInputDialog("Nombre: "),
                JOptionPane.showInputDialog("Documento: "),
                JOptionPane.showInputDialog("Género: ") );
    }//GEN-LAST:event_requestActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        objLista.imprimir();
    }//GEN-LAST:event_searchActionPerformed

    private void soldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldActionPerformed
        numeroBoletas = validateIntInput(JOptionPane.showInputDialog("Diga el numero de boletas a vender: "));
    }//GEN-LAST:event_soldActionPerformed

    private void attendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendActionPerformed
        int numBoletas = validateIntInput(JOptionPane.showInputDialog("Diga el numero de boletas a comprar: "));
        if (numBoletas <= 3) {
            if (boletasDis > 0) {
                boletasDis--;
                boletasVendidas++;
                JOptionPane.showMessageDialog(rootPane, "Se vendieron las boletas solicitadas");
            }else{
              JOptionPane.showMessageDialog(rootPane, "Lo sentimos, solo hay " + boletasDis + " boletas disponibles.");   
            }
        }else{
           JOptionPane.showMessageDialog(rootPane, "Lo sentimos, el número máximo de boletas que puedes compara es: 3");
        }
    }//GEN-LAST:event_attendActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JButton attend;
    private javax.swing.JButton number;
    private javax.swing.JButton request;
    private javax.swing.JButton search;
    private javax.swing.JButton searchDocument;
    private javax.swing.JButton sold;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
