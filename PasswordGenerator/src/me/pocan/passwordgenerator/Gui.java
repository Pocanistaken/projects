
package me.pocan.passwordgenerator;

/**
 *
 * @author Pocan
 */
public class Gui extends javax.swing.JFrame {
    private boolean uppercasestatus,lowercasestatus,integerstatus,specialcharstatus;


    public Gui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generate = new javax.swing.JButton();
        Uppercase_value = new javax.swing.JTextField();
        Integer_value = new javax.swing.JTextField();
        Lowercase_value = new javax.swing.JTextField();
        SpecialChar_value = new javax.swing.JTextField();
        UppercaseGUI = new javax.swing.JRadioButton();
        IntegerGUI = new javax.swing.JRadioButton();
        LowercaseGUI = new javax.swing.JRadioButton();
        SpecialCharGUI = new javax.swing.JRadioButton();
        OutputGUI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator by Pocan");

        generate.setText("Generate");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        Uppercase_value.setText("5");
        Uppercase_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uppercase_valueActionPerformed(evt);
            }
        });

        Integer_value.setText("5");

        Lowercase_value.setText("5");

        SpecialChar_value.setText("5");

        UppercaseGUI.setText("Uppercase");

        IntegerGUI.setText("Integer");
        IntegerGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegerGUIActionPerformed(evt);
            }
        });

        LowercaseGUI.setText("Lowercase");

        SpecialCharGUI.setText("Special Char");

        OutputGUI.setEditable(false);
        OutputGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputGUIActionPerformed(evt);
            }
        });

        jLabel1.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UppercaseGUI)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LowercaseGUI)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(Lowercase_value, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(Integer_value, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(SpecialChar_value, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IntegerGUI)
                                        .addGap(35, 35, 35)
                                        .addComponent(SpecialCharGUI))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Uppercase_value, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(OutputGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialCharGUI)
                    .addComponent(IntegerGUI)
                    .addComponent(LowercaseGUI)
                    .addComponent(UppercaseGUI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uppercase_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lowercase_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Integer_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpecialChar_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(generate)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Uppercase_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uppercase_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uppercase_valueActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        int uppercase = Integer.valueOf(Uppercase_value.getText());
        int lowercase = Integer.valueOf(Lowercase_value.getText());
        int integer = Integer.valueOf(Integer_value.getText());
        int specialchar = Integer.valueOf(SpecialChar_value.getText());
        
        
        if (UppercaseGUI.isSelected()) {
           uppercasestatus = true;
        }
        if (LowercaseGUI.isSelected()) {
            lowercasestatus = true;
        }       
        if (IntegerGUI.isSelected()) {
            integerstatus = true;
        }               
        if (SpecialCharGUI.isSelected()) {
            specialcharstatus = true;
        } 
        if (UppercaseGUI.isSelected() == false) {
            uppercasestatus = false;
        }
        if (LowercaseGUI.isSelected() == false) {
            lowercasestatus = false;
        }        
        if (IntegerGUI.isSelected() == false) {
            integerstatus = false;
        }            
        if (SpecialCharGUI.isSelected() == false) {
            specialcharstatus = false;
        }           
        
        System.out.println(UppercaseGUI.isSelected());    
        System.out.println(uppercasestatus);
        System.out.println(lowercasestatus);
        System.out.println(integerstatus);
        System.out.println(SpecialCharGUI);

       PasswordGenerator password = new PasswordGenerator(uppercase, uppercasestatus, lowercase, lowercasestatus, integer, integerstatus, specialchar, specialcharstatus);
       OutputGUI.setText(password.getPassword());

        System.out.println(uppercase);

    }//GEN-LAST:event_generateActionPerformed

    private void IntegerGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegerGUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntegerGUIActionPerformed

    private void OutputGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputGUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutputGUIActionPerformed

    

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton IntegerGUI;
    private javax.swing.JTextField Integer_value;
    private javax.swing.JRadioButton LowercaseGUI;
    private javax.swing.JTextField Lowercase_value;
    private javax.swing.JTextField OutputGUI;
    private javax.swing.JRadioButton SpecialCharGUI;
    private javax.swing.JTextField SpecialChar_value;
    private javax.swing.JRadioButton UppercaseGUI;
    private javax.swing.JTextField Uppercase_value;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
