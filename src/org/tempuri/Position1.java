/**
 * Position1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Position1  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private int available;

    private int blocked;

    private int clearingQuantities;

    private int receiving_t0;

    private int receiving_t1;

    private int receiving_t2;

    private int quantity;

    private java.lang.String symbol;

    private int secure;

    private int mortage;

    private int matchInday;

    public Position1() {
    }

    public Position1(
           java.lang.String accountNumber,
           int available,
           int blocked,
           int clearingQuantities,
           int receiving_t0,
           int receiving_t1,
           int receiving_t2,
           int quantity,
           java.lang.String symbol,
           int secure,
           int mortage,
           int matchInday) {
        this.accountNumber = accountNumber;
        this.available = available;
        this.blocked = blocked;
        this.clearingQuantities = clearingQuantities;
        this.receiving_t0 = receiving_t0;
        this.receiving_t1 = receiving_t1;
        this.receiving_t2 = receiving_t2;
        this.quantity = quantity;
        this.symbol = symbol;
        this.secure = secure;
        this.mortage = mortage;
        this.matchInday = matchInday;
    }


    /**
     * Gets the accountNumber value for this Position1.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Position1.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the available value for this Position1.
     * 
     * @return available
     */
    public int getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this Position1.
     * 
     * @param available
     */
    public void setAvailable(int available) {
        this.available = available;
    }


    /**
     * Gets the blocked value for this Position1.
     * 
     * @return blocked
     */
    public int getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this Position1.
     * 
     * @param blocked
     */
    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the clearingQuantities value for this Position1.
     * 
     * @return clearingQuantities
     */
    public int getClearingQuantities() {
        return clearingQuantities;
    }


    /**
     * Sets the clearingQuantities value for this Position1.
     * 
     * @param clearingQuantities
     */
    public void setClearingQuantities(int clearingQuantities) {
        this.clearingQuantities = clearingQuantities;
    }


    /**
     * Gets the receiving_t0 value for this Position1.
     * 
     * @return receiving_t0
     */
    public int getReceiving_t0() {
        return receiving_t0;
    }


    /**
     * Sets the receiving_t0 value for this Position1.
     * 
     * @param receiving_t0
     */
    public void setReceiving_t0(int receiving_t0) {
        this.receiving_t0 = receiving_t0;
    }


    /**
     * Gets the receiving_t1 value for this Position1.
     * 
     * @return receiving_t1
     */
    public int getReceiving_t1() {
        return receiving_t1;
    }


    /**
     * Sets the receiving_t1 value for this Position1.
     * 
     * @param receiving_t1
     */
    public void setReceiving_t1(int receiving_t1) {
        this.receiving_t1 = receiving_t1;
    }


    /**
     * Gets the receiving_t2 value for this Position1.
     * 
     * @return receiving_t2
     */
    public int getReceiving_t2() {
        return receiving_t2;
    }


    /**
     * Sets the receiving_t2 value for this Position1.
     * 
     * @param receiving_t2
     */
    public void setReceiving_t2(int receiving_t2) {
        this.receiving_t2 = receiving_t2;
    }


    /**
     * Gets the quantity value for this Position1.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Position1.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the symbol value for this Position1.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this Position1.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the secure value for this Position1.
     * 
     * @return secure
     */
    public int getSecure() {
        return secure;
    }


    /**
     * Sets the secure value for this Position1.
     * 
     * @param secure
     */
    public void setSecure(int secure) {
        this.secure = secure;
    }


    /**
     * Gets the mortage value for this Position1.
     * 
     * @return mortage
     */
    public int getMortage() {
        return mortage;
    }


    /**
     * Sets the mortage value for this Position1.
     * 
     * @param mortage
     */
    public void setMortage(int mortage) {
        this.mortage = mortage;
    }


    /**
     * Gets the matchInday value for this Position1.
     * 
     * @return matchInday
     */
    public int getMatchInday() {
        return matchInday;
    }


    /**
     * Sets the matchInday value for this Position1.
     * 
     * @param matchInday
     */
    public void setMatchInday(int matchInday) {
        this.matchInday = matchInday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Position1)) return false;
        Position1 other = (Position1) obj;
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
            this.available == other.getAvailable() &&
            this.blocked == other.getBlocked() &&
            this.clearingQuantities == other.getClearingQuantities() &&
            this.receiving_t0 == other.getReceiving_t0() &&
            this.receiving_t1 == other.getReceiving_t1() &&
            this.receiving_t2 == other.getReceiving_t2() &&
            this.quantity == other.getQuantity() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.secure == other.getSecure() &&
            this.mortage == other.getMortage() &&
            this.matchInday == other.getMatchInday();
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
        _hashCode += getAvailable();
        _hashCode += getBlocked();
        _hashCode += getClearingQuantities();
        _hashCode += getReceiving_t0();
        _hashCode += getReceiving_t1();
        _hashCode += getReceiving_t2();
        _hashCode += getQuantity();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += getSecure();
        _hashCode += getMortage();
        _hashCode += getMatchInday();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Position1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Position1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ClearingQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiving_t0");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Receiving_t0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiving_t1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Receiving_t1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiving_t2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Receiving_t2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Secure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mortage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Mortage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchInday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MatchInday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
