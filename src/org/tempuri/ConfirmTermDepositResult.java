/**
 * ConfirmTermDepositResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ConfirmTermDepositResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.ConfirmTermDeposit confirmTermDeposit;

    public ConfirmTermDepositResult() {
    }

    public ConfirmTermDepositResult(
           org.tempuri.MessageStatus status,
           org.tempuri.ConfirmTermDeposit confirmTermDeposit) {
        this.status = status;
        this.confirmTermDeposit = confirmTermDeposit;
    }


    /**
     * Gets the status value for this ConfirmTermDepositResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConfirmTermDepositResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the confirmTermDeposit value for this ConfirmTermDepositResult.
     * 
     * @return confirmTermDeposit
     */
    public org.tempuri.ConfirmTermDeposit getConfirmTermDeposit() {
        return confirmTermDeposit;
    }


    /**
     * Sets the confirmTermDeposit value for this ConfirmTermDepositResult.
     * 
     * @param confirmTermDeposit
     */
    public void setConfirmTermDeposit(org.tempuri.ConfirmTermDeposit confirmTermDeposit) {
        this.confirmTermDeposit = confirmTermDeposit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmTermDepositResult)) return false;
        ConfirmTermDepositResult other = (ConfirmTermDepositResult) obj;
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
            ((this.confirmTermDeposit==null && other.getConfirmTermDeposit()==null) || 
             (this.confirmTermDeposit!=null &&
              this.confirmTermDeposit.equals(other.getConfirmTermDeposit())));
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
        if (getConfirmTermDeposit() != null) {
            _hashCode += getConfirmTermDeposit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmTermDepositResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmTermDepositResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmTermDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmTermDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmTermDeposit"));
        elemField.setMinOccurs(0);
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
