/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comumanager.view;

import comumanager.view.insercao.ViewAnexo;
import comumanager.view.insercao.ViewComunidade;
import comumanager.view.insercao.ViewEntrevistado;
import comumanager.view.insercao.ViewPergunta;
import comumanager.view.insercao.ViewPesquisa;
import comumanager.view.insercao.ViewPesquisa;
import comumanager.view.insercao.ViewQuestionario;
import comumanager.view.insercao.ViewQuestionario;
import comumanager.view.insercao.ViewResposta;
import comumanager.view.insercao.ViewResposta;

/**
 *
 * @author lucas
 */
public class ViewInsercao extends javax.swing.JPanel {

    /**
     * Creates new form ViewInsercao
     */
    public ViewInsercao() {
        initComponents();
        jTabbedPane1.addTab("Pesquisa", new ViewPesquisa());
        jTabbedPane1.addTab("Questionario", new ViewQuestionario());
        jTabbedPane1.addTab("Comunidade", new ViewComunidade());
        jTabbedPane1.addTab("Entrevistado", new ViewEntrevistado());
        jTabbedPane1.addTab("Pergunta", new ViewPergunta());
        jTabbedPane1.addTab("Resposta", new ViewResposta());
        jTabbedPane1.addTab("Anexo", new ViewAnexo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        jTabbedPane1.setBackground(java.awt.Color.white);
        jTabbedPane1.setFont(new java.awt.Font("Fira Sans", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
