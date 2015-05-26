/**
 * StockOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StockOption  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String symbol;

    private java.lang.String type;

    private java.util.Calendar rightDate;

    private java.util.Calendar eventDate;

    private int positionAtRightDate;

    private java.lang.String ratio;

    private int stockReceivable;

    private double cashReceivable;

    private java.lang.String status;

    private java.util.Calendar lastDateToRegister;

    public StockOption() {
    }

    public StockOption(
           java.lang.String symbol,
           java.lang.String type,
           java.util.Calendar rightDate,
           java.util.Calendar eventDate,
           int positionAtRightDate,
           java.lang.String ratio,
           int stockReceivable,
           double cashReceivable,
           java.lang.String status,
           java.util.Calendar lastDateToRegister) {
        this.symbol = symbol;
        this.type = type;
        this.rightDate = rightDate;
        this.eventDate = eventDate;
        this.positionAtRightDate = positionAtRightDate;
        this.ratio = ratio;
        this.stockReceivable = stockReceivable;
        this.cashReceivable = cashReceivable;
        this.status = status;
        this.lastDateToRegister = lastDateToRegister;
    }


    /**
     * Gets the symbol value for this StockOption.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this StockOption.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the type value for this StockOption.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this StockOption.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the rightDate value for this StockOption.
     * 
     * @return rightDate
     */
    public java.util.Calendar getRightDate() {
        return rightDate;
    }


    /**
     * Sets the rightDate value for this StockOption.
     * 
     * @param rightDate
     */
    public void setRightDate(java.util.Calendar rightDate) {
        this.rightDate = rightDate;
    }


    /**
     * Gets the eventDate value for this StockOption.
     * 
     * @return eventDate
     */
    public java.util.Calendar getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this StockOption.
     * 
     * @param eventDate
     */
    public void setEventDate(java.util.Calendar eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the positionAtRightDate value for this StockOption.
     * 
     * @return positionAtRightDate
     */
    public int getPositionAtRightDate() {
        return positionAtRightDate;
    }


    /**
     * Sets the positionAtRightDate value for this StockOption.
     * 
     * @param positionAtRightDate
     */
    public void setPositionAtRightDate(int positionAtRightDate) {
        this.positionAtRightDate = positionAtRightDate;
    }


    /**
     * Gets the ratio value for this StockOption.
     * 
     * @return ratio
     */
    public java.lang.String getRatio() {
        return ratio;
    }


    /**
     * Sets the ratio value for this StockOption.
     * 
     * @param ratio
     */
    public void setRatio(java.lang.String ratio) {
        this.ratio = ratio;
    }


    /**
     * Gets the stockReceivable value for this StockOption.
     * 
     * @return stockReceivable
     */
    public int getStockReceivable() {
        return stockReceivable;
    }


    /**
     * Sets the stockReceivable value for this StockOption.
     * 
     * @param stockReceivable
     */
    public void setStockReceivable(int stockReceivable) {
        this.stockReceivable = stockReceivable;
    }


    /**
     * Gets the cashReceivable value for this StockOption.
     * 
     * @return cashReceivable
     */
    public double getCashReceivable() {
        return cashReceivable;
    }


    /**
     * Sets the cashReceivable value for this StockOption.
     * 
     * @param cashReceivable
     */
    public void setCashReceivable(double cashReceivable) {
        this.cashReceivable = cashReceivable;
    }


    /**
     * Gets the status value for this StockOption.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StockOption.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the lastDateToRegister value for this StockOption.
     * 
     * @return lastDateToRegister
     */
    public java.util.Calendar getLastDateToRegister() {
        return lastDateToRegister;
    }


    /**
     * Sets the lastDateToRegister value for this StockOption.
     * 
     * @param lastDateToRegister
     */
    public void setLastDateToRegister(java.util.Calendar lastDateToRegister) {
        this.lastDateToRegister = lastDateToRegister;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StockOption)) return false;
        StockOption other = (StockOption) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.rightDate==null && other.getRightDate()==null) || 
             (this.rightDate!=null &&
              this.rightDate.equals(other.getRightDate()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            this.positionAtRightDate == other.getPositionAtRightDate() &&
            ((this.ratio==null && other.getRatio()==null) || 
             (this.ratio!=null &&
              this.ratio.equals(other.getRatio()))) &&
            this.stockReceivable == other.getStockReceivable() &&
            this.cashReceivable == other.getCashReceivable() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.lastDateToRegister==null && other.getLastDateToRegister()==null) || 
             (this.lastDateToRegister!=null &&
              this.lastDateToRegister.equals(other.getLastDateToRegister())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRightDate() != null) {
            _hashCode += getRightDate().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        _hashCode += getPositionAtRightDate();
        if (getRatio() != null) {
            _hashCode += getRatio().hashCode();
        }
        _hashCode += getStockReceivable();
        _hashCode += new Double(getCashReceivable()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLastDateToRegister() != null) {
            _hashCode += getLastDateToRegister().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "StockOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "EventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionAtRightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PositionAtRightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Ratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockReceivable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "StockReceivable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashReceivable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CashReceivable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDateToRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "LastDateToRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
