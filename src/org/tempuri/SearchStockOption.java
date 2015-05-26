/**
 * SearchStockOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SearchStockOption  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String symbol;

    private java.lang.String type;

    private java.lang.String status;

    private java.util.Calendar fromRightDate;

    private java.util.Calendar toRightDate;

    private java.util.Calendar fromEventDate;

    private java.util.Calendar toEventDate;

    private org.tempuri.PagingInfo searchPagingInfo;

    public SearchStockOption() {
    }

    public SearchStockOption(
           java.lang.String accountNumber,
           java.lang.String symbol,
           java.lang.String type,
           java.lang.String status,
           java.util.Calendar fromRightDate,
           java.util.Calendar toRightDate,
           java.util.Calendar fromEventDate,
           java.util.Calendar toEventDate,
           org.tempuri.PagingInfo searchPagingInfo) {
        this.accountNumber = accountNumber;
        this.symbol = symbol;
        this.type = type;
        this.status = status;
        this.fromRightDate = fromRightDate;
        this.toRightDate = toRightDate;
        this.fromEventDate = fromEventDate;
        this.toEventDate = toEventDate;
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the accountNumber value for this SearchStockOption.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this SearchStockOption.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the symbol value for this SearchStockOption.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this SearchStockOption.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the type value for this SearchStockOption.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SearchStockOption.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the status value for this SearchStockOption.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchStockOption.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the fromRightDate value for this SearchStockOption.
     * 
     * @return fromRightDate
     */
    public java.util.Calendar getFromRightDate() {
        return fromRightDate;
    }


    /**
     * Sets the fromRightDate value for this SearchStockOption.
     * 
     * @param fromRightDate
     */
    public void setFromRightDate(java.util.Calendar fromRightDate) {
        this.fromRightDate = fromRightDate;
    }


    /**
     * Gets the toRightDate value for this SearchStockOption.
     * 
     * @return toRightDate
     */
    public java.util.Calendar getToRightDate() {
        return toRightDate;
    }


    /**
     * Sets the toRightDate value for this SearchStockOption.
     * 
     * @param toRightDate
     */
    public void setToRightDate(java.util.Calendar toRightDate) {
        this.toRightDate = toRightDate;
    }


    /**
     * Gets the fromEventDate value for this SearchStockOption.
     * 
     * @return fromEventDate
     */
    public java.util.Calendar getFromEventDate() {
        return fromEventDate;
    }


    /**
     * Sets the fromEventDate value for this SearchStockOption.
     * 
     * @param fromEventDate
     */
    public void setFromEventDate(java.util.Calendar fromEventDate) {
        this.fromEventDate = fromEventDate;
    }


    /**
     * Gets the toEventDate value for this SearchStockOption.
     * 
     * @return toEventDate
     */
    public java.util.Calendar getToEventDate() {
        return toEventDate;
    }


    /**
     * Sets the toEventDate value for this SearchStockOption.
     * 
     * @param toEventDate
     */
    public void setToEventDate(java.util.Calendar toEventDate) {
        this.toEventDate = toEventDate;
    }


    /**
     * Gets the searchPagingInfo value for this SearchStockOption.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this SearchStockOption.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchStockOption)) return false;
        SearchStockOption other = (SearchStockOption) obj;
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
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.fromRightDate==null && other.getFromRightDate()==null) || 
             (this.fromRightDate!=null &&
              this.fromRightDate.equals(other.getFromRightDate()))) &&
            ((this.toRightDate==null && other.getToRightDate()==null) || 
             (this.toRightDate!=null &&
              this.toRightDate.equals(other.getToRightDate()))) &&
            ((this.fromEventDate==null && other.getFromEventDate()==null) || 
             (this.fromEventDate!=null &&
              this.fromEventDate.equals(other.getFromEventDate()))) &&
            ((this.toEventDate==null && other.getToEventDate()==null) || 
             (this.toEventDate!=null &&
              this.toEventDate.equals(other.getToEventDate()))) &&
            ((this.searchPagingInfo==null && other.getSearchPagingInfo()==null) || 
             (this.searchPagingInfo!=null &&
              this.searchPagingInfo.equals(other.getSearchPagingInfo())));
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
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFromRightDate() != null) {
            _hashCode += getFromRightDate().hashCode();
        }
        if (getToRightDate() != null) {
            _hashCode += getToRightDate().hashCode();
        }
        if (getFromEventDate() != null) {
            _hashCode += getFromEventDate().hashCode();
        }
        if (getToEventDate() != null) {
            _hashCode += getToEventDate().hashCode();
        }
        if (getSearchPagingInfo() != null) {
            _hashCode += getSearchPagingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchStockOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SearchStockOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountNumber"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Type"));
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
        elemField.setFieldName("fromRightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FromRightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toRightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ToRightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FromEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ToEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "searchPagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PagingInfo"));
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
