/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Account  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String accountType;

    private double cashAvailable;

    private java.lang.String custodialCode;

    private double netAccountValue;

    private boolean OTCStock;

    private java.lang.String userFullName;

    private java.lang.String userID;

    private double purchasePower;

    private java.lang.String contractType;

    private java.lang.String isMarginContract;

    private java.lang.String isPPSEMargin;

    private double realMoney;

    private double secureRatio;

    private java.lang.String isWithdrawable;

    private java.lang.String customerType;

    private org.tempuri.IssuerDetail[] issuerDetail;

    public Account() {
    }

    public Account(
           java.lang.String accountNumber,
           java.lang.String accountType,
           double cashAvailable,
           java.lang.String custodialCode,
           double netAccountValue,
           boolean OTCStock,
           java.lang.String userFullName,
           java.lang.String userID,
           double purchasePower,
           java.lang.String contractType,
           java.lang.String isMarginContract,
           java.lang.String isPPSEMargin,
           double realMoney,
           double secureRatio,
           java.lang.String isWithdrawable,
           java.lang.String customerType,
           org.tempuri.IssuerDetail[] issuerDetail) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.cashAvailable = cashAvailable;
        this.custodialCode = custodialCode;
        this.netAccountValue = netAccountValue;
        this.OTCStock = OTCStock;
        this.userFullName = userFullName;
        this.userID = userID;
        this.purchasePower = purchasePower;
        this.contractType = contractType;
        this.isMarginContract = isMarginContract;
        this.isPPSEMargin = isPPSEMargin;
        this.realMoney = realMoney;
        this.secureRatio = secureRatio;
        this.isWithdrawable = isWithdrawable;
        this.customerType = customerType;
        this.issuerDetail = issuerDetail;
    }


    /**
     * Gets the accountNumber value for this Account.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Account.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountType value for this Account.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this Account.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the cashAvailable value for this Account.
     * 
     * @return cashAvailable
     */
    public double getCashAvailable() {
        return cashAvailable;
    }


    /**
     * Sets the cashAvailable value for this Account.
     * 
     * @param cashAvailable
     */
    public void setCashAvailable(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }


    /**
     * Gets the custodialCode value for this Account.
     * 
     * @return custodialCode
     */
    public java.lang.String getCustodialCode() {
        return custodialCode;
    }


    /**
     * Sets the custodialCode value for this Account.
     * 
     * @param custodialCode
     */
    public void setCustodialCode(java.lang.String custodialCode) {
        this.custodialCode = custodialCode;
    }


    /**
     * Gets the netAccountValue value for this Account.
     * 
     * @return netAccountValue
     */
    public double getNetAccountValue() {
        return netAccountValue;
    }


    /**
     * Sets the netAccountValue value for this Account.
     * 
     * @param netAccountValue
     */
    public void setNetAccountValue(double netAccountValue) {
        this.netAccountValue = netAccountValue;
    }


    /**
     * Gets the OTCStock value for this Account.
     * 
     * @return OTCStock
     */
    public boolean isOTCStock() {
        return OTCStock;
    }


    /**
     * Sets the OTCStock value for this Account.
     * 
     * @param OTCStock
     */
    public void setOTCStock(boolean OTCStock) {
        this.OTCStock = OTCStock;
    }


    /**
     * Gets the userFullName value for this Account.
     * 
     * @return userFullName
     */
    public java.lang.String getUserFullName() {
        return userFullName;
    }


    /**
     * Sets the userFullName value for this Account.
     * 
     * @param userFullName
     */
    public void setUserFullName(java.lang.String userFullName) {
        this.userFullName = userFullName;
    }


    /**
     * Gets the userID value for this Account.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Account.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the purchasePower value for this Account.
     * 
     * @return purchasePower
     */
    public double getPurchasePower() {
        return purchasePower;
    }


    /**
     * Sets the purchasePower value for this Account.
     * 
     * @param purchasePower
     */
    public void setPurchasePower(double purchasePower) {
        this.purchasePower = purchasePower;
    }


    /**
     * Gets the contractType value for this Account.
     * 
     * @return contractType
     */
    public java.lang.String getContractType() {
        return contractType;
    }


    /**
     * Sets the contractType value for this Account.
     * 
     * @param contractType
     */
    public void setContractType(java.lang.String contractType) {
        this.contractType = contractType;
    }


    /**
     * Gets the isMarginContract value for this Account.
     * 
     * @return isMarginContract
     */
    public java.lang.String getIsMarginContract() {
        return isMarginContract;
    }


    /**
     * Sets the isMarginContract value for this Account.
     * 
     * @param isMarginContract
     */
    public void setIsMarginContract(java.lang.String isMarginContract) {
        this.isMarginContract = isMarginContract;
    }


    /**
     * Gets the isPPSEMargin value for this Account.
     * 
     * @return isPPSEMargin
     */
    public java.lang.String getIsPPSEMargin() {
        return isPPSEMargin;
    }


    /**
     * Sets the isPPSEMargin value for this Account.
     * 
     * @param isPPSEMargin
     */
    public void setIsPPSEMargin(java.lang.String isPPSEMargin) {
        this.isPPSEMargin = isPPSEMargin;
    }


    /**
     * Gets the realMoney value for this Account.
     * 
     * @return realMoney
     */
    public double getRealMoney() {
        return realMoney;
    }


    /**
     * Sets the realMoney value for this Account.
     * 
     * @param realMoney
     */
    public void setRealMoney(double realMoney) {
        this.realMoney = realMoney;
    }


    /**
     * Gets the secureRatio value for this Account.
     * 
     * @return secureRatio
     */
    public double getSecureRatio() {
        return secureRatio;
    }


    /**
     * Sets the secureRatio value for this Account.
     * 
     * @param secureRatio
     */
    public void setSecureRatio(double secureRatio) {
        this.secureRatio = secureRatio;
    }


    /**
     * Gets the isWithdrawable value for this Account.
     * 
     * @return isWithdrawable
     */
    public java.lang.String getIsWithdrawable() {
        return isWithdrawable;
    }


    /**
     * Sets the isWithdrawable value for this Account.
     * 
     * @param isWithdrawable
     */
    public void setIsWithdrawable(java.lang.String isWithdrawable) {
        this.isWithdrawable = isWithdrawable;
    }


    /**
     * Gets the customerType value for this Account.
     * 
     * @return customerType
     */
    public java.lang.String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this Account.
     * 
     * @param customerType
     */
    public void setCustomerType(java.lang.String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the issuerDetail value for this Account.
     * 
     * @return issuerDetail
     */
    public org.tempuri.IssuerDetail[] getIssuerDetail() {
        return issuerDetail;
    }


    /**
     * Sets the issuerDetail value for this Account.
     * 
     * @param issuerDetail
     */
    public void setIssuerDetail(org.tempuri.IssuerDetail[] issuerDetail) {
        this.issuerDetail = issuerDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            this.cashAvailable == other.getCashAvailable() &&
            ((this.custodialCode==null && other.getCustodialCode()==null) || 
             (this.custodialCode!=null &&
              this.custodialCode.equals(other.getCustodialCode()))) &&
            this.netAccountValue == other.getNetAccountValue() &&
            this.OTCStock == other.isOTCStock() &&
            ((this.userFullName==null && other.getUserFullName()==null) || 
             (this.userFullName!=null &&
              this.userFullName.equals(other.getUserFullName()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            this.purchasePower == other.getPurchasePower() &&
            ((this.contractType==null && other.getContractType()==null) || 
             (this.contractType!=null &&
              this.contractType.equals(other.getContractType()))) &&
            ((this.isMarginContract==null && other.getIsMarginContract()==null) || 
             (this.isMarginContract!=null &&
              this.isMarginContract.equals(other.getIsMarginContract()))) &&
            ((this.isPPSEMargin==null && other.getIsPPSEMargin()==null) || 
             (this.isPPSEMargin!=null &&
              this.isPPSEMargin.equals(other.getIsPPSEMargin()))) &&
            this.realMoney == other.getRealMoney() &&
            this.secureRatio == other.getSecureRatio() &&
            ((this.isWithdrawable==null && other.getIsWithdrawable()==null) || 
             (this.isWithdrawable!=null &&
              this.isWithdrawable.equals(other.getIsWithdrawable()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.issuerDetail==null && other.getIssuerDetail()==null) || 
             (this.issuerDetail!=null &&
              java.util.Arrays.equals(this.issuerDetail, other.getIssuerDetail())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        _hashCode += new Double(getCashAvailable()).hashCode();
        if (getCustodialCode() != null) {
            _hashCode += getCustodialCode().hashCode();
        }
        _hashCode += new Double(getNetAccountValue()).hashCode();
        _hashCode += (isOTCStock() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUserFullName() != null) {
            _hashCode += getUserFullName().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        _hashCode += new Double(getPurchasePower()).hashCode();
        if (getContractType() != null) {
            _hashCode += getContractType().hashCode();
        }
        if (getIsMarginContract() != null) {
            _hashCode += getIsMarginContract().hashCode();
        }
        if (getIsPPSEMargin() != null) {
            _hashCode += getIsPPSEMargin().hashCode();
        }
        _hashCode += new Double(getRealMoney()).hashCode();
        _hashCode += new Double(getSecureRatio()).hashCode();
        if (getIsWithdrawable() != null) {
            _hashCode += getIsWithdrawable().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getIssuerDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssuerDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssuerDetail(), i);
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
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CashAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custodialCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CustodialCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAccountValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "NetAccountValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTCStock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OTCStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "UserFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePower");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PurchasePower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ContractType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMarginContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IsMarginContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPPSEMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IsPPSEMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RealMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SecureRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWithdrawable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IsWithdrawable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IssuerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "IssuerDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "IssuerDetail"));
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
