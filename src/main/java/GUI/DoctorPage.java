package GUI;

import ConcreteBuilder.DoctorConcreteBuilder;
import ConcreteBuilder.ScheduleConcreteBuilder;
import ConcreteBuilder.StatusConcreteBuilder;
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

public class DoctorPage extends javax.swing.JFrame {

    private Doctor doctor;

    public DoctorPage(User user) {
        this.doctor = (Doctor) user;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        loadProfile();
        loadPatientBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
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
        emailLabel = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        patientPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();
        patientNameLabel = new javax.swing.JLabel();
        patientNameBox = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        HeartRateLable = new javax.swing.JLabel();
        BloodPressureLable = new javax.swing.JLabel();
        heartRateTxt = new javax.swing.JTextField();
        bloodPressTxt = new javax.swing.JTextField();
        updatePatientBtn = new javax.swing.JButton();
        showAllBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        statusIdTxt = new javax.swing.JLabel();
        schedulePanel = new javax.swing.JPanel();
        patientNameLabel1 = new javax.swing.JLabel();
        patientNameBox1 = new javax.swing.JComboBox<>();
        scheDateLabel = new javax.swing.JLabel();
        scheDateTextField = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();
        showScheBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Doctor Page");

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

        emailLabel.setText("Email:");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText)
                                    .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneText))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressText, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutBtn))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(emailTxt)))
                .addContainerGap())
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
                    .addComponent(addressLabel)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn)
                    .addComponent(updateBtn))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", profilePanel);

        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePatient.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablePatient);
        tablePatient.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        patientNameLabel.setText("Patient Name:");

        patientNameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchBtn.setText("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        HeartRateLable.setText("Heart Rate:");

        BloodPressureLable.setText("Blood Pressure:");

        updatePatientBtn.setText("Update");
        updatePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientBtnActionPerformed(evt);
            }
        });

        showAllBtn.setText("Show All");
        showAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Status Id:");

        statusIdTxt.setText("....");

        javax.swing.GroupLayout patientPanelLayout = new javax.swing.GroupLayout(patientPanel);
        patientPanel.setLayout(patientPanelLayout);
        patientPanelLayout.setHorizontalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HeartRateLable, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(BloodPressureLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heartRateTxt)
                            .addComponent(bloodPressTxt)))
                    .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(patientPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(statusIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(patientPanelLayout.createSequentialGroup()
                            .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(patientNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(updatePatientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showAllBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientPanelLayout.setVerticalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameLabel)
                    .addComponent(patientNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(statusIdTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeartRateLable)
                    .addComponent(heartRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPressureLable)
                    .addComponent(bloodPressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePatientBtn)
                    .addComponent(showAllBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Patient", patientPanel);

        patientNameLabel1.setText("Patient Name:");

        patientNameBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        scheDateLabel.setText("Date");

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
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
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout schedulePanelLayout = new javax.swing.GroupLayout(schedulePanel);
        schedulePanel.setLayout(schedulePanelLayout);
        schedulePanelLayout.setHorizontalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scheDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scheDateTextField)
                    .addComponent(patientNameBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(bookBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showScheBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        schedulePanelLayout.setVerticalGroup(
            schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameLabel1)
                    .addComponent(patientNameBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scheDateLabel)
                    .addComponent(scheDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(schedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showScheBtn)
                    .addComponent(bookBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Schedule", schedulePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        String patientId = patientNameBox.getSelectedItem().toString().split("-")[0];

        PatientService service = new PatientServiceImpl();
        Patient patient = service.findById(patientId);

        StatusService statusService = new StatusServiceImpl();
        Status status = statusService.findById(patient.getStatusId());

        statusIdTxt.setText(status.getStatusID());
        heartRateTxt.setText(status.getHeartRate());
        bloodPressTxt.setText(status.getBloodPressure());
    }//GEN-LAST:event_searchBtnMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void showScheBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showScheBtnActionPerformed
        ScheduleService service = new ScheduleServiceImpl();
        List<Schedule> schedules = service.getAllByDoctorId(doctor.getDoctorID());

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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String id = idText.getText();
        String name = nameText.getText();
        String address = addressText.getText();
        String phone = phoneText.getText();
        String email = emailTxt.getText();

        doctor = new DoctorConcreteBuilder()
                .setDoctorId(id)
                .setDoctorName(name)
                .setDoctorPhone(phone)
                .setDoctorAddress(address)
                .setDoctorEmail(email)
                .build();

        DoctorService service = new DoctorServiceImpl();
        if (service.updateDoctor(doctor)) {
            JOptionPane.showMessageDialog(this, "Update successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        String date = scheDateTextField.getText();
        String patientId = patientNameBox1.getSelectedItem().toString().split("-")[0];
        String patientName = patientNameBox1.getSelectedItem().toString().split("-")[1];

        Schedule schedule = new ScheduleConcreteBuilder()
                .setPatient(patientName)
                .setPatientId(patientId)
                .setDoctor(doctor.getName())
                .setDoctorId(doctor.getDoctorID())
                .setDate(date)
                .build();

        ScheduleService service = new ScheduleServiceImpl();
        if (service.addSchedule(schedule)) {
            JOptionPane.showMessageDialog(this, "Add successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void showAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBtnActionPerformed
        PatientService service = new PatientServiceImpl();
        List<Patient> patients = service.getAllByDoctorId(doctor.getDoctorID());

        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        model.setRowCount(0);
        for (Patient p : patients) {
            Vector v = new Vector();

            v.add(p.getPatientID());
            v.add(p.getName());
            v.add(p.getPhone());
            v.add(p.getAddress());

            model.addRow(v);
        }
    }//GEN-LAST:event_showAllBtnActionPerformed

    private void updatePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientBtnActionPerformed
        String statusId = statusIdTxt.getText();
        String blood = bloodPressTxt.getText();
        String heart = heartRateTxt.getText();

        Status status = new StatusConcreteBuilder()
                .setStatusID(statusId)
                .setHeartRate(heart)
                .setBloodPressure(blood)
                .build();

        StatusService service = new StatusServiceImpl();
        if (service.updateStatus(status)) {
            JOptionPane.showMessageDialog(this, "Update successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Something was wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updatePatientBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodPressureLable;
    private javax.swing.JLabel HeartRateLable;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField bloodPressTxt;
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField heartRateTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idText;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox<String> patientNameBox;
    private javax.swing.JComboBox<String> patientNameBox1;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JLabel patientNameLabel1;
    private javax.swing.JPanel patientPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel scheDateLabel;
    private javax.swing.JTextField scheDateTextField;
    private javax.swing.JPanel schedulePanel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton showAllBtn;
    private javax.swing.JButton showScheBtn;
    private javax.swing.JLabel statusIdTxt;
    private javax.swing.JTable tablePatient;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updatePatientBtn;
    // End of variables declaration//GEN-END:variables

    private void loadProfile() {
        idText.setText(doctor.getDoctorID());
        nameText.setText(doctor.getName());
        addressText.setText(doctor.getAddress());
        phoneText.setText(doctor.getPhone());
        emailTxt.setText(doctor.getEmail());
    }

    private void loadPatientBox() {
        patientNameBox.removeAllItems();
        patientNameBox1.removeAllItems();

        PatientService service = new PatientServiceImpl();
        List<Patient> patients = service.getAllByDoctorId(doctor.getDoctorID());

        for (Patient patient : patients) {
            patientNameBox.addItem(patient.getPatientID() + "-" + patient.getName());
            patientNameBox1.addItem(patient.getPatientID() + "-" + patient.getName());
        }
    }
}
