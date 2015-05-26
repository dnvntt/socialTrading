/**
 * SearchStockOptionRegisterResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SearchStockOptionRegisterResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.PagingInfo searchPagingInfo;

    private org.tempuri.StockOptionRegister[] listStockOptionRegister;

    public SearchStockOptionRegisterResult() {
    }

    public SearchStockOptionRegisterResult(
           org.tempuri.MessageStatus status,
           org.tempuri.PagingInfo searchPagingInfo,
           org.tempuri.StockOptionRegister[] listStockOptionRegister) {
        this.status = status;
        this.searchPagingInfo = searchPagingInfo;
        this.listStockOptionRegister = listStockOptionRegister;
    }


    /**
     * Gets the status value for this SearchStockOptionRegisterResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchStockOptionRegisterResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the searchPagingInfo value for this SearchStockOptionRegisterResult.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this SearchStockOptionRegisterResult.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the listStockOptionRegister value for this SearchStockOptionRegisterResult.
     * 
     * @return listStockOptionRegister
     */
    public org.tempuri.StockOptionRegister[] getListStockOptionRegister() {
        return listStockOptionRegister;
    }


    /**
     * Sets the listStockOptionRegister value for this SearchStockOptionRegisterResult.
     * 
     * @param listStockOptionRegister
     */
    public void setListStockOptionRegister(org.tempuri.StockOptionRegister[] listStockOptionRegister) {
        this.listStockOptionRegister = listStockOptionRegister;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchStockOptionRegisterResult)) return false;
        SearchStockOptionRegisterResult other = (SearchStockOptionRegisterResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.searchPagingInfo==null && other.getSearchPagingInfo()==null) || 
             (this.searchPagingInfo!=null &&
              this.searchPagingInfo.equals(other.getSearchPagingInfo()))) &&
            ((this.listStockOptionRegister==null && other.getListStockOptionRegister()==null) || 
             (this.listStockOptionRegister!=null &&
              java.util.Arrays.equals(this.listStockOptionRegister, other.getListStockOptionRegister())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSearchPagingInfo() != null) {
            _hashCode += getSearchPagingInfo().hashCode();
        }
        if (getListStockOptionRegister() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListStockOptionRegister());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListStockOptionRegister(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchStockOptionRegisterResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "SearchStockOptionRegisterResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
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
        elemField.setFieldName("listStockOptionRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ListStockOptionRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "StockOptionRegister"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "StockOptionRegister"));
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
