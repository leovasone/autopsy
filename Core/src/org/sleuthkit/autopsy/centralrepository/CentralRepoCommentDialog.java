/*
 * Autopsy Forensic Browser
 *
 * Copyright 2018 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.centralrepository;

import org.openide.windows.WindowManager;
import org.sleuthkit.autopsy.centralrepository.datamodel.CorrelationAttribute;
import org.sleuthkit.autopsy.centralrepository.datamodel.CorrelationAttributeInstance;

/**
 * Dialog to allow Central Repository file instance comments to be added and
 * modified.
 */
final class CentralRepoCommentDialog extends javax.swing.JDialog {

    private final CorrelationAttribute correlationAttribute;
    private boolean commentUpdated = false;

    /**
     * Create an instance.
     *
     * @param correlationAttribute The correlation attribute to be modified.
     * @param title                The title to assign the dialog.
     */
    CentralRepoCommentDialog(CorrelationAttribute correlationAttribute, String title) {
        super(WindowManager.getDefault().getMainWindow(), title);
        
        initComponents();

        CorrelationAttributeInstance instance = correlationAttribute.getInstances().get(0);

        pathLabel.setText(instance.getFilePath());
        commentTextArea.setText(instance.getComment());

        this.correlationAttribute = correlationAttribute;
    }

    /**
     * Display the dialog.
     */
    void display() {
        setModal(true);
        setSize(getPreferredSize());
        setLocationRelativeTo(this.getParent());
        setAlwaysOnTop(false);
        pack();
        setVisible(true);
    }

    /**
     * Has the comment been updated?
     *
     * @return True if the comment has been updated; otherwise false.
     */
    boolean isCommentUpdated() {
        return commentUpdated;
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
        commentTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fileLabel = new javax.swing.JLabel();
        pathLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(getPreferredSize());

        commentTextArea.setColumns(20);
        commentTextArea.setLineWrap(true);
        commentTextArea.setRows(5);
        commentTextArea.setTabSize(4);
        commentTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(commentTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(okButton, org.openide.util.NbBundle.getMessage(CentralRepoCommentDialog.class, "CentralRepoCommentDialog.okButton.text")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(CentralRepoCommentDialog.class, "CentralRepoCommentDialog.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(fileLabel, org.openide.util.NbBundle.getMessage(CentralRepoCommentDialog.class, "CentralRepoCommentDialog.fileLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(pathLabel, org.openide.util.NbBundle.getMessage(CentralRepoCommentDialog.class, "CentralRepoCommentDialog.pathLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commentLabel, org.openide.util.NbBundle.getMessage(CentralRepoCommentDialog.class, "CentralRepoCommentDialog.commentLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pathLabel))
                            .addComponent(commentLabel))
                        .addGap(0, 451, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileLabel)
                    .addComponent(pathLabel))
                .addGap(19, 19, 19)
                .addComponent(commentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String comment = commentTextArea.getText();
        correlationAttribute.getInstances().get(0).setComment(comment);
        commentUpdated = true;

        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JTextArea commentTextArea;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pathLabel;
    // End of variables declaration//GEN-END:variables
}
