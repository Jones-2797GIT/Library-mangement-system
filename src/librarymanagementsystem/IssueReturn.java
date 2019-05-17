package librarymanagementsystem;

import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class IssueReturn extends javax.swing.JFrame {

    static String title;
    public IssueReturn() {
        initComponents();
        setTitle("Galgotia's Library ("+title+")");
        setLocationRelativeTo(null);
    }
    public IssueReturn(String t){
        initComponents();
        title=t;
        setTitle("Galgotia's Library ("+t+")");
        setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seprator = new javax.swing.JPanel();
        issueheadinglabel = new javax.swing.JLabel();
        issuestudentlabel = new javax.swing.JLabel();
        issuestudent = new javax.swing.JTextField();
        issuebooklabel = new javax.swing.JLabel();
        issuebook = new javax.swing.JTextField();
        issuelibrarylabel = new javax.swing.JLabel();
        issuelibrary = new javax.swing.JTextField();
        issuebutton = new javax.swing.JButton();
        returnheadinglabel = new javax.swing.JLabel();
        returnstudentlabel = new javax.swing.JLabel();
        returnbooklabel = new javax.swing.JLabel();
        returnlibrarylabel = new javax.swing.JLabel();
        returnbutton = new javax.swing.JButton();
        returnlibrary = new javax.swing.JTextField();
        returnbook = new javax.swing.JTextField();
        returnstudent = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        booklink = new javax.swing.JMenu();
        userlink = new javax.swing.JMenu();
        studentlink = new javax.swing.JMenu();
        issuereturnlink = new javax.swing.JMenu();
        aboutreturn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        issueheadinglabel.setText("Issue");

        issuestudentlabel.setText("STUDENT NO:");

        issuebooklabel.setText("BOOK NO:");

        issuelibrarylabel.setText("LIBRARY ID:");

        issuebutton.setText("ISSUE");
        issuebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebuttonActionPerformed(evt);
            }
        });

        returnheadinglabel.setText("Return");

        returnstudentlabel.setText("STUDENT NO:");

        returnbooklabel.setText("BOOK NO:");

        returnlibrarylabel.setText("LIBRARY ID:");

        returnbutton.setText("RETURN");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sepratorLayout = new javax.swing.GroupLayout(seprator);
        seprator.setLayout(sepratorLayout);
        sepratorLayout.setHorizontalGroup(
            sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sepratorLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(issuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sepratorLayout.createSequentialGroup()
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sepratorLayout.createSequentialGroup()
                                .addComponent(returnlibrarylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(returnlibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sepratorLayout.createSequentialGroup()
                                .addComponent(returnheadinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(sepratorLayout.createSequentialGroup()
                                        .addComponent(returnbooklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(returnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(sepratorLayout.createSequentialGroup()
                                        .addComponent(returnstudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(returnstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(sepratorLayout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sepratorLayout.createSequentialGroup()
                        .addComponent(issuelibrarylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(issuelibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sepratorLayout.createSequentialGroup()
                        .addComponent(issueheadinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sepratorLayout.createSequentialGroup()
                                .addComponent(issuebooklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sepratorLayout.createSequentialGroup()
                                .addComponent(issuestudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(issuestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 37, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        sepratorLayout.setVerticalGroup(
            sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sepratorLayout.createSequentialGroup()
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueheadinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuestudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issuebooklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issuelibrarylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuelibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(issuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnheadinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnstudentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnbooklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sepratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnlibrarylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnlibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        booklink.setText("Book");
        booklink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booklinkMouseClicked(evt);
            }
        });
        jMenuBar1.add(booklink);

        userlink.setText("User");
        userlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userlinkMouseClicked(evt);
            }
        });
        jMenuBar1.add(userlink);

        studentlink.setText("Student");
        studentlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentlinkMouseClicked(evt);
            }
        });
        studentlink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentlinkActionPerformed(evt);
            }
        });
        jMenuBar1.add(studentlink);

        issuereturnlink.setText("Issue/Return");
        issuereturnlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuereturnlinkMouseClicked(evt);
            }
        });
        jMenuBar1.add(issuereturnlink);

        aboutreturn.setText("About");
        jMenuBar1.add(aboutreturn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seprator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seprator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentlinkActionPerformed
    }//GEN-LAST:event_studentlinkActionPerformed

    private void studentlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentlinkMouseClicked
        // TODO add your handling code here:
        new Student(title).setVisible(true);
        dispose();
    }//GEN-LAST:event_studentlinkMouseClicked

    private void booklinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booklinkMouseClicked
        // TODO add your handling code here:
        new Book(title).setVisible(true);
        dispose();
    }//GEN-LAST:event_booklinkMouseClicked

    private void issuereturnlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuereturnlinkMouseClicked
        // TODO add your handling code here:
        new IANDR(title).setVisible(true);
        dispose();
    }//GEN-LAST:event_issuereturnlinkMouseClicked

    private void userlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userlinkMouseClicked
        new User(title).setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_userlinkMouseClicked

    private void issuebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebuttonActionPerformed
        // TODO add your handling code here:
        try{
        String s1=issuestudent.getText();
        String b1=issuebook.getText();
        String l1=issuelibrary.getText();
        
        int s=Integer.parseInt(s1);
        int b=Integer.parseInt(b1);
        int l=Integer.parseInt(l1);
        
        java.util.Date da=new java.util.Date();
        java.sql.Date date=new java.sql.Date(da.getTime());
        
        DBconnect.Connect.Issue.setInt(1,s);
        DBconnect.Connect.Issue.setInt(2,b);
        DBconnect.Connect.Issue.setInt(3,l);
        DBconnect.Connect.Issue.setDate(4,date);
        
        DBconnect.Connect.Issue.executeUpdate();
     
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Fill all entries carefully");
        }
    }//GEN-LAST:event_issuebuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
        try{
        String s1=returnstudent.getText();
        String b1=returnbook.getText();
        String l1=returnlibrary.getText();
        
        int s=Integer.parseInt(s1);
        int b=Integer.parseInt(b1);
        int l=Integer.parseInt(l1);
        
        java.util.Date da=new java.util.Date();
        java.sql.Date date=new java.sql.Date(da.getTime());
             
        DBconnect.Connect.Return.setInt(1,l);
        DBconnect.Connect.Return.setDate(2,date);
        DBconnect.Connect.Return.setInt(3,b);
        DBconnect.Connect.Return.setInt(4,s);
        
        DBconnect.Connect.Return.executeUpdate();
     
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Fill all entries carefully");
        }
    }//GEN-LAST:event_returnbuttonActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(IssueReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueReturn("directpass").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutreturn;
    private javax.swing.JMenu booklink;
    private javax.swing.JTextField issuebook;
    private javax.swing.JLabel issuebooklabel;
    private javax.swing.JButton issuebutton;
    private javax.swing.JLabel issueheadinglabel;
    private javax.swing.JTextField issuelibrary;
    private javax.swing.JLabel issuelibrarylabel;
    private javax.swing.JMenu issuereturnlink;
    private javax.swing.JTextField issuestudent;
    private javax.swing.JLabel issuestudentlabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField returnbook;
    private javax.swing.JLabel returnbooklabel;
    private javax.swing.JButton returnbutton;
    private javax.swing.JLabel returnheadinglabel;
    private javax.swing.JTextField returnlibrary;
    private javax.swing.JLabel returnlibrarylabel;
    private javax.swing.JTextField returnstudent;
    private javax.swing.JLabel returnstudentlabel;
    private javax.swing.JPanel seprator;
    private javax.swing.JMenu studentlink;
    private javax.swing.JMenu userlink;
    // End of variables declaration//GEN-END:variables
}
