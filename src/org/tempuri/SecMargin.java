/**
 * SecMargin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SecMargin  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private double marginRate;

    private double marginPrice;

    private double remainQtty;

    public SecMargin() {
    }

    public SecMargin(
           double marginRate,
           double marginPrice,
           double remainQtty) {
        this.marginRate = marginRate;
        this.marginPrice = marginPrice;
        this.remainQtty = remainQtty;
    }


    /**
     * Gets the marginRate value for this SecMargin.
     * 
     * @return marginRate
     */
    public double getMarginRate() {
        return marginRate;
    }


    /**
     * Sets the marginRate value for this SecMargin.
     * 
     * @param marginRate
     */
    public void setMarginRate(double marginRate) {
        this.marginRate = marginRate;
    }


    /**
     * Gets the marginPrice value for this SecMargin.
     * 
     * @return marginPrice
     */
    public double getMarginPrice() {
        return marginPrice;
    }


    /**
     * Sets the marginPrice value for this SecMargin.
     * 
     * @param marginPrice
     */
    public void setMarginPrice(double marginPrice) {
        this.marginPrice = marginPrice;
    }


    /**
     * Gets the remainQtty value for this SecMargin.
     * 
     * @return remainQtty
     */
    public double getRemainQtty() {
        return remainQtty;
    }


    /**
     * Sets the remainQtty value for this SecMargin.
     * 
     * @param remainQtty
     */
    public void setRemainQtty(double remainQtty) {
        this.remainQtty = remainQtty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecMargin)) return false;
        SecMargin other = (SecMargin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.marginRate == other.getMarginRate() &&
            this.marginPrice == other.getMarginPrice() &&
            this.remainQtty == other.getRemainQtty();
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
        _hashCode += new Double(getMarginRate()).hashCode();
        _hashCode += new Double(getMarginPrice()).hashCode();
        _hashCode += new Double(getRemainQtty()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecMargin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SecMargin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MarginRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MarginPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainQtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RemainQtty"));
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
