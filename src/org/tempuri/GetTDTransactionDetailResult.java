/**
 * GetTDTransactionDetailResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTDTransactionDetailResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.PagingInfo searchPagingInfo;

    private org.tempuri.MessageStatus status;

    private org.tempuri.TDTransactionDetail[] TDTransactionDetailCollection;

    public GetTDTransactionDetailResult() {
    }

    public GetTDTransactionDetailResult(
           org.tempuri.PagingInfo searchPagingInfo,
           org.tempuri.MessageStatus status,
           org.tempuri.TDTransactionDetail[] TDTransactionDetailCollection) {
        this.searchPagingInfo = searchPagingInfo;
        this.status = status;
        this.TDTransactionDetailCollection = TDTransactionDetailCollection;
    }


    /**
     * Gets the searchPagingInfo value for this GetTDTransactionDetailResult.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this GetTDTransactionDetailResult.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the status value for this GetTDTransactionDetailResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetTDTransactionDetailResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the TDTransactionDetailCollection value for this GetTDTransactionDetailResult.
     * 
     * @return TDTransactionDetailCollection
     */
    public org.tempuri.TDTransactionDetail[] getTDTransactionDetailCollection() {
        return TDTransactionDetailCollection;
    }


    /**
     * Sets the TDTransactionDetailCollection value for this GetTDTransactionDetailResult.
     * 
     * @param TDTransactionDetailCollection
     */
    public void setTDTransactionDetailCollection(org.tempuri.TDTransactionDetail[] TDTransactionDetailCollection) {
        this.TDTransactionDetailCollection = TDTransactionDetailCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTDTransactionDetailResult)) return false;
        GetTDTransactionDetailResult other = (GetTDTransactionDetailResult) obj;
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
            ((this.TDTransactionDetailCollection==null && other.getTDTransactionDetailCollection()==null) || 
             (this.TDTransactionDetailCollection!=null &&
              java.util.Arrays.equals(this.TDTransactionDetailCollection, other.getTDTransactionDetailCollection())));
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
        if (getTDTransactionDetailCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTDTransactionDetailCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTDTransactionDetailCollection(), i);
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
        new org.apache.axis.description.TypeDesc(GetTDTransactionDetailResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetTDTransactionDetailResult"));
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
        elemField.setFieldName("TDTransactionDetailCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TDTransactionDetailCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDTransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "TDTransactionDetail"));
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
