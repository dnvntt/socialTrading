/**
 * GetOrdersResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetOrdersResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.PagingInfo searchPagingInfo;

    private org.tempuri.MessageStatus status;

    private org.tempuri.Order[] listOrders;

    public GetOrdersResult() {
    }

    public GetOrdersResult(
           org.tempuri.PagingInfo searchPagingInfo,
           org.tempuri.MessageStatus status,
           org.tempuri.Order[] listOrders) {
        this.searchPagingInfo = searchPagingInfo;
        this.status = status;
        this.listOrders = listOrders;
    }


    /**
     * Gets the searchPagingInfo value for this GetOrdersResult.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this GetOrdersResult.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the status value for this GetOrdersResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetOrdersResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the listOrders value for this GetOrdersResult.
     * 
     * @return listOrders
     */
    public org.tempuri.Order[] getListOrders() {
        return listOrders;
    }


    /**
     * Sets the listOrders value for this GetOrdersResult.
     * 
     * @param listOrders
     */
    public void setListOrders(org.tempuri.Order[] listOrders) {
        this.listOrders = listOrders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrdersResult)) return false;
        GetOrdersResult other = (GetOrdersResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchPagingInfo==null && other.getSearchPagingInfo()==null) || 
             (this.searchPagingInfo!=null &&
              this.searchPagingInfo.equals(other.getSearchPagingInfo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.listOrders==null && other.getListOrders()==null) || 
             (this.listOrders!=null &&
              java.util.Arrays.equals(this.listOrders, other.getListOrders())));
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
        if (getSearchPagingInfo() != null) {
            _hashCode += getSearchPagingInfo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getListOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOrders(), i);
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
        new org.apache.axis.description.TypeDesc(GetOrdersResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetOrdersResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SearchPagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "PagingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MessageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ListOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Order"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "Order"));
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
