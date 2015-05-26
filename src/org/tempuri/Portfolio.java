/**
 * Portfolio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Portfolio  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private double costPrice;

    private double currentPrice;

    private double dailyChangeAmount;

    private double dailyChangePercent;

    private double dayGain;

    private double marketValue;

    private int quantity;

    private java.lang.String symbol;

    private double totalGainAmount;

    private double totalGainPercent;

    private java.lang.String tradingPlace;

    private java.lang.String customerId;

    public Portfolio() {
    }

    public Portfolio(
           double costPrice,
           double currentPrice,
           double dailyChangeAmount,
           double dailyChangePercent,
           double dayGain,
           double marketValue,
           int quantity,
           java.lang.String symbol,
           double totalGainAmount,
           double totalGainPercent,
           java.lang.String tradingPlace,
           java.lang.String customerId) {
        this.costPrice = costPrice;
        this.currentPrice = currentPrice;
        this.dailyChangeAmount = dailyChangeAmount;
        this.dailyChangePercent = dailyChangePercent;
        this.dayGain = dayGain;
        this.marketValue = marketValue;
        this.quantity = quantity;
        this.symbol = symbol;
        this.totalGainAmount = totalGainAmount;
        this.totalGainPercent = totalGainPercent;
        this.tradingPlace = tradingPlace;
        this.customerId = customerId;
    }


    /**
     * Gets the costPrice value for this Portfolio.
     * 
     * @return costPrice
     */
    public double getCostPrice() {
        return costPrice;
    }


    /**
     * Sets the costPrice value for this Portfolio.
     * 
     * @param costPrice
     */
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }


    /**
     * Gets the currentPrice value for this Portfolio.
     * 
     * @return currentPrice
     */
    public double getCurrentPrice() {
        return currentPrice;
    }


    /**
     * Sets the currentPrice value for this Portfolio.
     * 
     * @param currentPrice
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }


    /**
     * Gets the dailyChangeAmount value for this Portfolio.
     * 
     * @return dailyChangeAmount
     */
    public double getDailyChangeAmount() {
        return dailyChangeAmount;
    }


    /**
     * Sets the dailyChangeAmount value for this Portfolio.
     * 
     * @param dailyChangeAmount
     */
    public void setDailyChangeAmount(double dailyChangeAmount) {
        this.dailyChangeAmount = dailyChangeAmount;
    }


    /**
     * Gets the dailyChangePercent value for this Portfolio.
     * 
     * @return dailyChangePercent
     */
    public double getDailyChangePercent() {
        return dailyChangePercent;
    }


    /**
     * Sets the dailyChangePercent value for this Portfolio.
     * 
     * @param dailyChangePercent
     */
    public void setDailyChangePercent(double dailyChangePercent) {
        this.dailyChangePercent = dailyChangePercent;
    }


    /**
     * Gets the dayGain value for this Portfolio.
     * 
     * @return dayGain
     */
    public double getDayGain() {
        return dayGain;
    }


    /**
     * Sets the dayGain value for this Portfolio.
     * 
     * @param dayGain
     */
    public void setDayGain(double dayGain) {
        this.dayGain = dayGain;
    }


    /**
     * Gets the marketValue value for this Portfolio.
     * 
     * @return marketValue
     */
    public double getMarketValue() {
        return marketValue;
    }


    /**
     * Sets the marketValue value for this Portfolio.
     * 
     * @param marketValue
     */
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }


    /**
     * Gets the quantity value for this Portfolio.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Portfolio.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the symbol value for this Portfolio.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this Portfolio.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the totalGainAmount value for this Portfolio.
     * 
     * @return totalGainAmount
     */
    public double getTotalGainAmount() {
        return totalGainAmount;
    }


    /**
     * Sets the totalGainAmount value for this Portfolio.
     * 
     * @param totalGainAmount
     */
    public void setTotalGainAmount(double totalGainAmount) {
        this.totalGainAmount = totalGainAmount;
    }


    /**
     * Gets the totalGainPercent value for this Portfolio.
     * 
     * @return totalGainPercent
     */
    public double getTotalGainPercent() {
        return totalGainPercent;
    }


    /**
     * Sets the totalGainPercent value for this Portfolio.
     * 
     * @param totalGainPercent
     */
    public void setTotalGainPercent(double totalGainPercent) {
        this.totalGainPercent = totalGainPercent;
    }


    /**
     * Gets the tradingPlace value for this Portfolio.
     * 
     * @return tradingPlace
     */
    public java.lang.String getTradingPlace() {
        return tradingPlace;
    }


    /**
     * Sets the tradingPlace value for this Portfolio.
     * 
     * @param tradingPlace
     */
    public void setTradingPlace(java.lang.String tradingPlace) {
        this.tradingPlace = tradingPlace;
    }


    /**
     * Gets the customerId value for this Portfolio.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Portfolio.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Portfolio)) return false;
        Portfolio other = (Portfolio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.costPrice == other.getCostPrice() &&
            this.currentPrice == other.getCurrentPrice() &&
            this.dailyChangeAmount == other.getDailyChangeAmount() &&
            this.dailyChangePercent == other.getDailyChangePercent() &&
            this.dayGain == other.getDayGain() &&
            this.marketValue == other.getMarketValue() &&
            this.quantity == other.getQuantity() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.totalGainAmount == other.getTotalGainAmount() &&
            this.totalGainPercent == other.getTotalGainPercent() &&
            ((this.tradingPlace==null && other.getTradingPlace()==null) || 
             (this.tradingPlace!=null &&
              this.tradingPlace.equals(other.getTradingPlace()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId())));
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
        _hashCode += new Double(getCostPrice()).hashCode();
        _hashCode += new Double(getCurrentPrice()).hashCode();
        _hashCode += new Double(getDailyChangeAmount()).hashCode();
        _hashCode += new Double(getDailyChangePercent()).hashCode();
        _hashCode += new Double(getDayGain()).hashCode();
        _hashCode += new Double(getMarketValue()).hashCode();
        _hashCode += getQuantity();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += new Double(getTotalGainAmount()).hashCode();
        _hashCode += new Double(getTotalGainPercent()).hashCode();
        if (getTradingPlace() != null) {
            _hashCode += getTradingPlace().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Portfolio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Portfolio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CostPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CurrentPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyChangeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DailyChangeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyChangePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DailyChangePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayGain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DayGain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MarketValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("totalGainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TotalGainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalGainPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TotalGainPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradingPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TradingPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
