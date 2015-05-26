/**
 * TDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TDType  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String ACType;

    private java.lang.String TDName;

    public TDType() {
    }

    public TDType(
           java.lang.String ACType,
           java.lang.String TDName) {
        this.ACType = ACType;
        this.TDName = TDName;
    }


    /**
     * Gets the ACType value for this TDType.
     * 
     * @return ACType
     */
    public java.lang.String getACType() {
        return ACType;
    }


    /**
     * Sets the ACType value for this TDType.
     * 
     * @param ACType
     */
    public void setACType(java.lang.String ACType) {
        this.ACType = ACType;
    }


    /**
     * Gets the TDName value for this TDType.
     * 
     * @return TDName
     */
    public java.lang.String getTDName() {
        return TDName;
    }


    /**
     * Sets the TDName value for this TDType.
     * 
     * @param TDName
     */
    public void setTDName(java.lang.String TDName) {
        this.TDName = TDName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDType)) return false;
        TDType other = (TDType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ACType==null && other.getACType()==null) || 
             (this.ACType!=null &&
              this.ACType.equals(other.getACType()))) &&
            ((this.TDName==null && other.getTDName()==null) || 
             (this.TDName!=null &&
              this.TDName.equals(other.getTDName())));
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
        if (getACType() != null) {
            _hashCode += getACType().hashCode();
        }
        if (getTDName() != null) {
            _hashCode += getTDName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ACType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TDName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TDName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
