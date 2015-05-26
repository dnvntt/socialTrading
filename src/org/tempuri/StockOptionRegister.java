/**
 * StockOptionRegister.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StockOptionRegister  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String symbol;

    private java.util.Calendar lastDay;

    private double amount;

    private double remainedAmount;

    private double registeredAmount;

    private int currentPosition;

    private double price;

    private java.lang.String eventID;

    private java.lang.String taskCode;

    private java.lang.String SEAccountNo;

    private java.lang.String OPTSEAccountNo;

    private java.lang.String description;

    public StockOptionRegister() {
    }

    public StockOptionRegister(
           java.lang.String symbol,
           java.util.Calendar lastDay,
           double amount,
           double remainedAmount,
           double registeredAmount,
           int currentPosition,
           double price,
           java.lang.String eventID,
           java.lang.String taskCode,
           java.lang.String SEAccountNo,
           java.lang.String OPTSEAccountNo,
           java.lang.String description) {
        this.symbol = symbol;
        this.lastDay = lastDay;
        this.amount = amount;
        this.remainedAmount = remainedAmount;
        this.registeredAmount = registeredAmount;
        this.currentPosition = currentPosition;
        this.price = price;
        this.eventID = eventID;
        this.taskCode = taskCode;
        this.SEAccountNo = SEAccountNo;
        this.OPTSEAccountNo = OPTSEAccountNo;
        this.description = description;
    }


    /**
     * Gets the symbol value for this StockOptionRegister.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this StockOptionRegister.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the lastDay value for this StockOptionRegister.
     * 
     * @return lastDay
     */
    public java.util.Calendar getLastDay() {
        return lastDay;
    }


    /**
     * Sets the lastDay value for this StockOptionRegister.
     * 
     * @param lastDay
     */
    public void setLastDay(java.util.Calendar lastDay) {
        this.lastDay = lastDay;
    }


    /**
     * Gets the amount value for this StockOptionRegister.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this StockOptionRegister.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the remainedAmount value for this StockOptionRegister.
     * 
     * @return remainedAmount
     */
    public double getRemainedAmount() {
        return remainedAmount;
    }


    /**
     * Sets the remainedAmount value for this StockOptionRegister.
     * 
     * @param remainedAmount
     */
    public void setRemainedAmount(double remainedAmount) {
        this.remainedAmount = remainedAmount;
    }


    /**
     * Gets the registeredAmount value for this StockOptionRegister.
     * 
     * @return registeredAmount
     */
    public double getRegisteredAmount() {
        return registeredAmount;
    }


    /**
     * Sets the registeredAmount value for this StockOptionRegister.
     * 
     * @param registeredAmount
     */
    public void setRegisteredAmount(double registeredAmount) {
        this.registeredAmount = registeredAmount;
    }


    /**
     * Gets the currentPosition value for this StockOptionRegister.
     * 
     * @return currentPosition
     */
    public int getCurrentPosition() {
        return currentPosition;
    }


    /**
     * Sets the currentPosition value for this StockOptionRegister.
     * 
     * @param currentPosition
     */
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }


    /**
     * Gets the price value for this StockOptionRegister.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this StockOptionRegister.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the eventID value for this StockOptionRegister.
     * 
     * @return eventID
     */
    public java.lang.String getEventID() {
        return eventID;
    }


    /**
     * Sets the eventID value for this StockOptionRegister.
     * 
     * @param eventID
     */
    public void setEventID(java.lang.String eventID) {
        this.eventID = eventID;
    }


    /**
     * Gets the taskCode value for this StockOptionRegister.
     * 
     * @return taskCode
     */
    public java.lang.String getTaskCode() {
        return taskCode;
    }


    /**
     * Sets the taskCode value for this StockOptionRegister.
     * 
     * @param taskCode
     */
    public void setTaskCode(java.lang.String taskCode) {
        this.taskCode = taskCode;
    }


    /**
     * Gets the SEAccountNo value for this StockOptionRegister.
     * 
     * @return SEAccountNo
     */
    public java.lang.String getSEAccountNo() {
        return SEAccountNo;
    }


    /**
     * Sets the SEAccountNo value for this StockOptionRegister.
     * 
     * @param SEAccountNo
     */
    public void setSEAccountNo(java.lang.String SEAccountNo) {
        this.SEAccountNo = SEAccountNo;
    }


    /**
     * Gets the OPTSEAccountNo value for this StockOptionRegister.
     * 
     * @return OPTSEAccountNo
     */
    public java.lang.String getOPTSEAccountNo() {
        return OPTSEAccountNo;
    }


    /**
     * Sets the OPTSEAccountNo value for this StockOptionRegister.
     * 
     * @param OPTSEAccountNo
     */
    public void setOPTSEAccountNo(java.lang.String OPTSEAccountNo) {
        this.OPTSEAccountNo = OPTSEAccountNo;
    }


    /**
     * Gets the description value for this StockOptionRegister.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this StockOptionRegister.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StockOptionRegister)) return false;
        StockOptionRegister other = (StockOptionRegister) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.lastDay==null && other.getLastDay()==null) || 
             (this.lastDay!=null &&
              this.lastDay.equals(other.getLastDay()))) &&
            this.amount == other.getAmount() &&
            this.remainedAmount == other.getRemainedAmount() &&
            this.registeredAmount == other.getRegisteredAmount() &&
            this.currentPosition == other.getCurrentPosition() &&
            this.price == other.getPrice() &&
            ((this.eventID==null && other.getEventID()==null) || 
             (this.eventID!=null &&
              this.eventID.equals(other.getEventID()))) &&
            ((this.taskCode==null && other.getTaskCode()==null) || 
             (this.taskCode!=null &&
              this.taskCode.equals(other.getTaskCode()))) &&
            ((this.SEAccountNo==null && other.getSEAccountNo()==null) || 
             (this.SEAccountNo!=null &&
              this.SEAccountNo.equals(other.getSEAccountNo()))) &&
            ((this.OPTSEAccountNo==null && other.getOPTSEAccountNo()==null) || 
             (this.OPTSEAccountNo!=null &&
              this.OPTSEAccountNo.equals(other.getOPTSEAccountNo()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getLastDay() != null) {
            _hashCode += getLastDay().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += new Double(getRemainedAmount()).hashCode();
        _hashCode += new Double(getRegisteredAmount()).hashCode();
        _hashCode += getCurrentPosition();
        _hashCode += new Double(getPrice()).hashCode();
        if (getEventID() != null) {
            _hashCode += getEventID().hashCode();
        }
        if (getTaskCode() != null) {
            _hashCode += getTaskCode().hashCode();
        }
        if (getSEAccountNo() != null) {
            _hashCode += getSEAccountNo().hashCode();
        }
        if (getOPTSEAccountNo() != null) {
            _hashCode += getOPTSEAccountNo().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockOptionRegister.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "StockOptionRegister"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "LastDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RemainedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RegisteredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CurrentPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "EventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TaskCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEAccountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SEAccountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPTSEAccountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OPTSEAccountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Description"));
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
