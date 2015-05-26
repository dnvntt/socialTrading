/**
 * OrderDFAdvancedPaymentAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderDFAdvancedPaymentAmount  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.util.Calendar txdate;

    private java.lang.String symbol;

    private double executePrice;

    private int matchQtty;

    private int isSummary;

    private double debtPayableAmount;

    private double feePayableAmount;

    private double maxAdvancedPaymentAmt;

    private double feeAdvancedPayment;

    private double advancedPayment;

    public OrderDFAdvancedPaymentAmount() {
    }

    public OrderDFAdvancedPaymentAmount(
           java.util.Calendar txdate,
           java.lang.String symbol,
           double executePrice,
           int matchQtty,
           int isSummary,
           double debtPayableAmount,
           double feePayableAmount,
           double maxAdvancedPaymentAmt,
           double feeAdvancedPayment,
           double advancedPayment) {
        this.txdate = txdate;
        this.symbol = symbol;
        this.executePrice = executePrice;
        this.matchQtty = matchQtty;
        this.isSummary = isSummary;
        this.debtPayableAmount = debtPayableAmount;
        this.feePayableAmount = feePayableAmount;
        this.maxAdvancedPaymentAmt = maxAdvancedPaymentAmt;
        this.feeAdvancedPayment = feeAdvancedPayment;
        this.advancedPayment = advancedPayment;
    }


    /**
     * Gets the txdate value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return txdate
     */
    public java.util.Calendar getTxdate() {
        return txdate;
    }


    /**
     * Sets the txdate value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param txdate
     */
    public void setTxdate(java.util.Calendar txdate) {
        this.txdate = txdate;
    }


    /**
     * Gets the symbol value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the executePrice value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return executePrice
     */
    public double getExecutePrice() {
        return executePrice;
    }


    /**
     * Sets the executePrice value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param executePrice
     */
    public void setExecutePrice(double executePrice) {
        this.executePrice = executePrice;
    }


    /**
     * Gets the matchQtty value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return matchQtty
     */
    public int getMatchQtty() {
        return matchQtty;
    }


    /**
     * Sets the matchQtty value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param matchQtty
     */
    public void setMatchQtty(int matchQtty) {
        this.matchQtty = matchQtty;
    }


    /**
     * Gets the isSummary value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return isSummary
     */
    public int getIsSummary() {
        return isSummary;
    }


    /**
     * Sets the isSummary value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param isSummary
     */
    public void setIsSummary(int isSummary) {
        this.isSummary = isSummary;
    }


    /**
     * Gets the debtPayableAmount value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return debtPayableAmount
     */
    public double getDebtPayableAmount() {
        return debtPayableAmount;
    }


    /**
     * Sets the debtPayableAmount value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param debtPayableAmount
     */
    public void setDebtPayableAmount(double debtPayableAmount) {
        this.debtPayableAmount = debtPayableAmount;
    }


    /**
     * Gets the feePayableAmount value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return feePayableAmount
     */
    public double getFeePayableAmount() {
        return feePayableAmount;
    }


    /**
     * Sets the feePayableAmount value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param feePayableAmount
     */
    public void setFeePayableAmount(double feePayableAmount) {
        this.feePayableAmount = feePayableAmount;
    }


    /**
     * Gets the maxAdvancedPaymentAmt value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return maxAdvancedPaymentAmt
     */
    public double getMaxAdvancedPaymentAmt() {
        return maxAdvancedPaymentAmt;
    }


    /**
     * Sets the maxAdvancedPaymentAmt value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param maxAdvancedPaymentAmt
     */
    public void setMaxAdvancedPaymentAmt(double maxAdvancedPaymentAmt) {
        this.maxAdvancedPaymentAmt = maxAdvancedPaymentAmt;
    }


    /**
     * Gets the feeAdvancedPayment value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return feeAdvancedPayment
     */
    public double getFeeAdvancedPayment() {
        return feeAdvancedPayment;
    }


    /**
     * Sets the feeAdvancedPayment value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param feeAdvancedPayment
     */
    public void setFeeAdvancedPayment(double feeAdvancedPayment) {
        this.feeAdvancedPayment = feeAdvancedPayment;
    }


    /**
     * Gets the advancedPayment value for this OrderDFAdvancedPaymentAmount.
     * 
     * @return advancedPayment
     */
    public double getAdvancedPayment() {
        return advancedPayment;
    }


    /**
     * Sets the advancedPayment value for this OrderDFAdvancedPaymentAmount.
     * 
     * @param advancedPayment
     */
    public void setAdvancedPayment(double advancedPayment) {
        this.advancedPayment = advancedPayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDFAdvancedPaymentAmount)) return false;
        OrderDFAdvancedPaymentAmount other = (OrderDFAdvancedPaymentAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.txdate==null && other.getTxdate()==null) || 
             (this.txdate!=null &&
              this.txdate.equals(other.getTxdate()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.executePrice == other.getExecutePrice() &&
            this.matchQtty == other.getMatchQtty() &&
            this.isSummary == other.getIsSummary() &&
            this.debtPayableAmount == other.getDebtPayableAmount() &&
            this.feePayableAmount == other.getFeePayableAmount() &&
            this.maxAdvancedPaymentAmt == other.getMaxAdvancedPaymentAmt() &&
            this.feeAdvancedPayment == other.getFeeAdvancedPayment() &&
            this.advancedPayment == other.getAdvancedPayment();
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
        if (getTxdate() != null) {
            _hashCode += getTxdate().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += new Double(getExecutePrice()).hashCode();
        _hashCode += getMatchQtty();
        _hashCode += getIsSummary();
        _hashCode += new Double(getDebtPayableAmount()).hashCode();
        _hashCode += new Double(getFeePayableAmount()).hashCode();
        _hashCode += new Double(getMaxAdvancedPaymentAmt()).hashCode();
        _hashCode += new Double(getFeeAdvancedPayment()).hashCode();
        _hashCode += new Double(getAdvancedPayment()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDFAdvancedPaymentAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderDFAdvancedPaymentAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Txdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExecutePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchQtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MatchQtty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "isSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtPayableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DebtPayableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feePayableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FeePayableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAdvancedPaymentAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MaxAdvancedPaymentAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAdvancedPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FeeAdvancedPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AdvancedPayment"));
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
