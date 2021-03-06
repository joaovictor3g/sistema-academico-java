/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.view;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tp06.model.Disciplina;

/**
 *
 * @author joao
 */
public class AdicionarDisciplinasByCoo extends javax.swing.JFrame {
    List<Disciplina> disciplinas = new ArrayList<>();
    /**
     * Creates new form AdicionarDisciplinasByCoo
     */
    public AdicionarDisciplinasByCoo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel3 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextCredito = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        jTextCh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBPrereq = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(390, 500));
        setPreferredSize(new java.awt.Dimension(400, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 236, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Créditos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 139, -1, -1));
        getContentPane().add(jTextCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 131, 55, -1));

        jBAdicionar.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/plus_16.png")); // NOI18N
        jBAdicionar.setText("Adicionar");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 147, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/left_16.png")); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 147, -1));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 228, -1, -1));
        getContentPane().add(jTextCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 41, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Carga Horária:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 139, -1, -1));

        jCBPrereq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        getContentPane().add(jCBPrereq, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Tem pré-requisito?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 197, -1, -1));

        jPanel3.setBackground(java.awt.Color.black);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Olá, Coordenador");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Você está adicionando disciplinas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Powered by: Mr.Uzumaki");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        // TODO add your handling code here:
        //Criando arquivo 
        try {
            FileWriter file1 = new FileWriter("Disciplinas.txt", true);
            PrintWriter print1 = new PrintWriter(file1);
                    
            if(jTextNome.getText().equals("") || jTextCredito.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Campo vazio");
            
            int preRequisito = 0;
            
            preRequisito = jCBPrereq.getSelectedItem().equals("Sim")? 1 : 0; 
                
            //Preenchendo arquivo com campos de textos do JFrame    
            print1.println(jTextNome.getText() + ";" + jTextCredito.getText() + ";" + jTextCh.getText() + ";" + preRequisito + ";");
            JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso");
            disciplinas.add(new Disciplina(jTextNome.getText(), Integer.parseInt(jTextCredito.getText())));
            print1.close();
                
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "Exceção");
        }
        //Limpando os campos do JtextField    
        jTextNome.setText("");
        jTextCredito.setText("");
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByCoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByCoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByCoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByCoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarDisciplinasByCoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBPrereq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextCh;
    private javax.swing.JTextField jTextCredito;
    private javax.swing.JTextField jTextNome;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
