/**
 * GetTdMastListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTdMastListResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.TdMast[] tdMastListCollection;

    public GetTdMastListResult() {
    }

    public GetTdMastListResult(
           org.tempuri.MessageStatus status,
           org.tempuri.TdMast[] tdMastListCollection) {
        this.status = status;
        this.tdMastListCollection = tdMastListCollection;
    }


    /**
     * Gets the status value for this GetTdMastListResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetTdMastListResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the tdMastListCollection value for this GetTdMastListResult.
     * 
     * @return tdMastListCollection
     */
    public org.tempuri.TdMast[] getTdMastListCollection() {
        return tdMastListCollection;
    }


    /**
     * Sets the tdMastListCollection value for this GetTdMastListResult.
     * 
     * @param tdMastListCollection
     */
    public void setTdMastListCollection(org.tempuri.TdMast[] tdMastListCollection) {
        this.tdMastListCollection = tdMastListCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTdMastListResult)) return false;
        GetTdMastListResult other = (GetTdMastListResult) obj;
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
            ((this.tdMastListCollection==null && other.getTdMastListCollection()==null) || 
             (this.tdMastListCollection!=null &&
              java.util.Arrays.equals(this.tdMastListCollection, other.getTdMastListCollection())));
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
        if (getTdMastListCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTdMastListCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTdMastListCollection(), i);
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
        new org.apache.axis.description.TypeDesc(GetTdMastListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetTdMastListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tdMastListCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TdMastListCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TdMast"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "TdMast"));
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
