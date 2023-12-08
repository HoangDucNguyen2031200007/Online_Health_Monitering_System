package GUI;

import ConcreteBuilder.PatientConcreteBuilder;
import ConcreteBuilder.ScheduleConcreteBuilder;
import Entity.Doctor;
import Entity.Patient;
import Entity.Schedule;
import Entity.Status;
import Entity.User;
import Service.DoctorService;
import Service.PatientService;
import Service.ScheduleService;
import Service.ServiceImpl.DoctorServiceImpl;
import Service.ServiceImpl.PatientServiceImpl;
import Service.ServiceImpl.ScheduleServiceImpl;
import Service.ServiceImpl.StatusServiceImpl;
import Service.StatusService;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatientPage extends javax.swing.JFrame {

    private Patient patient;

    public PatientPage(User user) {
        this.patient = (Patient) user;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        loadProfile();
        loadStatus(patient.getStatusId());
        loadFee();
        loadDoctorBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        idText = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        logoutBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        birthLabel = new javax.swing.JLabel();
        birthText = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        refreshProfileBtn = new javax.swing.JButton();
        doctorsTxt = new javax.swing.JLabel();
        emailLable = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        statusPanel = new javax.swing.JPanel();
        HeartRateLable = new javax.swing.JLabel();
        BloodPressureLable = new javax.swing.JLabel();
        heartTxt = new javax.swing.JLabel();
        bloodTxt = new javax.swing.JLabel();
        refreshStatusBtn = new javax.swing.JButton();
        feePanel = new javax.swing.JPanel();
        feeLabel = new javax.swing.JLabel();
        feeTxt = new javax.swing.JLabel();
        schedulePanel = new javax.swing.JPanel();
        patientNameLabel1 = new javax.swing.JLabel();
        doctorBox = new javax.swing.JComboBox<>();
        scheDateLabel = new javax.swing.JLabel();
        scheDateTextField = new javax.swing.JTextField();
        bookButton = new javax.swing.JButton();
        showScheBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Page");

        titleLabel.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Patient Page");

        idLabel.setText("Id:");

        nameLabel.setText("Name:");

        addressLabel.setText("Address:");

        phoneLabel.setText("Phone:");

        idText.setText(".....");

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        birthLabel.setText("Birth:");

        ageLabel.setText("Age:");

        ageText.setText(".....");

        jLabel1.setText("Doctors:");

        jButton1.setText("Add Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refreshProfileBtn.setText("Refresh");
        refreshProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshProfileBtnActionPerformed(evt);
            }
        });

        doctorsTxt.setText(" ");

        emailLable.setText("Email:");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(refreshProfileBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutBtn)
                        .addGap(66, 66, 66))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneText))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressText))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(birthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthText)
                                    .addComponent(ageText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doctorsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(emailLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText)
                                    .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailTxt))))
                        .addContainerGap())))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLable)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthLabel)
                    .addComponent(birthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(doctorsTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn)
                    .addComponent(updateBtn)
                    .addComponent(jButton1)
                    .addComponent(refreshProfileBtn))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", profilePanel);

        HeartRateLable.setText("Heart Rate:");

        BloodPressureLable.setText("Blood Pressure:");

        heartTxt.setText(".....");

        bloodTxt.setText(".....");

        refreshStatusBtn.setText("Refresh");
        refreshStatusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshStatusBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeartRateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodPressureLable, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heartTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloodTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(refreshStatusBtn)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeartRateLable)
                    .addComponent(heartTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPressureLable)
                    .addComponent(bloodTxt))
                .addGap(18, 18, 18)
                .addComponent(refreshStatusBtn)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Status", statusPanel);

        feeLabel.setText("Fee:");

        feeTxt.setText("0");

        javax.swing.GroupLayout feePanelLayout = new javax.swing.GroupLayout(feePanel);
        feePanel.setLayout(feePanelLayout);
        feePanelLayout.setHorizontalGroup(
            feePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(feeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );
        feePanelLayout.setVerticalGroup(
            feePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feeLabel)
                    .addComponent(feeTxt))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fee", feePanel);

        patientNameLabel1.setText("Doctor Name:");

        doctorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        scheDateLabel.setText("Date");

        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        showScheBtn.setText("Show Schedule");
        showScheBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showScheBtnActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Patient", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(schedulePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scheDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scheDateTextField)))
                    .addGroup(schedulePanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(bookButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showScheBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameLabel1)
                    .addComponent(doctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scheDateLabel)
                    .addComponent(scheDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton)
                    .addComponent(showScheBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Schedule", schedulePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshStatusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshStatusBtnMouseClicked
        loadStatus(patient.getStatusId());
    }//GEN-LAST:event_refreshStatusBtnMouseClicked

    private void refreshProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshProfileBtnActionPerformed
        PatientService patientService = new PatientServiceImpl();
        patient = patientService.findById(patient.getPatientID());
        loadProfile();
    }//GEN-LAST:event_refreshProfileBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String id = idText.getText();
        String name = nameText.getText();
        String address = addressText.getText();
        String phone = phoneText.getText();
        String dob = birthText.getText();
        String email = emailTxt.getText();

        patient = new PatientConcreteBuilder()
                .setPatientId(id)
                .setPatientName(name)
                .setPatientPhone(phone)
                .setPatientDOB(dob)
                .setPatientAddress(address)
                .setPatientEmail(email)
                .build();

        PatientService patientService = new PatientServiceImpl();
        if (patientService.updatePatient(patient)) {
            JOptionPane.showMessageDialog(this, "Update successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String doctorId = JOptionPane.showInputDialog("Input doctor id you want to register:");
        PatientService ps = new PatientServiceImpl();
        if (ps.addDoctor(patient.getPatientID(), doctorId)) {
            JOptionPane.showMessageDialog(this, "Add successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showScheBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showScheBtnActionPerformed
        ScheduleService service = new ScheduleServiceImpl();
        List<Schedule> schedules = service.getAllByPatientId(patient.getPatientID());

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Schedule s : schedules) {
            Vector v = new Vector();

            v.add(s.getDate());
            v.add(s.getPatient());
            v.add(s.getDoctor());

            model.addRow(v);
        }
    }//GEN-LAST:event_showScheBtnActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        String date = scheDateTextField.getText();
        String doctorId = doctorBox.getSelectedItem().toString().split("-")[0];
        String doctorName = doctorBox.getSelectedItem().toString().split("-")[1];

        Schedule schedule = new ScheduleConcreteBuilder()
                .setDoctor(doctorName)
                .setDoctorId(doctorId)
                .setPatient(patient.getName())
                .setPatientId(patient.getPatientID())
                .setDate(date)
                .build();

        ScheduleService service = new ScheduleServiceImpl();
        if (service.addSchedule(schedule)) {
            JOptionPane.showMessageDialog(this, "Add successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPressureLable;
    private javax.swing.JLabel HeartRateLable;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ageText;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JTextField birthText;
    private javax.swing.JLabel bloodTxt;
    private javax.swing.JButton bookButton;
    private javax.swing.JComboBox<String> doctorBox;
    private javax.swing.JLabel doctorsTxt;
    private javax.swing.JLabel emailLable;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel feeLabel;
    private javax.swing.JPanel feePanel;
    private javax.swing.JLabel feeTxt;
    private javax.swing.JLabel heartTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel patientNameLabel1;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton refreshProfileBtn;
    private javax.swing.JButton refreshStatusBtn;
    private javax.swing.JLabel scheDateLabel;
    private javax.swing.JTextField scheDateTextField;
    private javax.swing.JPanel schedulePanel;
    private javax.swing.JButton showScheBtn;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void loadProfile() {
        idText.setText(patient.getPatientID());
        nameText.setText(patient.getName());
        addressText.setText(patient.getAddress());
        phoneText.setText(patient.getPhone());
        birthText.setText(patient.getDob());
        ageText.setText(patient.getAge() + "");
        emailTxt.setText(patient.getEmail());

        DoctorService doctorService = new DoctorServiceImpl();
        List<Doctor> doctors = doctorService.getDoctorByPatientId(patient.getPatientID());
        String doctorString = "";
        for (Doctor doctor : doctors) {
            doctorString += doctor.getName() + ",";
        }
        doctorsTxt.setText(doctorString);

    }

    private void loadStatus(int statusId) {
        StatusService statusService = new StatusServiceImpl();
        Status status = statusService.findById(statusId);

        if (status == null) {
            return;
        }
        heartTxt.setText(status.getHeartRate());
        bloodTxt.setText(status.getBloodPressure());
    }

    private void loadFee() {
        feeTxt.setText(patient.getFee() + "");
    }

    private void loadDoctorBox() {
        doctorBox.removeAllItems();

        DoctorService service = new DoctorServiceImpl();
        List<Doctor> doctors = service.getDoctorByPatientId(patient.getPatientID());

        for (Doctor doctor : doctors) {
            doctorBox.addItem(doctor.getDoctorID() + "-" + doctor.getName());
        }
    }
}
