/**
 * GuaranteeAssetItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GuaranteeAssetItem  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String afacctno;

    private java.lang.String symbol;

    private double AQtty;

    private double APrice;

    private double ARate;

    private double AValue;

    private java.lang.String AType;

    public GuaranteeAssetItem() {
    }

    public GuaranteeAssetItem(
           java.lang.String afacctno,
           java.lang.String symbol,
           double AQtty,
           double APrice,
           double ARate,
           double AValue,
           java.lang.String AType) {
        this.afacctno = afacctno;
        this.symbol = symbol;
        this.AQtty = AQtty;
        this.APrice = APrice;
        this.ARate = ARate;
        this.AValue = AValue;
        this.AType = AType;
    }


    /**
     * Gets the afacctno value for this GuaranteeAssetItem.
     * 
     * @return afacctno
     */
    public java.lang.String getAfacctno() {
        return afacctno;
    }


    /**
     * Sets the afacctno value for this GuaranteeAssetItem.
     * 
     * @param afacctno
     */
    public void setAfacctno(java.lang.String afacctno) {
        this.afacctno = afacctno;
    }


    /**
     * Gets the symbol value for this GuaranteeAssetItem.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this GuaranteeAssetItem.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the AQtty value for this GuaranteeAssetItem.
     * 
     * @return AQtty
     */
    public double getAQtty() {
        return AQtty;
    }


    /**
     * Sets the AQtty value for this GuaranteeAssetItem.
     * 
     * @param AQtty
     */
    public void setAQtty(double AQtty) {
        this.AQtty = AQtty;
    }


    /**
     * Gets the APrice value for this GuaranteeAssetItem.
     * 
     * @return APrice
     */
    public double getAPrice() {
        return APrice;
    }


    /**
     * Sets the APrice value for this GuaranteeAssetItem.
     * 
     * @param APrice
     */
    public void setAPrice(double APrice) {
        this.APrice = APrice;
    }


    /**
     * Gets the ARate value for this GuaranteeAssetItem.
     * 
     * @return ARate
     */
    public double getARate() {
        return ARate;
    }


    /**
     * Sets the ARate value for this GuaranteeAssetItem.
     * 
     * @param ARate
     */
    public void setARate(double ARate) {
        this.ARate = ARate;
    }


    /**
     * Gets the AValue value for this GuaranteeAssetItem.
     * 
     * @return AValue
     */
    public double getAValue() {
        return AValue;
    }


    /**
     * Sets the AValue value for this GuaranteeAssetItem.
     * 
     * @param AValue
     */
    public void setAValue(double AValue) {
        this.AValue = AValue;
    }


    /**
     * Gets the AType value for this GuaranteeAssetItem.
     * 
     * @return AType
     */
    public java.lang.String getAType() {
        return AType;
    }


    /**
     * Sets the AType value for this GuaranteeAssetItem.
     * 
     * @param AType
     */
    public void setAType(java.lang.String AType) {
        this.AType = AType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuaranteeAssetItem)) return false;
        GuaranteeAssetItem other = (GuaranteeAssetItem) obj;
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
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.AQtty == other.getAQtty() &&
            this.APrice == other.getAPrice() &&
            this.ARate == other.getARate() &&
            this.AValue == other.getAValue() &&
            ((this.AType==null && other.getAType()==null) || 
             (this.AType!=null &&
              this.AType.equals(other.getAType())));
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
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += new Double(getAQtty()).hashCode();
        _hashCode += new Double(getAPrice()).hashCode();
        _hashCode += new Double(getARate()).hashCode();
        _hashCode += new Double(getAValue()).hashCode();
        if (getAType() != null) {
            _hashCode += getAType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuaranteeAssetItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "GuaranteeAssetItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afacctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Afacctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AQtty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AQtty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "APrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ARate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AType"));
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
