/**
 * SearchOddQttyOrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SearchOddQttyOrderInfo  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.OddQttyOrder oddQttyOrder;

    private org.tempuri.PagingInfo searchPagingInfo;

    private java.util.Calendar toDate;

    private java.util.Calendar fromDate;

    public SearchOddQttyOrderInfo() {
    }

    public SearchOddQttyOrderInfo(
           org.tempuri.OddQttyOrder oddQttyOrder,
           org.tempuri.PagingInfo searchPagingInfo,
           java.util.Calendar toDate,
           java.util.Calendar fromDate) {
        this.oddQttyOrder = oddQttyOrder;
        this.searchPagingInfo = searchPagingInfo;
        this.toDate = toDate;
        this.fromDate = fromDate;
    }


    /**
     * Gets the oddQttyOrder value for this SearchOddQttyOrderInfo.
     * 
     * @return oddQttyOrder
     */
    public org.tempuri.OddQttyOrder getOddQttyOrder() {
        return oddQttyOrder;
    }


    /**
     * Sets the oddQttyOrder value for this SearchOddQttyOrderInfo.
     * 
     * @param oddQttyOrder
     */
    public void setOddQttyOrder(org.tempuri.OddQttyOrder oddQttyOrder) {
        this.oddQttyOrder = oddQttyOrder;
    }


    /**
     * Gets the searchPagingInfo value for this SearchOddQttyOrderInfo.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this SearchOddQttyOrderInfo.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the toDate value for this SearchOddQttyOrderInfo.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this SearchOddQttyOrderInfo.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the fromDate value for this SearchOddQttyOrderInfo.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this SearchOddQttyOrderInfo.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchOddQttyOrderInfo)) return false;
        SearchOddQttyOrderInfo other = (SearchOddQttyOrderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oddQttyOrder==null && other.getOddQttyOrder()==null) || 
             (this.oddQttyOrder!=null &&
              this.oddQttyOrder.equals(other.getOddQttyOrder()))) &&
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
        if (getOddQttyOrder() != null) {
            _hashCode += getOddQttyOrder().hashCode();
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
        new org.apache.axis.description.TypeDesc(SearchOddQttyOrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SearchOddQttyOrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oddQttyOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrder"));
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
