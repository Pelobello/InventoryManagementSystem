/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Inventory.Forms;

import Inventory.Controller.AddProductsToDatabase;
import Inventory.Main.Main;
import Inventory.Model.ModelProducts;
import com.raven.datechooser.DateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import net.glxn.qrgen.image.ImageType;


public class AddProductsForm extends javax.swing.JPanel {
    private DateChooser datedata = new DateChooser();
    private AddProductsToDatabase addProductsToDatabase;
    
    private Main main;
    
    public AddProductsForm(Main main) {
        initComponents();
        this.main = main;
         datedata.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
         datedata.setTextField(productDate);
        addProductsToDatabase = new AddProductsToDatabase();
       
        productID.setText(generateUserId());
        quantityIncrement();
       

    }
     public static String generateUserId() {
    int userIdLength = 6;

    Random random = new Random();
    StringBuilder userIdBuilder = new StringBuilder();
    for (int i = 0; i < userIdLength; i++) {
        userIdBuilder.append(random.nextInt(10));
    }

    String userId = userIdBuilder.toString();

    return userId;
}
    private void quantityIncrement(){
         incrementTimer = new Timer(100, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int dataIncrement = Integer.parseInt(productQuntity.getText());
        dataIncrement++;
        String quntityData = Integer.toString(dataIncrement);
        productQuntity.setText(quntityData);
    }
});
        decrementTimer = new Timer(100, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int dataDecrement = Integer.parseInt(productQuntity.getText());
        if (dataDecrement > 0) {
            dataDecrement--;
            String quntityData = Integer.toString(dataDecrement);
            productQuntity.setText(quntityData);
        } else {
            decrementTimer.stop(); 
        }
    }
});
    }
private Timer incrementTimer;
private Timer decrementTimer;
public void textfieldtoNone(){
        productName.setText("");
        productPrice.setText("0");
        productQuntity.setText("0");
        supplierName.setText("");
        supplierAddress.setText("");
        supplierContactNo.setText("");
        supplierEmailAdd.setText("");
        
       
    }
private void addproducts(){
     try {
       ByteArrayOutputStream out = net.glxn.qrgen.QRCode.from(productID.getText()).to(ImageType.PNG).stream();
       ImageIcon icon = new ImageIcon(out.toByteArray());
       
       double pricedata = Double.parseDouble(productPrice.getText());
       int quantityData = Integer.parseInt(productQuntity.getText());
       int contactNum = Integer.parseInt(supplierContactNo.getText());
       DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       Date orderDate = dateFormat.parse(productDate.getText());
       addProductsToDatabase.addProducts(new ModelProducts(icon, productID.getText(), productName.getText(), pricedata, quantityData, (String) productCategory.getSelectedItem(), orderDate, supplierName.getText(), supplierAddress.getText(), supplierEmailAdd.getText(), contactNum));
       productID.setText(generateUserId());
       addProductsToDatabase.populateData(main.tableProducts);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private void deleteProducts(){
    ModelProducts modelProducts = new ModelProducts();
    modelProducts.setProductID(productID.getText());
    addProductsToDatabase.deleteProduct(modelProducts);
    addProductsToDatabase.populateData(main.tableProducts);
    
    
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        productName = new Inventory.Components.TextField();
        productPrice = new Inventory.Components.TextField();
        productDate = new Inventory.Components.TextField();
        productID = new Inventory.Components.TextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        productQuntity = new javax.swing.JTextField();
        productCategory = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        supplierName = new Inventory.Components.TextField();
        supplierContactNo = new Inventory.Components.TextField();
        supplierAddress = new Inventory.Components.TextField();
        supplierEmailAdd = new Inventory.Components.TextField();
        jLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        productName.setForeground(new java.awt.Color(51, 51, 51));
        productName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productName.setLabelText("Product Name");
        productName.setPreferredSize(new java.awt.Dimension(55, 55));

        productPrice.setForeground(new java.awt.Color(51, 51, 51));
        productPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productPrice.setLabelText("Product Price");
        productPrice.setPreferredSize(new java.awt.Dimension(55, 55));
        productPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productPriceKeyTyped(evt);
            }
        });

        productDate.setEditable(false);
        productDate.setBackground(new java.awt.Color(255, 255, 255));
        productDate.setForeground(new java.awt.Color(51, 51, 51));
        productDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productDate.setLabelText("Product OrderDate");
        productDate.setPreferredSize(new java.awt.Dimension(55, 55));

        productID.setEditable(false);
        productID.setBackground(new java.awt.Color(255, 255, 255));
        productID.setForeground(new java.awt.Color(51, 51, 51));
        productID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productID.setLabelText("Product ID");
        productID.setPreferredSize(new java.awt.Dimension(55, 55));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setText(">");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setText("<");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        productQuntity.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        productQuntity.setForeground(new java.awt.Color(102, 102, 102));
        productQuntity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productQuntity.setText("0");
        productQuntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productQuntityKeyTyped(evt);
            }
        });

        productCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        productCategory.setForeground(new java.awt.Color(102, 102, 102));
        productCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Food", "Appliances", "Cigarettes", "Clothes ", "Fruit", "Books" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Product Information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(productName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(productID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        supplierName.setForeground(new java.awt.Color(51, 51, 51));
        supplierName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplierName.setLabelText("Company Name");
        supplierName.setPreferredSize(new java.awt.Dimension(55, 55));

        supplierContactNo.setForeground(new java.awt.Color(51, 51, 51));
        supplierContactNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplierContactNo.setLabelText("Company Contact No#");
        supplierContactNo.setPreferredSize(new java.awt.Dimension(55, 55));
        supplierContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplierContactNoKeyTyped(evt);
            }
        });

        supplierAddress.setForeground(new java.awt.Color(51, 51, 51));
        supplierAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplierAddress.setLabelText("Company Address");
        supplierAddress.setPreferredSize(new java.awt.Dimension(55, 55));

        supplierEmailAdd.setForeground(new java.awt.Color(51, 51, 51));
        supplierEmailAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        supplierEmailAdd.setLabelText("Company Email Address");
        supplierEmailAdd.setPreferredSize(new java.awt.Dimension(55, 55));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Supplier Information");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(supplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supplierEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(supplierName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supplierContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supplierContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(supplierName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateBtn.setBackground(new java.awt.Color(102, 92, 194));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventory/Image/icons8_update_35px.png"))); // NOI18N

        addBtn.setBackground(new java.awt.Color(102, 92, 194));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventory/Image/icons8_add_35px.png"))); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(102, 92, 194));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventory/Image/icons8_delete_35px.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(638, 638, 638)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        incrementTimer.start();
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
    incrementTimer.stop();      
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
       decrementTimer.start();
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
      decrementTimer.stop();
    }//GEN-LAST:event_jButton5MouseReleased

    private void supplierContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierContactNoKeyTyped
          char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_supplierContactNoKeyTyped

    private void productPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productPriceKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_productPriceKeyTyped

    private void productQuntityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productQuntityKeyTyped
         char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_productQuntityKeyTyped

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       addproducts();
       textfieldtoNone();
       
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
     deleteProducts();
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addBtn;
    public javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JComboBox<String> productCategory;
    public Inventory.Components.TextField productDate;
    public Inventory.Components.TextField productID;
    public Inventory.Components.TextField productName;
    public Inventory.Components.TextField productPrice;
    public javax.swing.JTextField productQuntity;
    public Inventory.Components.TextField supplierAddress;
    public Inventory.Components.TextField supplierContactNo;
    public Inventory.Components.TextField supplierEmailAdd;
    public Inventory.Components.TextField supplierName;
    public javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
