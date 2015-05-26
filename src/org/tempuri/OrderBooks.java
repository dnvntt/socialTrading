/**
 * OrderBooks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderBooks  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.util.Calendar txdate;

    private java.lang.String orderID;

    private java.lang.String requestType;

    private java.lang.String timeType;

    private java.lang.String orderType;

    private java.lang.String symbol;

    private java.lang.String priceType;

    private double orderQtty;

    private double orderPrice;

    private double editPrice;

    private java.lang.String via;

    private java.lang.String confirmStatus;

    public OrderBooks() {
    }

    public OrderBooks(
           java.util.Calendar txdate,
           java.lang.String orderID,
           java.lang.String requestType,
           java.lang.String timeType,
           java.lang.String orderType,
           java.lang.String symbol,
           java.lang.String priceType,
           double orderQtty,
           double orderPrice,
           double editPrice,
           java.lang.String via,
           java.lang.String confirmStatus) {
        this.txdate = txdate;
        this.orderID = orderID;
        this.requestType = requestType;
        this.timeType = timeType;
        this.orderType = orderType;
        this.symbol = symbol;
        this.priceType = priceType;
        this.orderQtty = orderQtty;
        this.orderPrice = orderPrice;
        this.editPrice = editPrice;
        this.via = via;
        this.confirmStatus = confirmStatus;
    }


    /**
     * Gets the txdate value for this OrderBooks.
     * 
     * @return txdate
     */
    public java.util.Calendar getTxdate() {
        return txdate;
    }


    /**
     * Sets the txdate value for this OrderBooks.
     * 
     * @param txdate
     */
    public void setTxdate(java.util.Calendar txdate) {
        this.txdate = txdate;
    }


    /**
     * Gets the orderID value for this OrderBooks.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this OrderBooks.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the requestType value for this OrderBooks.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this OrderBooks.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the timeType value for this OrderBooks.
     * 
     * @return timeType
     */
    public java.lang.String getTimeType() {
        return timeType;
    }


    /**
     * Sets the timeType value for this OrderBooks.
     * 
     * @param timeType
     */
    public void setTimeType(java.lang.String timeType) {
        this.timeType = timeType;
    }


    /**
     * Gets the orderType value for this OrderBooks.
     * 
     * @return orderType
     */
    public java.lang.String getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this OrderBooks.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the symbol value for this OrderBooks.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this OrderBooks.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the priceType value for this OrderBooks.
     * 
     * @return priceType
     */
    public java.lang.String getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this OrderBooks.
     * 
     * @param priceType
     */
    public void setPriceType(java.lang.String priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the orderQtty value for this OrderBooks.
     * 
     * @return orderQtty
     */
    public double getOrderQtty() {
        return orderQtty;
    }


    /**
     * Sets the orderQtty value for this OrderBooks.
     * 
     * @param orderQtty
     */
    public void setOrderQtty(double orderQtty) {
        this.orderQtty = orderQtty;
    }


    /**
     * Gets the orderPrice value for this OrderBooks.
     * 
     * @return orderPrice
     */
    public double getOrderPrice() {
        return orderPrice;
    }


    /**
     * Sets the orderPrice value for this OrderBooks.
     * 
     * @param orderPrice
     */
    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }


    /**
     * Gets the editPrice value for this OrderBooks.
     * 
     * @return editPrice
     */
    public double getEditPrice() {
        return editPrice;
    }


    /**
     * Sets the editPrice value for this OrderBooks.
     * 
     * @param editPrice
     */
    public void setEditPrice(double editPrice) {
        this.editPrice = editPrice;
    }


    /**
     * Gets the via value for this OrderBooks.
     * 
     * @return via
     */
    public java.lang.String getVia() {
        return via;
    }


    /**
     * Sets the via value for this OrderBooks.
     * 
     * @param via
     */
    public void setVia(java.lang.String via) {
        this.via = via;
    }


    /**
     * Gets the confirmStatus value for this OrderBooks.
     * 
     * @return confirmStatus
     */
    public java.lang.String getConfirmStatus() {
        return confirmStatus;
    }


    /**
     * Sets the confirmStatus value for this OrderBooks.
     * 
     * @param confirmStatus
     */
    public void setConfirmStatus(java.lang.String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderBooks)) return false;
        OrderBooks other = (OrderBooks) obj;
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
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.timeType==null && other.getTimeType()==null) || 
             (this.timeType!=null &&
              this.timeType.equals(other.getTimeType()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            this.orderQtty == other.getOrderQtty() &&
            this.orderPrice == other.getOrderPrice() &&
            this.editPrice == other.getEditPrice() &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              this.via.equals(other.getVia()))) &&
            ((this.confirmStatus==null && other.getConfirmStatus()==null) || 
             (this.confirmStatus!=null &&
              this.confirmStatus.equals(other.getConfirmStatus())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getTimeType() != null) {
            _hashCode += getTimeType().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        _hashCode += new Double(getOrderQtty()).hashCode();
        _hashCode += new Double(getOrderPrice()).hashCode();
        _hashCode += new Double(getEditPrice()).hashCode();
        if (getVia() != null) {
            _hashCode += getVia().hashCode();
        }
        if (getConfirmStatus() != null) {
            _hashCode += getConfirmStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderBooks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderBooks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Txdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PriceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderQtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderQtty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "EditPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("via");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Via"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmStatus"));
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
