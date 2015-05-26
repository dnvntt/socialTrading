/**
 * AccountFeatures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AccountFeatures  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String transactionType;

    private java.lang.String placeOrderOnline;

    private java.lang.String placeOrderByTelephone;

    private java.lang.String placeOrderAtFloor;

    private java.lang.String periodReceivingStatements;

    private java.lang.String receivingTradeConfirmationsMethod;

    public AccountFeatures() {
    }

    public AccountFeatures(
           java.lang.String accountNumber,
           java.lang.String transactionType,
           java.lang.String placeOrderOnline,
           java.lang.String placeOrderByTelephone,
           java.lang.String placeOrderAtFloor,
           java.lang.String periodReceivingStatements,
           java.lang.String receivingTradeConfirmationsMethod) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.placeOrderOnline = placeOrderOnline;
        this.placeOrderByTelephone = placeOrderByTelephone;
        this.placeOrderAtFloor = placeOrderAtFloor;
        this.periodReceivingStatements = periodReceivingStatements;
        this.receivingTradeConfirmationsMethod = receivingTradeConfirmationsMethod;
    }


    /**
     * Gets the accountNumber value for this AccountFeatures.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this AccountFeatures.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the transactionType value for this AccountFeatures.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this AccountFeatures.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the placeOrderOnline value for this AccountFeatures.
     * 
     * @return placeOrderOnline
     */
    public java.lang.String getPlaceOrderOnline() {
        return placeOrderOnline;
    }


    /**
     * Sets the placeOrderOnline value for this AccountFeatures.
     * 
     * @param placeOrderOnline
     */
    public void setPlaceOrderOnline(java.lang.String placeOrderOnline) {
        this.placeOrderOnline = placeOrderOnline;
    }


    /**
     * Gets the placeOrderByTelephone value for this AccountFeatures.
     * 
     * @return placeOrderByTelephone
     */
    public java.lang.String getPlaceOrderByTelephone() {
        return placeOrderByTelephone;
    }


    /**
     * Sets the placeOrderByTelephone value for this AccountFeatures.
     * 
     * @param placeOrderByTelephone
     */
    public void setPlaceOrderByTelephone(java.lang.String placeOrderByTelephone) {
        this.placeOrderByTelephone = placeOrderByTelephone;
    }


    /**
     * Gets the placeOrderAtFloor value for this AccountFeatures.
     * 
     * @return placeOrderAtFloor
     */
    public java.lang.String getPlaceOrderAtFloor() {
        return placeOrderAtFloor;
    }


    /**
     * Sets the placeOrderAtFloor value for this AccountFeatures.
     * 
     * @param placeOrderAtFloor
     */
    public void setPlaceOrderAtFloor(java.lang.String placeOrderAtFloor) {
        this.placeOrderAtFloor = placeOrderAtFloor;
    }


    /**
     * Gets the periodReceivingStatements value for this AccountFeatures.
     * 
     * @return periodReceivingStatements
     */
    public java.lang.String getPeriodReceivingStatements() {
        return periodReceivingStatements;
    }


    /**
     * Sets the periodReceivingStatements value for this AccountFeatures.
     * 
     * @param periodReceivingStatements
     */
    public void setPeriodReceivingStatements(java.lang.String periodReceivingStatements) {
        this.periodReceivingStatements = periodReceivingStatements;
    }


    /**
     * Gets the receivingTradeConfirmationsMethod value for this AccountFeatures.
     * 
     * @return receivingTradeConfirmationsMethod
     */
    public java.lang.String getReceivingTradeConfirmationsMethod() {
        return receivingTradeConfirmationsMethod;
    }


    /**
     * Sets the receivingTradeConfirmationsMethod value for this AccountFeatures.
     * 
     * @param receivingTradeConfirmationsMethod
     */
    public void setReceivingTradeConfirmationsMethod(java.lang.String receivingTradeConfirmationsMethod) {
        this.receivingTradeConfirmationsMethod = receivingTradeConfirmationsMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountFeatures)) return false;
        AccountFeatures other = (AccountFeatures) obj;
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
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.placeOrderOnline==null && other.getPlaceOrderOnline()==null) || 
             (this.placeOrderOnline!=null &&
              this.placeOrderOnline.equals(other.getPlaceOrderOnline()))) &&
            ((this.placeOrderByTelephone==null && other.getPlaceOrderByTelephone()==null) || 
             (this.placeOrderByTelephone!=null &&
              this.placeOrderByTelephone.equals(other.getPlaceOrderByTelephone()))) &&
            ((this.placeOrderAtFloor==null && other.getPlaceOrderAtFloor()==null) || 
             (this.placeOrderAtFloor!=null &&
              this.placeOrderAtFloor.equals(other.getPlaceOrderAtFloor()))) &&
            ((this.periodReceivingStatements==null && other.getPeriodReceivingStatements()==null) || 
             (this.periodReceivingStatements!=null &&
              this.periodReceivingStatements.equals(other.getPeriodReceivingStatements()))) &&
            ((this.receivingTradeConfirmationsMethod==null && other.getReceivingTradeConfirmationsMethod()==null) || 
             (this.receivingTradeConfirmationsMethod!=null &&
              this.receivingTradeConfirmationsMethod.equals(other.getReceivingTradeConfirmationsMethod())));
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
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getPlaceOrderOnline() != null) {
            _hashCode += getPlaceOrderOnline().hashCode();
        }
        if (getPlaceOrderByTelephone() != null) {
            _hashCode += getPlaceOrderByTelephone().hashCode();
        }
        if (getPlaceOrderAtFloor() != null) {
            _hashCode += getPlaceOrderAtFloor().hashCode();
        }
        if (getPeriodReceivingStatements() != null) {
            _hashCode += getPeriodReceivingStatements().hashCode();
        }
        if (getReceivingTradeConfirmationsMethod() != null) {
            _hashCode += getReceivingTradeConfirmationsMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountFeatures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AccountFeatures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeOrderOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PlaceOrderOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeOrderByTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PlaceOrderByTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeOrderAtFloor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PlaceOrderAtFloor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodReceivingStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PeriodReceivingStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingTradeConfirmationsMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ReceivingTradeConfirmationsMethod"));
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
