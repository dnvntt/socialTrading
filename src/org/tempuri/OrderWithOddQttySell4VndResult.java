/**
 * OrderWithOddQttySell4VndResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderWithOddQttySell4VndResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.OddQttyOrderSell4Vnd oddQttyOrderSell4Vnd;

    public OrderWithOddQttySell4VndResult() {
    }

    public OrderWithOddQttySell4VndResult(
           org.tempuri.MessageStatus status,
           org.tempuri.OddQttyOrderSell4Vnd oddQttyOrderSell4Vnd) {
        this.status = status;
        this.oddQttyOrderSell4Vnd = oddQttyOrderSell4Vnd;
    }


    /**
     * Gets the status value for this OrderWithOddQttySell4VndResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderWithOddQttySell4VndResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the oddQttyOrderSell4Vnd value for this OrderWithOddQttySell4VndResult.
     * 
     * @return oddQttyOrderSell4Vnd
     */
    public org.tempuri.OddQttyOrderSell4Vnd getOddQttyOrderSell4Vnd() {
        return oddQttyOrderSell4Vnd;
    }


    /**
     * Sets the oddQttyOrderSell4Vnd value for this OrderWithOddQttySell4VndResult.
     * 
     * @param oddQttyOrderSell4Vnd
     */
    public void setOddQttyOrderSell4Vnd(org.tempuri.OddQttyOrderSell4Vnd oddQttyOrderSell4Vnd) {
        this.oddQttyOrderSell4Vnd = oddQttyOrderSell4Vnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderWithOddQttySell4VndResult)) return false;
        OrderWithOddQttySell4VndResult other = (OrderWithOddQttySell4VndResult) obj;
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
            ((this.oddQttyOrderSell4Vnd==null && other.getOddQttyOrderSell4Vnd()==null) || 
             (this.oddQttyOrderSell4Vnd!=null &&
              this.oddQttyOrderSell4Vnd.equals(other.getOddQttyOrderSell4Vnd())));
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
        if (getOddQttyOrderSell4Vnd() != null) {
            _hashCode += getOddQttyOrderSell4Vnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderWithOddQttySell4VndResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderWithOddQttySell4vndResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oddQttyOrderSell4Vnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrderSell4vnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrderSell4vnd"));
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
