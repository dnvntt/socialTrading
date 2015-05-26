/**
 * IssuerDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IssuerDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String codeID;

    private java.lang.String roleCD;

    public IssuerDetail() {
    }

    public IssuerDetail(
           java.lang.String codeID,
           java.lang.String roleCD) {
        this.codeID = codeID;
        this.roleCD = roleCD;
    }


    /**
     * Gets the codeID value for this IssuerDetail.
     * 
     * @return codeID
     */
    public java.lang.String getCodeID() {
        return codeID;
    }


    /**
     * Sets the codeID value for this IssuerDetail.
     * 
     * @param codeID
     */
    public void setCodeID(java.lang.String codeID) {
        this.codeID = codeID;
    }


    /**
     * Gets the roleCD value for this IssuerDetail.
     * 
     * @return roleCD
     */
    public java.lang.String getRoleCD() {
        return roleCD;
    }


    /**
     * Sets the roleCD value for this IssuerDetail.
     * 
     * @param roleCD
     */
    public void setRoleCD(java.lang.String roleCD) {
        this.roleCD = roleCD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssuerDetail)) return false;
        IssuerDetail other = (IssuerDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codeID==null && other.getCodeID()==null) || 
             (this.codeID!=null &&
              this.codeID.equals(other.getCodeID()))) &&
            ((this.roleCD==null && other.getRoleCD()==null) || 
             (this.roleCD!=null &&
              this.roleCD.equals(other.getRoleCD())));
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
        if (getCodeID() != null) {
            _hashCode += getCodeID().hashCode();
        }
        if (getRoleCD() != null) {
            _hashCode += getRoleCD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssuerDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "IssuerDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RoleCD"));
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
