/**
 * TDEOD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TDEOD  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String ACCTNO;

    private java.util.Calendar TODATE;

    private double BALANCE;

    public TDEOD() {
    }

    public TDEOD(
           java.lang.String ACCTNO,
           java.util.Calendar TODATE,
           double BALANCE) {
        this.ACCTNO = ACCTNO;
        this.TODATE = TODATE;
        this.BALANCE = BALANCE;
    }


    /**
     * Gets the ACCTNO value for this TDEOD.
     * 
     * @return ACCTNO
     */
    public java.lang.String getACCTNO() {
        return ACCTNO;
    }


    /**
     * Sets the ACCTNO value for this TDEOD.
     * 
     * @param ACCTNO
     */
    public void setACCTNO(java.lang.String ACCTNO) {
        this.ACCTNO = ACCTNO;
    }


    /**
     * Gets the TODATE value for this TDEOD.
     * 
     * @return TODATE
     */
    public java.util.Calendar getTODATE() {
        return TODATE;
    }


    /**
     * Sets the TODATE value for this TDEOD.
     * 
     * @param TODATE
     */
    public void setTODATE(java.util.Calendar TODATE) {
        this.TODATE = TODATE;
    }


    /**
     * Gets the BALANCE value for this TDEOD.
     * 
     * @return BALANCE
     */
    public double getBALANCE() {
        return BALANCE;
    }


    /**
     * Sets the BALANCE value for this TDEOD.
     * 
     * @param BALANCE
     */
    public void setBALANCE(double BALANCE) {
        this.BALANCE = BALANCE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDEOD)) return false;
        TDEOD other = (TDEOD) obj;
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
            ((this.TODATE==null && other.getTODATE()==null) || 
             (this.TODATE!=null &&
              this.TODATE.equals(other.getTODATE()))) &&
            this.BALANCE == other.getBALANCE();
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
        if (getTODATE() != null) {
            _hashCode += getTODATE().hashCode();
        }
        _hashCode += new Double(getBALANCE()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDEOD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDEOD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ACCTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TODATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TODATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BALANCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BALANCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
