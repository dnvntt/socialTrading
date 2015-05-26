/**
 * AddStockOptionRegister.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddStockOptionRegister  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private org.tempuri.StockOptionRegister stockOptionRegister;

    private double registerAmount;

    public AddStockOptionRegister() {
    }

    public AddStockOptionRegister(
           java.lang.String accountNumber,
           org.tempuri.StockOptionRegister stockOptionRegister,
           double registerAmount) {
        this.accountNumber = accountNumber;
        this.stockOptionRegister = stockOptionRegister;
        this.registerAmount = registerAmount;
    }


    /**
     * Gets the accountNumber value for this AddStockOptionRegister.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this AddStockOptionRegister.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the stockOptionRegister value for this AddStockOptionRegister.
     * 
     * @return stockOptionRegister
     */
    public org.tempuri.StockOptionRegister getStockOptionRegister() {
        return stockOptionRegister;
    }


    /**
     * Sets the stockOptionRegister value for this AddStockOptionRegister.
     * 
     * @param stockOptionRegister
     */
    public void setStockOptionRegister(org.tempuri.StockOptionRegister stockOptionRegister) {
        this.stockOptionRegister = stockOptionRegister;
    }


    /**
     * Gets the registerAmount value for this AddStockOptionRegister.
     * 
     * @return registerAmount
     */
    public double getRegisterAmount() {
        return registerAmount;
    }


    /**
     * Sets the registerAmount value for this AddStockOptionRegister.
     * 
     * @param registerAmount
     */
    public void setRegisterAmount(double registerAmount) {
        this.registerAmount = registerAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddStockOptionRegister)) return false;
        AddStockOptionRegister other = (AddStockOptionRegister) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.stockOptionRegister==null && other.getStockOptionRegister()==null) || 
             (this.stockOptionRegister!=null &&
              this.stockOptionRegister.equals(other.getStockOptionRegister()))) &&
            this.registerAmount == other.getRegisterAmount();
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getStockOptionRegister() != null) {
            _hashCode += getStockOptionRegister().hashCode();
        }
        _hashCode += new Double(getRegisterAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddStockOptionRegister.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AddStockOptionRegister"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
