package librarymanagementsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Book extends javax.swing.JFrame {

    
    public Book(String t) {
        initComponents();
        setTitle("Galgotia's Library ("+t+")");
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        ADD_BOOK = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addbookname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addbookauthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addpublication = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addvolumeno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addnoofvolume = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addnoofpages = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addgenere = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addbranch = new javax.swing.JTextField();
        REMOVE_BOOK = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        removebutton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        removebooknumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        removebookname = new javax.swing.JLabel();
        removebookauthor = new javax.swing.JLabel();
        removepublication = new javax.swing.JLabel();
        removevolumeno = new javax.swing.JLabel();
        removenoofvolume = new javax.swing.JLabel();
        removenoofpages = new javax.swing.JLabel();
        removegenere = new javax.swing.JLabel();
        removebranch = new javax.swing.JLabel();
        UPDATE_BOOK = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        updatebutton = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        updatebooknumber = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        updatevalue = new javax.swing.JTextField();
        updateproperty = new javax.swing.JComboBox<>();
        ALL_BOOKS = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        showallbooksbutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        returnbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NEW BOOK");

        addbutton.setText("ADD");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        jLabel3.setText("BOOK NAME:");

        addbookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbooknameActionPerformed(evt);
            }
        });

        jLabel4.setText("BOOK AUTHOR:");

        addbookauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookauthorActionPerformed(evt);
            }
        });

        jLabel5.setText("PUBLICATION:");

        addpublication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpublicationActionPerformed(evt);
            }
        });

        jLabel6.setText("VOLUME NO:");

        addvolumeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvolumenoActionPerformed(evt);
            }
        });

        jLabel7.setText("NO. OF VOLUME:");

        addnoofvolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnoofvolumeActionPerformed(evt);
            }
        });

        jLabel8.setText("NO. OF PAGES:");

        addnoofpages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnoofpagesActionPerformed(evt);
            }
        });

        jLabel9.setText("GENERE:");

        addgenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgenereActionPerformed(evt);
            }
        });

        jLabel10.setText("BRANCH:");

        addbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbranchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addgenere, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addnoofpages, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addnoofvolume, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addvolumeno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addpublication, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addbookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addpublication, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(addvolumeno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnoofvolume, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnoofpages, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addgenere, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout ADD_BOOKLayout = new javax.swing.GroupLayout(ADD_BOOK);
        ADD_BOOK.setLayout(ADD_BOOKLayout);
        ADD_BOOKLayout.setHorizontalGroup(
            ADD_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADD_BOOKLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        ADD_BOOKLayout.setVerticalGroup(
            ADD_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADD_BOOKLayout.createSequentialGroup()
                .addGroup(ADD_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("ADD", ADD_BOOK);

        jLabel11.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REMOVE BOOK");

        removebutton.setText("REMOVE");
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        jLabel12.setText("BOOK NUMBER:");

        removebooknumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebooknumberActionPerformed(evt);
            }
        });

        jLabel13.setText("BOOK AUTHOR:");

        jLabel14.setText("BOOK NAME:");

        jLabel15.setText("PUBLICATION:");

        jLabel16.setText("VOLUME NO:");

        jLabel17.setText("NO. OF VOLUME:");

        jLabel18.setText("NO. OF PAGES:");

        jLabel19.setText("GENERE:");

        jLabel20.setText("BRANCH:");

        removebookname.setText("--------------------------------------------");

        removebookauthor.setText("--------------------------------------------");

        removepublication.setText("--------------------------------------------");

        removevolumeno.setText("--------------------------------------------");

        removenoofvolume.setText("--------------------------------------------");

        removenoofpages.setText("--------------------------------------------");

        removegenere.setText("--------------------------------------------");

        removebranch.setText("--------------------------------------------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removebookname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removebookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removepublication, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removevolumeno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removenoofvolume, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removenoofpages, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removegenere, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removebranch, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removebookname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(removebookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removepublication, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removevolumeno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removenoofvolume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removenoofpages, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removegenere, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removebranch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, removebookauthor, removebookname, removebranch, removegenere, removenoofpages, removenoofvolume, removepublication, removevolumeno});

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout REMOVE_BOOKLayout = new javax.swing.GroupLayout(REMOVE_BOOK);
        REMOVE_BOOK.setLayout(REMOVE_BOOKLayout);
        REMOVE_BOOKLayout.setHorizontalGroup(
            REMOVE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REMOVE_BOOKLayout.createSequentialGroup()
                .addGroup(REMOVE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(REMOVE_BOOKLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(REMOVE_BOOKLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removebooknumber, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 43, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        REMOVE_BOOKLayout.setVerticalGroup(
            REMOVE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REMOVE_BOOKLayout.createSequentialGroup()
                .addGroup(REMOVE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(REMOVE_BOOKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(REMOVE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(REMOVE_BOOKLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, REMOVE_BOOKLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(removebooknumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("REMOVE", REMOVE_BOOK);

        jLabel29.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("UPDATE BOOK DETAILS");

        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        jLabel30.setText("BOOK NUMBER:");

        jLabel31.setText("ENTER UPDATED VALUE:");

        updateproperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "AUTHOR", "PUBLICATION", "VOLUMENO", "NOOFVOLUME", "NOOFPAGES", "GENRE", "BRANCH", " " }));

        javax.swing.GroupLayout UPDATE_BOOKLayout = new javax.swing.GroupLayout(UPDATE_BOOK);
        UPDATE_BOOK.setLayout(UPDATE_BOOKLayout);
        UPDATE_BOOKLayout.setHorizontalGroup(
            UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATE_BOOKLayout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(UPDATE_BOOKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UPDATE_BOOKLayout.createSequentialGroup()
                        .addGroup(UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatebooknumber)
                            .addComponent(updatevalue)))
                    .addComponent(updateproperty, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UPDATE_BOOKLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel30, updatebooknumber});

        UPDATE_BOOKLayout.setVerticalGroup(
            UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATE_BOOKLayout.createSequentialGroup()
                .addGroup(UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebooknumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateproperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(UPDATE_BOOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatevalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 213, Short.MAX_VALUE))
        );

        UPDATE_BOOKLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel30, updatebooknumber});

        UPDATE_BOOKLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel31, updatevalue});

        jTabbedPane2.addTab("UPDATE", UPDATE_BOOK);

        jLabel32.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("ALL LIBRARY BOOKS");

        showallbooksbutton.setText("SHOW ALL BOOKS");
        showallbooksbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallbooksbuttonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK ID", "NAME", "AUTHOR", "PUBLICATION", "PAGES", "VOLUME NO.", "GENERE", "BRANCH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout ALL_BOOKSLayout = new javax.swing.GroupLayout(ALL_BOOKS);
        ALL_BOOKS.setLayout(ALL_BOOKSLayout);
        ALL_BOOKSLayout.setHorizontalGroup(
            ALL_BOOKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(ALL_BOOKSLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(showallbooksbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        ALL_BOOKSLayout.setVerticalGroup(
            ALL_BOOKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ALL_BOOKSLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showallbooksbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ALL", ALL_BOOKS);

        jLabel33.setFont(new java.awt.Font("BoltonBold", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("RETURN TO MAIN MENU");

        returnbutton.setText("RETURN");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 279, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("RETURN", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        try{
            String bn=addbookname.getText();
            String ba=addbookauthor.getText();
            String p=addpublication.getText();
            String vn1=addvolumeno.getText();
            String nov1=addnoofvolume.getText();
            String nop1=addnoofpages.getText();
            String g=addgenere.getText();
            String b=addbranch.getText();
            
            int vn=Integer.parseInt(vn1);
            int nov=Integer.parseInt(nov1);
            int nop=Integer.parseInt(nop1);
                        
            DBconnect.Connect.st.executeUpdate("insert into book(name,author,publication,volumeno,no_of_volume,no_of_pages,genere,branch) values('"+bn+"','"+ba+"','"+p+"',"+vn+","+nov+","+nop+",'"+g+"','"+b+"')");
            ResultSet rs=DBconnect.Connect.st.executeQuery("select max(id) from Book");
            rs.next();
            int n=rs.getInt(1);
            JOptionPane.showMessageDialog(null,"Book Number is "+n);
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Fill all entries carefully!!!");
        }
    }//GEN-LAST:event_addbuttonActionPerformed

    private void addbooknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbooknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbooknameActionPerformed

    private void addbookauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbookauthorActionPerformed

    private void addpublicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpublicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addpublicationActionPerformed

    private void addvolumenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvolumenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addvolumenoActionPerformed

    private void addnoofvolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnoofvolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addnoofvolumeActionPerformed

    private void addnoofpagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnoofpagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addnoofpagesActionPerformed

    private void addgenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgenereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addgenereActionPerformed

    private void addbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbranchActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
        new IssueReturn().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void removebooknumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebooknumberActionPerformed
        // TODO add your handling code here:
        try{
            String bn=removebooknumber.getText();
            int id=Integer.parseInt(bn);
            ResultSet rs=DBconnect.Connect.st.executeQuery("SELECT * FROM BOOK WHERE ID="+id+"");
            rs.next();
            removebookname.setText(rs.getString("name"));
            removebookauthor.setText(rs.getString("author"));
            removepublication.setText(rs.getString("publication"));
            removevolumeno.setText(Integer.toString(rs.getInt("volumeno")));
            removenoofvolume.setText(Integer.toString(rs.getInt("no_of_volume")));
            removenoofpages.setText(Integer.toString(rs.getInt("no_of_pages")));
            removegenere.setText(rs.getString("genere"));
            removebranch.setText(rs.getString("branch"));
            
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_removebooknumberActionPerformed

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
        // TODO add your handling code here:
        try{
            String bn=removebooknumber.getText();
            int id=Integer.parseInt(bn);
            DBconnect.Connect.st.executeUpdate("DELETE FROM BOOK WHERE ID="+id+"");
            
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_removebuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        // TODO add your handling code here:
        try{
            int id=Integer.parseInt(updatebooknumber.getText());
            String prop=(String)updateproperty.getSelectedItem();
            if(prop=="VOLUMENO" | prop=="N0OFVOLUME" | prop=="NOOFPAGES"){
                int v=Integer.parseInt(updatevalue.getText());
                DBconnect.Connect.st.executeUpdate("update book set "+prop+"="+v+" where id="+id+"");
            }else{
                String v=updatevalue.getText();
                DBconnect.Connect.st.executeUpdate("update book set "+prop+"='"+v+"' where id="+id+"");
            }
            
        }catch(Exception ex){
            System.out.println();
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void showallbooksbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallbooksbuttonActionPerformed
        // TODO add your handling code here:
        try{
            javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)jTable1.getModel();
            int rc=model.getRowCount();
            while(rc--!=0){
                model.removeRow(rc);
                }
            ResultSet rs=DBconnect.Connect.st.executeQuery("SELECT * FROM BOOK");
            while(rs.next()){
                java.util.Vector r= new java.util.Vector();
                r.add(rs.getInt("ID"));
                r.add(rs.getString("name"));
                r.add(rs.getString("author"));
                r.add(rs.getString("publication"));
                r.add(rs.getInt("no_of_pages"));
                r.add(rs.getInt("volumeno"));
                r.add(rs.getString("genere"));
                r.add(rs.getString("branch"));
                model.addRow(r);
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_showallbooksbuttonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book("Directpass").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADD_BOOK;
    private javax.swing.JPanel ALL_BOOKS;
    private javax.swing.JPanel REMOVE_BOOK;
    private javax.swing.JPanel UPDATE_BOOK;
    private javax.swing.JTextField addbookauthor;
    private javax.swing.JTextField addbookname;
    private javax.swing.JTextField addbranch;
    private javax.swing.JButton addbutton;
    private javax.swing.JTextField addgenere;
    private javax.swing.JTextField addnoofpages;
    private javax.swing.JTextField addnoofvolume;
    private javax.swing.JTextField addpublication;
    private javax.swing.JTextField addvolumeno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel removebookauthor;
    private javax.swing.JLabel removebookname;
    private javax.swing.JTextField removebooknumber;
    private javax.swing.JLabel removebranch;
    private javax.swing.JButton removebutton;
    private javax.swing.JLabel removegenere;
    private javax.swing.JLabel removenoofpages;
    private javax.swing.JLabel removenoofvolume;
    private javax.swing.JLabel removepublication;
    private javax.swing.JLabel removevolumeno;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton showallbooksbutton;
    private javax.swing.JTextField updatebooknumber;
    private javax.swing.JButton updatebutton;
    private javax.swing.JComboBox<String> updateproperty;
    private javax.swing.JTextField updatevalue;
    // End of variables declaration//GEN-END:variables
}
