/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author sqdan
 */
public class JPNL_Botones extends javax.swing.JPanel {

    /**
     * Creates new form JPNL_Botones
     */
    public JPNL_Botones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Buscar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Agregar.setText("Agregar");

        jb_Modificar.setText("Modificar");

        jb_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Buscar)
                .addGap(18, 18, 18)
                .addComponent(jb_Agregar)
                .addGap(18, 18, 18)
                .addComponent(jb_Modificar)
                .addGap(18, 18, 18)
                .addComponent(jb_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Agregar)
                    .addComponent(jb_Modificar)
                    .addComponent(jb_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    // End of variables declaration//GEN-END:variables
}