import java.io.File;
//import javax.media.Manager;
//import javax.media.Player;
import java.util.Scanner;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;;
import javax.swing.JOptionPane;

public class RMIWindow extends javax.swing.JFrame 
       
{
  public RMIWindow()
{
    initComponents();
  try
  {
    Registry reg=
 LocateRegistry.createRegistry(2003);
 System.out.println("SERVER IS READY");
 CheckLogin cl=new CheckLogin();
reg.bind("AUTH",cl);
}

catch(Exception ex)

{

}
}
private void jLable2MouseClicked(java.awt.event.MouseEvent evt){
String serverName=jTextField2.getText();
int portNo=Integer.parseInt(jTextField5.getText());
String uniqueId=jTextField6.getText();
String userId=jTextField8.getText();
char ch[]=jPasswordField1.getPassword();
String password=new String(ch);

try
{
Registry reg=
 LocateRegistry.getRegistry(serverName,portNo);
LoginInterface li= (LoginInterface)reg.lookup(uniqueId);
boolean result = li.check(userId,password);
if(result)
{
new Flash().setVisible(true);
}
else
{
JOptionPane.showMessageDialog(this,"whats up.......");
System.exit(0);
}
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 280, 40));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 280, 40));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, 40));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 280, 40));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 280, 50));

        jButton3.setText("GO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b3313396-fb21-4890-bbb2-ded65e0e2092_1.png"))); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -250, 870, 1030));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String serverName=jTextField2.getText();
int portNo=Integer.parseInt(jTextField5.getText());
String uniqueId=jTextField6.getText();
String userId=jTextField8.getText();
char ch[]=jPasswordField1.getPassword();
String password=new String(ch);

try
{
Registry reg=
 LocateRegistry.getRegistry(serverName,portNo);
LoginInterface li= (LoginInterface)reg.lookup(uniqueId);
boolean result = li.check(userId,password);
if(result)
{
new Flash().setVisible(true);
}
else
{
JOptionPane.showMessageDialog(this,"whats up.......");
System.exit(0);
}
}
catch(Exception ex)
{
ex.printStackTrace();
}

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RMIWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
