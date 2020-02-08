/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tp06.model.Aluno;
import tp06.model.Curso;
import tp06.model.Instituicao;
import java.util.Random;
/**
 *
 * @author joao
 */
public class CadastrodeNovoAluno extends javax.swing.JFrame {
    List<Aluno> alunos = new ArrayList<>();

    /**
     * Creates new form CadastrodeNovoAluno
     */
    public CadastrodeNovoAluno() {
        initComponents();
        preencherDisciplinasComboBox();
        gerarIDAleatorio();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jIdade = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCBCurso = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboInst = new javax.swing.JComboBox<>();
        jCpf = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            jCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 240, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel4.setText("Idade(em anos):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        getContentPane().add(jIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 56, -1));

        jBAdicionar.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/save_16.png")); // NOI18N
        jBAdicionar.setText("Adicionar");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 200, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/left_16.png")); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 96, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jID.setEnabled(false);
        getContentPane().add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/delete_16.png")); // NOI18N
        jButton1.setText("Limpar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 100, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel6.setText("Curso :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jCBCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Sistemas de Informação", "Engenharia de Computação", "Ciência da Computação", "Engenharia de Software", "Design Digital", "Redes de Computadores" }));
        getContentPane().add(jCBCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 240, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel7.setText("Instituição:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jComboInst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "UFC - Campus Quixadá", "UFC - Campus Pici", "UFC - Campus Sobral", "UFC - Campus Russas", "UFC - Campus Crateús" }));
        getContentPane().add(jComboInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 280, 240, -1));
        getContentPane().add(jCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 240, -1));

        jPanel1.setBackground(java.awt.Color.black);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Adicionar Aluno(a)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Powered by: Mr.Uzumaki");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SecretariaCadastrosView secCad = new SecretariaCadastrosView();
        secCad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    //Criando arquivo e alocando informações passadas pelos jtextField
    private boolean adicionar(){
        try{
            FileWriter fw = new FileWriter("Alunos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jNome.getText() +";"+ jCpf.getText() + ";" +jIdade.getText() +";"+ jID.getText() +";" + jCBCurso.getSelectedItem() + ";" + jComboInst.getSelectedItem());
            alocacaoNoArrayList();
            pw.close();
            fw.close();
            return true;
            
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
            
        } catch (IOException ex) {
            Logger.getLogger(CadastrodeNovoAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
  
    }
    //Preenchendo jComboBox com os novos cursos adicionados
    private void preencherDisciplinasComboBox(){
        String[] palavras = null;
        try{
            FileInputStream arquivo = new FileInputStream("CursosAdicionados.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha = null;
            do{
                linha = br.readLine();
                if(linha != null){
                    palavras = linha.split(";");
                    for(int i = 0; i < palavras.length; i++){
                        jCBCurso.addItem(palavras[i]);
                        break;   
                    }
                }
               
            }while(linha != null);
            
            
        }catch(Exception e){
            
        }
       
    }
    //Gerando ids aleatoriamente para os alunos
    public final void gerarIDAleatorio(){
        Random gerador = new Random();
        for(int i = 0; i < 1000; i++){
            jID.setText(Integer.toString(gerador.nextInt(1000)));
        }    
    }
    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        // TODO add your handling code here:
        //Adicionando oq foi selecionado no JComboBox no construtor de Curso
        //Criando arquivo Alunos para guardar alunos adicionados pelo Secretario
        if(adicionar())
            JOptionPane.showMessageDialog(null, "Aluno adicionado, confirme matrícula assim que possível");
        else JOptionPane.showMessageDialog(null, "Erro");
        limparCampos();
              
    }//GEN-LAST:event_jBAdicionarActionPerformed
    public void alocacaoNoArrayList(){
        Curso curso = new Curso((String) jCBCurso.getSelectedItem());
        Instituicao inst = new Instituicao((String) jComboInst.getSelectedItem());
        Aluno aluno = new Aluno(jNome.getText(), jCpf.getText(), Integer.parseInt(jIdade.getText()), Integer.parseInt(jID.getText()), curso, inst);
        alunos.add(aluno);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limparCampos();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed
    //Metodo para limpar os Jframes
    private void limparCampos(){
        jNome.setText("");
        jCpf.setText("");
        jIdade.setText("");
        jID.setText("");
        jCBCurso.setSelectedItem("Selecione...");
        jComboInst.setSelectedItem("Selecione...");
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
            java.util.logging.Logger.getLogger(CadastrodeNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodeNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodeNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodeNovoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodeNovoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBCurso;
    private javax.swing.JComboBox<String> jComboInst;
    private javax.swing.JFormattedTextField jCpf;
    private javax.swing.JTextField jID;
    private javax.swing.JTextField jIdade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
