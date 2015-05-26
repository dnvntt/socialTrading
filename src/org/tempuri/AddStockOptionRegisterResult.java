/**
 * AddStockOptionRegisterResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddStockOptionRegisterResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.StockOptionRegister stockOptionRegister;

    private double registerAmount;

    private double totalPrice;

    public AddStockOptionRegisterResult() {
    }

    public AddStockOptionRegisterResult(
           org.tempuri.MessageStatus status,
           org.tempuri.StockOptionRegister stockOptionRegister,
           double registerAmount,
           double totalPrice) {
        this.status = status;
        this.stockOptionRegister = stockOptionRegister;
        this.registerAmount = registerAmount;
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the status value for this AddStockOptionRegisterResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AddStockOptionRegisterResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the stockOptionRegister value for this AddStockOptionRegisterResult.
     * 
     * @return stockOptionRegister
     */
    public org.tempuri.StockOptionRegister getStockOptionRegister() {
        return stockOptionRegister;
    }


    /**
     * Sets the stockOptionRegister value for this AddStockOptionRegisterResult.
     * 
     * @param stockOptionRegister
     */
    public void setStockOptionRegister(org.tempuri.StockOptionRegister stockOptionRegister) {
        this.stockOptionRegister = stockOptionRegister;
    }


    /**
     * Gets the registerAmount value for this AddStockOptionRegisterResult.
     * 
     * @return registerAmount
     */
    public double getRegisterAmount() {
        return registerAmount;
    }


    /**
     * Sets the registerAmount value for this AddStockOptionRegisterResult.
     * 
     * @param registerAmount
     */
    public void setRegisterAmount(double registerAmount) {
        this.registerAmount = registerAmount;
    }


    /**
     * Gets the totalPrice value for this AddStockOptionRegisterResult.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this AddStockOptionRegisterResult.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddStockOptionRegisterResult)) return false;
        AddStockOptionRegisterResult other = (AddStockOptionRegisterResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.stockOptionRegister==null && other.getStockOptionRegister()==null) || 
             (this.stockOptionRegister!=null &&
              this.stockOptionRegister.equals(other.getStockOptionRegister()))) &&
            this.registerAmount == other.getRegisterAmount() &&
            this.totalPrice == other.getTotalPrice();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStockOptionRegister() != null) {
            _hashCode += getStockOptionRegister().hashCode();
        }
        _hashCode += new Double(getRegisterAmount()).hashCode();
        _hashCode += new Double(getTotalPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddStockOptionRegisterResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AddStockOptionRegisterResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockOptionRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "StockOptionRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "StockOptionRegister"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RegisterAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
