/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Hager elsehamy
 */
public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
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

        register = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        fname = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Sign Up");
        setMinimumSize(new java.awt.Dimension(480, 710));
        setName("signUp"); // NOI18N
        setPreferredSize(new java.awt.Dimension(480, 710));
        setResizable(false);
        getContentPane().setLayout(null);

        register.setBackground(new java.awt.Color(102, 0, 0));
        register.setFont(new java.awt.Font("Perpetua Titling MT", 3, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(130, 490, 110, 30);

        cancel.setBackground(new java.awt.Color(102, 0, 0));
        cancel.setFont(new java.awt.Font("Perpetua Titling MT", 3, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(300, 490, 110, 30);

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 0, 0));
        name.setText("first name:");
        getContentPane().add(name);
        name.setBounds(80, 50, 70, 17);

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 0, 0));
        email.setText("e-mail:");
        getContentPane().add(email);
        email.setBounds(80, 280, 50, 17);

        pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(102, 0, 0));
        pass.setText("password:");
        getContentPane().add(pass);
        pass.setBounds(80, 220, 120, 17);

        city.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        city.setForeground(new java.awt.Color(102, 0, 0));
        city.setText("address");
        getContentPane().add(city);
        city.setBounds(80, 340, 110, 17);

        jTextField3.setMaximumSize(new java.awt.Dimension(0, 3));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 330, 200, 25);

        jPasswordField1.setMaximumSize(new java.awt.Dimension(0, 3));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(160, 220, 200, 25);

        fname.setMaximumSize(new java.awt.Dimension(0, 3));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(160, 50, 200, 25);

        jTextField5.setMaximumSize(new java.awt.Dimension(0, 3));
        jTextField5.setName("mail"); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(160, 170, 200, 25);

        lname.setMinimumSize(new java.awt.Dimension(6, 25));
        lname.setPreferredSize(new java.awt.Dimension(6, 25));
        getContentPane().add(lname);
        lname.setBounds(160, 120, 200, 25);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("last name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 120, 70, 20);

        jTextField2.setMaximumSize(new java.awt.Dimension(0, 3));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 280, 200, 25);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("phone:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 170, 50, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
String mail=this.jTextField2.getText();
         if(person.CheckIfAlready(mail))
         {
             JOptionPane.showMessageDialog(signUp.this, "UserName already taken!","Adding new User Error!", JOptionPane.ERROR_MESSAGE);
         }
         else
         {
             mail =this.jTextField2.getText();
             String password = String.valueOf(this.jPasswordField1.getPassword());
             String phone = this.jTextField5.getText();
             String fname=this.fname.getText();
             String lname=this.lname.getText();
             String address=this.jTextField3.getText();
                if(person.SignUp(fname,lname,phone,mail,password,address)!=0)
                {
                    JOptionPane.showMessageDialog(signUp.this, "User is Added Successfully!","Adding New User!", JOptionPane.OK_OPTION);
                    this.fname.setText("");
                    this.lname.setText("");
                    this.jTextField2.setText("");
                    this.jTextField3.setText("");
                    this.jTextField5.setText("");
                    this.jPasswordField1.setText("");
                }
                else
                       JOptionPane.showMessageDialog(signUp.this, "Unable to add new User","Adding new User Error!", JOptionPane.ERROR_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed
    }
    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel city;
    private javax.swing.JLabel email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pass;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
