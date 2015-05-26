/**
 * SearchOrdersell4Vnd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SearchOrdersell4Vnd  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.OddQttyOrderSell4Vnd oddQttyOrderSell4Vnd;

    private org.tempuri.PagingInfo searchPagingInfo;

    private java.util.Calendar toDate;

    private java.util.Calendar fromDate;

    public SearchOrdersell4Vnd() {
    }

    public SearchOrdersell4Vnd(
           org.tempuri.OddQttyOrderSell4Vnd oddQttyOrderSell4Vnd,
           org.tempuri.PagingInfo searchPagingInfo,
           java.util.Calendar toDate,
           java.util.Calendar fromDate) {
        this.oddQttyOrderSell4Vnd = oddQttyOrderSell4Vnd;
        this.searchPagingInfo = searchPagingInfo;
        this.toDate = toDate;
        this.fromDate = fromDate;
    }


    /**
     * Gets the oddQttyOrderSell4Vnd value for this SearchOrdersell4Vnd.
     * 
     * @return oddQttyOrderSell4Vnd
     */
    public org.tempuri.OddQttyOrderSell4Vnd getOddQttyOrderSell4Vnd() {
        return oddQttyOrderSell4Vnd;
    }


    /**
     * Sets the oddQttyOrderSell4Vnd value for this SearchOrdersell4Vnd.
     * 
     * @param oddQttyOrderSell4Vnd
     */
    public void setOddQttyOrderSell4Vnd(org.tempuri.OddQttyOrderSell4Vnd oddQttyOrderSell4Vnd) {
        this.oddQttyOrderSell4Vnd = oddQttyOrderSell4Vnd;
    }


    /**
     * Gets the searchPagingInfo value for this SearchOrdersell4Vnd.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this SearchOrdersell4Vnd.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the toDate value for this SearchOrdersell4Vnd.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this SearchOrdersell4Vnd.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the fromDate value for this SearchOrdersell4Vnd.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this SearchOrdersell4Vnd.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchOrdersell4Vnd)) return false;
        SearchOrdersell4Vnd other = (SearchOrdersell4Vnd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oddQttyOrderSell4Vnd==null && other.getOddQttyOrderSell4Vnd()==null) || 
             (this.oddQttyOrderSell4Vnd!=null &&
              this.oddQttyOrderSell4Vnd.equals(other.getOddQttyOrderSell4Vnd()))) &&
            ((this.searchPagingInfo==null && other.getSearchPagingInfo()==null) || 
             (this.searchPagingInfo!=null &&
              this.searchPagingInfo.equals(other.getSearchPagingInfo()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate())));
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
        if (getOddQttyOrderSell4Vnd() != null) {
            _hashCode += getOddQttyOrderSell4Vnd().hashCode();
        }
        if (getSearchPagingInfo() != null) {
            _hashCode += getSearchPagingInfo().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchOrdersell4Vnd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SearchOrdersell4vnd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oddQttyOrderSell4Vnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrderSell4vnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrderSell4vnd"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FromDate"));
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
