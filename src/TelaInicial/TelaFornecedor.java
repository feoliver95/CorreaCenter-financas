/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaInicial;

import Classe.Fornecedor;
import Dao.FornecedorDao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author fmoliveira
 */
public class TelaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TelaFornecedor
     */
    public TelaFornecedor() {
        initComponents();
        this.setLocationRelativeTo(null);
          this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        j_id_fornecedor = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        j_nome_fornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 128, 40));

        jButton7.setText("Consultar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 128, 40));

        jLabel1.setText("id_fornecedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 315, -1, -1));

        j_id_fornecedor.setEditable(false);
        j_id_fornecedor.setEnabled(false);
        j_id_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_id_fornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(j_id_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 348, 60, -1));

        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 128, 40));
        getContentPane().add(j_nome_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 431, 190, -1));

        jLabel2.setText("Nome Fornecedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 406, -1, -1));

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 128, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Registrar Fornecedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 264, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_correcenterMenor.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 608, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FornecedorDao funcao_fornecedor= new FornecedorDao();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId_fornecedor(Integer.parseInt(this.j_id_fornecedor.getText()));
        fornecedor.setNome_fornecedor(this.j_nome_fornecedor.getText());

        funcao_fornecedor.UpdateFornecedor(fornecedor);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int id_fornecedor=0;
        FornecedorDao funcao_fornecedor= new FornecedorDao();
        id_fornecedor=funcao_fornecedor.retorna_nome_fornecedor(this.j_nome_fornecedor.getText());
        
   
         
        if (id_fornecedor>0){
            this.j_id_fornecedor.setText(String.valueOf(id_fornecedor));
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Nenhuma Categoria encontrada com esse nome");
            this.j_id_fornecedor.setText("");
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void j_id_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_id_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_id_fornecedorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FornecedorDao funcao_fornecedor= new FornecedorDao();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId_fornecedor(Integer.parseInt(this.j_id_fornecedor.getText()));
        fornecedor.setNome_fornecedor(this.j_nome_fornecedor.getText());

      funcao_fornecedor.DeleteFornecedor(this.j_nome_fornecedor.getText());
      
      this.j_nome_fornecedor.setText("");
      this.j_id_fornecedor.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: this.dispose();
        this.dispose();
        TelaContasAPagar telainicial = new TelaContasAPagar();
        telainicial.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FornecedorDao funcao_fornecedor= new FornecedorDao();
        Fornecedor fornecedor = new Fornecedor();
       // fornecedor.setId_fornecedor(Integer.parseInt(this.j_id_fornecedor.getText()));
        if(this.j_nome_fornecedor.getText().length()>0 ){
              fornecedor.setNome_fornecedor(this.j_nome_fornecedor.getText());

        
        funcao_fornecedor.InserirFornecedor(fornecedor);
        
       this.j_nome_fornecedor.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "verifique se todos os campos estão preenchidos");
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField j_id_fornecedor;
    private javax.swing.JTextField j_nome_fornecedor;
    // End of variables declaration//GEN-END:variables
}
