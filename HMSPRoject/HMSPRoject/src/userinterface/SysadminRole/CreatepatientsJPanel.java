/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

import Business.Department.DepartmentClass;
import Business.Department.DoctorDepartment;
import Business.Department.PatientDepartment;
import Business.Doctor.DoctorDetails;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lsrajput
 */
public class CreatepatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatepatientsJPanel
     */
    private JPanel displayJPanel;
    private Ecosystem ecosystem;
    public CreatepatientsJPanel(JPanel displayJPanel,Ecosystem ecosystem) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.ecosystem = ecosystem;
        populateTable();
        populateDoctorComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        patientTypeJLabel = new javax.swing.JLabel();
        patientTypeComboBox = new javax.swing.JComboBox();
        patientNameJLabel = new javax.swing.JLabel();
        patientNameTxtField = new javax.swing.JTextField();
        roomNoJLabel = new javax.swing.JLabel();
        roomNoTxtField = new javax.swing.JTextField();
        createPatientBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        doctorNamesJCombo = new javax.swing.JComboBox<>();

        jLabel1.setText("Enterprise <Grey Sloan Medical Centre>");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Patient Type", "Room No", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        patientTypeJLabel.setText("Patient Type :");

        patientTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In Patient", "Out Patient" }));

        patientNameJLabel.setText("Patient Name :");

        roomNoJLabel.setText("Room No :");

        createPatientBtn.setText("Create Patient");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Doctor:");

        doctorNamesJCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(createPatientBtn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientNameJLabel)
                                    .addComponent(roomNoJLabel)
                                    .addComponent(patientTypeJLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(patientNameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(roomNoTxtField))
                                    .addComponent(backBtn)
                                    .addComponent(doctorNamesJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeJLabel)
                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameJLabel)
                    .addComponent(patientNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomNoJLabel)
                    .addComponent(roomNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(doctorNamesJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPatientBtn)
                    .addComponent(backBtn))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateDoctorComboBox()
    {
        try
        {
            doctorNamesJCombo.removeAllItems();
            for(DepartmentClass departmentClass: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
            {
                if(departmentClass instanceof DoctorDepartment)
                {
                    for(UserAccount ua:departmentClass.getUserDir().getUserAccountsList() )
                    {
                        Employee emp = ua.getEmployee();
                        doctorNamesJCombo.addItem(emp.getEmployeeId()+" - "+emp.getFirstName());
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
        {
            if(dept instanceof PatientDepartment)
            {
                for (Patient patient : ((PatientDepartment) dept).getPatientDirectory().getPatientList()){
                Object[] row = new Object[5];
                row[0] = patient.getPatientId();
                row[1] = patient.getPatientName();
                row[2] = patient.getPatientType();
                row[3] = patient.getPatientRoomNo();
                row[4] = patient.getDoctorName();
                model.addRow(row);
        }
            }
        }
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed
        String patientType = (String)patientTypeComboBox.getSelectedItem();
        
        String patientName = patientNameTxtField.getText();
        String roomNo = roomNoTxtField.getText();
        String doctor = (String) doctorNamesJCombo.getSelectedItem();
        String[] doctorArray = doctor.split(" - ");
        int doctorId = Integer.parseInt(doctorArray[0]);
        String doctorName = doctorArray[1];
        
        //ecosystem.getNetworkList().get(0).getPatientDirectory().createNewPatient(patientName, roomNo, patientType);
        for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
        {
            if(dept instanceof PatientDepartment)
            {
                Patient patient = ((PatientDepartment) dept).getPatientDirectory().createNewPatient(patientName, roomNo, patientType,doctorId,doctorName);
                dept.getUserDir().createUserAccount(patientName, patientName, null, new Business.Role.Patient());
                for(DepartmentClass dept2: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
                {
                    if(dept2 instanceof DoctorDepartment)
                    {
                        for(DoctorDetails doc: ((DoctorDepartment) dept2).getDoctorDirectory().getDocDetails())
                        {
                            if(doctorId == doc.getEmployeeId())
                            {
                                System.out.println("doc: "+doc);
                                System.out.println("doc name: "+doc.getFirstName());
                                System.out.println("doc.getPatientDirectory(): "+doc.getPatientDirectory());
                                doc.getPatientDirectory().getPatientList().add(patient);
                            }
                        }
                    }
                }
            }
        }
        populateTable();
        
    }//GEN-LAST:event_createPatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JComboBox<String> doctorNamesJCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField patientNameTxtField;
    private javax.swing.JComboBox patientTypeComboBox;
    private javax.swing.JLabel patientTypeJLabel;
    private javax.swing.JLabel roomNoJLabel;
    private javax.swing.JTextField roomNoTxtField;
    // End of variables declaration//GEN-END:variables
}
