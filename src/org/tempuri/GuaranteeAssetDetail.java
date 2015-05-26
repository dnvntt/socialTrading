/**
 * GuaranteeAssetDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GuaranteeAssetDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String afAcctno;

    private org.tempuri.GuaranteeAssetItem[] guaranteeList;

    private double totalValue;

    public GuaranteeAssetDetail() {
    }

    public GuaranteeAssetDetail(
           java.lang.String afAcctno,
           org.tempuri.GuaranteeAssetItem[] guaranteeList,
           double totalValue) {
        this.afAcctno = afAcctno;
        this.guaranteeList = guaranteeList;
        this.totalValue = totalValue;
    }


    /**
     * Gets the afAcctno value for this GuaranteeAssetDetail.
     * 
     * @return afAcctno
     */
    public java.lang.String getAfAcctno() {
        return afAcctno;
    }


    /**
     * Sets the afAcctno value for this GuaranteeAssetDetail.
     * 
     * @param afAcctno
     */
    public void setAfAcctno(java.lang.String afAcctno) {
        this.afAcctno = afAcctno;
    }


    /**
     * Gets the guaranteeList value for this GuaranteeAssetDetail.
     * 
     * @return guaranteeList
     */
    public org.tempuri.GuaranteeAssetItem[] getGuaranteeList() {
        return guaranteeList;
    }


    /**
     * Sets the guaranteeList value for this GuaranteeAssetDetail.
     * 
     * @param guaranteeList
     */
    public void setGuaranteeList(org.tempuri.GuaranteeAssetItem[] guaranteeList) {
        this.guaranteeList = guaranteeList;
    }


    /**
     * Gets the totalValue value for this GuaranteeAssetDetail.
     * 
     * @return totalValue
     */
    public double getTotalValue() {
        return totalValue;
    }


    /**
     * Sets the totalValue value for this GuaranteeAssetDetail.
     * 
     * @param totalValue
     */
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuaranteeAssetDetail)) return false;
        GuaranteeAssetDetail other = (GuaranteeAssetDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.afAcctno==null && other.getAfAcctno()==null) || 
             (this.afAcctno!=null &&
              this.afAcctno.equals(other.getAfAcctno()))) &&
            ((this.guaranteeList==null && other.getGuaranteeList()==null) || 
             (this.guaranteeList!=null &&
              java.util.Arrays.equals(this.guaranteeList, other.getGuaranteeList()))) &&
            this.totalValue == other.getTotalValue();
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
        if (getAfAcctno() != null) {
            _hashCode += getAfAcctno().hashCode();
        }
        if (getGuaranteeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuaranteeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuaranteeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getTotalValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuaranteeAssetDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afAcctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AfAcctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TotalValue"));
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
