/**
 * CustomerID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CustomerID  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String ACCTNO;

    private java.lang.String CUSTID;

    private java.lang.String CUSTTYPE;

    public CustomerID() {
    }

    public CustomerID(
           java.lang.String ACCTNO,
           java.lang.String CUSTID,
           java.lang.String CUSTTYPE) {
        this.ACCTNO = ACCTNO;
        this.CUSTID = CUSTID;
        this.CUSTTYPE = CUSTTYPE;
    }


    /**
     * Gets the ACCTNO value for this CustomerID.
     * 
     * @return ACCTNO
     */
    public java.lang.String getACCTNO() {
        return ACCTNO;
    }


    /**
     * Sets the ACCTNO value for this CustomerID.
     * 
     * @param ACCTNO
     */
    public void setACCTNO(java.lang.String ACCTNO) {
        this.ACCTNO = ACCTNO;
    }


    /**
     * Gets the CUSTID value for this CustomerID.
     * 
     * @return CUSTID
     */
    public java.lang.String getCUSTID() {
        return CUSTID;
    }


    /**
     * Sets the CUSTID value for this CustomerID.
     * 
     * @param CUSTID
     */
    public void setCUSTID(java.lang.String CUSTID) {
        this.CUSTID = CUSTID;
    }


    /**
     * Gets the CUSTTYPE value for this CustomerID.
     * 
     * @return CUSTTYPE
     */
    public java.lang.String getCUSTTYPE() {
        return CUSTTYPE;
    }


    /**
     * Sets the CUSTTYPE value for this CustomerID.
     * 
     * @param CUSTTYPE
     */
    public void setCUSTTYPE(java.lang.String CUSTTYPE) {
        this.CUSTTYPE = CUSTTYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerID)) return false;
        CustomerID other = (CustomerID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ACCTNO==null && other.getACCTNO()==null) || 
             (this.ACCTNO!=null &&
              this.ACCTNO.equals(other.getACCTNO()))) &&
            ((this.CUSTID==null && other.getCUSTID()==null) || 
             (this.CUSTID!=null &&
              this.CUSTID.equals(other.getCUSTID()))) &&
            ((this.CUSTTYPE==null && other.getCUSTTYPE()==null) || 
             (this.CUSTTYPE!=null &&
              this.CUSTTYPE.equals(other.getCUSTTYPE())));
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
        if (getACCTNO() != null) {
            _hashCode += getACCTNO().hashCode();
        }
        if (getCUSTID() != null) {
            _hashCode += getCUSTID().hashCode();
        }
        if (getCUSTTYPE() != null) {
            _hashCode += getCUSTTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "CustomerID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ACCTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CUSTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CUSTTYPE"));
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
