/**
 * AccountLoanLimitDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AccountLoanLimitDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String afAcctNo;

    private java.lang.String fullName;

    private double loanLimitAmount;

    private double clearingAmount;

    private double rtt;

    private double guaranteeAssetValue;

    private double actualBalance;

    private double mustPayValue;

    private double accountRtt;

    public AccountLoanLimitDetail() {
    }

    public AccountLoanLimitDetail(
           java.lang.String afAcctNo,
           java.lang.String fullName,
           double loanLimitAmount,
           double clearingAmount,
           double rtt,
           double guaranteeAssetValue,
           double actualBalance,
           double mustPayValue,
           double accountRtt) {
        this.afAcctNo = afAcctNo;
        this.fullName = fullName;
        this.loanLimitAmount = loanLimitAmount;
        this.clearingAmount = clearingAmount;
        this.rtt = rtt;
        this.guaranteeAssetValue = guaranteeAssetValue;
        this.actualBalance = actualBalance;
        this.mustPayValue = mustPayValue;
        this.accountRtt = accountRtt;
    }


    /**
     * Gets the afAcctNo value for this AccountLoanLimitDetail.
     * 
     * @return afAcctNo
     */
    public java.lang.String getAfAcctNo() {
        return afAcctNo;
    }


    /**
     * Sets the afAcctNo value for this AccountLoanLimitDetail.
     * 
     * @param afAcctNo
     */
    public void setAfAcctNo(java.lang.String afAcctNo) {
        this.afAcctNo = afAcctNo;
    }


    /**
     * Gets the fullName value for this AccountLoanLimitDetail.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this AccountLoanLimitDetail.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the loanLimitAmount value for this AccountLoanLimitDetail.
     * 
     * @return loanLimitAmount
     */
    public double getLoanLimitAmount() {
        return loanLimitAmount;
    }


    /**
     * Sets the loanLimitAmount value for this AccountLoanLimitDetail.
     * 
     * @param loanLimitAmount
     */
    public void setLoanLimitAmount(double loanLimitAmount) {
        this.loanLimitAmount = loanLimitAmount;
    }


    /**
     * Gets the clearingAmount value for this AccountLoanLimitDetail.
     * 
     * @return clearingAmount
     */
    public double getClearingAmount() {
        return clearingAmount;
    }


    /**
     * Sets the clearingAmount value for this AccountLoanLimitDetail.
     * 
     * @param clearingAmount
     */
    public void setClearingAmount(double clearingAmount) {
        this.clearingAmount = clearingAmount;
    }


    /**
     * Gets the rtt value for this AccountLoanLimitDetail.
     * 
     * @return rtt
     */
    public double getRtt() {
        return rtt;
    }


    /**
     * Sets the rtt value for this AccountLoanLimitDetail.
     * 
     * @param rtt
     */
    public void setRtt(double rtt) {
        this.rtt = rtt;
    }


    /**
     * Gets the guaranteeAssetValue value for this AccountLoanLimitDetail.
     * 
     * @return guaranteeAssetValue
     */
    public double getGuaranteeAssetValue() {
        return guaranteeAssetValue;
    }


    /**
     * Sets the guaranteeAssetValue value for this AccountLoanLimitDetail.
     * 
     * @param guaranteeAssetValue
     */
    public void setGuaranteeAssetValue(double guaranteeAssetValue) {
        this.guaranteeAssetValue = guaranteeAssetValue;
    }


    /**
     * Gets the actualBalance value for this AccountLoanLimitDetail.
     * 
     * @return actualBalance
     */
    public double getActualBalance() {
        return actualBalance;
    }


    /**
     * Sets the actualBalance value for this AccountLoanLimitDetail.
     * 
     * @param actualBalance
     */
    public void setActualBalance(double actualBalance) {
        this.actualBalance = actualBalance;
    }


    /**
     * Gets the mustPayValue value for this AccountLoanLimitDetail.
     * 
     * @return mustPayValue
     */
    public double getMustPayValue() {
        return mustPayValue;
    }


    /**
     * Sets the mustPayValue value for this AccountLoanLimitDetail.
     * 
     * @param mustPayValue
     */
    public void setMustPayValue(double mustPayValue) {
        this.mustPayValue = mustPayValue;
    }


    /**
     * Gets the accountRtt value for this AccountLoanLimitDetail.
     * 
     * @return accountRtt
     */
    public double getAccountRtt() {
        return accountRtt;
    }


    /**
     * Sets the accountRtt value for this AccountLoanLimitDetail.
     * 
     * @param accountRtt
     */
    public void setAccountRtt(double accountRtt) {
        this.accountRtt = accountRtt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountLoanLimitDetail)) return false;
        AccountLoanLimitDetail other = (AccountLoanLimitDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.afAcctNo==null && other.getAfAcctNo()==null) || 
             (this.afAcctNo!=null &&
              this.afAcctNo.equals(other.getAfAcctNo()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            this.loanLimitAmount == other.getLoanLimitAmount() &&
            this.clearingAmount == other.getClearingAmount() &&
            this.rtt == other.getRtt() &&
            this.guaranteeAssetValue == other.getGuaranteeAssetValue() &&
            this.actualBalance == other.getActualBalance() &&
            this.mustPayValue == other.getMustPayValue() &&
            this.accountRtt == other.getAccountRtt();
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
        if (getAfAcctNo() != null) {
            _hashCode += getAfAcctNo().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        _hashCode += new Double(getLoanLimitAmount()).hashCode();
        _hashCode += new Double(getClearingAmount()).hashCode();
        _hashCode += new Double(getRtt()).hashCode();
        _hashCode += new Double(getGuaranteeAssetValue()).hashCode();
        _hashCode += new Double(getActualBalance()).hashCode();
        _hashCode += new Double(getMustPayValue()).hashCode();
        _hashCode += new Double(getAccountRtt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountLoanLimitDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AccountLoanLimitDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afAcctNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AfAcctNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanLimitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "LoanLimitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ClearingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Rtt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeAssetValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ActualBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mustPayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MustPayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountRtt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountRtt"));
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
