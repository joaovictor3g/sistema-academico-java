/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp06.model.Pessoa;
import tp06.model.Professor;

/**
 *
 * @author joao
 */
public class ViewProfessor extends javax.swing.JFrame {
    Pessoa professor = new Professor();
    LancarNotas lancar = new LancarNotas();
    /**
     * Creates new form ViewProfessor
     */
    public ViewProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   //Preenchendo todas as COLUNAS e LINHAS
    private void preencherColunaCodigoePeriodo(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        try{
            FileInputStream abrir = new FileInputStream("TurmasAbertas.txt");
            InputStreamReader input = new InputStreamReader(abrir);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            String[] palavras;
            int linhaCodigo = 0, colunaCodigo = 0;
            
            while((linha = br.readLine()) != null){
                if(linha != null){
                    palavras = linha.split(";");
                    
                    for(int i = 0; i < palavras.length; i++){
                        if(Integer.toString(getIDProfessor()).equals(palavras[i])){
                            modelo.setValueAt(palavras[2], linhaCodigo, colunaCodigo);
                            modelo.setValueAt(palavras[5], linhaCodigo, 1);
                            modelo.setValueAt(palavras[7], linhaCodigo, 2);
                            modelo.setValueAt(palavras[6], linhaCodigo, 3);
                            modelo.setValueAt(palavras[8], linhaCodigo, 4);
                            linhaCodigo++;
                        }
                        
                    }
                    
                }
                
                
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(632, 506));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Disciplina", "Periodo", "Créditos", "Dia da Semana"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 810, 280));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/left_16.png")); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 430, 150, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/info_16.png")); // NOI18N
        jButton2.setText("Turmas anteriores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/diagram_16.png")); // NOI18N
        jButton3.setText("Lançar Notas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 155, -1));

        jToggleButton1.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/document_16.png")); // NOI18N
        jToggleButton1.setText("Ver turmas atuais");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 155, -1));

        jPanel1.setBackground(java.awt.Color.black);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Olá, Professor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(315, 315, 315))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 50));

        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Powered by: Mr.Uzumaki");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TurmasAnterioresProfessor turmasAnt = new TurmasAnterioresProfessor();
        turmasAnt.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    //Chamando Tela de lancamento de notas
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LancarNotas lancarnotas = new LancarNotas();
        lancarnotas.setVisible(true);
        lancar.setLoginProfessor(getIDProfessor());
        dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        //JOptionPane.showMessageDialog(null, Integer.toString(getIDProfessor()));
    }//GEN-LAST:event_jTable1MouseClicked
    //Limpando a tabela
    private void limparTabela(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        int x = jTable1.getRowCount();
        for(int i = 0; i < x; i++){
            modelo.setValueAt("", i, 0);
            modelo.setValueAt("", i, 1);
            modelo.setValueAt("", i, 2);
        }
    }
    //Verificando se botao foi selecionado ou nao
    private void verificarJtoggle(){
        if(jToggleButton1.isSelected()){
            preencherColunaCodigoePeriodo();
            
        }else{
            limparTabela();
        }
    }
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        verificarJtoggle();
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    public void setIDProfessor(int _id){
        professor.setId(_id);
        
    }
    public int getIDProfessor(){
       return professor.getId();
       
    }
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
            java.util.logging.Logger.getLogger(ViewProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
