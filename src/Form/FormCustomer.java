/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Wandana
 */
public class FormCustomer extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    
    /**
     * Creates new form FormCustomer
     */
    public FormCustomer() {
        initComponents();
        judul();
        tampilData();
        setLocationRelativeTo(null);
    }
    
    public void reset() {
        Tidcustomer.setText("");
        Tnama.setText("");
        Talamat.setText("");
        Tidcustomer.setEnabled(true);
        Bsave.setEnabled(true);
        Bedit.setEnabled(true);
        Bdelete.setEnabled(true);
        Tidcustomer.setEnabled(true);
    }
        
    public void judul() {
        Object[] judul = {"ID CUSTOMER", "NAMA CUSTOMER", "ALAMAT"};
        tabModel = new DefaultTableModel(null, judul);
        TBcustomer.setModel(tabModel);
    }
    
    public void tampilData(){
        try {
           st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("select * from customer");
            while (rs.next()) {
                Object[] data = {
                   rs.getString("id_customer"),
                   rs.getString("nama"),
                   rs.getString("alamat")
                };
                tabModel.addRow(data);
            }
        } catch (Exception e) {
          e.printStackTrace();  
        }
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        Bcari = new javax.swing.JButton();
        Talamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBcustomer = new javax.swing.JTable();
        Bsave = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Breset = new javax.swing.JButton();
        Bkeluar = new javax.swing.JButton();
        Tidcustomer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BENGKEL MOTOR JAVA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("DATA CUSTOMER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel3.setText("ID Customer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel10.setText("Nama");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        Tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnamaActionPerformed(evt);
            }
        });
        getContentPane().add(Tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 220, -1));

        Bcari.setText("Cari");
        Bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcariActionPerformed(evt);
            }
        });
        getContentPane().add(Bcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 60, -1));

        Talamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TalamatActionPerformed(evt);
            }
        });
        getContentPane().add(Talamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, 40));

        TBcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBcustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBcustomer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 480, 260));

        Bsave.setText("Simpan");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });
        getContentPane().add(Bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 90, -1));

        Bedit.setText("Update");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        getContentPane().add(Bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 90, -1));

        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, -1));

        Breset.setText("Reset");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });
        getContentPane().add(Breset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 80, -1));

        Bkeluar.setText("Keluar");
        Bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Bkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 80, -1));
        getContentPane().add(Tidcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnamaActionPerformed

    private void BcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcariActionPerformed
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM customer where id_customer ='"+
                Tidcustomer.getText()+"'");
            while (rs.next()){

                Tnama.setText(rs.getString(2));
                Talamat.setText(rs.getString(3));
                JOptionPane.showMessageDialog(rootPane, "Ini Datanya Berdasarkan ID Customer = '"+Tidcustomer.getText()+"' ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "eror"+e);
        }
    }//GEN-LAST:event_BcariActionPerformed

    private void TalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TalamatActionPerformed

    private void TBcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBcustomerMouseClicked
        try {
            Tidcustomer.setText(tabModel.getValueAt(TBcustomer.getSelectedRow(), 0).toString());
            Tnama.setText(tabModel.getValueAt(TBcustomer.getSelectedRow(), 1).toString());
            Talamat.setText(tabModel.getValueAt(TBcustomer.getSelectedRow(), 2).toString());
            Bsave.setEnabled(false);
            Bedit.setEnabled(true);
            Bdelete.setEnabled(true);
            Tidcustomer.setEnabled(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_TBcustomerMouseClicked

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        if (Tidcustomer.getText().isEmpty() || Tnama.getText().isEmpty() || Talamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lengkapi Data!");
        } else {
            try {
                st = cn.createStatement();
                st.executeUpdate("INSERT INTO customer VALUES('"+
                    Tidcustomer.getText()+"','"+
                    Tnama.getText()+"','"+
                    Talamat.getText()+"')");
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
                tampilData();
                reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BsaveActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed
        if (Tidcustomer.getText().isEmpty() || Tnama.getText().isEmpty() || Talamat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lengkapi Data!");
        } else {
            try {
                st = cn.createStatement();
                st.executeUpdate("UPDATE customer set nama='"+Tnama.getText()
                    + "', alamat='"+Talamat.getText()
                    + "' WHERE id_customer='"+ Tidcustomer.getText()+"'");
                JOptionPane.showMessageDialog(null, "Berhasil Diupdate");
                tampilData();
                reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BeditActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        int jawab;
        if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin Menghapus Data?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
            try {
                st = cn.createStatement();
                st.executeUpdate("delete from customer where id_customer='" + Tidcustomer.getText()+ "'");
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                tampilData();
                reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        reset();
    }//GEN-LAST:event_BresetActionPerformed

    private void BkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkeluarActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda akan kembali ke menu utama?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            MenuUtama menu = new MenuUtama();
            menu.setVisible(true);
            this.dispose();
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_BkeluarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcari;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bkeluar;
    private javax.swing.JButton Breset;
    private javax.swing.JButton Bsave;
    private javax.swing.JTable TBcustomer;
    private javax.swing.JTextField Talamat;
    private javax.swing.JTextField Tidcustomer;
    private javax.swing.JTextField Tnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
