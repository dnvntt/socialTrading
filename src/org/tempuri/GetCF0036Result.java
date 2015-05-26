/**
 * GetCF0036Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCF0036Result  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.MessageStatus status;

    private org.tempuri.PagingInfo searchPagingInfo;

    private org.tempuri.CF0036Row[] listCF0036Row;

    public GetCF0036Result() {
    }

    public GetCF0036Result(
           org.tempuri.MessageStatus status,
           org.tempuri.PagingInfo searchPagingInfo,
           org.tempuri.CF0036Row[] listCF0036Row) {
        this.status = status;
        this.searchPagingInfo = searchPagingInfo;
        this.listCF0036Row = listCF0036Row;
    }


    /**
     * Gets the status value for this GetCF0036Result.
     * 
     * @return status
     */
    public org.tempuri.MessageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetCF0036Result.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.MessageStatus status) {
        this.status = status;
    }


    /**
     * Gets the searchPagingInfo value for this GetCF0036Result.
     * 
     * @return searchPagingInfo
     */
    public org.tempuri.PagingInfo getSearchPagingInfo() {
        return searchPagingInfo;
    }


    /**
     * Sets the searchPagingInfo value for this GetCF0036Result.
     * 
     * @param searchPagingInfo
     */
    public void setSearchPagingInfo(org.tempuri.PagingInfo searchPagingInfo) {
        this.searchPagingInfo = searchPagingInfo;
    }


    /**
     * Gets the listCF0036Row value for this GetCF0036Result.
     * 
     * @return listCF0036Row
     */
    public org.tempuri.CF0036Row[] getListCF0036Row() {
        return listCF0036Row;
    }


    /**
     * Sets the listCF0036Row value for this GetCF0036Result.
     * 
     * @param listCF0036Row
     */
    public void setListCF0036Row(org.tempuri.CF0036Row[] listCF0036Row) {
        this.listCF0036Row = listCF0036Row;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCF0036Result)) return false;
        GetCF0036Result other = (GetCF0036Result) obj;
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
            ((this.listCF0036Row==null && other.getListCF0036Row()==null) || 
             (this.listCF0036Row!=null &&
              java.util.Arrays.equals(this.listCF0036Row, other.getListCF0036Row())));
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
        if (getListCF0036Row() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListCF0036Row());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListCF0036Row(), i);
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
        new org.apache.axis.description.TypeDesc(GetCF0036Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GetCF0036Result"));
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
        elemField.setFieldName("listCF0036Row");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ListCF0036Row"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "CF0036Row"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "CF0036Row"));
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
