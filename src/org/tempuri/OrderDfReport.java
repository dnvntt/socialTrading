/**
 * OrderDfReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OrderDfReport  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String afacctno;

    private double orderDfOverdueDebt;

    private double orderDfDueDebt;

    private double orderDfRtt;

    private double orderDfBlock;

    private double orderDfUndueDebt;

    private org.tempuri.OrderDfDetail[] orderDfDetail;

    public OrderDfReport() {
    }

    public OrderDfReport(
           java.lang.String afacctno,
           double orderDfOverdueDebt,
           double orderDfDueDebt,
           double orderDfRtt,
           double orderDfBlock,
           double orderDfUndueDebt,
           org.tempuri.OrderDfDetail[] orderDfDetail) {
        this.afacctno = afacctno;
        this.orderDfOverdueDebt = orderDfOverdueDebt;
        this.orderDfDueDebt = orderDfDueDebt;
        this.orderDfRtt = orderDfRtt;
        this.orderDfBlock = orderDfBlock;
        this.orderDfUndueDebt = orderDfUndueDebt;
        this.orderDfDetail = orderDfDetail;
    }


    /**
     * Gets the afacctno value for this OrderDfReport.
     * 
     * @return afacctno
     */
    public java.lang.String getAfacctno() {
        return afacctno;
    }


    /**
     * Sets the afacctno value for this OrderDfReport.
     * 
     * @param afacctno
     */
    public void setAfacctno(java.lang.String afacctno) {
        this.afacctno = afacctno;
    }


    /**
     * Gets the orderDfOverdueDebt value for this OrderDfReport.
     * 
     * @return orderDfOverdueDebt
     */
    public double getOrderDfOverdueDebt() {
        return orderDfOverdueDebt;
    }


    /**
     * Sets the orderDfOverdueDebt value for this OrderDfReport.
     * 
     * @param orderDfOverdueDebt
     */
    public void setOrderDfOverdueDebt(double orderDfOverdueDebt) {
        this.orderDfOverdueDebt = orderDfOverdueDebt;
    }


    /**
     * Gets the orderDfDueDebt value for this OrderDfReport.
     * 
     * @return orderDfDueDebt
     */
    public double getOrderDfDueDebt() {
        return orderDfDueDebt;
    }


    /**
     * Sets the orderDfDueDebt value for this OrderDfReport.
     * 
     * @param orderDfDueDebt
     */
    public void setOrderDfDueDebt(double orderDfDueDebt) {
        this.orderDfDueDebt = orderDfDueDebt;
    }


    /**
     * Gets the orderDfRtt value for this OrderDfReport.
     * 
     * @return orderDfRtt
     */
    public double getOrderDfRtt() {
        return orderDfRtt;
    }


    /**
     * Sets the orderDfRtt value for this OrderDfReport.
     * 
     * @param orderDfRtt
     */
    public void setOrderDfRtt(double orderDfRtt) {
        this.orderDfRtt = orderDfRtt;
    }


    /**
     * Gets the orderDfBlock value for this OrderDfReport.
     * 
     * @return orderDfBlock
     */
    public double getOrderDfBlock() {
        return orderDfBlock;
    }


    /**
     * Sets the orderDfBlock value for this OrderDfReport.
     * 
     * @param orderDfBlock
     */
    public void setOrderDfBlock(double orderDfBlock) {
        this.orderDfBlock = orderDfBlock;
    }


    /**
     * Gets the orderDfUndueDebt value for this OrderDfReport.
     * 
     * @return orderDfUndueDebt
     */
    public double getOrderDfUndueDebt() {
        return orderDfUndueDebt;
    }


    /**
     * Sets the orderDfUndueDebt value for this OrderDfReport.
     * 
     * @param orderDfUndueDebt
     */
    public void setOrderDfUndueDebt(double orderDfUndueDebt) {
        this.orderDfUndueDebt = orderDfUndueDebt;
    }


    /**
     * Gets the orderDfDetail value for this OrderDfReport.
     * 
     * @return orderDfDetail
     */
    public org.tempuri.OrderDfDetail[] getOrderDfDetail() {
        return orderDfDetail;
    }


    /**
     * Sets the orderDfDetail value for this OrderDfReport.
     * 
     * @param orderDfDetail
     */
    public void setOrderDfDetail(org.tempuri.OrderDfDetail[] orderDfDetail) {
        this.orderDfDetail = orderDfDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDfReport)) return false;
        OrderDfReport other = (OrderDfReport) obj;
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
            this.orderDfOverdueDebt == other.getOrderDfOverdueDebt() &&
            this.orderDfDueDebt == other.getOrderDfDueDebt() &&
            this.orderDfRtt == other.getOrderDfRtt() &&
            this.orderDfBlock == other.getOrderDfBlock() &&
            this.orderDfUndueDebt == other.getOrderDfUndueDebt() &&
            ((this.orderDfDetail==null && other.getOrderDfDetail()==null) || 
             (this.orderDfDetail!=null &&
              java.util.Arrays.equals(this.orderDfDetail, other.getOrderDfDetail())));
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
        _hashCode += new Double(getOrderDfOverdueDebt()).hashCode();
        _hashCode += new Double(getOrderDfDueDebt()).hashCode();
        _hashCode += new Double(getOrderDfRtt()).hashCode();
        _hashCode += new Double(getOrderDfBlock()).hashCode();
        _hashCode += new Double(getOrderDfUndueDebt()).hashCode();
        if (getOrderDfDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderDfDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderDfDetail(), i);
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
        new org.apache.axis.description.TypeDesc(OrderDfReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afacctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Afacctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDfOverdueDebt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfOverdueDebt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDfDueDebt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfDueDebt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDfRtt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfRtt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDfBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDfUndueDebt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfUndueDebt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDfDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "OrderDfDetail"));
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
