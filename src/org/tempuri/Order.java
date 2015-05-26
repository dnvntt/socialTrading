/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Order  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String orderNumber;

    private java.lang.String type;

    private java.lang.String orderType;

    private int quantity;

    private int executedQuantity;

    private java.lang.String symbol;

    private java.lang.String priceType;

    private java.lang.String price;

    private double priceExecuted;

    private java.lang.String term;

    private java.lang.String status;

    private java.util.Calendar timePlaced;

    private java.util.Calendar expiredDate;

    private java.lang.String means;

    private java.lang.String AON;

    private java.lang.String voucher;

    private double stopPrice;

    private double limitPrice;

    private double commissionFree;

    private java.lang.String via;

    private java.lang.String duplicateConfirm;

    private java.lang.String correctStatus;

    private java.util.Calendar sentTime;

    private int cancelQuantity;

    private java.lang.String refOrderID;

    private double depositRatio;

    private java.lang.String allowOverPrice;

    private int clearDay;

    private java.lang.String clearCode;

    public Order() {
    }

    public Order(
           java.lang.String accountNumber,
           java.lang.String orderNumber,
           java.lang.String type,
           java.lang.String orderType,
           int quantity,
           int executedQuantity,
           java.lang.String symbol,
           java.lang.String priceType,
           java.lang.String price,
           double priceExecuted,
           java.lang.String term,
           java.lang.String status,
           java.util.Calendar timePlaced,
           java.util.Calendar expiredDate,
           java.lang.String means,
           java.lang.String AON,
           java.lang.String voucher,
           double stopPrice,
           double limitPrice,
           double commissionFree,
           java.lang.String via,
           java.lang.String duplicateConfirm,
           java.lang.String correctStatus,
           java.util.Calendar sentTime,
           int cancelQuantity,
           java.lang.String refOrderID,
           double depositRatio,
           java.lang.String allowOverPrice,
           int clearDay,
           java.lang.String clearCode) {
        this.accountNumber = accountNumber;
        this.orderNumber = orderNumber;
        this.type = type;
        this.orderType = orderType;
        this.quantity = quantity;
        this.executedQuantity = executedQuantity;
        this.symbol = symbol;
        this.priceType = priceType;
        this.price = price;
        this.priceExecuted = priceExecuted;
        this.term = term;
        this.status = status;
        this.timePlaced = timePlaced;
        this.expiredDate = expiredDate;
        this.means = means;
        this.AON = AON;
        this.voucher = voucher;
        this.stopPrice = stopPrice;
        this.limitPrice = limitPrice;
        this.commissionFree = commissionFree;
        this.via = via;
        this.duplicateConfirm = duplicateConfirm;
        this.correctStatus = correctStatus;
        this.sentTime = sentTime;
        this.cancelQuantity = cancelQuantity;
        this.refOrderID = refOrderID;
        this.depositRatio = depositRatio;
        this.allowOverPrice = allowOverPrice;
        this.clearDay = clearDay;
        this.clearCode = clearCode;
    }


    /**
     * Gets the accountNumber value for this Order.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Order.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the orderNumber value for this Order.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Order.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the type value for this Order.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Order.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the orderType value for this Order.
     * 
     * @return orderType
     */
    public java.lang.String getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this Order.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the quantity value for this Order.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Order.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the executedQuantity value for this Order.
     * 
     * @return executedQuantity
     */
    public int getExecutedQuantity() {
        return executedQuantity;
    }


    /**
     * Sets the executedQuantity value for this Order.
     * 
     * @param executedQuantity
     */
    public void setExecutedQuantity(int executedQuantity) {
        this.executedQuantity = executedQuantity;
    }


    /**
     * Gets the symbol value for this Order.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this Order.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the priceType value for this Order.
     * 
     * @return priceType
     */
    public java.lang.String getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this Order.
     * 
     * @param priceType
     */
    public void setPriceType(java.lang.String priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the price value for this Order.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Order.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the priceExecuted value for this Order.
     * 
     * @return priceExecuted
     */
    public double getPriceExecuted() {
        return priceExecuted;
    }


    /**
     * Sets the priceExecuted value for this Order.
     * 
     * @param priceExecuted
     */
    public void setPriceExecuted(double priceExecuted) {
        this.priceExecuted = priceExecuted;
    }


    /**
     * Gets the term value for this Order.
     * 
     * @return term
     */
    public java.lang.String getTerm() {
        return term;
    }


    /**
     * Sets the term value for this Order.
     * 
     * @param term
     */
    public void setTerm(java.lang.String term) {
        this.term = term;
    }


    /**
     * Gets the status value for this Order.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Order.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the timePlaced value for this Order.
     * 
     * @return timePlaced
     */
    public java.util.Calendar getTimePlaced() {
        return timePlaced;
    }


    /**
     * Sets the timePlaced value for this Order.
     * 
     * @param timePlaced
     */
    public void setTimePlaced(java.util.Calendar timePlaced) {
        this.timePlaced = timePlaced;
    }


    /**
     * Gets the expiredDate value for this Order.
     * 
     * @return expiredDate
     */
    public java.util.Calendar getExpiredDate() {
        return expiredDate;
    }


    /**
     * Sets the expiredDate value for this Order.
     * 
     * @param expiredDate
     */
    public void setExpiredDate(java.util.Calendar expiredDate) {
        this.expiredDate = expiredDate;
    }


    /**
     * Gets the means value for this Order.
     * 
     * @return means
     */
    public java.lang.String getMeans() {
        return means;
    }


    /**
     * Sets the means value for this Order.
     * 
     * @param means
     */
    public void setMeans(java.lang.String means) {
        this.means = means;
    }


    /**
     * Gets the AON value for this Order.
     * 
     * @return AON
     */
    public java.lang.String getAON() {
        return AON;
    }


    /**
     * Sets the AON value for this Order.
     * 
     * @param AON
     */
    public void setAON(java.lang.String AON) {
        this.AON = AON;
    }


    /**
     * Gets the voucher value for this Order.
     * 
     * @return voucher
     */
    public java.lang.String getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this Order.
     * 
     * @param voucher
     */
    public void setVoucher(java.lang.String voucher) {
        this.voucher = voucher;
    }


    /**
     * Gets the stopPrice value for this Order.
     * 
     * @return stopPrice
     */
    public double getStopPrice() {
        return stopPrice;
    }


    /**
     * Sets the stopPrice value for this Order.
     * 
     * @param stopPrice
     */
    public void setStopPrice(double stopPrice) {
        this.stopPrice = stopPrice;
    }


    /**
     * Gets the limitPrice value for this Order.
     * 
     * @return limitPrice
     */
    public double getLimitPrice() {
        return limitPrice;
    }


    /**
     * Sets the limitPrice value for this Order.
     * 
     * @param limitPrice
     */
    public void setLimitPrice(double limitPrice) {
        this.limitPrice = limitPrice;
    }


    /**
     * Gets the commissionFree value for this Order.
     * 
     * @return commissionFree
     */
    public double getCommissionFree() {
        return commissionFree;
    }


    /**
     * Sets the commissionFree value for this Order.
     * 
     * @param commissionFree
     */
    public void setCommissionFree(double commissionFree) {
        this.commissionFree = commissionFree;
    }


    /**
     * Gets the via value for this Order.
     * 
     * @return via
     */
    public java.lang.String getVia() {
        return via;
    }


    /**
     * Sets the via value for this Order.
     * 
     * @param via
     */
    public void setVia(java.lang.String via) {
        this.via = via;
    }


    /**
     * Gets the duplicateConfirm value for this Order.
     * 
     * @return duplicateConfirm
     */
    public java.lang.String getDuplicateConfirm() {
        return duplicateConfirm;
    }


    /**
     * Sets the duplicateConfirm value for this Order.
     * 
     * @param duplicateConfirm
     */
    public void setDuplicateConfirm(java.lang.String duplicateConfirm) {
        this.duplicateConfirm = duplicateConfirm;
    }


    /**
     * Gets the correctStatus value for this Order.
     * 
     * @return correctStatus
     */
    public java.lang.String getCorrectStatus() {
        return correctStatus;
    }


    /**
     * Sets the correctStatus value for this Order.
     * 
     * @param correctStatus
     */
    public void setCorrectStatus(java.lang.String correctStatus) {
        this.correctStatus = correctStatus;
    }


    /**
     * Gets the sentTime value for this Order.
     * 
     * @return sentTime
     */
    public java.util.Calendar getSentTime() {
        return sentTime;
    }


    /**
     * Sets the sentTime value for this Order.
     * 
     * @param sentTime
     */
    public void setSentTime(java.util.Calendar sentTime) {
        this.sentTime = sentTime;
    }


    /**
     * Gets the cancelQuantity value for this Order.
     * 
     * @return cancelQuantity
     */
    public int getCancelQuantity() {
        return cancelQuantity;
    }


    /**
     * Sets the cancelQuantity value for this Order.
     * 
     * @param cancelQuantity
     */
    public void setCancelQuantity(int cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }


    /**
     * Gets the refOrderID value for this Order.
     * 
     * @return refOrderID
     */
    public java.lang.String getRefOrderID() {
        return refOrderID;
    }


    /**
     * Sets the refOrderID value for this Order.
     * 
     * @param refOrderID
     */
    public void setRefOrderID(java.lang.String refOrderID) {
        this.refOrderID = refOrderID;
    }


    /**
     * Gets the depositRatio value for this Order.
     * 
     * @return depositRatio
     */
    public double getDepositRatio() {
        return depositRatio;
    }


    /**
     * Sets the depositRatio value for this Order.
     * 
     * @param depositRatio
     */
    public void setDepositRatio(double depositRatio) {
        this.depositRatio = depositRatio;
    }


    /**
     * Gets the allowOverPrice value for this Order.
     * 
     * @return allowOverPrice
     */
    public java.lang.String getAllowOverPrice() {
        return allowOverPrice;
    }


    /**
     * Sets the allowOverPrice value for this Order.
     * 
     * @param allowOverPrice
     */
    public void setAllowOverPrice(java.lang.String allowOverPrice) {
        this.allowOverPrice = allowOverPrice;
    }


    /**
     * Gets the clearDay value for this Order.
     * 
     * @return clearDay
     */
    public int getClearDay() {
        return clearDay;
    }


    /**
     * Sets the clearDay value for this Order.
     * 
     * @param clearDay
     */
    public void setClearDay(int clearDay) {
        this.clearDay = clearDay;
    }


    /**
     * Gets the clearCode value for this Order.
     * 
     * @return clearCode
     */
    public java.lang.String getClearCode() {
        return clearCode;
    }


    /**
     * Sets the clearCode value for this Order.
     * 
     * @param clearCode
     */
    public void setClearCode(java.lang.String clearCode) {
        this.clearCode = clearCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            this.quantity == other.getQuantity() &&
            this.executedQuantity == other.getExecutedQuantity() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            this.priceExecuted == other.getPriceExecuted() &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              this.term.equals(other.getTerm()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timePlaced==null && other.getTimePlaced()==null) || 
             (this.timePlaced!=null &&
              this.timePlaced.equals(other.getTimePlaced()))) &&
            ((this.expiredDate==null && other.getExpiredDate()==null) || 
             (this.expiredDate!=null &&
              this.expiredDate.equals(other.getExpiredDate()))) &&
            ((this.means==null && other.getMeans()==null) || 
             (this.means!=null &&
              this.means.equals(other.getMeans()))) &&
            ((this.AON==null && other.getAON()==null) || 
             (this.AON!=null &&
              this.AON.equals(other.getAON()))) &&
            ((this.voucher==null && other.getVoucher()==null) || 
             (this.voucher!=null &&
              this.voucher.equals(other.getVoucher()))) &&
            this.stopPrice == other.getStopPrice() &&
            this.limitPrice == other.getLimitPrice() &&
            this.commissionFree == other.getCommissionFree() &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              this.via.equals(other.getVia()))) &&
            ((this.duplicateConfirm==null && other.getDuplicateConfirm()==null) || 
             (this.duplicateConfirm!=null &&
              this.duplicateConfirm.equals(other.getDuplicateConfirm()))) &&
            ((this.correctStatus==null && other.getCorrectStatus()==null) || 
             (this.correctStatus!=null &&
              this.correctStatus.equals(other.getCorrectStatus()))) &&
            ((this.sentTime==null && other.getSentTime()==null) || 
             (this.sentTime!=null &&
              this.sentTime.equals(other.getSentTime()))) &&
            this.cancelQuantity == other.getCancelQuantity() &&
            ((this.refOrderID==null && other.getRefOrderID()==null) || 
             (this.refOrderID!=null &&
              this.refOrderID.equals(other.getRefOrderID()))) &&
            this.depositRatio == other.getDepositRatio() &&
            ((this.allowOverPrice==null && other.getAllowOverPrice()==null) || 
             (this.allowOverPrice!=null &&
              this.allowOverPrice.equals(other.getAllowOverPrice()))) &&
            this.clearDay == other.getClearDay() &&
            ((this.clearCode==null && other.getClearCode()==null) || 
             (this.clearCode!=null &&
              this.clearCode.equals(other.getClearCode())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        _hashCode += getQuantity();
        _hashCode += getExecutedQuantity();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        _hashCode += new Double(getPriceExecuted()).hashCode();
        if (getTerm() != null) {
            _hashCode += getTerm().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimePlaced() != null) {
            _hashCode += getTimePlaced().hashCode();
        }
        if (getExpiredDate() != null) {
            _hashCode += getExpiredDate().hashCode();
        }
        if (getMeans() != null) {
            _hashCode += getMeans().hashCode();
        }
        if (getAON() != null) {
            _hashCode += getAON().hashCode();
        }
        if (getVoucher() != null) {
            _hashCode += getVoucher().hashCode();
        }
        _hashCode += new Double(getStopPrice()).hashCode();
        _hashCode += new Double(getLimitPrice()).hashCode();
        _hashCode += new Double(getCommissionFree()).hashCode();
        if (getVia() != null) {
            _hashCode += getVia().hashCode();
        }
        if (getDuplicateConfirm() != null) {
            _hashCode += getDuplicateConfirm().hashCode();
        }
        if (getCorrectStatus() != null) {
            _hashCode += getCorrectStatus().hashCode();
        }
        if (getSentTime() != null) {
            _hashCode += getSentTime().hashCode();
        }
        _hashCode += getCancelQuantity();
        if (getRefOrderID() != null) {
            _hashCode += getRefOrderID().hashCode();
        }
        _hashCode += new Double(getDepositRatio()).hashCode();
        if (getAllowOverPrice() != null) {
            _hashCode += getAllowOverPrice().hashCode();
        }
        _hashCode += getClearDay();
        if (getClearCode() != null) {
            _hashCode += getClearCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Order"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Type"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExecutedQuantity"));
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
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PriceType"));
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
        elemField.setFieldName("priceExecuted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PriceExecuted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("timePlaced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TimePlaced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ExpiredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("means");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Means"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AON");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Voucher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "StopPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "LimitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionFree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CommissionFree"));
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
        elemField.setFieldName("duplicateConfirm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DuplicateConfirm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CorrectStatus"));
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
        elemField.setFieldName("cancelQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CancelQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("depositRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DepositRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AllowOverPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ClearDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ClearCode"));
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
