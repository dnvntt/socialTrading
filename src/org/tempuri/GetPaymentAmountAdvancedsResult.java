/**
 * GetPaymentAmountAdvancedsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentAmountAdvancedsResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.PaymentAmountAdvanced[] listPaymentAmountAdvanced;

    public GetPaymentAmountAdvancedsResult() {
    }

    public GetPaymentAmountAdvancedsResult(
           org.tempuri.MessageStatus status,
           org.tempuri.PaymentAmountAdvanced[] listPaymentAmountAdvanced) {
        this.status = status;
        this.listPaymentAmountAdvanced = listPaymentAmountAdvanced;
    }


    /**
     * Gets the status value for this GetPaymentAmountAdvancedsResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetPaymentAmountAdvancedsResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the listPaymentAmountAdvanced value for this GetPaymentAmountAdvancedsResult.
     * 
     * @return listPaymentAmountAdvanced
     */
    public org.tempuri.PaymentAmountAdvanced[] getListPaymentAmountAdvanced() {
        return listPaymentAmountAdvanced;
    }


    /**
     * Sets the listPaymentAmountAdvanced value for this GetPaymentAmountAdvancedsResult.
     * 
     * @param listPaymentAmountAdvanced
     */
    public void setListPaymentAmountAdvanced(org.tempuri.PaymentAmountAdvanced[] listPaymentAmountAdvanced) {
        this.listPaymentAmountAdvanced = listPaymentAmountAdvanced;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentAmountAdvancedsResult)) return false;
        GetPaymentAmountAdvancedsResult other = (GetPaymentAmountAdvancedsResult) obj;
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
            ((this.listPaymentAmountAdvanced==null && other.getListPaymentAmountAdvanced()==null) || 
             (this.listPaymentAmountAdvanced!=null &&
              java.util.Arrays.equals(this.listPaymentAmountAdvanced, other.getListPaymentAmountAdvanced())));
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
        if (getListPaymentAmountAdvanced() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListPaymentAmountAdvanced());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListPaymentAmountAdvanced(), i);
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
        new org.apache.axis.description.TypeDesc(GetPaymentAmountAdvancedsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetPaymentAmountAdvancedsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPaymentAmountAdvanced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ListPaymentAmountAdvanced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PaymentAmountAdvanced"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "PaymentAmountAdvanced"));
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
