/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import crudescola.GerenciadorAlunos;
import crudescola.GerenciadorCoordenadores;
import crudescola.GerenciadorDiretor;
import crudescola.GerenciadorProfessores;
import crudescola.GerenciadorTurmas;
/**
 *
 * @author vinic
 */
public class Cadastros extends javax.swing.JFrame {

    /**
     * Creates new form Cadastros
     */
    GerenciadorProfessores professores;
    GerenciadorCoordenadores coordenadores;
    GerenciadorDiretor diretores;
    GerenciadorAlunos alunos;
    GerenciadorTurmas turmas;
    
    public Cadastros() {
        initComponents();
    }
    
    public void listas(GerenciadorProfessores professores, GerenciadorCoordenadores coordenadores,
                     GerenciadorDiretor diretores, GerenciadorAlunos alunos, GerenciadorTurmas turmas){
        this.professores=professores;
        this.diretores=diretores;
        this.coordenadores=coordenadores;
        this.alunos=alunos;
        this.turmas=turmas;
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
        btnCadProf = new javax.swing.JButton();
        btnCadCoord = new javax.swing.JButton();
        btnCadDiretor = new javax.swing.JButton();
        btnCadAluno = new javax.swing.JButton();
        btnCadTurma = new javax.swing.JButton();
        btnVoltarCadastros = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tela de cadastros");

        btnCadProf.setText("Professor");
        btnCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProfActionPerformed(evt);
            }
        });

        btnCadCoord.setText("Coordenador");
        btnCadCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCoordActionPerformed(evt);
            }
        });

        btnCadDiretor.setText("Diretor");
        btnCadDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDiretorActionPerformed(evt);
            }
        });

        btnCadAluno.setText("Aluno");
        btnCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAlunoActionPerformed(evt);
            }
        });

        btnCadTurma.setText("Turma");
        btnCadTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadTurmaActionPerformed(evt);
            }
        });

        btnVoltarCadastros.setText("Voltar");
        btnVoltarCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastrosActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione quem você deseja cadastrar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCadAluno)
                        .addGap(47, 47, 47)
                        .addComponent(btnCadTurma)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltarCadastros)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnCadProf)
                        .addGap(47, 47, 47)
                        .addComponent(btnCadCoord)
                        .addGap(38, 38, 38)
                        .addComponent(btnCadDiretor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadProf)
                    .addComponent(btnCadCoord)
                    .addComponent(btnCadDiretor))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadTurma)
                    .addComponent(btnCadAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnVoltarCadastros)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCoordActionPerformed
        CadCoordenador cadcoord = new CadCoordenador();
        cadcoord.setVisible(true);
    }//GEN-LAST:event_btnCadCoordActionPerformed

    private void btnCadDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDiretorActionPerformed
        CadDiretor caddiretor = new CadDiretor();
        caddiretor.setVisible(true);
    }//GEN-LAST:event_btnCadDiretorActionPerformed

    private void btnCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAlunoActionPerformed
        CadAluno cadaluno = new CadAluno();
        cadaluno.alunos(alunos);
        cadaluno.setVisible(true);
    }//GEN-LAST:event_btnCadAlunoActionPerformed

    private void btnCadTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadTurmaActionPerformed
        CadTurma cadturma = new CadTurma();
        cadturma.setVisible(true);
    }//GEN-LAST:event_btnCadTurmaActionPerformed

    private void btnVoltarCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastrosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastrosActionPerformed

    private void btnCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProfActionPerformed
        CadProfessor cadprof = new CadProfessor();
        cadprof.setVisible(true);
    }//GEN-LAST:event_btnCadProfActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAluno;
    private javax.swing.JButton btnCadCoord;
    private javax.swing.JButton btnCadDiretor;
    private javax.swing.JButton btnCadProf;
    private javax.swing.JButton btnCadTurma;
    private javax.swing.JButton btnVoltarCadastros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
