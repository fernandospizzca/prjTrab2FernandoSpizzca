package fatec.poo.view;

import fatec.poo.model.Atendente;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fernandoHS
 */
public class GuiCadastroAtendente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroAtendente
     */
    public GuiCadastroAtendente(ArrayList<Pessoa> c) {
        initComponents();
        cadPessoas = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbtTurno = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRegFuncional = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jPanelTurno = new javax.swing.JPanel();
        rbtManha = new javax.swing.JRadioButton();
        rbtTarde = new javax.swing.JRadioButton();
        rbtNoite = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Atendente");

        jLabel1.setText("Reg. Funcional");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        jPanelTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        grbtTurno.add(rbtManha);
        rbtManha.setSelected(true);
        rbtManha.setText("Manhã");
        rbtManha.setEnabled(false);

        grbtTurno.add(rbtTarde);
        rbtTarde.setText("Tarde");
        rbtTarde.setEnabled(false);

        grbtTurno.add(rbtNoite);
        rbtNoite.setText("Noite");
        rbtNoite.setEnabled(false);

        javax.swing.GroupLayout jPanelTurnoLayout = new javax.swing.GroupLayout(jPanelTurno);
        jPanelTurno.setLayout(jPanelTurnoLayout);
        jPanelTurnoLayout.setHorizontalGroup(
            jPanelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTurnoLayout.createSequentialGroup()
                .addComponent(rbtManha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtNoite)
                .addContainerGap())
        );
        jPanelTurnoLayout.setVerticalGroup(
            jPanelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTurnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtManha)
                    .addComponent(rbtTarde)
                    .addComponent(rbtNoite)))
        );

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addComponent(jPanelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtEndereco)
                            .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int x;
        for (x = 0; x < cadPessoas.size(); x++) {
            if (cadPessoas.get(x) instanceof Atendente) {
                if (((Atendente) cadPessoas.get(x)).getRegFunc().equals(txtRegFuncional.getText())) {
                    break;
                }
            }
        }

        if (x < cadPessoas.size()) {
            posAtendente = x;
        } else {
            posAtendente = -1;
        }

        if (posAtendente >= 0) {
            txtRegFuncional.setText(((Atendente) cadPessoas.get(posAtendente)).getRegFunc());
            txtNome.setText(cadPessoas.get(posAtendente).getNome());
            txtEndereco.setText(cadPessoas.get(posAtendente).getEndereco());
            txtTelefone.setText(cadPessoas.get(posAtendente).getTelefone());
            if (((Atendente) cadPessoas.get(posAtendente)).getTurno() == "M") {
                rbtManha.setSelected(true);
            } else if (((Atendente) cadPessoas.get(posAtendente)).getTurno() == "T") {
                rbtTarde.setSelected(true);
            } else {
                rbtNoite.setSelected(true);
            }
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Atendente não cadastrado, caso deseje cadastrar informe os dados a seguir e clique inserir.");
            txtNome.setText(null);
            txtEndereco.setText(null);
            txtTelefone.setText(null);
            rbtManha.setSelected(true);
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtNome.requestFocus();
        }
        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        rbtManha.setEnabled(true);
        rbtTarde.setEnabled(true);
        rbtNoite.setEnabled(true);

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        p = new Atendente(txtNome.getText(), txtRegFuncional.getText());
        p.setEndereco(txtEndereco.getText());
        p.setTelefone(txtTelefone.getText());

        if (rbtManha.isSelected()) {
            ((Atendente) p).setTurno("M");
        } else if (rbtTarde.isSelected()) {
            ((Atendente) p).setTurno("T");
        } else {
            ((Atendente) p).setTurno("N");
        }

        cadPessoas.add(p);

        txtRegFuncional.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        rbtManha.setEnabled(false);
        rbtTarde.setEnabled(false);
        rbtNoite.setEnabled(false);
        rbtManha.setSelected(true);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtRegFuncional.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        cadPessoas.get(posAtendente).setNome(txtNome.getText());
        cadPessoas.get(posAtendente).setEndereco(txtEndereco.getText());
        cadPessoas.get(posAtendente).setTelefone(txtTelefone.getText());
        if (rbtManha.isSelected()) {
            ((Atendente) cadPessoas.get(posAtendente)).setTurno("M");
        } else if (rbtTarde.isSelected()) {
            ((Atendente) cadPessoas.get(posAtendente)).setTurno("T");
        } else {
            ((Atendente) cadPessoas.get(posAtendente)).setTurno("N");
        }

        txtRegFuncional.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        rbtManha.setEnabled(false);
        rbtTarde.setEnabled(false);
        rbtNoite.setEnabled(false);
        rbtManha.setSelected(true);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtRegFuncional.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posAtendente >= 0) {
            cadPessoas.remove(posAtendente);
            posAtendente = -1;
        }
        txtRegFuncional.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        rbtManha.setEnabled(false);
        rbtTarde.setEnabled(false);
        rbtNoite.setEnabled(false);
        rbtManha.setSelected(true);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtRegFuncional.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup grbtTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelTurno;
    private javax.swing.JRadioButton rbtManha;
    private javax.swing.JRadioButton rbtNoite;
    private javax.swing.JRadioButton rbtTarde;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegFuncional;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadPessoas = new ArrayList<Pessoa>();
    private Pessoa p = null;
    private int posAtendente;
}