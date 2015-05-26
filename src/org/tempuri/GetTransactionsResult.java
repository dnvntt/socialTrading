/**
 * GetTransactionsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTransactionsResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.PagingInfo searchPagingInfo;

    private org.tempuri.Transaction[] listTransaction;

    private double bodAmount;

    private double eodAmount;

    public GetTransactionsResult() {
    }

    public GetTransactionsResult(
           org.tempuri.MessageStatus status,
           org.tempuri.PagingInfo searchPagingInfo,
           org.tempuri.Transaction[] listTransaction,
           double bodAmount,
           double eodAmount) {
        this.status = status;
        this.searchPagingInfo = searchPagingInfo;
        this.listTransaction = listTransaction;
        this.bodAmount = bodAmount;
        this.eodAmount = eodAmount;
    }


    /**
     * Gets the status value for this GetTransactionsResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetTransactionsResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the searchPagingInfo value for this GetTransactionsResult.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this GetTransactionsResult.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the listTransaction value for this GetTransactionsResult.
     * 
     * @return listTransaction
     */
    public org.tempuri.Transaction[] getListTransaction() {
        return listTransaction;
    }


    /**
     * Sets the listTransaction value for this GetTransactionsResult.
     * 
     * @param listTransaction
     */
    public void setListTransaction(org.tempuri.Transaction[] listTransaction) {
        this.listTransaction = listTransaction;
    }


    /**
     * Gets the bodAmount value for this GetTransactionsResult.
     * 
     * @return bodAmount
     */
    public double getBodAmount() {
        return bodAmount;
    }


    /**
     * Sets the bodAmount value for this GetTransactionsResult.
     * 
     * @param bodAmount
     */
    public void setBodAmount(double bodAmount) {
        this.bodAmount = bodAmount;
    }


    /**
     * Gets the eodAmount value for this GetTransactionsResult.
     * 
     * @return eodAmount
     */
    public double getEodAmount() {
        return eodAmount;
    }


    /**
     * Sets the eodAmount value for this GetTransactionsResult.
     * 
     * @param eodAmount
     */
    public void setEodAmount(double eodAmount) {
        this.eodAmount = eodAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionsResult)) return false;
        GetTransactionsResult other = (GetTransactionsResult) obj;
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
            ((this.searchPagingInfo==null && other.getSearchPagingInfo()==null) || 
             (this.searchPagingInfo!=null &&
              this.searchPagingInfo.equals(other.getSearchPagingInfo()))) &&
            ((this.listTransaction==null && other.getListTransaction()==null) || 
             (this.listTransaction!=null &&
              java.util.Arrays.equals(this.listTransaction, other.getListTransaction()))) &&
            this.bodAmount == other.getBodAmount() &&
            this.eodAmount == other.getEodAmount();
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
        if (getSearchPagingInfo() != null) {
            _hashCode += getSearchPagingInfo().hashCode();
        }
        if (getListTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getBodAmount()).hashCode();
        _hashCode += new Double(getEodAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetTransactionsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SearchPagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PagingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ListTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Transaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "Transaction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BodAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eodAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "EodAmount"));
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
