/**
 * Tdtypschm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Tdtypschm  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private double framt;

    private double toamt;

    private double frTerm;

    private double toTerm;

    private double intRate;

    public Tdtypschm() {
    }

    public Tdtypschm(
           double framt,
           double toamt,
           double frTerm,
           double toTerm,
           double intRate) {
        this.framt = framt;
        this.toamt = toamt;
        this.frTerm = frTerm;
        this.toTerm = toTerm;
        this.intRate = intRate;
    }


    /**
     * Gets the framt value for this Tdtypschm.
     * 
     * @return framt
     */
    public double getFramt() {
        return framt;
    }


    /**
     * Sets the framt value for this Tdtypschm.
     * 
     * @param framt
     */
    public void setFramt(double framt) {
        this.framt = framt;
    }


    /**
     * Gets the toamt value for this Tdtypschm.
     * 
     * @return toamt
     */
    public double getToamt() {
        return toamt;
    }


    /**
     * Sets the toamt value for this Tdtypschm.
     * 
     * @param toamt
     */
    public void setToamt(double toamt) {
        this.toamt = toamt;
    }


    /**
     * Gets the frTerm value for this Tdtypschm.
     * 
     * @return frTerm
     */
    public double getFrTerm() {
        return frTerm;
    }


    /**
     * Sets the frTerm value for this Tdtypschm.
     * 
     * @param frTerm
     */
    public void setFrTerm(double frTerm) {
        this.frTerm = frTerm;
    }


    /**
     * Gets the toTerm value for this Tdtypschm.
     * 
     * @return toTerm
     */
    public double getToTerm() {
        return toTerm;
    }


    /**
     * Sets the toTerm value for this Tdtypschm.
     * 
     * @param toTerm
     */
    public void setToTerm(double toTerm) {
        this.toTerm = toTerm;
    }


    /**
     * Gets the intRate value for this Tdtypschm.
     * 
     * @return intRate
     */
    public double getIntRate() {
        return intRate;
    }


    /**
     * Sets the intRate value for this Tdtypschm.
     * 
     * @param intRate
     */
    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tdtypschm)) return false;
        Tdtypschm other = (Tdtypschm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.framt == other.getFramt() &&
            this.toamt == other.getToamt() &&
            this.frTerm == other.getFrTerm() &&
            this.toTerm == other.getToTerm() &&
            this.intRate == other.getIntRate();
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
        _hashCode += new Double(getFramt()).hashCode();
        _hashCode += new Double(getToamt()).hashCode();
        _hashCode += new Double(getFrTerm()).hashCode();
        _hashCode += new Double(getToTerm()).hashCode();
        _hashCode += new Double(getIntRate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tdtypschm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Tdtypschm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("framt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Framt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toamt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Toamt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FrTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ToTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IntRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
