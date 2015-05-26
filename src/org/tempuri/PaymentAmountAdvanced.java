/**
 * PaymentAmountAdvanced.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PaymentAmountAdvanced  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.util.Calendar timePlaced;

    private java.lang.String symbol;

    private double executedPrice;

    private int executedQuantity;

    private double maximumAmountAvailable;

    private double feeEstimate;

    private double currentPaymentAdvanced;

    private double paymentAdvanced;

    private java.lang.String orderID;

    private double feeRate;

    private double minBal;

    private java.util.Calendar clearDate;

    private int days;

    public PaymentAmountAdvanced() {
    }

    public PaymentAmountAdvanced(
           java.util.Calendar timePlaced,
           java.lang.String symbol,
           double executedPrice,
           int executedQuantity,
           double maximumAmountAvailable,
           double feeEstimate,
           double currentPaymentAdvanced,
           double paymentAdvanced,
           java.lang.String orderID,
           double feeRate,
           double minBal,
           java.util.Calendar clearDate,
           int days) {
        this.timePlaced = timePlaced;
        this.symbol = symbol;
        this.executedPrice = executedPrice;
        this.executedQuantity = executedQuantity;
        this.maximumAmountAvailable = maximumAmountAvailable;
        this.feeEstimate = feeEstimate;
        this.currentPaymentAdvanced = currentPaymentAdvanced;
        this.paymentAdvanced = paymentAdvanced;
        this.orderID = orderID;
        this.feeRate = feeRate;
        this.minBal = minBal;
        this.clearDate = clearDate;
        this.days = days;
    }


    /**
     * Gets the timePlaced value for this PaymentAmountAdvanced.
     * 
     * @return timePlaced
     */
    public java.util.Calendar getTimePlaced() {
        return timePlaced;
    }


    /**
     * Sets the timePlaced value for this PaymentAmountAdvanced.
     * 
     * @param timePlaced
     */
    public void setTimePlaced(java.util.Calendar timePlaced) {
        this.timePlaced = timePlaced;
    }


    /**
     * Gets the symbol value for this PaymentAmountAdvanced.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this PaymentAmountAdvanced.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the executedPrice value for this PaymentAmountAdvanced.
     * 
     * @return executedPrice
     */
    public double getExecutedPrice() {
        return executedPrice;
    }


    /**
     * Sets the executedPrice value for this PaymentAmountAdvanced.
     * 
     * @param executedPrice
     */
    public void setExecutedPrice(double executedPrice) {
        this.executedPrice = executedPrice;
    }


    /**
     * Gets the executedQuantity value for this PaymentAmountAdvanced.
     * 
     * @return executedQuantity
     */
    public int getExecutedQuantity() {
        return executedQuantity;
    }


    /**
     * Sets the executedQuantity value for this PaymentAmountAdvanced.
     * 
     * @param executedQuantity
     */
    public void setExecutedQuantity(int executedQuantity) {
        this.executedQuantity = executedQuantity;
    }


    /**
     * Gets the maximumAmountAvailable value for this PaymentAmountAdvanced.
     * 
     * @return maximumAmountAvailable
     */
    public double getMaximumAmountAvailable() {
        return maximumAmountAvailable;
    }


    /**
     * Sets the maximumAmountAvailable value for this PaymentAmountAdvanced.
     * 
     * @param maximumAmountAvailable
     */
    public void setMaximumAmountAvailable(double maximumAmountAvailable) {
        this.maximumAmountAvailable = maximumAmountAvailable;
    }


    /**
     * Gets the feeEstimate value for this PaymentAmountAdvanced.
     * 
     * @return feeEstimate
     */
    public double getFeeEstimate() {
        return feeEstimate;
    }


    /**
     * Sets the feeEstimate value for this PaymentAmountAdvanced.
     * 
     * @param feeEstimate
     */
    public void setFeeEstimate(double feeEstimate) {
        this.feeEstimate = feeEstimate;
    }


    /**
     * Gets the currentPaymentAdvanced value for this PaymentAmountAdvanced.
     * 
     * @return currentPaymentAdvanced
     */
    public double getCurrentPaymentAdvanced() {
        return currentPaymentAdvanced;
    }


    /**
     * Sets the currentPaymentAdvanced value for this PaymentAmountAdvanced.
     * 
     * @param currentPaymentAdvanced
     */
    public void setCurrentPaymentAdvanced(double currentPaymentAdvanced) {
        this.currentPaymentAdvanced = currentPaymentAdvanced;
    }


    /**
     * Gets the paymentAdvanced value for this PaymentAmountAdvanced.
     * 
     * @return paymentAdvanced
     */
    public double getPaymentAdvanced() {
        return paymentAdvanced;
    }


    /**
     * Sets the paymentAdvanced value for this PaymentAmountAdvanced.
     * 
     * @param paymentAdvanced
     */
    public void setPaymentAdvanced(double paymentAdvanced) {
        this.paymentAdvanced = paymentAdvanced;
    }


    /**
     * Gets the orderID value for this PaymentAmountAdvanced.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this PaymentAmountAdvanced.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the feeRate value for this PaymentAmountAdvanced.
     * 
     * @return feeRate
     */
    public double getFeeRate() {
        return feeRate;
    }


    /**
     * Sets the feeRate value for this PaymentAmountAdvanced.
     * 
     * @param feeRate
     */
    public void setFeeRate(double feeRate) {
        this.feeRate = feeRate;
    }


    /**
     * Gets the minBal value for this PaymentAmountAdvanced.
     * 
     * @return minBal
     */
    public double getMinBal() {
        return minBal;
    }


    /**
     * Sets the minBal value for this PaymentAmountAdvanced.
     * 
     * @param minBal
     */
    public void setMinBal(double minBal) {
        this.minBal = minBal;
    }


    /**
     * Gets the clearDate value for this PaymentAmountAdvanced.
     * 
     * @return clearDate
     */
    public java.util.Calendar getClearDate() {
        return clearDate;
    }


    /**
     * Sets the clearDate value for this PaymentAmountAdvanced.
     * 
     * @param clearDate
     */
    public void setClearDate(java.util.Calendar clearDate) {
        this.clearDate = clearDate;
    }


    /**
     * Gets the days value for this PaymentAmountAdvanced.
     * 
     * @return days
     */
    public int getDays() {
        return days;
    }


    /**
     * Sets the days value for this PaymentAmountAdvanced.
     * 
     * @param days
     */
    public void setDays(int days) {
        this.days = days;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentAmountAdvanced)) return false;
        PaymentAmountAdvanced other = (PaymentAmountAdvanced) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timePlaced==null && other.getTimePlaced()==null) || 
             (this.timePlaced!=null &&
              this.timePlaced.equals(other.getTimePlaced()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.executedPrice == other.getExecutedPrice() &&
            this.executedQuantity == other.getExecutedQuantity() &&
            this.maximumAmountAvailable == other.getMaximumAmountAvailable() &&
            this.feeEstimate == other.getFeeEstimate() &&
            this.currentPaymentAdvanced == other.getCurrentPaymentAdvanced() &&
            this.paymentAdvanced == other.getPaymentAdvanced() &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            this.feeRate == other.getFeeRate() &&
            this.minBal == other.getMinBal() &&
            ((this.clearDate==null && other.getClearDate()==null) || 
             (this.clearDate!=null &&
              this.clearDate.equals(other.getClearDate()))) &&
            this.days == other.getDays();
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
        if (getTimePlaced() != null) {
            _hashCode += getTimePlaced().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += new Double(getExecutedPrice()).hashCode();
        _hashCode += getExecutedQuantity();
        _hashCode += new Double(getMaximumAmountAvailable()).hashCode();
        _hashCode += new Double(getFeeEstimate()).hashCode();
        _hashCode += new Double(getCurrentPaymentAdvanced()).hashCode();
        _hashCode += new Double(getPaymentAdvanced()).hashCode();
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        _hashCode += new Double(getFeeRate()).hashCode();
        _hashCode += new Double(getMinBal()).hashCode();
        if (getClearDate() != null) {
            _hashCode += getClearDate().hashCode();
        }
        _hashCode += getDays();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentAmountAdvanced.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PaymentAmountAdvanced"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePlaced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TimePlaced"));
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
        elemField.setFieldName("executedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExecutedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExecutedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumAmountAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MaximumAmountAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FeeEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPaymentAdvanced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CurrentPaymentAdvanced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAdvanced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PaymentAdvanced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FeeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MinBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ClearDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
