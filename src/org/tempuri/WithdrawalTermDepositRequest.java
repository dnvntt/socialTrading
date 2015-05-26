/**
 * WithdrawalTermDepositRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WithdrawalTermDepositRequest  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String ACCTNO;

    private double WITHDRAWAL;

    public WithdrawalTermDepositRequest() {
    }

    public WithdrawalTermDepositRequest(
           java.lang.String ACCTNO,
           double WITHDRAWAL) {
        this.ACCTNO = ACCTNO;
        this.WITHDRAWAL = WITHDRAWAL;
    }


    /**
     * Gets the ACCTNO value for this WithdrawalTermDepositRequest.
     * 
     * @return ACCTNO
     */
    public java.lang.String getACCTNO() {
        return ACCTNO;
    }


    /**
     * Sets the ACCTNO value for this WithdrawalTermDepositRequest.
     * 
     * @param ACCTNO
     */
    public void setACCTNO(java.lang.String ACCTNO) {
        this.ACCTNO = ACCTNO;
    }


    /**
     * Gets the WITHDRAWAL value for this WithdrawalTermDepositRequest.
     * 
     * @return WITHDRAWAL
     */
    public double getWITHDRAWAL() {
        return WITHDRAWAL;
    }


    /**
     * Sets the WITHDRAWAL value for this WithdrawalTermDepositRequest.
     * 
     * @param WITHDRAWAL
     */
    public void setWITHDRAWAL(double WITHDRAWAL) {
        this.WITHDRAWAL = WITHDRAWAL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WithdrawalTermDepositRequest)) return false;
        WithdrawalTermDepositRequest other = (WithdrawalTermDepositRequest) obj;
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
            this.WITHDRAWAL == other.getWITHDRAWAL();
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
        _hashCode += new Double(getWITHDRAWAL()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WithdrawalTermDepositRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "WithdrawalTermDepositRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ACCTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WITHDRAWAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "WITHDRAWAL"));
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
