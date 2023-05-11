
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
    }
    public void setTotalPrice(int sum){
        totalPriceTextCheckout.setText(Integer.toString(sum));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalPriceLabel = new javax.swing.JLabel();
        totalPriceTextCheckout = new javax.swing.JTextField();
        visaNumberLabel = new javax.swing.JLabel();
        visaNumberText = new javax.swing.JTextField();
        checkoutLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        payButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        totalPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalPriceLabel.setText("Total Price");

        totalPriceTextCheckout.setEditable(false);
        totalPriceTextCheckout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalPriceTextCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceTextCheckoutActionPerformed(evt);
            }
        });

        visaNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        visaNumberLabel.setText("Visa Number");

        visaNumberText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        checkoutLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        checkoutLabel.setText("Checkout");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordLabel.setText("Password");

        passwordText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        payButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalPriceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(totalPriceTextCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkoutLabel)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visaNumberLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(visaNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payButton)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkoutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(totalPriceTextCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visaNumberLabel)
                    .addComponent(visaNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(payButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalPriceTextCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceTextCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceTextCheckoutActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        String visaNumber = visaNumberText.getText().toString(), evenIndexes = "", oddIndexes = "";
        String passNumber = passwordText.getText().toString();
        for(int i = 0; i < visaNumber.length(); i = i + 2) {
            evenIndexes = evenIndexes + visaNumber.charAt(i);
            oddIndexes = oddIndexes + visaNumber.charAt(i+1);
        }
        int lastDegit = (int)(visaNumber.charAt(15))-48;
        int sum = 0;
        for(int i = 0; i < evenIndexes.length(); i++){
            int checkNumber = (int)(evenIndexes.charAt(i))-48;
            if(checkNumber == 5)
                sum = sum + 1;
            else if(checkNumber == 6)
                sum = sum + 3;
            else if(checkNumber == 7)
                sum = sum + 5;
            else if(checkNumber == 8)
                sum = sum + 7;
            else if(checkNumber == 9)
                sum = sum + 9;
            else
                sum = sum + (checkNumber*2);
        }
        for(int i = 0; i < oddIndexes.length() - 1; i++){
            int takenNumber = (int)(oddIndexes.charAt(i))-48;
            sum = sum + takenNumber;
        }
        if((sum + lastDegit) % 10 == 0 && passNumber.equals("1234"))
            JOptionPane.showMessageDialog(this,"Valid");
        else
            JOptionPane.showMessageDialog(this,"Not Valid");
    }//GEN-LAST:event_payButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkoutLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JTextField totalPriceTextCheckout;
    private javax.swing.JLabel visaNumberLabel;
    private javax.swing.JTextField visaNumberText;
    // End of variables declaration//GEN-END:variables
}
