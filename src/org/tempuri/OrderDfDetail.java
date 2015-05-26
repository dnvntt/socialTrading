/**
 * OrderDfDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderDfDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String acctno;

    private java.lang.String dfType;

    private java.lang.String symbol;

    private double dfQtty;

    private java.lang.String status;

    private java.util.Calendar txdate;

    private java.util.Calendar duedate;

    private double principalDebtUnpaid;

    private double interestUnpaid;

    private double totalDebtPayable;

    private double dfrate;

    private double dfCallAmt;

    private java.lang.String warning;

    private double dfRtt;

    private double dfPrice;

    private double sellQtty;

    private double blockDealPayment;

    public OrderDfDetail() {
    }

    public OrderDfDetail(
           java.lang.String acctno,
           java.lang.String dfType,
           java.lang.String symbol,
           double dfQtty,
           java.lang.String status,
           java.util.Calendar txdate,
           java.util.Calendar duedate,
           double principalDebtUnpaid,
           double interestUnpaid,
           double totalDebtPayable,
           double dfrate,
           double dfCallAmt,
           java.lang.String warning,
           double dfRtt,
           double dfPrice,
           double sellQtty,
           double blockDealPayment) {
        this.acctno = acctno;
        this.dfType = dfType;
        this.symbol = symbol;
        this.dfQtty = dfQtty;
        this.status = status;
        this.txdate = txdate;
        this.duedate = duedate;
        this.principalDebtUnpaid = principalDebtUnpaid;
        this.interestUnpaid = interestUnpaid;
        this.totalDebtPayable = totalDebtPayable;
        this.dfrate = dfrate;
        this.dfCallAmt = dfCallAmt;
        this.warning = warning;
        this.dfRtt = dfRtt;
        this.dfPrice = dfPrice;
        this.sellQtty = sellQtty;
        this.blockDealPayment = blockDealPayment;
    }


    /**
     * Gets the acctno value for this OrderDfDetail.
     * 
     * @return acctno
     */
    public java.lang.String getAcctno() {
        return acctno;
    }


    /**
     * Sets the acctno value for this OrderDfDetail.
     * 
     * @param acctno
     */
    public void setAcctno(java.lang.String acctno) {
        this.acctno = acctno;
    }


    /**
     * Gets the dfType value for this OrderDfDetail.
     * 
     * @return dfType
     */
    public java.lang.String getDfType() {
        return dfType;
    }


    /**
     * Sets the dfType value for this OrderDfDetail.
     * 
     * @param dfType
     */
    public void setDfType(java.lang.String dfType) {
        this.dfType = dfType;
    }


    /**
     * Gets the symbol value for this OrderDfDetail.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this OrderDfDetail.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the dfQtty value for this OrderDfDetail.
     * 
     * @return dfQtty
     */
    public double getDfQtty() {
        return dfQtty;
    }


    /**
     * Sets the dfQtty value for this OrderDfDetail.
     * 
     * @param dfQtty
     */
    public void setDfQtty(double dfQtty) {
        this.dfQtty = dfQtty;
    }


    /**
     * Gets the status value for this OrderDfDetail.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderDfDetail.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the txdate value for this OrderDfDetail.
     * 
     * @return txdate
     */
    public java.util.Calendar getTxdate() {
        return txdate;
    }


    /**
     * Sets the txdate value for this OrderDfDetail.
     * 
     * @param txdate
     */
    public void setTxdate(java.util.Calendar txdate) {
        this.txdate = txdate;
    }


    /**
     * Gets the duedate value for this OrderDfDetail.
     * 
     * @return duedate
     */
    public java.util.Calendar getDuedate() {
        return duedate;
    }


    /**
     * Sets the duedate value for this OrderDfDetail.
     * 
     * @param duedate
     */
    public void setDuedate(java.util.Calendar duedate) {
        this.duedate = duedate;
    }


    /**
     * Gets the principalDebtUnpaid value for this OrderDfDetail.
     * 
     * @return principalDebtUnpaid
     */
    public double getPrincipalDebtUnpaid() {
        return principalDebtUnpaid;
    }


    /**
     * Sets the principalDebtUnpaid value for this OrderDfDetail.
     * 
     * @param principalDebtUnpaid
     */
    public void setPrincipalDebtUnpaid(double principalDebtUnpaid) {
        this.principalDebtUnpaid = principalDebtUnpaid;
    }


    /**
     * Gets the interestUnpaid value for this OrderDfDetail.
     * 
     * @return interestUnpaid
     */
    public double getInterestUnpaid() {
        return interestUnpaid;
    }


    /**
     * Sets the interestUnpaid value for this OrderDfDetail.
     * 
     * @param interestUnpaid
     */
    public void setInterestUnpaid(double interestUnpaid) {
        this.interestUnpaid = interestUnpaid;
    }


    /**
     * Gets the totalDebtPayable value for this OrderDfDetail.
     * 
     * @return totalDebtPayable
     */
    public double getTotalDebtPayable() {
        return totalDebtPayable;
    }


    /**
     * Sets the totalDebtPayable value for this OrderDfDetail.
     * 
     * @param totalDebtPayable
     */
    public void setTotalDebtPayable(double totalDebtPayable) {
        this.totalDebtPayable = totalDebtPayable;
    }


    /**
     * Gets the dfrate value for this OrderDfDetail.
     * 
     * @return dfrate
     */
    public double getDfrate() {
        return dfrate;
    }


    /**
     * Sets the dfrate value for this OrderDfDetail.
     * 
     * @param dfrate
     */
    public void setDfrate(double dfrate) {
        this.dfrate = dfrate;
    }


    /**
     * Gets the dfCallAmt value for this OrderDfDetail.
     * 
     * @return dfCallAmt
     */
    public double getDfCallAmt() {
        return dfCallAmt;
    }


    /**
     * Sets the dfCallAmt value for this OrderDfDetail.
     * 
     * @param dfCallAmt
     */
    public void setDfCallAmt(double dfCallAmt) {
        this.dfCallAmt = dfCallAmt;
    }


    /**
     * Gets the warning value for this OrderDfDetail.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this OrderDfDetail.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }


    /**
     * Gets the dfRtt value for this OrderDfDetail.
     * 
     * @return dfRtt
     */
    public double getDfRtt() {
        return dfRtt;
    }


    /**
     * Sets the dfRtt value for this OrderDfDetail.
     * 
     * @param dfRtt
     */
    public void setDfRtt(double dfRtt) {
        this.dfRtt = dfRtt;
    }


    /**
     * Gets the dfPrice value for this OrderDfDetail.
     * 
     * @return dfPrice
     */
    public double getDfPrice() {
        return dfPrice;
    }


    /**
     * Sets the dfPrice value for this OrderDfDetail.
     * 
     * @param dfPrice
     */
    public void setDfPrice(double dfPrice) {
        this.dfPrice = dfPrice;
    }


    /**
     * Gets the sellQtty value for this OrderDfDetail.
     * 
     * @return sellQtty
     */
    public double getSellQtty() {
        return sellQtty;
    }


    /**
     * Sets the sellQtty value for this OrderDfDetail.
     * 
     * @param sellQtty
     */
    public void setSellQtty(double sellQtty) {
        this.sellQtty = sellQtty;
    }


    /**
     * Gets the blockDealPayment value for this OrderDfDetail.
     * 
     * @return blockDealPayment
     */
    public double getBlockDealPayment() {
        return blockDealPayment;
    }


    /**
     * Sets the blockDealPayment value for this OrderDfDetail.
     * 
     * @param blockDealPayment
     */
    public void setBlockDealPayment(double blockDealPayment) {
        this.blockDealPayment = blockDealPayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDfDetail)) return false;
        OrderDfDetail other = (OrderDfDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctno==null && other.getAcctno()==null) || 
             (this.acctno!=null &&
              this.acctno.equals(other.getAcctno()))) &&
            ((this.dfType==null && other.getDfType()==null) || 
             (this.dfType!=null &&
              this.dfType.equals(other.getDfType()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.dfQtty == other.getDfQtty() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.txdate==null && other.getTxdate()==null) || 
             (this.txdate!=null &&
              this.txdate.equals(other.getTxdate()))) &&
            ((this.duedate==null && other.getDuedate()==null) || 
             (this.duedate!=null &&
              this.duedate.equals(other.getDuedate()))) &&
            this.principalDebtUnpaid == other.getPrincipalDebtUnpaid() &&
            this.interestUnpaid == other.getInterestUnpaid() &&
            this.totalDebtPayable == other.getTotalDebtPayable() &&
            this.dfrate == other.getDfrate() &&
            this.dfCallAmt == other.getDfCallAmt() &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning()))) &&
            this.dfRtt == other.getDfRtt() &&
            this.dfPrice == other.getDfPrice() &&
            this.sellQtty == other.getSellQtty() &&
            this.blockDealPayment == other.getBlockDealPayment();
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
        if (getAcctno() != null) {
            _hashCode += getAcctno().hashCode();
        }
        if (getDfType() != null) {
            _hashCode += getDfType().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += new Double(getDfQtty()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTxdate() != null) {
            _hashCode += getTxdate().hashCode();
        }
        if (getDuedate() != null) {
            _hashCode += getDuedate().hashCode();
        }
        _hashCode += new Double(getPrincipalDebtUnpaid()).hashCode();
        _hashCode += new Double(getInterestUnpaid()).hashCode();
        _hashCode += new Double(getTotalDebtPayable()).hashCode();
        _hashCode += new Double(getDfrate()).hashCode();
        _hashCode += new Double(getDfCallAmt()).hashCode();
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        _hashCode += new Double(getDfRtt()).hashCode();
        _hashCode += new Double(getDfPrice()).hashCode();
        _hashCode += new Double(getSellQtty()).hashCode();
        _hashCode += new Double(getBlockDealPayment()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDfDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Acctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DfType"));
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
        elemField.setFieldName("dfQtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DfQtty"));
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
        elemField.setFieldName("txdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Txdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duedate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Duedate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principalDebtUnpaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PrincipalDebtUnpaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestUnpaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "InterestUnpaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDebtPayable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TotalDebtPayable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Dfrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfCallAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DfCallAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfRtt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DfRtt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DfPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellQtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SellQtty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockDealPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BlockDealPayment"));
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
