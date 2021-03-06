/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.view;
import tp06.model.Disciplina;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author joao
 */
public class AdicionarDisciplinasByReitor extends javax.swing.JFrame {
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    /**
     * Creates new form AdicionarDisciplinas
     */
    public AdicionarDisciplinasByReitor() {
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

        jLabel1 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCredito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextCh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel2.setText("Créditos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(jCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 72, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/plus_16.png")); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 111, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/left_16.png")); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 86, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel4.setText("Carga Horária:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 140, -1, -1));

        jTextCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 80, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Você está adicionando disciplinas.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 24, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 210, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel6.setText("Tem pré-requisito:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 195, -1, -1));

        jPanel1.setBackground(java.awt.Color.black);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Olá Reitor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel3)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setForeground(java.awt.Color.gray);
        jLabel7.setText("Powered by: Mr.Uzumaki");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adicionar();
        //Limpando os JtextField
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void limparCampos(){
        jNome.setText("");
        jCredito.setText("");
    }
    public boolean adicionar(){
        AlunoInterface alunoIn = new AlunoInterface();
       
        try {
            FileWriter file1 = new FileWriter("Disciplinas.txt", true);
            PrintWriter print1 = new PrintWriter(file1);
                    
            if(jNome.getText().equals("") || jCredito.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Campos vazios, adicione o nome e creditos da disciplina!!");
            
            else if(verificarSeJaAdicionado()){
                JOptionPane.showMessageDialog(null, "Disciplina já adicionada");
                limparCampos();
                
            }else{
                int preReq = 0;
                
                preReq = jComboBox1.getSelectedItem().equals("Sim")? 1 : 0;
                
                print1.println(jNome.getText() + ";" + jCredito.getText() + ";"+jTextCh.getText() + ";" + preReq +";");
                JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso");
                disciplinas.add(new Disciplina(jNome.getText(), Integer.parseInt(jCredito.getText())));
                print1.close();
                limparCampos();
                return true;
            }
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "Arquivo não aberto");
            
        }
        limparCampos();
        return false;
    }
    //Verifica se discilina ja foi adicionada
    private boolean verificarSeJaAdicionado(){
        try{
            FileInputStream abrirArq = new FileInputStream("Disciplinas.txt");
            InputStreamReader lerArq = new InputStreamReader(abrirArq);
            BufferedReader br = new BufferedReader(lerArq);
            
            String linha;
            
            while((linha = br.readLine()) != null){
                String[] palavras = linha.split(";");
                if(linha != null){
                    for(int i = 0; i < palavras.length; i++){
                        if(jNome.getText().equals(palavras[i]))
                            return true;
                    }
                }
                
            }
            
        }catch(Exception e){
            
        }
        return false;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuReitor menu = new MenuReitor();
        menu.setVisible(true);
        dispose();
       
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextChActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextChActionPerformed
    
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
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByReitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByReitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByReitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarDisciplinasByReitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarDisciplinasByReitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jCredito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCh;
    // End of variables declaration//GEN-END:variables
}
