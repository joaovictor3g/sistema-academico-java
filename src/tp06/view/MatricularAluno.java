/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author joao
 */
public class MatricularAluno extends javax.swing.JFrame {

    /**
     * Creates new form MatricularAluno
     */
    public MatricularAluno() {
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
        JNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBCpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            jBCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        jBMatricular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jLogin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jInstText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextCurso = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(390, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Matricular Aluno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 12, -1, -1));

        JNome.setEnabled(false);
        getContentPane().add(JNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 80, 230, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jIdade.setEnabled(false);
        getContentPane().add(jIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel3.setText("Idade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jID.setEnabled(false);
        jID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIDActionPerformed(evt);
            }
        });
        getContentPane().add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 130, 70, -1));

        jBPesquisar.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/search_16.png")); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jBPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 107, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        getContentPane().add(jBCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 230, -1));

        jBMatricular.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/plus_16.png")); // NOI18N
        jBMatricular.setText("Matricular");
        jBMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatricularActionPerformed(evt);
            }
        });
        getContentPane().add(jBMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/left_16.png")); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 107, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel6.setText("Curso:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        getContentPane().add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 218, -1));
        getContentPane().add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 218, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel8.setText("Login:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel9.setText("Novo Login e Senha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jInstText.setEnabled(false);
        getContentPane().add(jInstText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 230, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel10.setText("Instituicao:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jTextCurso.setEnabled(false);
        jTextCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 230, -1));

        jPanel1.setBackground(java.awt.Color.black);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        jLabel11.setForeground(java.awt.Color.lightGray);
        jLabel11.setText("Powered by: Mr.Uzumaki");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // TODO add your handling code here:
        int cont = 0;
        try {
            //Abrindo arquivo Alunos.txt para lê-lo e pegar suas informações
            FileInputStream arquivo = new FileInputStream("Alunos.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha = null;
            do{
                linha = br.readLine();
    
                if(linha != null){
                    String[] palavras = linha.split(";");
                    for(int i = 0; i < palavras.length; i++){
                        if(jBCpf.getText().equals(palavras[i])){
                            JNome.setText(palavras[i-1]);
                            jIdade.setText(palavras[i+1]);
                            jID.setText(palavras[i+2]);    
                            jTextCurso.setText(palavras[i+3]);
                            jInstText.setText(palavras[i+4]);
                            cont++;
                            
                        }
                    }
                }
            }while(linha != null);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aluno inexistente");
                
        }
        if(cont == 0){
            JOptionPane.showMessageDialog(null, "Aluno inexistente");
            limparCampos();
        
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    //Metódo que verifica se cpf já foi matriculado
    private boolean verificarSeJaExiste(){
        try {
            FileInputStream arquivo = new FileInputStream("AlunoLogineSenha.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);

            String linha = null;
            do{
                linha = br.readLine();
                
                if(linha != null){
                    String[] palavras = linha.split(";");
                    for(int i = 0; i < palavras.length; i++){
                        if(jBCpf.getText().equals(palavras[i])){
                            return true;
                     
                        }
                    }
                }
            }while(linha != null);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aluno inexistente");
        
        }
        return false;
        
    }
    private void jBMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatricularActionPerformed
        // TODO add your handling code here
        //Verificando o retorno da função booleana 
        if(jBCpf.getText().equals("") || JNome.getText().equals("") || jIdade.getText().equals("") || jID.getText().equals("") || jLogin.getText().equals("") || jSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos vazios");
            
        }
        else if(!verificarSeJaExiste()){
            try{
                //Abrindo arquivo AlunoLogineSenha.txt que contém todos os logins e senhas dos alunos
                FileWriter criarArquivo = new FileWriter("AlunoLogineSenha.txt", true);
                PrintWriter gravar = new PrintWriter(criarArquivo);
                gravar.println(jLogin.getText() + ";" + new String(jSenha.getPassword()) +";" + jID.getText() + ";"+ jBCpf.getText() + ";" + JNome.getText());
                JOptionPane.showMessageDialog(null, "Matriculado com sucesso");
                limparCampos();
                gravar.close();
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Aluno inexistente");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Aluno já adicionado, tente com outro CPF");
            limparCampos();
        } 
    }//GEN-LAST:event_jBMatricularActionPerformed
    private void limparCampos(){
        jBCpf.setText("");
        JNome.setText("");
        jLogin.setText("");
        jSenha.setText("");
        jTextCurso.setText("");
        jID.setText("");
        jIdade.setText("");
        jInstText.setText("");
        
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SecretariaCadastrosView secV = new SecretariaCadastrosView();
        secV.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jTextCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCursoActionPerformed
     
       
    }//GEN-LAST:event_jTextCursoActionPerformed

    private void jIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDActionPerformed
    //Habilita os campos conforme a necessidade
    public void deixarCamposAbeis(){
        JNome.setEnabled(true);
        jIdade.setEnabled(true);
        jID.setEnabled(true);
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
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatricularAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JNome;
    private javax.swing.JTextField jBCpf;
    private javax.swing.JButton jBMatricular;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jID;
    private javax.swing.JTextField jIdade;
    private javax.swing.JTextField jInstText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JFormattedTextField jTextCurso;
    // End of variables declaration//GEN-END:variables
}