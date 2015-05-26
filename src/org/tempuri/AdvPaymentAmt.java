/**
 * AdvPaymentAmt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AdvPaymentAmt  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.util.Calendar txdate;

    private double currentAdvancePayment;

    public AdvPaymentAmt() {
    }

    public AdvPaymentAmt(
           java.util.Calendar txdate,
           double currentAdvancePayment) {
        this.txdate = txdate;
        this.currentAdvancePayment = currentAdvancePayment;
    }


    /**
     * Gets the txdate value for this AdvPaymentAmt.
     * 
     * @return txdate
     */
    public java.util.Calendar getTxdate() {
        return txdate;
    }


    /**
     * Sets the txdate value for this AdvPaymentAmt.
     * 
     * @param txdate
     */
    public void setTxdate(java.util.Calendar txdate) {
        this.txdate = txdate;
    }


    /**
     * Gets the currentAdvancePayment value for this AdvPaymentAmt.
     * 
     * @return currentAdvancePayment
     */
    public double getCurrentAdvancePayment() {
        return currentAdvancePayment;
    }


    /**
     * Sets the currentAdvancePayment value for this AdvPaymentAmt.
     * 
     * @param currentAdvancePayment
     */
    public void setCurrentAdvancePayment(double currentAdvancePayment) {
        this.currentAdvancePayment = currentAdvancePayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvPaymentAmt)) return false;
        AdvPaymentAmt other = (AdvPaymentAmt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.txdate==null && other.getTxdate()==null) || 
             (this.txdate!=null &&
              this.txdate.equals(other.getTxdate()))) &&
            this.currentAdvancePayment == other.getCurrentAdvancePayment();
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
        if (getTxdate() != null) {
            _hashCode += getTxdate().hashCode();
        }
        _hashCode += new Double(getCurrentAdvancePayment()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvPaymentAmt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AdvPaymentAmt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Txdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAdvancePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CurrentAdvancePayment"));
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
