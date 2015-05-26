/**
 * GetMarginContractInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMarginContractInfoResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private java.util.Calendar nextWorkDate;

    private org.tempuri.MessageStatus[] marginCallMessage;

    private org.tempuri.MarginContractInfo[] marginContractInfoList;

    private org.tempuri.GuaranteeAssetDetail[] marginAssetList;

    private org.tempuri.AccountLoanLimitDetail[] loanLimitList;

    public GetMarginContractInfoResult() {
    }

    public GetMarginContractInfoResult(
           org.tempuri.MessageStatus status,
           java.util.Calendar nextWorkDate,
           org.tempuri.MessageStatus[] marginCallMessage,
           org.tempuri.MarginContractInfo[] marginContractInfoList,
           org.tempuri.GuaranteeAssetDetail[] marginAssetList,
           org.tempuri.AccountLoanLimitDetail[] loanLimitList) {
        this.status = status;
        this.nextWorkDate = nextWorkDate;
        this.marginCallMessage = marginCallMessage;
        this.marginContractInfoList = marginContractInfoList;
        this.marginAssetList = marginAssetList;
        this.loanLimitList = loanLimitList;
    }


    /**
     * Gets the status value for this GetMarginContractInfoResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetMarginContractInfoResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the nextWorkDate value for this GetMarginContractInfoResult.
     * 
     * @return nextWorkDate
     */
    public java.util.Calendar getNextWorkDate() {
        return nextWorkDate;
    }


    /**
     * Sets the nextWorkDate value for this GetMarginContractInfoResult.
     * 
     * @param nextWorkDate
     */
    public void setNextWorkDate(java.util.Calendar nextWorkDate) {
        this.nextWorkDate = nextWorkDate;
    }


    /**
     * Gets the marginCallMessage value for this GetMarginContractInfoResult.
     * 
     * @return marginCallMessage
     */
    public org.tempuri.MessageStatus[] getMarginCallMessage() {
        return marginCallMessage;
    }


    /**
     * Sets the marginCallMessage value for this GetMarginContractInfoResult.
     * 
     * @param marginCallMessage
     */
    public void setMarginCallMessage(org.tempuri.MessageStatus[] marginCallMessage) {
        this.marginCallMessage = marginCallMessage;
    }


    /**
     * Gets the marginContractInfoList value for this GetMarginContractInfoResult.
     * 
     * @return marginContractInfoList
     */
    public org.tempuri.MarginContractInfo[] getMarginContractInfoList() {
        return marginContractInfoList;
    }


    /**
     * Sets the marginContractInfoList value for this GetMarginContractInfoResult.
     * 
     * @param marginContractInfoList
     */
    public void setMarginContractInfoList(org.tempuri.MarginContractInfo[] marginContractInfoList) {
        this.marginContractInfoList = marginContractInfoList;
    }


    /**
     * Gets the marginAssetList value for this GetMarginContractInfoResult.
     * 
     * @return marginAssetList
     */
    public org.tempuri.GuaranteeAssetDetail[] getMarginAssetList() {
        return marginAssetList;
    }


    /**
     * Sets the marginAssetList value for this GetMarginContractInfoResult.
     * 
     * @param marginAssetList
     */
    public void setMarginAssetList(org.tempuri.GuaranteeAssetDetail[] marginAssetList) {
        this.marginAssetList = marginAssetList;
    }


    /**
     * Gets the loanLimitList value for this GetMarginContractInfoResult.
     * 
     * @return loanLimitList
     */
    public org.tempuri.AccountLoanLimitDetail[] getLoanLimitList() {
        return loanLimitList;
    }


    /**
     * Sets the loanLimitList value for this GetMarginContractInfoResult.
     * 
     * @param loanLimitList
     */
    public void setLoanLimitList(org.tempuri.AccountLoanLimitDetail[] loanLimitList) {
        this.loanLimitList = loanLimitList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMarginContractInfoResult)) return false;
        GetMarginContractInfoResult other = (GetMarginContractInfoResult) obj;
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
            ((this.nextWorkDate==null && other.getNextWorkDate()==null) || 
             (this.nextWorkDate!=null &&
              this.nextWorkDate.equals(other.getNextWorkDate()))) &&
            ((this.marginCallMessage==null && other.getMarginCallMessage()==null) || 
             (this.marginCallMessage!=null &&
              java.util.Arrays.equals(this.marginCallMessage, other.getMarginCallMessage()))) &&
            ((this.marginContractInfoList==null && other.getMarginContractInfoList()==null) || 
             (this.marginContractInfoList!=null &&
              java.util.Arrays.equals(this.marginContractInfoList, other.getMarginContractInfoList()))) &&
            ((this.marginAssetList==null && other.getMarginAssetList()==null) || 
             (this.marginAssetList!=null &&
              java.util.Arrays.equals(this.marginAssetList, other.getMarginAssetList()))) &&
            ((this.loanLimitList==null && other.getLoanLimitList()==null) || 
             (this.loanLimitList!=null &&
              java.util.Arrays.equals(this.loanLimitList, other.getLoanLimitList())));
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
        if (getNextWorkDate() != null) {
            _hashCode += getNextWorkDate().hashCode();
        }
        if (getMarginCallMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarginCallMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarginCallMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarginContractInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarginContractInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarginContractInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarginAssetList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarginAssetList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarginAssetList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanLimitList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoanLimitList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoanLimitList(), i);
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
        new org.apache.axis.description.TypeDesc(GetMarginContractInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetMarginContractInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextWorkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "NextWorkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginCallMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MarginCallMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginContractInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MarginContractInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MarginContractInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "MarginContractInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginAssetList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MarginAssetList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanLimitList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "LoanLimitList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AccountLoanLimitDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "AccountLoanLimitDetail"));
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
