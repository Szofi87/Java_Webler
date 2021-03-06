
package CalculatorRound;


/**
 *
 * @author rnszofi
 */
public class CalculatorRound extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operations;
    
    
    public CalculatorRound() {
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

        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jtxtDisplay = new javax.swing.JTextField();
        jBtnMinus = new javax.swing.JButton();
        jBtnDiv = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnPM = new javax.swing.JButton();
        jBtnEquals = new javax.swing.JButton();
        jBtnMulti = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setText("jButton1");

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(425, 750));
        setPreferredSize(new java.awt.Dimension(430, 755));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, 90));

        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 80, 80));

        jBtnDiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDiv.setText("/");
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 80, 80));

        jBtnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnBack.setText("???");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 80));

        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, 80));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 80));

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 80, 80));

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setToolTipText("");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 80, 80));

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 80, 80));

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 80, 80));

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 80, 80));

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 80, 80));

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 80, 80));

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 80, 80));

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 80, 80));

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 80, 80));

        jBtnPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnPM.setText("+/-");
        jBtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 80, 80));

        jBtnEquals.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnEquals.setText("=");
        jBtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 80, 80));

        jBtnMulti.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnMulti.setText("*");
        jBtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 80, 80));

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 80, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 240, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

                  
    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
          String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn7.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn7.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn1.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn1.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn8.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn8.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn9.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn9.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn4.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn4.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
       String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn5.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn5.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn6.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn6.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn2.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn2.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn3.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn3.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String EnterNumber = jtxtDisplay.getText();
          
          if(EnterNumber == ""){
              jtxtDisplay.setText(jBtn0.getText());
          } else {
              EnterNumber = jtxtDisplay.getText() + jBtn0.getText();
              jtxtDisplay.setText(EnterNumber);
          }
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        if(! jtxtDisplay.getText().contains(".")){
            jtxtDisplay.setText(jtxtDisplay.getText() + jBtnDot.getText());
        }
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        String backspace = null;
        if(jtxtDisplay.getText().length()> 0){
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() -1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
        
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        jLabel1.setText(firstnum + "/");
        operations = "/";
    }//GEN-LAST:event_jBtnDivActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        jLabel1.setText(firstnum + "-");
        operations = "-";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        operations = "+";
        jtxtDisplay.setText("");
        jLabel1.setText(firstnum + "+");
        
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiActionPerformed
         firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        jLabel1.setText(firstnum + "*");
        operations = "*";
    }//GEN-LAST:event_jBtnMultiActionPerformed

    private void jBtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPMActionPerformed
        
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_jBtnPMActionPerformed

    private void jBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualsActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if(operations == "+"){
            result = firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if(operations == "-"){
            result = firstnum - secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if(operations == "*"){
            result = firstnum * secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        } else if(operations == "/"){
            result = firstnum / secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        jLabel1.setText("");
    }//GEN-LAST:event_jBtnEqualsActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorRound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEquals;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMulti;
    private javax.swing.JButton jBtnPM;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
