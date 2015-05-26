/**
 * ConfirmDFAdvPaymentAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ConfirmDFAdvPaymentAmount  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.util.Calendar txdate;

    private double debtPayableAmount;

    private double maxAdvancedPaymentAmt;

    private double currentAdvancePayment;

    private double availableAdvancedDay;

    private double feeRate;

    private double feeAdvPayment;

    public ConfirmDFAdvPaymentAmount() {
    }

    public ConfirmDFAdvPaymentAmount(
           java.util.Calendar txdate,
           double debtPayableAmount,
           double maxAdvancedPaymentAmt,
           double currentAdvancePayment,
           double availableAdvancedDay,
           double feeRate,
           double feeAdvPayment) {
        this.txdate = txdate;
        this.debtPayableAmount = debtPayableAmount;
        this.maxAdvancedPaymentAmt = maxAdvancedPaymentAmt;
        this.currentAdvancePayment = currentAdvancePayment;
        this.availableAdvancedDay = availableAdvancedDay;
        this.feeRate = feeRate;
        this.feeAdvPayment = feeAdvPayment;
    }


    /**
     * Gets the txdate value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return txdate
     */
    public java.util.Calendar getTxdate() {
        return txdate;
    }


    /**
     * Sets the txdate value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param txdate
     */
    public void setTxdate(java.util.Calendar txdate) {
        this.txdate = txdate;
    }


    /**
     * Gets the debtPayableAmount value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return debtPayableAmount
     */
    public double getDebtPayableAmount() {
        return debtPayableAmount;
    }


    /**
     * Sets the debtPayableAmount value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param debtPayableAmount
     */
    public void setDebtPayableAmount(double debtPayableAmount) {
        this.debtPayableAmount = debtPayableAmount;
    }


    /**
     * Gets the maxAdvancedPaymentAmt value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return maxAdvancedPaymentAmt
     */
    public double getMaxAdvancedPaymentAmt() {
        return maxAdvancedPaymentAmt;
    }


    /**
     * Sets the maxAdvancedPaymentAmt value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param maxAdvancedPaymentAmt
     */
    public void setMaxAdvancedPaymentAmt(double maxAdvancedPaymentAmt) {
        this.maxAdvancedPaymentAmt = maxAdvancedPaymentAmt;
    }


    /**
     * Gets the currentAdvancePayment value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return currentAdvancePayment
     */
    public double getCurrentAdvancePayment() {
        return currentAdvancePayment;
    }


    /**
     * Sets the currentAdvancePayment value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param currentAdvancePayment
     */
    public void setCurrentAdvancePayment(double currentAdvancePayment) {
        this.currentAdvancePayment = currentAdvancePayment;
    }


    /**
     * Gets the availableAdvancedDay value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return availableAdvancedDay
     */
    public double getAvailableAdvancedDay() {
        return availableAdvancedDay;
    }


    /**
     * Sets the availableAdvancedDay value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param availableAdvancedDay
     */
    public void setAvailableAdvancedDay(double availableAdvancedDay) {
        this.availableAdvancedDay = availableAdvancedDay;
    }


    /**
     * Gets the feeRate value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return feeRate
     */
    public double getFeeRate() {
        return feeRate;
    }


    /**
     * Sets the feeRate value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param feeRate
     */
    public void setFeeRate(double feeRate) {
        this.feeRate = feeRate;
    }


    /**
     * Gets the feeAdvPayment value for this ConfirmDFAdvPaymentAmount.
     * 
     * @return feeAdvPayment
     */
    public double getFeeAdvPayment() {
        return feeAdvPayment;
    }


    /**
     * Sets the feeAdvPayment value for this ConfirmDFAdvPaymentAmount.
     * 
     * @param feeAdvPayment
     */
    public void setFeeAdvPayment(double feeAdvPayment) {
        this.feeAdvPayment = feeAdvPayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmDFAdvPaymentAmount)) return false;
        ConfirmDFAdvPaymentAmount other = (ConfirmDFAdvPaymentAmount) obj;
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
            this.debtPayableAmount == other.getDebtPayableAmount() &&
            this.maxAdvancedPaymentAmt == other.getMaxAdvancedPaymentAmt() &&
            this.currentAdvancePayment == other.getCurrentAdvancePayment() &&
            this.availableAdvancedDay == other.getAvailableAdvancedDay() &&
            this.feeRate == other.getFeeRate() &&
            this.feeAdvPayment == other.getFeeAdvPayment();
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
        _hashCode += new Double(getDebtPayableAmount()).hashCode();
        _hashCode += new Double(getMaxAdvancedPaymentAmt()).hashCode();
        _hashCode += new Double(getCurrentAdvancePayment()).hashCode();
        _hashCode += new Double(getAvailableAdvancedDay()).hashCode();
        _hashCode += new Double(getFeeRate()).hashCode();
        _hashCode += new Double(getFeeAdvPayment()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmDFAdvPaymentAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmDFAdvPaymentAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Txdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtPayableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DebtPayableAmount"));
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
        elemField.setFieldName("currentAdvancePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CurrentAdvancePayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableAdvancedDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AvailableAdvancedDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FeeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAdvPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FeeAdvPayment"));
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
