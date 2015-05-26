/**
 * GetSecMarginInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSecMarginInfoResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.SecMargin getSecMarginInfo;

    public GetSecMarginInfoResult() {
    }

    public GetSecMarginInfoResult(
           org.tempuri.MessageStatus status,
           org.tempuri.SecMargin getSecMarginInfo) {
        this.status = status;
        this.getSecMarginInfo = getSecMarginInfo;
    }


    /**
     * Gets the status value for this GetSecMarginInfoResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetSecMarginInfoResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the getSecMarginInfo value for this GetSecMarginInfoResult.
     * 
     * @return getSecMarginInfo
     */
    public org.tempuri.SecMargin getGetSecMarginInfo() {
        return getSecMarginInfo;
    }


    /**
     * Sets the getSecMarginInfo value for this GetSecMarginInfoResult.
     * 
     * @param getSecMarginInfo
     */
    public void setGetSecMarginInfo(org.tempuri.SecMargin getSecMarginInfo) {
        this.getSecMarginInfo = getSecMarginInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSecMarginInfoResult)) return false;
        GetSecMarginInfoResult other = (GetSecMarginInfoResult) obj;
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
            ((this.getSecMarginInfo==null && other.getGetSecMarginInfo()==null) || 
             (this.getSecMarginInfo!=null &&
              this.getSecMarginInfo.equals(other.getGetSecMarginInfo())));
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
        if (getGetSecMarginInfo() != null) {
            _hashCode += getGetSecMarginInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSecMarginInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetSecMarginInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSecMarginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "GetSecMarginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SecMargin"));
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
