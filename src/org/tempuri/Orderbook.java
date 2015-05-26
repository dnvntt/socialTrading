/**
 * Orderbook.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Orderbook  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String orderNumber;

    private java.lang.String orderType;

    private java.lang.String priceType;

    private double quantity;

    private java.lang.String symbol;

    private java.lang.String timeType;

    private java.lang.String price;

    private double averagePrice;

    private double executedQuantity;

    private double remainQuantity;

    private double cancelQuantity;

    private double modifyQuantity;

    private java.lang.String status;

    private java.lang.String cancelStatus;

    private java.lang.String modifyStatus;

    private java.util.Calendar timePlaced;

    private java.lang.String refOrderID;

    private double execAmount;

    private java.lang.String VIA;

    private java.util.Calendar sentTime;

    private java.lang.String type;

    public Orderbook() {
    }

    public Orderbook(
           java.lang.String accountNumber,
           java.lang.String orderNumber,
           java.lang.String orderType,
           java.lang.String priceType,
           double quantity,
           java.lang.String symbol,
           java.lang.String timeType,
           java.lang.String price,
           double averagePrice,
           double executedQuantity,
           double remainQuantity,
           double cancelQuantity,
           double modifyQuantity,
           java.lang.String status,
           java.lang.String cancelStatus,
           java.lang.String modifyStatus,
           java.util.Calendar timePlaced,
           java.lang.String refOrderID,
           double execAmount,
           java.lang.String VIA,
           java.util.Calendar sentTime,
           java.lang.String type) {
        this.accountNumber = accountNumber;
        this.orderNumber = orderNumber;
        this.orderType = orderType;
        this.priceType = priceType;
        this.quantity = quantity;
        this.symbol = symbol;
        this.timeType = timeType;
        this.price = price;
        this.averagePrice = averagePrice;
        this.executedQuantity = executedQuantity;
        this.remainQuantity = remainQuantity;
        this.cancelQuantity = cancelQuantity;
        this.modifyQuantity = modifyQuantity;
        this.status = status;
        this.cancelStatus = cancelStatus;
        this.modifyStatus = modifyStatus;
        this.timePlaced = timePlaced;
        this.refOrderID = refOrderID;
        this.execAmount = execAmount;
        this.VIA = VIA;
        this.sentTime = sentTime;
        this.type = type;
    }


    /**
     * Gets the accountNumber value for this Orderbook.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Orderbook.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the orderNumber value for this Orderbook.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Orderbook.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderType value for this Orderbook.
     * 
     * @return orderType
     */
    public java.lang.String getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this Orderbook.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the priceType value for this Orderbook.
     * 
     * @return priceType
     */
    public java.lang.String getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this Orderbook.
     * 
     * @param priceType
     */
    public void setPriceType(java.lang.String priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the quantity value for this Orderbook.
     * 
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Orderbook.
     * 
     * @param quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the symbol value for this Orderbook.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this Orderbook.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the timeType value for this Orderbook.
     * 
     * @return timeType
     */
    public java.lang.String getTimeType() {
        return timeType;
    }


    /**
     * Sets the timeType value for this Orderbook.
     * 
     * @param timeType
     */
    public void setTimeType(java.lang.String timeType) {
        this.timeType = timeType;
    }


    /**
     * Gets the price value for this Orderbook.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Orderbook.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the averagePrice value for this Orderbook.
     * 
     * @return averagePrice
     */
    public double getAveragePrice() {
        return averagePrice;
    }


    /**
     * Sets the averagePrice value for this Orderbook.
     * 
     * @param averagePrice
     */
    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }


    /**
     * Gets the executedQuantity value for this Orderbook.
     * 
     * @return executedQuantity
     */
    public double getExecutedQuantity() {
        return executedQuantity;
    }


    /**
     * Sets the executedQuantity value for this Orderbook.
     * 
     * @param executedQuantity
     */
    public void setExecutedQuantity(double executedQuantity) {
        this.executedQuantity = executedQuantity;
    }


    /**
     * Gets the remainQuantity value for this Orderbook.
     * 
     * @return remainQuantity
     */
    public double getRemainQuantity() {
        return remainQuantity;
    }


    /**
     * Sets the remainQuantity value for this Orderbook.
     * 
     * @param remainQuantity
     */
    public void setRemainQuantity(double remainQuantity) {
        this.remainQuantity = remainQuantity;
    }


    /**
     * Gets the cancelQuantity value for this Orderbook.
     * 
     * @return cancelQuantity
     */
    public double getCancelQuantity() {
        return cancelQuantity;
    }


    /**
     * Sets the cancelQuantity value for this Orderbook.
     * 
     * @param cancelQuantity
     */
    public void setCancelQuantity(double cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }


    /**
     * Gets the modifyQuantity value for this Orderbook.
     * 
     * @return modifyQuantity
     */
    public double getModifyQuantity() {
        return modifyQuantity;
    }


    /**
     * Sets the modifyQuantity value for this Orderbook.
     * 
     * @param modifyQuantity
     */
    public void setModifyQuantity(double modifyQuantity) {
        this.modifyQuantity = modifyQuantity;
    }


    /**
     * Gets the status value for this Orderbook.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Orderbook.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the cancelStatus value for this Orderbook.
     * 
     * @return cancelStatus
     */
    public java.lang.String getCancelStatus() {
        return cancelStatus;
    }


    /**
     * Sets the cancelStatus value for this Orderbook.
     * 
     * @param cancelStatus
     */
    public void setCancelStatus(java.lang.String cancelStatus) {
        this.cancelStatus = cancelStatus;
    }


    /**
     * Gets the modifyStatus value for this Orderbook.
     * 
     * @return modifyStatus
     */
    public java.lang.String getModifyStatus() {
        return modifyStatus;
    }


    /**
     * Sets the modifyStatus value for this Orderbook.
     * 
     * @param modifyStatus
     */
    public void setModifyStatus(java.lang.String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }


    /**
     * Gets the timePlaced value for this Orderbook.
     * 
     * @return timePlaced
     */
    public java.util.Calendar getTimePlaced() {
        return timePlaced;
    }


    /**
     * Sets the timePlaced value for this Orderbook.
     * 
     * @param timePlaced
     */
    public void setTimePlaced(java.util.Calendar timePlaced) {
        this.timePlaced = timePlaced;
    }


    /**
     * Gets the refOrderID value for this Orderbook.
     * 
     * @return refOrderID
     */
    public java.lang.String getRefOrderID() {
        return refOrderID;
    }


    /**
     * Sets the refOrderID value for this Orderbook.
     * 
     * @param refOrderID
     */
    public void setRefOrderID(java.lang.String refOrderID) {
        this.refOrderID = refOrderID;
    }


    /**
     * Gets the execAmount value for this Orderbook.
     * 
     * @return execAmount
     */
    public double getExecAmount() {
        return execAmount;
    }


    /**
     * Sets the execAmount value for this Orderbook.
     * 
     * @param execAmount
     */
    public void setExecAmount(double execAmount) {
        this.execAmount = execAmount;
    }


    /**
     * Gets the VIA value for this Orderbook.
     * 
     * @return VIA
     */
    public java.lang.String getVIA() {
        return VIA;
    }


    /**
     * Sets the VIA value for this Orderbook.
     * 
     * @param VIA
     */
    public void setVIA(java.lang.String VIA) {
        this.VIA = VIA;
    }


    /**
     * Gets the sentTime value for this Orderbook.
     * 
     * @return sentTime
     */
    public java.util.Calendar getSentTime() {
        return sentTime;
    }


    /**
     * Sets the sentTime value for this Orderbook.
     * 
     * @param sentTime
     */
    public void setSentTime(java.util.Calendar sentTime) {
        this.sentTime = sentTime;
    }


    /**
     * Gets the type value for this Orderbook.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Orderbook.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Orderbook)) return false;
        Orderbook other = (Orderbook) obj;
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
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            this.quantity == other.getQuantity() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.timeType==null && other.getTimeType()==null) || 
             (this.timeType!=null &&
              this.timeType.equals(other.getTimeType()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            this.averagePrice == other.getAveragePrice() &&
            this.executedQuantity == other.getExecutedQuantity() &&
            this.remainQuantity == other.getRemainQuantity() &&
            this.cancelQuantity == other.getCancelQuantity() &&
            this.modifyQuantity == other.getModifyQuantity() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cancelStatus==null && other.getCancelStatus()==null) || 
             (this.cancelStatus!=null &&
              this.cancelStatus.equals(other.getCancelStatus()))) &&
            ((this.modifyStatus==null && other.getModifyStatus()==null) || 
             (this.modifyStatus!=null &&
              this.modifyStatus.equals(other.getModifyStatus()))) &&
            ((this.timePlaced==null && other.getTimePlaced()==null) || 
             (this.timePlaced!=null &&
              this.timePlaced.equals(other.getTimePlaced()))) &&
            ((this.refOrderID==null && other.getRefOrderID()==null) || 
             (this.refOrderID!=null &&
              this.refOrderID.equals(other.getRefOrderID()))) &&
            this.execAmount == other.getExecAmount() &&
            ((this.VIA==null && other.getVIA()==null) || 
             (this.VIA!=null &&
              this.VIA.equals(other.getVIA()))) &&
            ((this.sentTime==null && other.getSentTime()==null) || 
             (this.sentTime!=null &&
              this.sentTime.equals(other.getSentTime()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        _hashCode += new Double(getQuantity()).hashCode();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getTimeType() != null) {
            _hashCode += getTimeType().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        _hashCode += new Double(getAveragePrice()).hashCode();
        _hashCode += new Double(getExecutedQuantity()).hashCode();
        _hashCode += new Double(getRemainQuantity()).hashCode();
        _hashCode += new Double(getCancelQuantity()).hashCode();
        _hashCode += new Double(getModifyQuantity()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCancelStatus() != null) {
            _hashCode += getCancelStatus().hashCode();
        }
        if (getModifyStatus() != null) {
            _hashCode += getModifyStatus().hashCode();
        }
        if (getTimePlaced() != null) {
            _hashCode += getTimePlaced().hashCode();
        }
        if (getRefOrderID() != null) {
            _hashCode += getRefOrderID().hashCode();
        }
        _hashCode += new Double(getExecAmount()).hashCode();
        if (getVIA() != null) {
            _hashCode += getVIA().hashCode();
        }
        if (getSentTime() != null) {
            _hashCode += getSentTime().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Orderbook.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Orderbook"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderNumber"));
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
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PriceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("timeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averagePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AveragePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExecutedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RemainQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CancelQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ModifyQuantity"));
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
        elemField.setFieldName("cancelStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CancelStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ModifyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePlaced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TimePlaced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "RefOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExecAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "VIA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Type"));
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
