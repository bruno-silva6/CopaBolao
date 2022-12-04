/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Views.Admin.Dashboard;
import DAOs.UserDAO;
import Models.User;
import Views.User.ListTeams;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
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
        label_loginTitle = new javax.swing.JLabel();
        lbl_loginField = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        btn_submit = new javax.swing.JButton();
        btn_submit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Copa Bolão");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setName("Copa Bolão"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(27, 164, 72));
        jLabel1.setForeground(new java.awt.Color(27, 164, 72));
        jLabel1.setIcon(new javax.swing.ImageIcon("assets/logo.png"));
        jLabel1.setMaximumSize(new java.awt.Dimension(3508, 2480));
        jLabel1.setMinimumSize(new java.awt.Dimension(3508, 2480));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(3508, 2480));

        label_loginTitle.setBackground(new java.awt.Color(27, 164, 72));
        label_loginTitle.setFont(new java.awt.Font("Ubuntu Light", 1, 36)); // NOI18N
        label_loginTitle.setForeground(new java.awt.Color(27, 164, 72));
        label_loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_loginTitle.setText("Login");

        lbl_loginField.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        lbl_loginField.setText("E-mail ou nome de usuário");

        tf_email.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N

        lbl_password.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        lbl_password.setText("Senha");

        pf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_passwordActionPerformed(evt);
            }
        });

        btn_submit.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(27, 164, 72));
        btn_submit.setText("Cadastrar");
        btn_submit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 164, 72), 1, true));
        btn_submit.setContentAreaFilled(false);
        btn_submit.setFocusable(false);
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_submit1.setBackground(new java.awt.Color(27, 164, 72));
        btn_submit1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        btn_submit1.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit1.setText("Entrar");
        btn_submit1.setBorderPainted(false);
        btn_submit1.setFocusable(false);
        btn_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_password)
                    .addComponent(lbl_loginField)
                    .addComponent(btn_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(label_loginTitle)
                .addGap(55, 55, 55)
                .addComponent(lbl_loginField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btn_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void pf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_passwordActionPerformed

    private void btn_submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submit1ActionPerformed
        login();
    }//GEN-LAST:event_btn_submit1ActionPerformed

    private void login() {
        String username = tf_email.getText();
        String password = new String(pf_password.getPassword());

        User user = new User(username, password);

        user = UserDAO.auth(user);
        
        if (user.isAuthenticated()) {
            if (user.getId_nivelAcesso() == 1) {
                (new Dashboard()).setVisible(true);
            } else {
                (new ListTeams(user)).setVisible(true);
            }
            
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario/Senha inválido(s)");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_submit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_loginTitle;
    private javax.swing.JLabel lbl_loginField;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_email;
    // End of variables declaration//GEN-END:variables
}
