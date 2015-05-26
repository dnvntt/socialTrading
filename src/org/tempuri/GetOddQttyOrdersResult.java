/**
 * GetOddQttyOrdersResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetOddQttyOrdersResult  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.PagingInfo searchPagingInfo;

    private org.tempuri.MessageStatus status;

    private org.tempuri.OddQttyOrder[] getOddQttyOrdersInfo;

    public GetOddQttyOrdersResult() {
    }

    public GetOddQttyOrdersResult(
           org.tempuri.PagingInfo searchPagingInfo,
           org.tempuri.MessageStatus status,
           org.tempuri.OddQttyOrder[] getOddQttyOrdersInfo) {
        this.searchPagingInfo = searchPagingInfo;
        this.status = status;
        this.getOddQttyOrdersInfo = getOddQttyOrdersInfo;
    }


    /**
     * Gets the searchPagingInfo value for this GetOddQttyOrdersResult.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this GetOddQttyOrdersResult.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the status value for this GetOddQttyOrdersResult.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetOddQttyOrdersResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the getOddQttyOrdersInfo value for this GetOddQttyOrdersResult.
     * 
     * @return getOddQttyOrdersInfo
     */
    public org.tempuri.OddQttyOrder[] getGetOddQttyOrdersInfo() {
        return getOddQttyOrdersInfo;
    }


    /**
     * Sets the getOddQttyOrdersInfo value for this GetOddQttyOrdersResult.
     * 
     * @param getOddQttyOrdersInfo
     */
    public void setGetOddQttyOrdersInfo(org.tempuri.OddQttyOrder[] getOddQttyOrdersInfo) {
        this.getOddQttyOrdersInfo = getOddQttyOrdersInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOddQttyOrdersResult)) return false;
        GetOddQttyOrdersResult other = (GetOddQttyOrdersResult) obj;
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
            ((this.getOddQttyOrdersInfo==null && other.getGetOddQttyOrdersInfo()==null) || 
             (this.getOddQttyOrdersInfo!=null &&
              java.util.Arrays.equals(this.getOddQttyOrdersInfo, other.getGetOddQttyOrdersInfo())));
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
        if (getGetOddQttyOrdersInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetOddQttyOrdersInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetOddQttyOrdersInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetOddQttyOrdersResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetOddQttyOrdersResult"));
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
        elemField.setFieldName("getOddQttyOrdersInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "GetOddQttyOrdersInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "OddQttyOrder"));
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
