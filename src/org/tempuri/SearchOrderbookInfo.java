/**
 * SearchOrderbookInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SearchOrderbookInfo  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String afacctno;

    private java.lang.String confirmStatus;

    private java.lang.String odtype;

    private java.util.Calendar fromDate;

    private org.tempuri.PagingInfo searchPagingInfo;

    private java.util.Calendar toDate;

    private java.lang.String symbol;

    public SearchOrderbookInfo() {
    }

    public SearchOrderbookInfo(
           java.lang.String afacctno,
           java.lang.String confirmStatus,
           java.lang.String odtype,
           java.util.Calendar fromDate,
           org.tempuri.PagingInfo searchPagingInfo,
           java.util.Calendar toDate,
           java.lang.String symbol) {
        this.afacctno = afacctno;
        this.confirmStatus = confirmStatus;
        this.odtype = odtype;
        this.fromDate = fromDate;
        this.searchPagingInfo = searchPagingInfo;
        this.toDate = toDate;
        this.symbol = symbol;
    }


    /**
     * Gets the afacctno value for this SearchOrderbookInfo.
     * 
     * @return afacctno
     */
    public java.lang.String getAfacctno() {
        return afacctno;
    }


    /**
     * Sets the afacctno value for this SearchOrderbookInfo.
     * 
     * @param afacctno
     */
    public void setAfacctno(java.lang.String afacctno) {
        this.afacctno = afacctno;
    }


    /**
     * Gets the confirmStatus value for this SearchOrderbookInfo.
     * 
     * @return confirmStatus
     */
    public java.lang.String getConfirmStatus() {
        return confirmStatus;
    }


    /**
     * Sets the confirmStatus value for this SearchOrderbookInfo.
     * 
     * @param confirmStatus
     */
    public void setConfirmStatus(java.lang.String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }


    /**
     * Gets the odtype value for this SearchOrderbookInfo.
     * 
     * @return odtype
     */
    public java.lang.String getOdtype() {
        return odtype;
    }


    /**
     * Sets the odtype value for this SearchOrderbookInfo.
     * 
     * @param odtype
     */
    public void setOdtype(java.lang.String odtype) {
        this.odtype = odtype;
    }


    /**
     * Gets the fromDate value for this SearchOrderbookInfo.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this SearchOrderbookInfo.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the searchPagingInfo value for this SearchOrderbookInfo.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this SearchOrderbookInfo.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the toDate value for this SearchOrderbookInfo.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this SearchOrderbookInfo.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the symbol value for this SearchOrderbookInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this SearchOrderbookInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchOrderbookInfo)) return false;
        SearchOrderbookInfo other = (SearchOrderbookInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.afacctno==null && other.getAfacctno()==null) || 
             (this.afacctno!=null &&
              this.afacctno.equals(other.getAfacctno()))) &&
            ((this.confirmStatus==null && other.getConfirmStatus()==null) || 
             (this.confirmStatus!=null &&
              this.confirmStatus.equals(other.getConfirmStatus()))) &&
            ((this.odtype==null && other.getOdtype()==null) || 
             (this.odtype!=null &&
              this.odtype.equals(other.getOdtype()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.searchPagingInfo==null && other.getSearchPagingInfo()==null) || 
             (this.searchPagingInfo!=null &&
              this.searchPagingInfo.equals(other.getSearchPagingInfo()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol())));
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
        if (getAfacctno() != null) {
            _hashCode += getAfacctno().hashCode();
        }
        if (getConfirmStatus() != null) {
            _hashCode += getConfirmStatus().hashCode();
        }
        if (getOdtype() != null) {
            _hashCode += getOdtype().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getSearchPagingInfo() != null) {
            _hashCode += getSearchPagingInfo().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchOrderbookInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SearchOrderbookInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afacctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Afacctno"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Odtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SearchPagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PagingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ToDate"));
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
