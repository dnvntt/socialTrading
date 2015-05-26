/**
 * ConfirmDFAdvPaymentAmountResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ConfirmDFAdvPaymentAmountResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.ConfirmDFAdvPaymentAmount[] confirmDFAdvPaymentAmounts;

    public ConfirmDFAdvPaymentAmountResult() {
    }

    public ConfirmDFAdvPaymentAmountResult(
           org.tempuri.MessageStatus status,
           org.tempuri.ConfirmDFAdvPaymentAmount[] confirmDFAdvPaymentAmounts) {
        this.status = status;
        this.confirmDFAdvPaymentAmounts = confirmDFAdvPaymentAmounts;
    }


    /**
     * Gets the status value for this ConfirmDFAdvPaymentAmountResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConfirmDFAdvPaymentAmountResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the confirmDFAdvPaymentAmounts value for this ConfirmDFAdvPaymentAmountResult.
     * 
     * @return confirmDFAdvPaymentAmounts
     */
    public org.tempuri.ConfirmDFAdvPaymentAmount[] getConfirmDFAdvPaymentAmounts() {
        return confirmDFAdvPaymentAmounts;
    }


    /**
     * Sets the confirmDFAdvPaymentAmounts value for this ConfirmDFAdvPaymentAmountResult.
     * 
     * @param confirmDFAdvPaymentAmounts
     */
    public void setConfirmDFAdvPaymentAmounts(org.tempuri.ConfirmDFAdvPaymentAmount[] confirmDFAdvPaymentAmounts) {
        this.confirmDFAdvPaymentAmounts = confirmDFAdvPaymentAmounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmDFAdvPaymentAmountResult)) return false;
        ConfirmDFAdvPaymentAmountResult other = (ConfirmDFAdvPaymentAmountResult) obj;
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
            ((this.confirmDFAdvPaymentAmounts==null && other.getConfirmDFAdvPaymentAmounts()==null) || 
             (this.confirmDFAdvPaymentAmounts!=null &&
              java.util.Arrays.equals(this.confirmDFAdvPaymentAmounts, other.getConfirmDFAdvPaymentAmounts())));
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
        if (getConfirmDFAdvPaymentAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfirmDFAdvPaymentAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfirmDFAdvPaymentAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmDFAdvPaymentAmountResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmDFAdvPaymentAmountResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmDFAdvPaymentAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmDFAdvPaymentAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmDFAdvPaymentAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmDFAdvPaymentAmount"));
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
