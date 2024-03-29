
package Inventory.Controller;

import Inventory.Database.DatabaseConnection;
import Inventory.Model.ModelProducts;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class AddProductsToDatabase {
    private PreparedStatement p;
    private ResultSet rs;
    public AddProductsToDatabase() {
        
        
    }
    
    
    public void addProducts(ModelProducts data){
        
        
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(data.getProductOrderDate());
            DatabaseConnection connection = new DatabaseConnection();
            Connection con = connection.getCConnection();

        String sql = "INSERT INTO productsinformationdata(QRCode, ProductID, ProductName, ProductPrice, ProductQuantity, Category, ProductOrderDate, SupplierName, SupplierAddress, SupplierEmailAddress, SupplierContactInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        p = con.prepareStatement(sql);

        // Convert QR code icon to byte array
        BufferedImage bufferedImage = new BufferedImage(data.getQrCode().getIconWidth(), data.getQrCode().getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.createGraphics();
        data.getQrCode().paintIcon(null, g, 0, 0);
        g.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", baos);
        byte[] imageBytes = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        p.setBlob(1, bais, imageBytes.length);

        // Set other parameters
        p.setString(2, data.getProductID());
        p.setString(3, data.getProductName());
        p.setDouble(4, data.getProductPrice());
        p.setInt(5, data.getProductQuntity());
        p.setString(6, data.getProductCategory());
        p.setDate(7, java.sql.Date.valueOf(formattedDate));
        p.setString(8, data.getSupplierName());
        p.setString(9, data.getSupplierAddress());
        p.setString(10, data.getSupplierEmailAddress());
        p.setInt(11, data.getSupplierContactInfo());

        p.executeUpdate(); 
        JOptionPane.showMessageDialog(null, "Succesfully Added");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void populateData(JTable table){
        try {
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
             DatabaseConnection connection = new DatabaseConnection();
            Connection con = connection.getCConnection();
            String sql = "SELECT * FROM productsinformationdata WHERE DateDeleted IS NULL";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
            
            while (rs.next()) {                
                Vector <Object> v = new Vector<>();
                for (int i = 0; i < 35; i++) {
                Blob blob = rs.getBlob("QRCode");   
                       table.getColumnModel().getColumn(0).setCellRenderer(new ImageIconCellRenderer());
                       ImageIcon imageicon = blobToImageIcon(blob,50,50);
                       v.add(imageicon);
                       v.add(rs.getString("ProductID"));
                       v.add(rs.getString("ProductName"));
                       v.add(rs.getDouble("ProductPrice"));
                       v.add(rs.getInt("ProductQuantity")); 
                       v.add(rs.getDate("ProductOrderDate"));
                        v.add(rs.getString("Category"));
                       v.add(rs.getString("SupplierName"));
                       v.add(rs.getString("SupplierAddress"));
                       v.add(rs.getString("SupplierEmailAddress"));
                       v.add(rs.getString("SupplierAddress"));
                      
                    
                }
                model.addRow(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public void deleteProduct(ModelProducts data){
       try {
           DatabaseConnection connection = new DatabaseConnection();
           Connection con = connection.getCConnection();
           String sql = "UPDATE productsinformationdata SET DateDeleted = CURRENT_DATE WHERE ProductID =?";
           p = con.prepareStatement(sql);
           p.setString(1, data.getProductID());
            
           p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Succesfully Deleted");
           
       } catch (Exception e) {
           e.printStackTrace();
       }
   } 
    
   class ImageIconCellRenderer extends DefaultTableCellRenderer {
        @Override
        protected void setValue(Object value) {
            if (value instanceof ImageIcon) {
                setIcon((ImageIcon) value);
            } else {
                setText((value == null) ? "" : value.toString());
                setIcon(null);
            }
        }
    }
      private ImageIcon blobToImageIcon(Blob blob, int width, int height) throws SQLException {
        if (blob != null) {
            try (InputStream inputStream = blob.getBinaryStream()) {
                // Read the bytes from the blob
                byte[] bytes = inputStream.readAllBytes();
                // Convert bytes to ImageIcon
                ImageIcon originalIcon = new ImageIcon(bytes);
                // Scale down the image
                Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }  
    
}
