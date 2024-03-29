
package Inventory.Model;

import java.util.Date;
import javax.swing.Icon;

public class ModelProducts {

  
    public Icon getQrCode() {
        return qrCode;
    }

  
    public void setQrCode(Icon qrCode) {
        this.qrCode = qrCode;
    }

    public String getProductID() {
        return productID;
    }


    public void setProductID(String productID) {
        this.productID = productID;
    }

  
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuntity() {
        return productQuntity;
    }

    public void setProductQuntity(int productQuntity) {
        this.productQuntity = productQuntity;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Date getProductOrderDate() {
        return productOrderDate;
    }

    public void setProductOrderDate(Date productOrderDate) {
        this.productOrderDate = productOrderDate;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public void setSupplierAddress(String SupplierAddress) {
        this.SupplierAddress = SupplierAddress;
    }

    public String getSupplierEmailAddress() {
        return SupplierEmailAddress;
    }

    public void setSupplierEmailAddress(String SupplierEmailAddress) {
        this.SupplierEmailAddress = SupplierEmailAddress;
    }

    public int getSupplierContactInfo() {
        return SupplierContactInfo;
    }

    public void setSupplierContactInfo(int SupplierContactInfo) {
        this.SupplierContactInfo = SupplierContactInfo;
    }

    public ModelProducts(Icon qrCode, String productID, String productName, double productPrice, int productQuntity, String productCategory, Date productOrderDate, String SupplierName, String SupplierAddress, String SupplierEmailAddress, int SupplierContactInfo) {
        this.qrCode = qrCode;
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuntity = productQuntity;
        this.productCategory = productCategory;
        this.productOrderDate = productOrderDate;
        this.SupplierName = SupplierName;
        this.SupplierAddress = SupplierAddress;
        this.SupplierEmailAddress = SupplierEmailAddress;
        this.SupplierContactInfo = SupplierContactInfo;
    }

    
    public ModelProducts() {
    }
    
    
    
    private Icon qrCode;
    private String productID;
    private String productName;
    private double productPrice;
    private int productQuntity;
    private String productCategory;
    private Date productOrderDate;
    private String SupplierName;
    private String SupplierAddress;
    private String SupplierEmailAddress;
    private int SupplierContactInfo;
    
}
