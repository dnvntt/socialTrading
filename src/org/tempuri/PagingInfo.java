/**
 * PagingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PagingInfo  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private int offsetNumber;

    private int totalItem;

    private int currentIndex;

    public PagingInfo() {
    }

    public PagingInfo(
           int offsetNumber,
           int totalItem,
           int currentIndex) {
        this.offsetNumber = offsetNumber;
        this.totalItem = totalItem;
        this.currentIndex = currentIndex;
    }


    /**
     * Gets the offsetNumber value for this PagingInfo.
     * 
     * @return offsetNumber
     */
    public int getOffsetNumber() {
        return offsetNumber;
    }


    /**
     * Sets the offsetNumber value for this PagingInfo.
     * 
     * @param offsetNumber
     */
    public void setOffsetNumber(int offsetNumber) {
        this.offsetNumber = offsetNumber;
    }


    /**
     * Gets the totalItem value for this PagingInfo.
     * 
     * @return totalItem
     */
    public int getTotalItem() {
        return totalItem;
    }


    /**
     * Sets the totalItem value for this PagingInfo.
     * 
     * @param totalItem
     */
    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }


    /**
     * Gets the currentIndex value for this PagingInfo.
     * 
     * @return currentIndex
     */
    public int getCurrentIndex() {
        return currentIndex;
    }


    /**
     * Sets the currentIndex value for this PagingInfo.
     * 
     * @param currentIndex
     */
    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagingInfo)) return false;
        PagingInfo other = (PagingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.offsetNumber == other.getOffsetNumber() &&
            this.totalItem == other.getTotalItem() &&
            this.currentIndex == other.getCurrentIndex();
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
        _hashCode += getOffsetNumber();
        _hashCode += getTotalItem();
        _hashCode += getCurrentIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PagingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offsetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OffsetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TotalItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CurrentIndex"));
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
