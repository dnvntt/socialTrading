/**
 * OrderDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.Order orderInfo;

    private org.tempuri.Transaction[] listTransaction;

    public OrderDetail() {
    }

    public OrderDetail(
           org.tempuri.Order orderInfo,
           org.tempuri.Transaction[] listTransaction) {
        this.orderInfo = orderInfo;
        this.listTransaction = listTransaction;
    }


    /**
     * Gets the orderInfo value for this OrderDetail.
     * 
     * @return orderInfo
     */
    public org.tempuri.Order getOrderInfo() {
        return orderInfo;
    }


    /**
     * Sets the orderInfo value for this OrderDetail.
     * 
     * @param orderInfo
     */
    public void setOrderInfo(org.tempuri.Order orderInfo) {
        this.orderInfo = orderInfo;
    }


    /**
     * Gets the listTransaction value for this OrderDetail.
     * 
     * @return listTransaction
     */
    public org.tempuri.Transaction[] getListTransaction() {
        return listTransaction;
    }


    /**
     * Sets the listTransaction value for this OrderDetail.
     * 
     * @param listTransaction
     */
    public void setListTransaction(org.tempuri.Transaction[] listTransaction) {
        this.listTransaction = listTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDetail)) return false;
        OrderDetail other = (OrderDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderInfo==null && other.getOrderInfo()==null) || 
             (this.orderInfo!=null &&
              this.orderInfo.equals(other.getOrderInfo()))) &&
            ((this.listTransaction==null && other.getListTransaction()==null) || 
             (this.listTransaction!=null &&
              java.util.Arrays.equals(this.listTransaction, other.getListTransaction())));
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
        if (getOrderInfo() != null) {
            _hashCode += getOrderInfo().hashCode();
        }
        if (getListTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListTransaction(), i);
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
        new org.apache.axis.description.TypeDesc(OrderDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Order"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ListTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Transaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "Transaction"));
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
