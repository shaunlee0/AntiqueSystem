package dadaassignment1;

import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DADAAssignment extends javax.swing.JFrame {

//Init of stock class
private static Stock stockClass = new Stock();

    public DADAAssignment() {
        initComponents();
        FillSetBox();
        FillItemsBox();
       
    }
    
    public void FillItemsBox(){
        StringBuilder stringBuilder = new StringBuilder();

        for (Item i : stockClass.allItems) {

            stringBuilder.append(i.display());
            stringBuilder.append("\n");
        }

        itemsBox.setText(stringBuilder.toString());
    }
    
    public void FillSetBox(){
         StringBuilder StringBuilder3 = new StringBuilder();
         for (Set s : stockClass.sets) {
            StringBuilder3.append(s.display());
        }

        setsBox.setText(StringBuilder3.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemToFind = new javax.swing.JTextField();
        getItemButton = new javax.swing.JButton();
        itemListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsBox = new javax.swing.JTextArea();
        showItems = new javax.swing.JButton();
        deleteItemField = new javax.swing.JTextField();
        deleteItemButton = new javax.swing.JButton();
        Sets = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        setsBox = new javax.swing.JTextArea();
        showSetsButton = new javax.swing.JButton();
        InsertionOnPriceBtn = new javax.swing.JButton();
        removeAndReplacebtn = new javax.swing.JButton();
        itemToRemoveAndReplaceInSet = new javax.swing.JTextField();
        removeReplaceSetOnly = new javax.swing.JButton();
        removeInSetBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        addToSetBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DescriptionField = new javax.swing.JTextField();
        PriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itemToFind.setName("itemToFind"); // NOI18N
        itemToFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemToFindActionPerformed(evt);
            }
        });

        getItemButton.setText("Get Item Info");
        getItemButton.setName("getItemButton"); // NOI18N
        getItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getItemButtonActionPerformed(evt);
            }
        });

        itemListLabel.setText("Items");

        itemsBox.setColumns(20);
        itemsBox.setRows(5);
        jScrollPane1.setViewportView(itemsBox);

        showItems.setText("Show Items");
        showItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showItemsActionPerformed(evt);
            }
        });

        deleteItemButton.setText("Delete Item Everywhere");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        Sets.setText("Sets");

        setsBox.setColumns(20);
        setsBox.setRows(5);
        jScrollPane2.setViewportView(setsBox);

        showSetsButton.setText("Show Sets");
        showSetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSetsButtonActionPerformed(evt);
            }
        });

        InsertionOnPriceBtn.setText("Sort Items by Price");
        InsertionOnPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertionOnPriceBtnActionPerformed(evt);
            }
        });

        removeAndReplacebtn.setText("Remove in Set & All Items, Replace in Set");
        removeAndReplacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAndReplacebtnActionPerformed(evt);
            }
        });

        removeReplaceSetOnly.setText("Remove & Replace in Set Only");
        removeReplaceSetOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeReplaceSetOnlyActionPerformed(evt);
            }
        });

        removeInSetBtn.setText("Remove from Set(s)");
        removeInSetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeInSetBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Add Item to Set");

        jLabel2.setText("itemNo ");

        jLabel3.setText("SetNo");

        addToSetBtn.setText("Add");
        addToSetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToSetBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Add Item to All Items");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Description");

        jLabel6.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InsertionOnPriceBtn)
                        .addGap(18, 18, 18)
                        .addComponent(showItems))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itemListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(itemToFind, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(deleteItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteItemField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 398, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Sets)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(addToSetBtn)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(itemToRemoveAndReplaceInSet, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeInSetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeReplaceSetOnly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeAndReplacebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(127, 127, 127)
                        .addComponent(showSetsButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemToFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getItemButton)
                    .addComponent(deleteItemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteItemButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemListLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showItems)
                    .addComponent(InsertionOnPriceBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sets)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showSetsButton)
                    .addComponent(removeAndReplacebtn)
                    .addComponent(itemToRemoveAndReplaceInSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeReplaceSetOnly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeInSetBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addToSetBtn)
                    .addComponent(jButton1)
                    .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemToFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemToFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemToFindActionPerformed

    private void getItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getItemButtonActionPerformed

        try{
        JOptionPane.showMessageDialog(null, "Item Found : " + stockClass.findItem(itemToFind.getText()).display());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Unable to find item");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_getItemButtonActionPerformed

    private void showItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showItemsActionPerformed

        StringBuilder stringBuilder = new StringBuilder();

        for (Item i : stockClass.allItems) {

            stringBuilder.append(i.display());
            stringBuilder.append("\n");
        }

        itemsBox.setText(stringBuilder.toString());

// TODO add your handling code here:
    }//GEN-LAST:event_showItemsActionPerformed

    private void showSetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSetsButtonActionPerformed

        FillSetBox();


    }//GEN-LAST:event_showSetsButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
  try{
        int itemToRemoveNo = Integer.valueOf(deleteItemField.getText());
        Item removing = stockClass.getItem(deleteItemField.getText());

        stockClass.removeFromSets(itemToRemoveNo);
        stockClass.removeFromAllItems(itemToRemoveNo);        
        
        FillItemsBox();
        FillSetBox();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Unable to find item");
        }
        

    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void InsertionOnPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertionOnPriceBtnActionPerformed

        for (int i = 1; i < stockClass.allItems.size(); i++) {

            Item current = stockClass.allItems.get(i);
            double value = stockClass.allItems.get(i).getPrice();

            int toCompare = i;

            while (toCompare > 0 && stockClass.allItems.get(toCompare - 1).getPrice() > value) {
                stockClass.allItems.set(toCompare, stockClass.allItems.get(toCompare - 1));
                toCompare = toCompare - 1;
            }
            stockClass.allItems.set(toCompare, current);
        }
        
        FillItemsBox();
        
        
    }//GEN-LAST:event_InsertionOnPriceBtnActionPerformed

    private void removeAndReplacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAndReplacebtnActionPerformed

        try {
            stockClass.removeAndReplaceInSetAndAllItems(itemToRemoveAndReplaceInSet.getText());
            FillSetBox();
            FillItemsBox();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No Item Found to replace");
        }
    }//GEN-LAST:event_removeAndReplacebtnActionPerformed

    private void removeReplaceSetOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeReplaceSetOnlyActionPerformed
        stockClass.removeAndReplaceInSetOnly(itemToRemoveAndReplaceInSet.getText());
        FillSetBox();
        
    }//GEN-LAST:event_removeReplaceSetOnlyActionPerformed

    private void removeInSetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeInSetBtnActionPerformed
        int itemToRemove = Integer.valueOf(itemToRemoveAndReplaceInSet.getText());

        stockClass.removeFromSets(itemToRemove);
        FillSetBox();
        
    }//GEN-LAST:event_removeInSetBtnActionPerformed

    private void addToSetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToSetBtnActionPerformed
        try {
            Item adding = stockClass.getItem(jTextField1.getText());
            Set setToAddTo = stockClass.getSet(jTextField2.getText());
            setToAddTo.ItemsInSetLinked.add(adding);
            setToAddTo.updatePriceOfSet();
            FillSetBox();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Set or Item not found");
        }

    }//GEN-LAST:event_addToSetBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        stockClass.addItemtoAllItems(DescriptionField.getText(), Double.valueOf(PriceField.getText()));
        FillItemsBox();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {

        //creation of scanners to pass into fillStock method
        Scanner sc = new Scanner(DADAAssignment.class.getResourceAsStream("items.csv"));
        Scanner sd = new Scanner(DADAAssignment.class.getResourceAsStream("sets.csv"));

        //Fill all stock repositories using above scanners
        stockClass.fillStockRepositories(sc, sd);
        
        
        

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
            java.util.logging.Logger.getLogger(DADAAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DADAAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DADAAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DADAAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DADAAssignment().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescriptionField;
    private javax.swing.JButton InsertionOnPriceBtn;
    private javax.swing.JTextField PriceField;
    private javax.swing.JLabel Sets;
    private javax.swing.JButton addToSetBtn;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JTextField deleteItemField;
    private javax.swing.JButton getItemButton;
    private javax.swing.JLabel itemListLabel;
    private javax.swing.JTextField itemToFind;
    private javax.swing.JTextField itemToRemoveAndReplaceInSet;
    private javax.swing.JTextArea itemsBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton removeAndReplacebtn;
    private javax.swing.JButton removeInSetBtn;
    private javax.swing.JButton removeReplaceSetOnly;
    private javax.swing.JTextArea setsBox;
    private javax.swing.JButton showItems;
    private javax.swing.JButton showSetsButton;
    // End of variables declaration//GEN-END:variables
}
