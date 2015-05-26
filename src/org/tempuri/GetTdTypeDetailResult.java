/**
 * GetTdTypeDetailResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTdTypeDetailResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.TDTypeDetail getTdTypeDetail;

    public GetTdTypeDetailResult() {
    }

    public GetTdTypeDetailResult(
           org.tempuri.MessageStatus status,
           org.tempuri.TDTypeDetail getTdTypeDetail) {
        this.status = status;
        this.getTdTypeDetail = getTdTypeDetail;
    }


    /**
     * Gets the status value for this GetTdTypeDetailResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetTdTypeDetailResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the getTdTypeDetail value for this GetTdTypeDetailResult.
     * 
     * @return getTdTypeDetail
     */
    public org.tempuri.TDTypeDetail getGetTdTypeDetail() {
        return getTdTypeDetail;
    }


    /**
     * Sets the getTdTypeDetail value for this GetTdTypeDetailResult.
     * 
     * @param getTdTypeDetail
     */
    public void setGetTdTypeDetail(org.tempuri.TDTypeDetail getTdTypeDetail) {
        this.getTdTypeDetail = getTdTypeDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTdTypeDetailResult)) return false;
        GetTdTypeDetailResult other = (GetTdTypeDetailResult) obj;
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
            ((this.getTdTypeDetail==null && other.getGetTdTypeDetail()==null) || 
             (this.getTdTypeDetail!=null &&
              this.getTdTypeDetail.equals(other.getGetTdTypeDetail())));
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
        if (getGetTdTypeDetail() != null) {
            _hashCode += getGetTdTypeDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTdTypeDetailResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetTdTypeDetailResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTdTypeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "GetTdTypeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDTypeDetail"));
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
