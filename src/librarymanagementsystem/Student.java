
package librarymanagementsystem;

import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Student extends javax.swing.JFrame {

    
    public Student(String t) {
        initComponents();
        setTitle("Galgotia's Library ("+t+")");
        registerdob.setSelectableDateRange(new java.util.Date("01/01/1960"),
                new java.util.Date());
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        REGISTER_NEW_USER = new javax.swing.JPanel();
        registerlabel = new javax.swing.JLabel();
        registerbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        registername = new javax.swing.JTextField();
        registernamelabel = new javax.swing.JLabel();
        registermale = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        registercurrentaddress = new javax.swing.JTextArea();
        registerfemale = new javax.swing.JRadioButton();
        registeryes = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        registerpermanentaddress = new javax.swing.JTextArea();
        registeremaillabel = new javax.swing.JLabel();
        registerno = new javax.swing.JRadioButton();
        registerphonelabel = new javax.swing.JLabel();
        registergenderlabel = new javax.swing.JLabel();
        registerphone = new javax.swing.JTextField();
        registercurrentaddresslabel = new javax.swing.JLabel();
        registeremail = new javax.swing.JTextField();
        registermartialstatuslabel = new javax.swing.JLabel();
        registerpermanentaddresslabel = new javax.swing.JLabel();
        registerdoblabel = new javax.swing.JLabel();
        registerdob = new com.toedter.calendar.JDateChooser();
        REMOVE_USER = new javax.swing.JPanel();
        removelabel = new javax.swing.JLabel();
        removebutton = new javax.swing.JButton();
        removestudentlabel = new javax.swing.JLabel();
        removestudentid = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        removenamelabel = new javax.swing.JLabel();
        removeemaillabel = new javax.swing.JLabel();
        removephonelabel = new javax.swing.JLabel();
        removegenderlabel = new javax.swing.JLabel();
        removecurrentaddresslabel = new javax.swing.JLabel();
        removemartialstatuslabel = new javax.swing.JLabel();
        removepermanentaddresslabel = new javax.swing.JLabel();
        removename = new javax.swing.JLabel();
        removegender = new javax.swing.JLabel();
        removemartialstatus = new javax.swing.JLabel();
        removephone = new javax.swing.JLabel();
        removeemail = new javax.swing.JLabel();
        removecurrentaddress = new javax.swing.JLabel();
        removepermanentaddress = new javax.swing.JLabel();
        removedoblabel = new javax.swing.JLabel();
        removedob = new javax.swing.JLabel();
        UPDATE_USER = new javax.swing.JPanel();
        updatestudentlabel = new javax.swing.JLabel();
        updatestudentid = new javax.swing.JTextField();
        updateproperty = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        updatevalue = new javax.swing.JTextArea();
        updatebutton = new javax.swing.JButton();
        updatevaluelabel = new javax.swing.JLabel();
        updatelabel = new javax.swing.JLabel();
        ALL_USERS = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        showallstudentsbutton = new javax.swing.JButton();
        allstudentslabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        returnlabel = new javax.swing.JLabel();
        returnbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        registerlabel.setFont(new java.awt.Font("BoltonTitling", 0, 14)); // NOI18N
        registerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerlabel.setText("REGISTER NEW STUDENT");

        registerbutton.setText("REGISTER");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });

        registername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registernameActionPerformed(evt);
            }
        });

        registernamelabel.setText("NAME:");

        buttonGroup1.add(registermale);
        registermale.setSelected(true);
        registermale.setText("MALE");
        registermale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registermaleActionPerformed(evt);
            }
        });

        registercurrentaddress.setColumns(20);
        registercurrentaddress.setRows(5);
        jScrollPane2.setViewportView(registercurrentaddress);

        buttonGroup1.add(registerfemale);
        registerfemale.setText("FEMALE");
        registerfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerfemaleActionPerformed(evt);
            }
        });

        buttonGroup2.add(registeryes);
        registeryes.setText("YES");

        registerpermanentaddress.setColumns(20);
        registerpermanentaddress.setRows(5);
        jScrollPane3.setViewportView(registerpermanentaddress);

        registeremaillabel.setText("EMAIL:");

        buttonGroup2.add(registerno);
        registerno.setSelected(true);
        registerno.setText("NO");

        registerphonelabel.setText("PHONE NO:");

        registergenderlabel.setText("GENDER:");

        registercurrentaddresslabel.setText("CURRENT ADDRESS:");

        registermartialstatuslabel.setText("MARTIAL STATUS:");

        registerpermanentaddresslabel.setText("PERMANENT ADDRESS:");

        registerdoblabel.setText("DOB:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registergenderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(registercurrentaddresslabel)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(registerpermanentaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registermartialstatuslabel)
                                    .addComponent(registerphonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registeremaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerdoblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registeremail)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(registermale)
                                                .addGap(18, 18, 18)
                                                .addComponent(registerfemale))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(registeryes)
                                                .addGap(26, 26, 26)
                                                .addComponent(registerno)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(registerphone)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(registername)))
                        .addContainerGap(102, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {registercurrentaddresslabel, registerdoblabel, registeremaillabel, registergenderlabel, registermartialstatuslabel, registernamelabel, registerpermanentaddresslabel, registerphonelabel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registergenderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registermale)
                    .addComponent(registerfemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registermartialstatuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registeryes)
                    .addComponent(registerno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerphonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registeremaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registeremail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerdoblabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerdob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registercurrentaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerpermanentaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {registercurrentaddresslabel, registerdob, registerdoblabel, registeremail, registeremaillabel, registergenderlabel, registermartialstatuslabel, registername, registernamelabel, registerpermanentaddresslabel, registerphone, registerphonelabel});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout REGISTER_NEW_USERLayout = new javax.swing.GroupLayout(REGISTER_NEW_USER);
        REGISTER_NEW_USER.setLayout(REGISTER_NEW_USERLayout);
        REGISTER_NEW_USERLayout.setHorizontalGroup(
            REGISTER_NEW_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGISTER_NEW_USERLayout.createSequentialGroup()
                .addComponent(registerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, REGISTER_NEW_USERLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        REGISTER_NEW_USERLayout.setVerticalGroup(
            REGISTER_NEW_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGISTER_NEW_USERLayout.createSequentialGroup()
                .addGroup(REGISTER_NEW_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(registerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        jTabbedPane1.addTab("Register", REGISTER_NEW_USER);

        removelabel.setFont(new java.awt.Font("BoltonTitling", 0, 14)); // NOI18N
        removelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removelabel.setText("REMOVE STUDENT DETAILS");

        removebutton.setText("REMOVE");
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        removestudentlabel.setText("STUDENT ID:");

        removestudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removestudentidActionPerformed(evt);
            }
        });

        removenamelabel.setText("NAME:");

        removeemaillabel.setText("EMAIL:");

        removephonelabel.setText("PHONE NO:");

        removegenderlabel.setText("GENDER:");

        removecurrentaddresslabel.setText("CURRENT ADDRESS:");

        removemartialstatuslabel.setText("MARTIAL STATUS:");

        removepermanentaddresslabel.setText("PERMANENT ADDRESS:");

        removename.setText("------------------------------");

        removegender.setText("--------------------");

        removemartialstatus.setText("----------------");

        removephone.setText("----------------------");

        removeemail.setText("-----------------");

        removecurrentaddress.setText("------------------");

        removepermanentaddress.setText("------------------");

        removedoblabel.setText("DOB:");

        removedob.setText("-----------------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(removepermanentaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removepermanentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removegenderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removenamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removemartialstatuslabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removegender, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removename)
                                    .addComponent(removemartialstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(378, 378, 378))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeemaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removephonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removedob, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removephone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeemail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removecurrentaddresslabel)
                                    .addComponent(removedoblabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removecurrentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {removecurrentaddress, removecurrentaddresslabel, removedob, removedoblabel, removeemail, removeemaillabel, removegender, removegenderlabel, removemartialstatus, removemartialstatuslabel, removename, removenamelabel, removepermanentaddress, removepermanentaddresslabel, removephone, removephonelabel});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removenamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removename, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removegenderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removegender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removemartialstatuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removemartialstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(removephonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removephone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeemaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeemail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(removedoblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removecurrentaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removepermanentaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removedob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removecurrentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removepermanentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {removecurrentaddress, removecurrentaddresslabel, removedob, removedoblabel, removeemail, removeemaillabel, removegender, removegenderlabel, removemartialstatus, removemartialstatuslabel, removename, removenamelabel, removepermanentaddress, removepermanentaddresslabel, removephone, removephonelabel});

        jScrollPane4.setViewportView(jPanel3);

        javax.swing.GroupLayout REMOVE_USERLayout = new javax.swing.GroupLayout(REMOVE_USER);
        REMOVE_USER.setLayout(REMOVE_USERLayout);
        REMOVE_USERLayout.setHorizontalGroup(
            REMOVE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REMOVE_USERLayout.createSequentialGroup()
                .addComponent(removelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(REMOVE_USERLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(removestudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removestudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(REMOVE_USERLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        REMOVE_USERLayout.setVerticalGroup(
            REMOVE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REMOVE_USERLayout.createSequentialGroup()
                .addGroup(REMOVE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(REMOVE_USERLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(REMOVE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removestudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removestudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Remove", REMOVE_USER);

        updatestudentlabel.setText("Student ID:");

        updateproperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "GENDER", "MARTIAL_STATUS", "CURRENT_ADDRESS", "PERMANENT_ADDRESS", "EMAIL_ID", "PHONE_NO", "DOB" }));
        updateproperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepropertyActionPerformed(evt);
            }
        });

        updatevalue.setColumns(20);
        updatevalue.setRows(5);
        jScrollPane6.setViewportView(updatevalue);

        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        updatevaluelabel.setText("ENTER UPDATED VALUE:");

        updatelabel.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        updatelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updatelabel.setText("UPDATE STUDENT DETAILS");

        javax.swing.GroupLayout UPDATE_USERLayout = new javax.swing.GroupLayout(UPDATE_USER);
        UPDATE_USER.setLayout(UPDATE_USERLayout);
        UPDATE_USERLayout.setHorizontalGroup(
            UPDATE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATE_USERLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(UPDATE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UPDATE_USERLayout.createSequentialGroup()
                        .addComponent(updatestudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(updatestudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UPDATE_USERLayout.createSequentialGroup()
                        .addComponent(updateproperty, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UPDATE_USERLayout.createSequentialGroup()
                        .addComponent(updatevaluelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UPDATE_USERLayout.createSequentialGroup()
                .addComponent(updatelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        UPDATE_USERLayout.setVerticalGroup(
            UPDATE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATE_USERLayout.createSequentialGroup()
                .addGroup(UPDATE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UPDATE_USERLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updatelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(UPDATE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatestudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatestudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(updateproperty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(UPDATE_USERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatevaluelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );

        jTabbedPane1.addTab("Update", UPDATE_USER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT ID", "NAME", "GENDER", "DOB", "EMAIL", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable1);

        showallstudentsbutton.setText("SHOW ALL STUDENT");
        showallstudentsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallstudentsbuttonActionPerformed(evt);
            }
        });

        allstudentslabel.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        allstudentslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allstudentslabel.setText("ALL STUDENTS");

        javax.swing.GroupLayout ALL_USERSLayout = new javax.swing.GroupLayout(ALL_USERS);
        ALL_USERS.setLayout(ALL_USERSLayout);
        ALL_USERSLayout.setHorizontalGroup(
            ALL_USERSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ALL_USERSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ALL_USERSLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(showallstudentsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(allstudentslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ALL_USERSLayout.setVerticalGroup(
            ALL_USERSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ALL_USERSLayout.createSequentialGroup()
                .addComponent(allstudentslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showallstudentsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Students", ALL_USERS);

        returnlabel.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        returnlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnlabel.setText("RETURN TO MAIN MENU");

        returnbutton.setText("RETURN");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
            .addComponent(returnlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(returnlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Return", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removebuttonActionPerformed

    private void updatepropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatepropertyActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        // TODO add your handling code here:
        try{
            int id=Integer.parseInt(updatestudentid.getText());
            String prop=(String)updateproperty.getSelectedItem();
            if(prop.equalsIgnoreCase("phone_no")){
                long v=Long.parseLong(updatevalue.getText());
                DBconnect.Connect.st.executeUpdate("update student set "+prop+"="+v+" where id="+id+"");
            }else{
                String v=updatevalue.getText();
                DBconnect.Connect.st.executeUpdate("update student set "+prop+"='"+v+"' where id="+id+"");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void registerfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerfemaleActionPerformed

    private void registermaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registermaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registermaleActionPerformed

    private void registernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registernameActionPerformed

    private void showallstudentsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallstudentsbuttonActionPerformed
        // TODO add your handling code here:
        try{
            javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)jTable1.getModel();
            int rc=model.getRowCount();
            while(rc--!=0){
                model.removeRow(rc);
                }
            ResultSet rs=DBconnect.Connect.st.executeQuery("SELECT * FROM student");
            while(rs.next()){
                java.util.Vector r= new java.util.Vector();
                r.add(rs.getInt("ID"));
                r.add(rs.getString("name"));
                r.add(rs.getString("gender"));
                r.add(rs.getDate("dob"));
                 r.add(rs.getString("email_id"));
                r.add(rs.getString("current_address"));
               
                model.addRow(r);
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_showallstudentsbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
         new IssueReturn().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        // TODO add your handling code here:
         try{
            String rn=registername.getText();
            String g="male";
            if(registermale.isSelected()){
                g=registermale.getText();
            }else if(registerfemale.isSelected()){
                g=registerfemale.getText();
            }
            String ms="no";
            if(registeryes.isSelected()){
                ms=registeryes.getText();
            }else if(registerno.isSelected()){
                ms=registerno.getText();
            }
            long p=Long.parseLong(registerphone.getText());
            String em=registeremail.getText();
            String ca=registercurrentaddress.getText();
            String pa=registerpermanentaddress.getText();
            
            java.util.Date date=registerdob.getDate();
            java.sql.Date dob=new java.sql.Date(date.getTime());
            System.out.println(dob);
            
            DBconnect.Connect.st.executeUpdate("insert into STUDENT(name,gender,maRtial_status,phone_no,email_id,dob,current_address,permanent_address)"
                                                       +"values('"+rn+"','"+g+"','"+ms+"',"+p+",'"+em+"','"+dob+"','"+ca+"','"+pa+"')");
            System.out.println(dob);
            ResultSet rs=DBconnect.Connect.st.executeQuery("select max(id) from student");
            rs.next();
            int n=rs.getInt(1);
            JOptionPane.showMessageDialog(null,"student id is "+n);
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Fill all entries carefully!!!");
        }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void removestudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removestudentidActionPerformed
        // TODO add your handling code here:
        try{
            int id=Integer.parseInt(removestudentid.getText());
            ResultSet rs=DBconnect.Connect.st.executeQuery("SELECT * FROM student WHERE ID="+id+"");
            rs.next();
            removename.setText(rs.getString("name"));
            removegender.setText(rs.getString("gender"));
            removemartialstatus.setText(rs.getString("martial_status"));
            removephone.setText(Long.toString(rs.getLong("phone_no")));
            removeemail.setText(rs.getString("email_id"));
            removecurrentaddress.setText(rs.getString("current_address"));
            removepermanentaddress.setText(rs.getString("permanent_address"));
            removedob.setText(String.valueOf(rs.getDate("dob")));
            
            
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_removestudentidActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student("Directpass").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL_USERS;
    private javax.swing.JPanel REGISTER_NEW_USER;
    private javax.swing.JPanel REMOVE_USER;
    private javax.swing.JPanel UPDATE_USER;
    private javax.swing.JLabel allstudentslabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton registerbutton;
    private javax.swing.JTextArea registercurrentaddress;
    private javax.swing.JLabel registercurrentaddresslabel;
    private com.toedter.calendar.JDateChooser registerdob;
    private javax.swing.JLabel registerdoblabel;
    private javax.swing.JTextField registeremail;
    private javax.swing.JLabel registeremaillabel;
    private javax.swing.JRadioButton registerfemale;
    private javax.swing.JLabel registergenderlabel;
    private javax.swing.JLabel registerlabel;
    private javax.swing.JRadioButton registermale;
    private javax.swing.JLabel registermartialstatuslabel;
    private javax.swing.JTextField registername;
    private javax.swing.JLabel registernamelabel;
    private javax.swing.JRadioButton registerno;
    private javax.swing.JTextArea registerpermanentaddress;
    private javax.swing.JLabel registerpermanentaddresslabel;
    private javax.swing.JTextField registerphone;
    private javax.swing.JLabel registerphonelabel;
    private javax.swing.JRadioButton registeryes;
    private javax.swing.JButton removebutton;
    private javax.swing.JLabel removecurrentaddress;
    private javax.swing.JLabel removecurrentaddresslabel;
    private javax.swing.JLabel removedob;
    private javax.swing.JLabel removedoblabel;
    private javax.swing.JLabel removeemail;
    private javax.swing.JLabel removeemaillabel;
    private javax.swing.JLabel removegender;
    private javax.swing.JLabel removegenderlabel;
    private javax.swing.JLabel removelabel;
    private javax.swing.JLabel removemartialstatus;
    private javax.swing.JLabel removemartialstatuslabel;
    private javax.swing.JLabel removename;
    private javax.swing.JLabel removenamelabel;
    private javax.swing.JLabel removepermanentaddress;
    private javax.swing.JLabel removepermanentaddresslabel;
    private javax.swing.JLabel removephone;
    private javax.swing.JLabel removephonelabel;
    private javax.swing.JTextField removestudentid;
    private javax.swing.JLabel removestudentlabel;
    private javax.swing.JButton returnbutton;
    private javax.swing.JLabel returnlabel;
    private javax.swing.JButton showallstudentsbutton;
    private javax.swing.JButton updatebutton;
    private javax.swing.JLabel updatelabel;
    private javax.swing.JComboBox<String> updateproperty;
    private javax.swing.JTextField updatestudentid;
    private javax.swing.JLabel updatestudentlabel;
    private javax.swing.JTextArea updatevalue;
    private javax.swing.JLabel updatevaluelabel;
    // End of variables declaration//GEN-END:variables
}
