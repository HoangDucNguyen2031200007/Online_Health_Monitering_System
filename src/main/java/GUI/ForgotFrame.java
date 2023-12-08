package GUI;

import Entity.User;
import Service.DoctorService;
import Service.PatientService;
import Service.ServiceImpl.DoctorServiceImpl;
import Service.ServiceImpl.PatientServiceImpl;
import javax.swing.JOptionPane;

public class ForgotFrame extends javax.swing.JFrame {

    public ForgotFrame() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        typeUser = new javax.swing.JComboBox<>();
        findButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Reset Password");

        emailLabel.setText("Email:");

        typeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor" }));

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(findButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        String email = emailTxt.getText();
        String type = typeUser.getSelectedItem().toString();

        if (type.equals("Patient")) {
            PatientService service = new PatientServiceImpl();
            if (service.findByEmail(email)) {
                String new_pass = JOptionPane.showInputDialog("Input your new password:");
                String encode_pass = new User().encode(new_pass);
                if (service.updatePassword(encode_pass, email)) {
                    JOptionPane.showMessageDialog(this, "Update Successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "This email is not existed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            DoctorService service = new DoctorServiceImpl();
            if (service.findByEmail(email)) {
                String new_pass = JOptionPane.showInputDialog("Input your new password:");
                String encode_pass = new User().encode(new_pass);
                if (service.updatePassword(encode_pass, email)) {
                    JOptionPane.showMessageDialog(this, "Update Successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "This email is not existed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_findButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeUser;
    // End of variables declaration//GEN-END:variables
}
