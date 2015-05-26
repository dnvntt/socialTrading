/**
 * DebtAmountReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DebtAmountReport  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String isLeader;

    private double rttMargin;

    private double rttDealFinancing;

    private double rttAccount;

    private double accountAddAmount;

    private org.tempuri.GuaranteeAsset[] guaranteeAssetlist;

    private org.tempuri.DebtUnPaid[] debtUnPaidList;

    private org.tempuri.BalanceAccount[] balanceAccountList;

    private org.tempuri.ReceivingAmount[] receivingAmountList;

    private org.tempuri.DebtLimitAccount[] debtLimitAccountList;

    public DebtAmountReport() {
    }

    public DebtAmountReport(
           java.lang.String isLeader,
           double rttMargin,
           double rttDealFinancing,
           double rttAccount,
           double accountAddAmount,
           org.tempuri.GuaranteeAsset[] guaranteeAssetlist,
           org.tempuri.DebtUnPaid[] debtUnPaidList,
           org.tempuri.BalanceAccount[] balanceAccountList,
           org.tempuri.ReceivingAmount[] receivingAmountList,
           org.tempuri.DebtLimitAccount[] debtLimitAccountList) {
        this.isLeader = isLeader;
        this.rttMargin = rttMargin;
        this.rttDealFinancing = rttDealFinancing;
        this.rttAccount = rttAccount;
        this.accountAddAmount = accountAddAmount;
        this.guaranteeAssetlist = guaranteeAssetlist;
        this.debtUnPaidList = debtUnPaidList;
        this.balanceAccountList = balanceAccountList;
        this.receivingAmountList = receivingAmountList;
        this.debtLimitAccountList = debtLimitAccountList;
    }


    /**
     * Gets the isLeader value for this DebtAmountReport.
     * 
     * @return isLeader
     */
    public java.lang.String getIsLeader() {
        return isLeader;
    }


    /**
     * Sets the isLeader value for this DebtAmountReport.
     * 
     * @param isLeader
     */
    public void setIsLeader(java.lang.String isLeader) {
        this.isLeader = isLeader;
    }


    /**
     * Gets the rttMargin value for this DebtAmountReport.
     * 
     * @return rttMargin
     */
    public double getRttMargin() {
        return rttMargin;
    }


    /**
     * Sets the rttMargin value for this DebtAmountReport.
     * 
     * @param rttMargin
     */
    public void setRttMargin(double rttMargin) {
        this.rttMargin = rttMargin;
    }


    /**
     * Gets the rttDealFinancing value for this DebtAmountReport.
     * 
     * @return rttDealFinancing
     */
    public double getRttDealFinancing() {
        return rttDealFinancing;
    }


    /**
     * Sets the rttDealFinancing value for this DebtAmountReport.
     * 
     * @param rttDealFinancing
     */
    public void setRttDealFinancing(double rttDealFinancing) {
        this.rttDealFinancing = rttDealFinancing;
    }


    /**
     * Gets the rttAccount value for this DebtAmountReport.
     * 
     * @return rttAccount
     */
    public double getRttAccount() {
        return rttAccount;
    }


    /**
     * Sets the rttAccount value for this DebtAmountReport.
     * 
     * @param rttAccount
     */
    public void setRttAccount(double rttAccount) {
        this.rttAccount = rttAccount;
    }


    /**
     * Gets the accountAddAmount value for this DebtAmountReport.
     * 
     * @return accountAddAmount
     */
    public double getAccountAddAmount() {
        return accountAddAmount;
    }


    /**
     * Sets the accountAddAmount value for this DebtAmountReport.
     * 
     * @param accountAddAmount
     */
    public void setAccountAddAmount(double accountAddAmount) {
        this.accountAddAmount = accountAddAmount;
    }


    /**
     * Gets the guaranteeAssetlist value for this DebtAmountReport.
     * 
     * @return guaranteeAssetlist
     */
    public org.tempuri.GuaranteeAsset[] getGuaranteeAssetlist() {
        return guaranteeAssetlist;
    }


    /**
     * Sets the guaranteeAssetlist value for this DebtAmountReport.
     * 
     * @param guaranteeAssetlist
     */
    public void setGuaranteeAssetlist(org.tempuri.GuaranteeAsset[] guaranteeAssetlist) {
        this.guaranteeAssetlist = guaranteeAssetlist;
    }


    /**
     * Gets the debtUnPaidList value for this DebtAmountReport.
     * 
     * @return debtUnPaidList
     */
    public org.tempuri.DebtUnPaid[] getDebtUnPaidList() {
        return debtUnPaidList;
    }


    /**
     * Sets the debtUnPaidList value for this DebtAmountReport.
     * 
     * @param debtUnPaidList
     */
    public void setDebtUnPaidList(org.tempuri.DebtUnPaid[] debtUnPaidList) {
        this.debtUnPaidList = debtUnPaidList;
    }


    /**
     * Gets the balanceAccountList value for this DebtAmountReport.
     * 
     * @return balanceAccountList
     */
    public org.tempuri.BalanceAccount[] getBalanceAccountList() {
        return balanceAccountList;
    }


    /**
     * Sets the balanceAccountList value for this DebtAmountReport.
     * 
     * @param balanceAccountList
     */
    public void setBalanceAccountList(org.tempuri.BalanceAccount[] balanceAccountList) {
        this.balanceAccountList = balanceAccountList;
    }


    /**
     * Gets the receivingAmountList value for this DebtAmountReport.
     * 
     * @return receivingAmountList
     */
    public org.tempuri.ReceivingAmount[] getReceivingAmountList() {
        return receivingAmountList;
    }


    /**
     * Sets the receivingAmountList value for this DebtAmountReport.
     * 
     * @param receivingAmountList
     */
    public void setReceivingAmountList(org.tempuri.ReceivingAmount[] receivingAmountList) {
        this.receivingAmountList = receivingAmountList;
    }


    /**
     * Gets the debtLimitAccountList value for this DebtAmountReport.
     * 
     * @return debtLimitAccountList
     */
    public org.tempuri.DebtLimitAccount[] getDebtLimitAccountList() {
        return debtLimitAccountList;
    }


    /**
     * Sets the debtLimitAccountList value for this DebtAmountReport.
     * 
     * @param debtLimitAccountList
     */
    public void setDebtLimitAccountList(org.tempuri.DebtLimitAccount[] debtLimitAccountList) {
        this.debtLimitAccountList = debtLimitAccountList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebtAmountReport)) return false;
        DebtAmountReport other = (DebtAmountReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isLeader==null && other.getIsLeader()==null) || 
             (this.isLeader!=null &&
              this.isLeader.equals(other.getIsLeader()))) &&
            this.rttMargin == other.getRttMargin() &&
            this.rttDealFinancing == other.getRttDealFinancing() &&
            this.rttAccount == other.getRttAccount() &&
            this.accountAddAmount == other.getAccountAddAmount() &&
            ((this.guaranteeAssetlist==null && other.getGuaranteeAssetlist()==null) || 
             (this.guaranteeAssetlist!=null &&
              java.util.Arrays.equals(this.guaranteeAssetlist, other.getGuaranteeAssetlist()))) &&
            ((this.debtUnPaidList==null && other.getDebtUnPaidList()==null) || 
             (this.debtUnPaidList!=null &&
              java.util.Arrays.equals(this.debtUnPaidList, other.getDebtUnPaidList()))) &&
            ((this.balanceAccountList==null && other.getBalanceAccountList()==null) || 
             (this.balanceAccountList!=null &&
              java.util.Arrays.equals(this.balanceAccountList, other.getBalanceAccountList()))) &&
            ((this.receivingAmountList==null && other.getReceivingAmountList()==null) || 
             (this.receivingAmountList!=null &&
              java.util.Arrays.equals(this.receivingAmountList, other.getReceivingAmountList()))) &&
            ((this.debtLimitAccountList==null && other.getDebtLimitAccountList()==null) || 
             (this.debtLimitAccountList!=null &&
              java.util.Arrays.equals(this.debtLimitAccountList, other.getDebtLimitAccountList())));
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
        if (getIsLeader() != null) {
            _hashCode += getIsLeader().hashCode();
        }
        _hashCode += new Double(getRttMargin()).hashCode();
        _hashCode += new Double(getRttDealFinancing()).hashCode();
        _hashCode += new Double(getRttAccount()).hashCode();
        _hashCode += new Double(getAccountAddAmount()).hashCode();
        if (getGuaranteeAssetlist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuaranteeAssetlist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuaranteeAssetlist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebtUnPaidList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebtUnPaidList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebtUnPaidList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalanceAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceivingAmountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivingAmountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivingAmountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebtLimitAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebtLimitAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebtLimitAccountList(), i);
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
        new org.apache.axis.description.TypeDesc(DebtAmountReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "DebtAmountReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IsLeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rttMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RttMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rttDealFinancing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RttDealFinancing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rttAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RttAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAddAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountAddAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeAssetlist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAsset"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtUnPaidList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DebtUnPaidList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "DebtUnPaid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "DebtUnPaid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAccountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BalanceAccountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "BalanceAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "BalanceAccount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingAmountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ReceivingAmountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ReceivingAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "ReceivingAmount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtLimitAccountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DebtLimitAccountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "DebtLimitAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "DebtLimitAccount"));
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
