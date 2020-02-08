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
import tp06.model.Historico;

/**
 *
 * @author joao
 */
public class HistoricoEscolar extends javax.swing.JFrame {
    Historico hist = new Historico();
    /**
     * Creates new form HistoricoEscolar
     */  
    public HistoricoEscolar() {
        //preencherCodigo();
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    //Preenchendo dados
    private void preencherDadosDoDiscente(){
       //JOptionPane.showMessageDialog(null, getIdAluno());
        try{
           FileInputStream abrir = new FileInputStream("Alunos.txt");
           InputStreamReader input = new InputStreamReader(abrir);
           BufferedReader br = new BufferedReader(input);
           
           String linha;
           String[] palavras;
           
            while((linha = br.readLine()) != null){
               if(linha != null){
                   palavras = linha.split(";");
                   for(int i = 0; i < palavras.length; i++){
                       if(jTextID.getText().equals(palavras[i])){
                           jTextNome.setText(palavras[0]);
                           jTextCurso.setText(palavras[4]);
                           jTextModad.setText("Presencial");
                           jTextInst.setText(palavras[5]);
                           
                       }
                   }
               }
               
           }
           
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
        
    }
    //Preenchendo a coluna de notas do aluno, disciplina e a situação
    private void preencherTabelasComNotas(){
        int cont = 0;
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        double media = 0.0;
        
        try{
            FileInputStream abrir = new FileInputStream("Notas.txt");
            InputStreamReader input = new InputStreamReader(abrir);
            BufferedReader br = new BufferedReader(input);
           
            String linha;
            String[] palavras;
            
            
            int linhaNota = 0, colunaNota = 2, linhaDic = 0, colunaDisc = 0;
            int linhaSituacao = 0, colunaSituacao = 3;
            while((linha = br.readLine()) != null){
                if(linha != null){
                    palavras = linha.split(";");
                    
                    for(int i = 0; i < palavras.length; i++){
                        if(jTextID.getText().equals(palavras[i])){
                            media = (Double.parseDouble(palavras[2]) + Double.parseDouble(palavras[3]) + Double.parseDouble(palavras[4]))/3;
                            modelo.setValueAt(media, linhaNota, colunaNota);
                            modelo.setValueAt(palavras[6], linhaDic, colunaDisc);
                            
                            String situacao = media >= 7 ? "Aprovado": "Reprovado";
                            modelo.setValueAt(situacao, linhaSituacao, colunaSituacao);
                            cont++;
                            linhaNota++;
                            linhaDic++;
                            linhaSituacao++;
                      
                        }   
                    }
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if(cont == 0)
            JOptionPane.showMessageDialog(null, "ID inexistente");
        preencherFrequencia();
    }
    //Prenchendo a tabela de frequência do aluno
    private void preencherFrequencia(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        double frequencia;
        try{
            FileInputStream abrir = new FileInputStream("Notas.txt");
            InputStreamReader input = new InputStreamReader(abrir);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            String[] palavras;
            int linhafreq = 0, colunafreq = 1;
            while((linha = br.readLine()) != null){
                if(linha != null){
                    palavras = linha.split(";");
                    //JOptionPane.showMessageDialog(null, palavras.length);
                    
                    for(int i = 0; i < palavras.length; i++){
                        if(jTextID.getText().equals(palavras[1])){
                            frequencia = 100 - (((Double.parseDouble(palavras[5])) / (Double.parseDouble(palavras[7]))) * 100);
                            modelo.setValueAt(frequencia, linhafreq, colunafreq);
                            linhafreq++;
                            break;
                        }   
                    }
                   
                }
            }
            br.close();
            input.close();
            abrir.close();
               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Metodo para ajustar ID do aluno
    public void setIDAluno(int id){
        hist.setId(id);
    }
    //Metodo para pegar Id do aluno
    public int getIdAluno(){
        return hist.getId();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextCurso = new javax.swing.JTextField();
        jTextModad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextInst = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(702, 786));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.black);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Dados do Pessoais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 678, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 58, 32));

        jTextNome.setEnabled(false);
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 63, 309, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("ID do Aluno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jTextID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextIDMouseClicked(evt);
            }
        });
        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 63, 102, -1));

        jPanel2.setBackground(java.awt.Color.black);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Dados do Curso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, 678, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Curso:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jTextCurso.setEnabled(false);
        getContentPane().add(jTextCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 213, 306, -1));

        jTextModad.setEnabled(false);
        getContentPane().add(jTextModad, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 254, 306, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Modalidade:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jPanel3.setBackground(java.awt.Color.black);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Dados da instituição");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(267, 267, 267))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 359, 678, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 431, -1, -1));

        jTextInst.setEnabled(false);
        getContentPane().add(jTextInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 417, 302, -1));

        jPanel4.setBackground(java.awt.Color.black);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Componentes Curriculares Cursados/Cursando");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(130, 130, 130))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 458, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Disciplina", "Freq %", "Nota", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 513, 678, 148));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/search_16.png")); // NOI18N
        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 104, 102, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/joao/Documentos/CADEIRAS/POO/Pack de imagens/left_16.png")); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, -1, -1));

        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("Powered by: Mr.Uzumaki");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 770, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, getIdAluno());
        
        preencherDadosDoDiscente();
        preencherTabelasComNotas();
        //preencherFrequencia();
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextIDMouseClicked
        // TODO add your handling code here:
        jTextID.setText(Integer.toString(getIdAluno()));
    }//GEN-LAST:event_jTextIDMouseClicked

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
            java.util.logging.Logger.getLogger(HistoricoEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoEscolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoEscolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCurso;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextInst;
    private javax.swing.JTextField jTextModad;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
