/**
 * TDTypeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TDTypeDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String actype;

    private java.lang.String typeName;

    private java.lang.String termcd;

    private double TDTerm;

    private java.lang.String autoPaid;

    private double minAmt;

    private java.lang.String schdType;

    private double intRate;

    private java.lang.String autoRnd;

    private java.lang.String inttypbrcd;

    private double flIntRate;

    private java.lang.String buyingPower;

    private java.lang.String minbrterm;

    private java.lang.String breakcd;

    private org.tempuri.Tdtypschm[] tdtypschm;

    public TDTypeDetail() {
    }

    public TDTypeDetail(
           java.lang.String actype,
           java.lang.String typeName,
           java.lang.String termcd,
           double TDTerm,
           java.lang.String autoPaid,
           double minAmt,
           java.lang.String schdType,
           double intRate,
           java.lang.String autoRnd,
           java.lang.String inttypbrcd,
           double flIntRate,
           java.lang.String buyingPower,
           java.lang.String minbrterm,
           java.lang.String breakcd,
           org.tempuri.Tdtypschm[] tdtypschm) {
        this.actype = actype;
        this.typeName = typeName;
        this.termcd = termcd;
        this.TDTerm = TDTerm;
        this.autoPaid = autoPaid;
        this.minAmt = minAmt;
        this.schdType = schdType;
        this.intRate = intRate;
        this.autoRnd = autoRnd;
        this.inttypbrcd = inttypbrcd;
        this.flIntRate = flIntRate;
        this.buyingPower = buyingPower;
        this.minbrterm = minbrterm;
        this.breakcd = breakcd;
        this.tdtypschm = tdtypschm;
    }


    /**
     * Gets the actype value for this TDTypeDetail.
     * 
     * @return actype
     */
    public java.lang.String getActype() {
        return actype;
    }


    /**
     * Sets the actype value for this TDTypeDetail.
     * 
     * @param actype
     */
    public void setActype(java.lang.String actype) {
        this.actype = actype;
    }


    /**
     * Gets the typeName value for this TDTypeDetail.
     * 
     * @return typeName
     */
    public java.lang.String getTypeName() {
        return typeName;
    }


    /**
     * Sets the typeName value for this TDTypeDetail.
     * 
     * @param typeName
     */
    public void setTypeName(java.lang.String typeName) {
        this.typeName = typeName;
    }


    /**
     * Gets the termcd value for this TDTypeDetail.
     * 
     * @return termcd
     */
    public java.lang.String getTermcd() {
        return termcd;
    }


    /**
     * Sets the termcd value for this TDTypeDetail.
     * 
     * @param termcd
     */
    public void setTermcd(java.lang.String termcd) {
        this.termcd = termcd;
    }


    /**
     * Gets the TDTerm value for this TDTypeDetail.
     * 
     * @return TDTerm
     */
    public double getTDTerm() {
        return TDTerm;
    }


    /**
     * Sets the TDTerm value for this TDTypeDetail.
     * 
     * @param TDTerm
     */
    public void setTDTerm(double TDTerm) {
        this.TDTerm = TDTerm;
    }


    /**
     * Gets the autoPaid value for this TDTypeDetail.
     * 
     * @return autoPaid
     */
    public java.lang.String getAutoPaid() {
        return autoPaid;
    }


    /**
     * Sets the autoPaid value for this TDTypeDetail.
     * 
     * @param autoPaid
     */
    public void setAutoPaid(java.lang.String autoPaid) {
        this.autoPaid = autoPaid;
    }


    /**
     * Gets the minAmt value for this TDTypeDetail.
     * 
     * @return minAmt
     */
    public double getMinAmt() {
        return minAmt;
    }


    /**
     * Sets the minAmt value for this TDTypeDetail.
     * 
     * @param minAmt
     */
    public void setMinAmt(double minAmt) {
        this.minAmt = minAmt;
    }


    /**
     * Gets the schdType value for this TDTypeDetail.
     * 
     * @return schdType
     */
    public java.lang.String getSchdType() {
        return schdType;
    }


    /**
     * Sets the schdType value for this TDTypeDetail.
     * 
     * @param schdType
     */
    public void setSchdType(java.lang.String schdType) {
        this.schdType = schdType;
    }


    /**
     * Gets the intRate value for this TDTypeDetail.
     * 
     * @return intRate
     */
    public double getIntRate() {
        return intRate;
    }


    /**
     * Sets the intRate value for this TDTypeDetail.
     * 
     * @param intRate
     */
    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }


    /**
     * Gets the autoRnd value for this TDTypeDetail.
     * 
     * @return autoRnd
     */
    public java.lang.String getAutoRnd() {
        return autoRnd;
    }


    /**
     * Sets the autoRnd value for this TDTypeDetail.
     * 
     * @param autoRnd
     */
    public void setAutoRnd(java.lang.String autoRnd) {
        this.autoRnd = autoRnd;
    }


    /**
     * Gets the inttypbrcd value for this TDTypeDetail.
     * 
     * @return inttypbrcd
     */
    public java.lang.String getInttypbrcd() {
        return inttypbrcd;
    }


    /**
     * Sets the inttypbrcd value for this TDTypeDetail.
     * 
     * @param inttypbrcd
     */
    public void setInttypbrcd(java.lang.String inttypbrcd) {
        this.inttypbrcd = inttypbrcd;
    }


    /**
     * Gets the flIntRate value for this TDTypeDetail.
     * 
     * @return flIntRate
     */
    public double getFlIntRate() {
        return flIntRate;
    }


    /**
     * Sets the flIntRate value for this TDTypeDetail.
     * 
     * @param flIntRate
     */
    public void setFlIntRate(double flIntRate) {
        this.flIntRate = flIntRate;
    }


    /**
     * Gets the buyingPower value for this TDTypeDetail.
     * 
     * @return buyingPower
     */
    public java.lang.String getBuyingPower() {
        return buyingPower;
    }


    /**
     * Sets the buyingPower value for this TDTypeDetail.
     * 
     * @param buyingPower
     */
    public void setBuyingPower(java.lang.String buyingPower) {
        this.buyingPower = buyingPower;
    }


    /**
     * Gets the minbrterm value for this TDTypeDetail.
     * 
     * @return minbrterm
     */
    public java.lang.String getMinbrterm() {
        return minbrterm;
    }


    /**
     * Sets the minbrterm value for this TDTypeDetail.
     * 
     * @param minbrterm
     */
    public void setMinbrterm(java.lang.String minbrterm) {
        this.minbrterm = minbrterm;
    }


    /**
     * Gets the breakcd value for this TDTypeDetail.
     * 
     * @return breakcd
     */
    public java.lang.String getBreakcd() {
        return breakcd;
    }


    /**
     * Sets the breakcd value for this TDTypeDetail.
     * 
     * @param breakcd
     */
    public void setBreakcd(java.lang.String breakcd) {
        this.breakcd = breakcd;
    }


    /**
     * Gets the tdtypschm value for this TDTypeDetail.
     * 
     * @return tdtypschm
     */
    public org.tempuri.Tdtypschm[] getTdtypschm() {
        return tdtypschm;
    }


    /**
     * Sets the tdtypschm value for this TDTypeDetail.
     * 
     * @param tdtypschm
     */
    public void setTdtypschm(org.tempuri.Tdtypschm[] tdtypschm) {
        this.tdtypschm = tdtypschm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDTypeDetail)) return false;
        TDTypeDetail other = (TDTypeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actype==null && other.getActype()==null) || 
             (this.actype!=null &&
              this.actype.equals(other.getActype()))) &&
            ((this.typeName==null && other.getTypeName()==null) || 
             (this.typeName!=null &&
              this.typeName.equals(other.getTypeName()))) &&
            ((this.termcd==null && other.getTermcd()==null) || 
             (this.termcd!=null &&
              this.termcd.equals(other.getTermcd()))) &&
            this.TDTerm == other.getTDTerm() &&
            ((this.autoPaid==null && other.getAutoPaid()==null) || 
             (this.autoPaid!=null &&
              this.autoPaid.equals(other.getAutoPaid()))) &&
            this.minAmt == other.getMinAmt() &&
            ((this.schdType==null && other.getSchdType()==null) || 
             (this.schdType!=null &&
              this.schdType.equals(other.getSchdType()))) &&
            this.intRate == other.getIntRate() &&
            ((this.autoRnd==null && other.getAutoRnd()==null) || 
             (this.autoRnd!=null &&
              this.autoRnd.equals(other.getAutoRnd()))) &&
            ((this.inttypbrcd==null && other.getInttypbrcd()==null) || 
             (this.inttypbrcd!=null &&
              this.inttypbrcd.equals(other.getInttypbrcd()))) &&
            this.flIntRate == other.getFlIntRate() &&
            ((this.buyingPower==null && other.getBuyingPower()==null) || 
             (this.buyingPower!=null &&
              this.buyingPower.equals(other.getBuyingPower()))) &&
            ((this.minbrterm==null && other.getMinbrterm()==null) || 
             (this.minbrterm!=null &&
              this.minbrterm.equals(other.getMinbrterm()))) &&
            ((this.breakcd==null && other.getBreakcd()==null) || 
             (this.breakcd!=null &&
              this.breakcd.equals(other.getBreakcd()))) &&
            ((this.tdtypschm==null && other.getTdtypschm()==null) || 
             (this.tdtypschm!=null &&
              java.util.Arrays.equals(this.tdtypschm, other.getTdtypschm())));
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
        if (getActype() != null) {
            _hashCode += getActype().hashCode();
        }
        if (getTypeName() != null) {
            _hashCode += getTypeName().hashCode();
        }
        if (getTermcd() != null) {
            _hashCode += getTermcd().hashCode();
        }
        _hashCode += new Double(getTDTerm()).hashCode();
        if (getAutoPaid() != null) {
            _hashCode += getAutoPaid().hashCode();
        }
        _hashCode += new Double(getMinAmt()).hashCode();
        if (getSchdType() != null) {
            _hashCode += getSchdType().hashCode();
        }
        _hashCode += new Double(getIntRate()).hashCode();
        if (getAutoRnd() != null) {
            _hashCode += getAutoRnd().hashCode();
        }
        if (getInttypbrcd() != null) {
            _hashCode += getInttypbrcd().hashCode();
        }
        _hashCode += new Double(getFlIntRate()).hashCode();
        if (getBuyingPower() != null) {
            _hashCode += getBuyingPower().hashCode();
        }
        if (getMinbrterm() != null) {
            _hashCode += getMinbrterm().hashCode();
        }
        if (getBreakcd() != null) {
            _hashCode += getBreakcd().hashCode();
        }
        if (getTdtypschm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTdtypschm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTdtypschm(), i);
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
        new org.apache.axis.description.TypeDesc(TDTypeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDTypeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Actype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Termcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TDTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TDTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AutoPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MinAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SchdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IntRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AutoRnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inttypbrcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Inttypbrcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flIntRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FlIntRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingPower");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BuyingPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minbrterm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Minbrterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Breakcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tdtypschm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Tdtypschm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Tdtypschm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org", "Tdtypschm"));
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
