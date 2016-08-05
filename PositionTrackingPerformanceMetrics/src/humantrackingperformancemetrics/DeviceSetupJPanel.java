/*
 * This is public domain software, however it is preferred
 * that the following disclaimers be attached.
 * 
 * Software Copywrite/Warranty Disclaimer
 * 
 * This software was developed at the National Institute of Standards and
 * Technology by employees of the Federal Government in the course of their
 * official duties. Pursuant to title 17 Section 105 of the United States
 * Code this software is not subject to copyright protection and is in the
 * public domain. NIST Real-Time Control System software is an experimental
 * system. NIST assumes no responsibility whatsoever for its use by other
 * parties, and makes no guarantees, expressed or implied, about its
 * quality, reliability, or any other characteristic. We would appreciate
 * acknowledgement if the software is used. This software can be
 * redistributed and/or modified freely provided that any derivative works
 * bear some notice that they are derived from it, and any modified
 * versions bear some notice that they have been modified.
 * 
 */
package humantrackingperformancemetrics;

import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.JDialog;

/**
 *
 * @author Will Shackleford {@literal <william.shackleford@nist.gov>}
 */
public class DeviceSetupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OptitrackSetupJPanel
     */
    public DeviceSetupJPanel() {
        initComponents();
    }

    private JDialog dialog = null;
    private DeviceSetupOptions options;

    public DeviceSetupOptions getOptions() {
        return options;
    }

    private boolean cancelled;

    public boolean isCancelled() {
        return cancelled;
    }

    static public DeviceSetupJPanel showDialog(Frame parent, DeviceTypeEnum devType) {
        DeviceSetupJPanel opanel = new DeviceSetupJPanel();
        JDialog dialog = new JDialog(parent, Dialog.ModalityType.APPLICATION_MODAL);
        opanel.setVisible(true);
        opanel.dialog = dialog;
        if (null != devType) {
            switch (devType) {
                case VICON:
                    opanel.jRadioButtonVicon.setSelected(true);
                    opanel.jRadioButtonOptitrack.setSelected(false);
                    break;

                case OPTITRACK:
                    opanel.jRadioButtonVicon.setSelected(false);
                    opanel.jRadioButtonOptitrack.setSelected(true);
                    break;
            }
            opanel.jRadioButtonVicon.setEnabled(false);
            opanel.jRadioButtonOptitrack.setEnabled(false);
        }
        dialog.add(opanel);
        dialog.pack();
        //dialog.setModal(Dialog.ModalityType.APPLICATION_MODAL);
        //OR, you can do the following...
        //JDialog dialog = new JDialog();
        //dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

        //dialog.setBounds(transform_frame.getBounds());
        dialog.setVisible(true);
        if (opanel.cancelled) {
            opanel.options = null;
        } else {
            if (null == devType) {
                devType = DeviceTypeEnum.OPTITRACK;
                if (opanel.jRadioButtonVicon.isSelected()) {
                    devType = DeviceTypeEnum.VICON;
                }
            }
            opanel.options = new DeviceSetupOptions(opanel.jTextFieldHost.getText(),
                    opanel.jTextFieldVersion.getText(),
                    opanel.jCheckBoxMulticast.isSelected(),
                    opanel.jCheckBoxGroundTruth.isSelected(),
                    opanel.jCheckBoxStartRecording.isSelected(),
                    devType);
        }
        return opanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldHost = new javax.swing.JTextField();
        jCheckBoxGroundTruth = new javax.swing.JCheckBox();
        jCheckBoxMulticast = new javax.swing.JCheckBox();
        jCheckBoxStartRecording = new javax.swing.JCheckBox();
        jButtonCancel = new javax.swing.JButton();
        jButtonOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldVersion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonVicon = new javax.swing.JRadioButton();
        jRadioButtonOptitrack = new javax.swing.JRadioButton();

        jLabel1.setText("Host:");

        jTextFieldHost.setText("localhost");

        jCheckBoxGroundTruth.setText("Ground Truth");

        jCheckBoxMulticast.setText("Multicast");

        jCheckBoxStartRecording.setSelected(true);
        jCheckBoxStartRecording.setText("Start Recording Immediately");

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jLabel2.setText("Version");

        jTextFieldVersion.setText("2.10");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Device Type"));

        buttonGroup1.add(jRadioButtonVicon);
        jRadioButtonVicon.setText("Vicon");

        buttonGroup1.add(jRadioButtonOptitrack);
        jRadioButtonOptitrack.setSelected(true);
        jRadioButtonOptitrack.setText("Optitrack");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonVicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOptitrack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonVicon)
                    .addComponent(jRadioButtonOptitrack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHost))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxGroundTruth)
                            .addComponent(jCheckBoxMulticast)
                            .addComponent(jCheckBoxStartRecording))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVersion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxGroundTruth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxMulticast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxStartRecording)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonOk))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        cancelled = false;
        dialog.setVisible(false);
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cancelled = true;
        dialog.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JCheckBox jCheckBoxGroundTruth;
    private javax.swing.JCheckBox jCheckBoxMulticast;
    private javax.swing.JCheckBox jCheckBoxStartRecording;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonOptitrack;
    private javax.swing.JRadioButton jRadioButtonVicon;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldVersion;
    // End of variables declaration//GEN-END:variables
}
