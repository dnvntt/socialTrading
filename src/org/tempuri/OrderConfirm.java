/**
 * OrderConfirm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderConfirm  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String orderID;

    private java.lang.String fullname;

    private java.lang.String address;

    private java.lang.String afacctno;

    private java.lang.String IDcode;

    private double qtty;

    private java.lang.String desc;

    public OrderConfirm() {
    }

    public OrderConfirm(
           java.lang.String orderID,
           java.lang.String fullname,
           java.lang.String address,
           java.lang.String afacctno,
           java.lang.String IDcode,
           double qtty,
           java.lang.String desc) {
        this.orderID = orderID;
        this.fullname = fullname;
        this.address = address;
        this.afacctno = afacctno;
        this.IDcode = IDcode;
        this.qtty = qtty;
        this.desc = desc;
    }


    /**
     * Gets the orderID value for this OrderConfirm.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this OrderConfirm.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the fullname value for this OrderConfirm.
     * 
     * @return fullname
     */
    public java.lang.String getFullname() {
        return fullname;
    }


    /**
     * Sets the fullname value for this OrderConfirm.
     * 
     * @param fullname
     */
    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
    }


    /**
     * Gets the address value for this OrderConfirm.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this OrderConfirm.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the afacctno value for this OrderConfirm.
     * 
     * @return afacctno
     */
    public java.lang.String getAfacctno() {
        return afacctno;
    }


    /**
     * Sets the afacctno value for this OrderConfirm.
     * 
     * @param afacctno
     */
    public void setAfacctno(java.lang.String afacctno) {
        this.afacctno = afacctno;
    }


    /**
     * Gets the IDcode value for this OrderConfirm.
     * 
     * @return IDcode
     */
    public java.lang.String getIDcode() {
        return IDcode;
    }


    /**
     * Sets the IDcode value for this OrderConfirm.
     * 
     * @param IDcode
     */
    public void setIDcode(java.lang.String IDcode) {
        this.IDcode = IDcode;
    }


    /**
     * Gets the qtty value for this OrderConfirm.
     * 
     * @return qtty
     */
    public double getQtty() {
        return qtty;
    }


    /**
     * Sets the qtty value for this OrderConfirm.
     * 
     * @param qtty
     */
    public void setQtty(double qtty) {
        this.qtty = qtty;
    }


    /**
     * Gets the desc value for this OrderConfirm.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this OrderConfirm.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderConfirm)) return false;
        OrderConfirm other = (OrderConfirm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.fullname==null && other.getFullname()==null) || 
             (this.fullname!=null &&
              this.fullname.equals(other.getFullname()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.afacctno==null && other.getAfacctno()==null) || 
             (this.afacctno!=null &&
              this.afacctno.equals(other.getAfacctno()))) &&
            ((this.IDcode==null && other.getIDcode()==null) || 
             (this.IDcode!=null &&
              this.IDcode.equals(other.getIDcode()))) &&
            this.qtty == other.getQtty() &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getFullname() != null) {
            _hashCode += getFullname().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAfacctno() != null) {
            _hashCode += getAfacctno().hashCode();
        }
        if (getIDcode() != null) {
            _hashCode += getIDcode().hashCode();
        }
        _hashCode += new Double(getQtty()).hashCode();
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderConfirm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderConfirm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "fullname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afacctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "afacctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IDcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Qtty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Desc"));
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
