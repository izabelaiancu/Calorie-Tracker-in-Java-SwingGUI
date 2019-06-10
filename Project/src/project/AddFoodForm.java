/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.text.DecimalFormat;
import javax.swing.ButtonGroup;

/**
 *
 * @author Iuliano
 */
public class AddFoodForm extends javax.swing.JFrame {

    /**
     * Creates new form AddFoodForm
     */
    public String tableName;
    public AddFoodForm(String tableName) {
        this.tableName = tableName;
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(Breakfast);
        bg.add(Lunch);
        bg.add(Dinner);
        bg.add(Snack);
        Breakfast.setSelected(true);
        
    }
    public AddFoodForm(){
        
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(Breakfast);
        bg.add(Lunch);
        bg.add(Dinner);
        bg.add(Snack);
        Breakfast.setSelected(true);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FoodName = new javax.swing.JTextField();
        jTextField_Fats = new javax.swing.JTextField();
        Breakfast = new javax.swing.JRadioButton();
        Lunch = new javax.swing.JRadioButton();
        Dinner = new javax.swing.JRadioButton();
        Snack = new javax.swing.JRadioButton();
        jTextField_Protein = new javax.swing.JTextField();
        jTextField_Carbs = new javax.swing.JTextField();
        jTextField_Grams = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Add1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("New Food");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Food Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Food Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Actual Grams:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Protein per 100g:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Fats per 100g:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Carbs per 100g:");

        jTextField_Fats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FatsKeyTyped(evt);
            }
        });

        Breakfast.setText("Breakfast");
        Breakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreakfastActionPerformed(evt);
            }
        });

        Lunch.setText("Lunch");

        Dinner.setText("Dinner");

        Snack.setText("Snack");

        jTextField_Protein.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ProteinKeyTyped(evt);
            }
        });

        jTextField_Carbs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CarbsKeyTyped(evt);
            }
        });

        jTextField_Grams.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_GramsKeyTyped(evt);
            }
        });

        jButton_Add.setBackground(new java.awt.Color(255, 204, 255));
        jButton_Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(102, 0, 102));
        jButton_Add.setText("Cancel");
        jButton_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AddMouseClicked(evt);
            }
        });

        jButton_Add1.setBackground(new java.awt.Color(255, 204, 255));
        jButton_Add1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Add1.setForeground(new java.awt.Color(102, 0, 102));
        jButton_Add1.setText("Add");
        jButton_Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Add1MouseClicked(evt);
            }
        });
        jButton_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_Protein, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(jTextField_Carbs)
                                .addComponent(jTextField_Fats)
                                .addComponent(jTextField_Grams))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_FoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Breakfast)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Lunch)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Dinner)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Snack)))))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_FoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Breakfast)
                    .addComponent(Lunch)
                    .addComponent(Dinner)
                    .addComponent(Snack))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Protein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Fats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Carbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Grams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreakfastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BreakfastActionPerformed

    private void jButton_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AddMouseClicked
       this.dispose();
       
    }//GEN-LAST:event_jButton_AddMouseClicked

    private void jTextField_ProteinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ProteinKeyTyped
       if(!Character.isDigit(evt.getKeyChar()))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField_ProteinKeyTyped

    private void jTextField_FatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FatsKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField_FatsKeyTyped

    private void jTextField_CarbsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CarbsKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField_CarbsKeyTyped

    private void jTextField_GramsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_GramsKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField_GramsKeyTyped

    private void jButton_Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Add1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Add1MouseClicked

    private void jButton_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add1ActionPerformed
        String foodName=jTextField_FoodName.getText();
        String sprotein=jTextField_Protein.getText();
                String scarbs = jTextField_Carbs.getText();
                        String sfats=jTextField_Fats.getText();
                                String sgrams = jTextField_Grams.getText();
        float protein = Float.parseFloat(sprotein);
        float carbs = Float.parseFloat(scarbs);
        float fats = Float.parseFloat(sfats);
        float grams = Float.parseFloat(sgrams);
        String foodType = "Breakfast";
        if(Lunch.isSelected()){
            foodType = "Lunch";
            
        }
        else if(Dinner.isSelected()){
            foodType = "Dinner";
        }
        else if(Snack.isSelected()){
            
            foodType = "Snack";
        }
        
        Food food = new Food();
        food.insertUpdateDeleteFood('i', tableName, foodName, foodType, protein, carbs, fats, grams);
        float total = MyFunction.countCalories(tableName);

            DecimalFormat df = new DecimalFormat("#.0");

            HOMEJFrame.jLabel_Calories.setText("Total Calories = "+df.format(total));
            HOMEJFrame.jLabel_Protein.setText("Total Grams of Protein = "+Float.toString(MyFunction.countProtein(tableName))+" grams");
            HOMEJFrame.jLabel_Fats.setText("Total Grams of Fat = "+Float.toString(MyFunction.countFat(tableName))+" grams");
            HOMEJFrame.jLabel_Carbs.setText("Total Grams of Carbs = "+Float.toString(MyFunction.countCarbs(tableName))+" grams");
    }//GEN-LAST:event_jButton_Add1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Breakfast;
    private javax.swing.JRadioButton Dinner;
    private javax.swing.JRadioButton Lunch;
    private javax.swing.JRadioButton Snack;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Add1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField_Carbs;
    private javax.swing.JTextField jTextField_Fats;
    private javax.swing.JTextField jTextField_FoodName;
    private javax.swing.JTextField jTextField_Grams;
    private javax.swing.JTextField jTextField_Protein;
    // End of variables declaration//GEN-END:variables
}