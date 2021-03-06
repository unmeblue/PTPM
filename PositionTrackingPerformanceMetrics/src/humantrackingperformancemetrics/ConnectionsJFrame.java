
package humantrackingperformancemetrics;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * ConnectionsJFrame implements a JFrame to show and allow options related to 
 * connections to be changed.
 * @author Will Shackleford <shackle@nist.gov>
 */
public class ConnectionsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConnectionsJFrame
     */
    public ConnectionsJFrame() {
        initComponents();
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
        jList1 = new javax.swing.JList<>();
        jCheckBoxUseTimeRecvd = new javax.swing.JCheckBox();
        jButtonConnectionDisconnect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMonitorPeriod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRequiredUpdates = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUpdates = new javax.swing.JTextField();
        jCheckBoxMonitorConnection = new javax.swing.JCheckBox();
        jCheckBoxApplyTransform = new javax.swing.JCheckBox();
        jButtonEditTransform = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMissedFrames = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connections ...");

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jCheckBoxUseTimeRecvd.setText("Use time recieved as timestamp.");
        jCheckBoxUseTimeRecvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUseTimeRecvdActionPerformed(evt);
            }
        });

        jButtonConnectionDisconnect.setText("Disconnect");
        jButtonConnectionDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectionDisconnectActionPerformed(evt);
            }
        });

        jLabel1.setText("Monitor Period (in Seconds):");

        jTextFieldMonitorPeriod.setText("10");
        jTextFieldMonitorPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMonitorPeriodActionPerformed(evt);
            }
        });

        jLabel2.setText("Required updates per period:");

        jTextFieldRequiredUpdates.setText("0");
        jTextFieldRequiredUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRequiredUpdatesActionPerformed(evt);
            }
        });

        jLabel3.setText("Total updates:");

        jTextFieldUpdates.setEditable(false);
        jTextFieldUpdates.setText("0");

        jCheckBoxMonitorConnection.setText("Monitor Connection");
        jCheckBoxMonitorConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonitorConnectionActionPerformed(evt);
            }
        });

        jCheckBoxApplyTransform.setText("Apply Transform");
        jCheckBoxApplyTransform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxApplyTransformActionPerformed(evt);
            }
        });

        jButtonEditTransform.setText("Edit Transform");
        jButtonEditTransform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTransformActionPerformed(evt);
            }
        });

        jLabel4.setText("Missed Frames: ");

        jTextFieldMissedFrames.setText("0");

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jCheckBoxUseTimeRecvd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMonitorPeriod)
                            .addComponent(jTextFieldRequiredUpdates)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUpdates))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMissedFrames, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReset))
                            .addComponent(jButtonConnectionDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxMonitorConnection)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxApplyTransform)
                                .addGap(69, 69, 69)
                                .addComponent(jButtonEditTransform)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConnectionDisconnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMonitorConnection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxUseTimeRecvd)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldMonitorPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldRequiredUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldMissedFrames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxApplyTransform)
                            .addComponent(jButtonEditTransform))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectionDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectionDisconnectActionPerformed
        try {
            MonitoredConnection selected_client = (MonitoredConnection) this.jList1.getSelectedValue();
            if (null != selected_client) {
                selected_client.close();
            }
            if(null != main_frame.gt_connections) {
                main_frame.gt_connections.remove(selected_client);
            }
            if(null != main_frame.sut_connections) {
                main_frame.sut_connections.remove(selected_client);
            }
            this.UpdateList();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }//GEN-LAST:event_jButtonConnectionDisconnectActionPerformed

    private void jTextFieldMonitorPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMonitorPeriodActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        String periodS = this.jTextFieldMonitorPeriod.getText();
        int period = Integer.valueOf(periodS);
        selected_client.set_monitor_period(period*1000);
    }//GEN-LAST:event_jTextFieldMonitorPeriodActionPerformed

    private void jTextFieldRequiredUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRequiredUpdatesActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        String reqiredUpdatesS = this.jTextFieldRequiredUpdates.getText();
        selected_client.setRequiredUpdatesPerPeriod((long) Long.valueOf(reqiredUpdatesS));
    }//GEN-LAST:event_jTextFieldRequiredUpdatesActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        this.jTextFieldMonitorPeriod.setText(Integer.toString(selected_client.get_monitor_period()/1000));
        this.jTextFieldRequiredUpdates.setText(Long.toString(selected_client.getRequiredUpdatesPerPeriod()));
        this.jTextFieldUpdates.setText(Long.toString(selected_client.getUpdates()));
        this.jTextFieldMissedFrames.setText(Long.toString(selected_client.getMissedFrames()));
        this.jCheckBoxUseTimeRecvd.setSelected(selected_client.isUseTimeRecieved());
        this.jCheckBoxApplyTransform.setSelected(selected_client.isApplyTransform());
        selected_client.setMonitorConnection(this.jCheckBoxMonitorConnection.isSelected());
    }//GEN-LAST:event_jList1ValueChanged

    private void jCheckBoxUseTimeRecvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUseTimeRecvdActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        selected_client.setUseTimeRecieved(this.jCheckBoxUseTimeRecvd.isSelected());
    }//GEN-LAST:event_jCheckBoxUseTimeRecvdActionPerformed

    private void jCheckBoxMonitorConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonitorConnectionActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        selected_client.setMonitorConnection(this.jCheckBoxMonitorConnection.isSelected());
        String reqiredUpdatesS = this.jTextFieldRequiredUpdates.getText();
        selected_client.setRequiredUpdatesPerPeriod((long) Long.valueOf(reqiredUpdatesS));
        String periodS = this.jTextFieldMonitorPeriod.getText();
        int period = Integer.valueOf(periodS);
        selected_client.set_monitor_period(period*1000);
        selected_client.restart_monitor();
    }//GEN-LAST:event_jCheckBoxMonitorConnectionActionPerformed

    private void jCheckBoxApplyTransformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxApplyTransformActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        selected_client.setApplyTransform(this.jCheckBoxApplyTransform.isSelected());
    }//GEN-LAST:event_jCheckBoxApplyTransformActionPerformed

    private void jButtonEditTransformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTransformActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        TransformMatrixJPanel.showDialog(this, selected_client);
        this.jCheckBoxApplyTransform.setSelected(selected_client.isApplyTransform());
    }//GEN-LAST:event_jButtonEditTransformActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client) {
            return;
        }
        selected_client.setMissedFrames(0);
        selected_client.resetUpdates();
    }//GEN-LAST:event_jButtonResetActionPerformed
    public HTPM_JFrame main_frame = null;
    
    public MonitoredConnection getSelectedClient() {
        return (MonitoredConnection) this.jList1.getSelectedValue();
    }

    public void UpdateCount(MonitoredConnection client) {
        MonitoredConnection selected_client = this.getSelectedClient();
        if(null == selected_client || selected_client != client) {
            return;
        }
        this.jTextFieldUpdates.setText(Long.toString(client.getUpdates()));
        this.jTextFieldMissedFrames.setText(Long.toString(selected_client.getMissedFrames()));
    }
    
    public void UpdateList() {
        jList1.removeAll();
        DefaultListModel<MonitoredConnection> lm = new DefaultListModel<MonitoredConnection>();
        if (null != main_frame) {
            if (null != main_frame.gt_connections) {
                for (MonitoredConnection c : main_frame.gt_connections) {
                    lm.addElement(c);
                }
            }
            if (null != main_frame.sut_connections) {
                for (MonitoredConnection c : main_frame.sut_connections) {
                    lm.addElement(c);
                }
            }
            if(null != main_frame.ods) {
                lm.addElement(main_frame.ods);
            }
            if(null != main_frame.viconStream) {
                lm.addElement(main_frame.viconStream);
            }
            if(null != main_frame.default_client) {
                lm.addElement(main_frame.default_client);
            }
        }
        jList1.setModel(lm);
        jList1.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(ConnectionsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectionsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectionsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectionsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectionsJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnectionDisconnect;
    private javax.swing.JButton jButtonEditTransform;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxApplyTransform;
    private javax.swing.JCheckBox jCheckBoxMonitorConnection;
    private javax.swing.JCheckBox jCheckBoxUseTimeRecvd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<MonitoredConnection> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldMissedFrames;
    private javax.swing.JTextField jTextFieldMonitorPeriod;
    private javax.swing.JTextField jTextFieldRequiredUpdates;
    private javax.swing.JTextField jTextFieldUpdates;
    // End of variables declaration//GEN-END:variables
}
