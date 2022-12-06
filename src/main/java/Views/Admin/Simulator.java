/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Admin;

import DAOs.TimeDAO;
import Models.Time;
import Views.Admin.Dashboard;
import Views.Admin.Groups.Groups;
import Views.Admin.Matches.ListMatches;
import Views.Admin.Teams.Teams;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bruno
 */
public class Simulator extends javax.swing.JFrame {

    /**
     * Creates new form Simulator
     */
    public Simulator() {
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
        jPanel2 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JButton();
        btn_simulator = new javax.swing.JButton();
        btn_times = new javax.swing.JButton();
        btn_groups = new javax.swing.JButton();
        btn_groups1 = new javax.swing.JButton();
        lbl_team1 = new javax.swing.JLabel();
        lbl_team2 = new javax.swing.JLabel();
        lbl_scoreTeam2 = new javax.swing.JLabel();
        lbl_scoreTeam1 = new javax.swing.JLabel();
        btn_simulateMatch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);

        lbl_logo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo.setIcon(new javax.swing.ImageIcon("assets/logo_menor.png"));
        lbl_logo.setToolTipText("");
        lbl_logo.setPreferredSize(new java.awt.Dimension(180, 100));

        btn_dashboard.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setBorderPainted(false);
        btn_dashboard.setDefaultCapable(false);
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.setFocusable(false);
        btn_dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        btn_simulator.setBackground(new java.awt.Color(27, 164, 72));
        btn_simulator.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_simulator.setForeground(new java.awt.Color(255, 255, 255));
        btn_simulator.setText("Simulador");
        btn_simulator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_simulator.setFocusable(false);
        btn_simulator.setOpaque(true);
        btn_simulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simulatorActionPerformed(evt);
            }
        });

        btn_times.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_times.setText("Times");
        btn_times.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_times.setFocusable(false);
        btn_times.setOpaque(true);
        btn_times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timesActionPerformed(evt);
            }
        });

        btn_groups.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_groups.setText("Grupos");
        btn_groups.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_groups.setFocusable(false);
        btn_groups.setOpaque(true);
        btn_groups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_groupsActionPerformed(evt);
            }
        });

        btn_groups1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_groups1.setText("Partidas");
        btn_groups1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 245, 245)));
        btn_groups1.setFocusable(false);
        btn_groups1.setOpaque(true);
        btn_groups1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_groups1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(btn_simulator, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(btn_times, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(btn_groups, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_groups1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_simulator, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_times, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_groups, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_groups1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_team1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lbl_team1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_team1.setText(" ");

        lbl_team2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lbl_team2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_team2.setText(" ");

        lbl_scoreTeam2.setFont(new java.awt.Font("Ubuntu", 0, 90)); // NOI18N
        lbl_scoreTeam2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_scoreTeam2.setText(" ");

        lbl_scoreTeam1.setFont(new java.awt.Font("Ubuntu", 0, 90)); // NOI18N
        lbl_scoreTeam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_scoreTeam1.setText(" ");

        btn_simulateMatch.setBackground(new java.awt.Color(27, 164, 72));
        btn_simulateMatch.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_simulateMatch.setForeground(new java.awt.Color(255, 255, 255));
        btn_simulateMatch.setText("Simular Partida");
        btn_simulateMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simulateMatchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 40)); // NOI18N
        jLabel5.setText("VS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_team1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_scoreTeam1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_team2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_scoreTeam2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btn_simulateMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_team1)
                    .addComponent(lbl_team2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_scoreTeam2)
                            .addComponent(lbl_scoreTeam1))))
                .addGap(132, 132, 132)
                .addComponent(btn_simulateMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simulateMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simulateMatchActionPerformed
        ArrayList<Time> teams = TimeDAO.list();
        Time team1 = teams.get(new Random().nextInt(teams.size()));

        Time team2 = teams.get(new Random().nextInt(teams.size()));
        while (team2.getId() == team1.getId()) {
            team2 = teams.get(new Random().nextInt(teams.size()));
        }

        lbl_team1.setText(team1.getNome());
        lbl_team2.setText(team2.getNome());

        lbl_scoreTeam1.setText(Integer.toString(new Random().nextInt(4) ));
        lbl_scoreTeam2.setText(Integer.toString(new Random().nextInt(4)));
    }//GEN-LAST:event_btn_simulateMatchActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        (new Dashboard()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_simulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simulatorActionPerformed
        (new Simulator()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_simulatorActionPerformed

    private void btn_timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timesActionPerformed
        (new Teams()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_timesActionPerformed

    private void btn_groupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_groupsActionPerformed
        (new Groups()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_groupsActionPerformed

    private void btn_groups1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_groups1ActionPerformed
        (new ListMatches()).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_groups1ActionPerformed

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
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_groups;
    private javax.swing.JButton btn_groups1;
    private javax.swing.JButton btn_simulateMatch;
    private javax.swing.JButton btn_simulator;
    private javax.swing.JButton btn_times;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_scoreTeam1;
    private javax.swing.JLabel lbl_scoreTeam2;
    private javax.swing.JLabel lbl_team1;
    private javax.swing.JLabel lbl_team2;
    // End of variables declaration//GEN-END:variables
}
